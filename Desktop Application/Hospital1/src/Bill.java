import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Bill {
    static String username = "harshika.p3.hp@gmail.com";
    static JLabel H_name_label, p_name_label, p_name_text_label, p_age_label, p_gender_text_label, p_age_text_label, p_doctor_label, p_doctor_text_label, p_ward_label, p_gender_label, p_ward_text_label, p_bed_label, p_bed_text_label, p_blood_label, p_blood_text_label, p_date_label, doc_fee_label, address_label, bill_num_label, current_date_label, med_name_label, med_price_label, test_label, med_label, bill_amt_label, test_price_label;
    static String name, ward_name = "N/A", doctor_name, gender, appoint_date, bg, admit_date, email, test_name = "";
    static int age, j = 0, k = 0;
    static double bed_price, doctor_fee, test_amt, medi_claim;
    static Connection con = Sconnection.connection();
    static String[] med_list;
    static String[] test_list = new String[10];
    static int[] num_list;
    static double[] price_list;
    static double[] test_price = new double[10];
    String med_name = "";
    int number_of_med;
    double med_price;

    Bill(String med_name, int number_of_med, double med_price) {
        this.med_name = med_name;
        this.number_of_med = number_of_med;
        this.med_price = med_price;
    }

    static void p_details(String p_id) {
        med_list = new String[10];
        num_list = new int[10];
        price_list = new double[10];

        int i = 0;
        try {
            Statement stmt = con.createStatement();
            Statement stm = con.createStatement();
            Statement st = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from patient inner join doctor on patient.doctor_id=doctor.doc_id and patient.p_id='" + p_id + "'inner join ward on patient.ward_id=ward.ward_id;");
            ResultSet r = stm.executeQuery("select * from lab inner join test on lab.test_id=test.test_id and test.patient_id='" + p_id + "'; ");
            ResultSet rm = st.executeQuery("select * from medicine_alloted m inner join medicine on m.med_id = medicine.med_id and m.patient_id='" + p_id + "'; ");
            while (r.next()) {
                if (!(r.getString("test_name").equals("null"))) {
                    test_name = r.getString("test_name");
                    test_amt = r.getDouble("test_price");
                    test_list[k] = test_name;
                    test_price[k] = test_amt;
                    k++;
                }
            }
            while (rm.next()) {
                String name1 = "";
                int num_of_med = 0;
                double price = 0;
                if (!(rm.getString("med_name").equals("null"))) {
                    name1 = rm.getString("med_name");
                    num_of_med = rm.getInt("num_of_med");
                    price = rm.getDouble("med_price");
                    med_list[j] = name1;
                    num_list[j] = num_of_med;
                    price_list[j] = price;
                    j++;
                }
            }
            while (rs.next()) {
                name = rs.getString(2);
                gender = rs.getString(3);
                age = rs.getInt(4);
                bg = rs.getString(6);
                email = rs.getString(7);
                appoint_date = rs.getString(8);
                admit_date = rs.getString(10);
                medi_claim = rs.getDouble(13);
                doctor_name = rs.getString(17);
                doctor_fee = rs.getDouble(22);
                ward_name = rs.getString(27);
                bed_price = rs.getDouble(30);
                i++;
            }
        } catch (SQLException e) {
            System.out.println("Exception " + e);
            e.getStackTrace();
        }
        if (i < 1) {
            JOptionPane.showMessageDialog(null, "No Record Found", " Error ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void hospital_bill(String p_id, String choose, String discharge_date) {
        j = 0;
        k = 0;
        p_details(p_id);
        double total_test_amt = 0, total_med_amt = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String current_date = dtf.format(now);

        LocalDate startDate = LocalDate.parse(admit_date, dtf);
        LocalDate endtDate = LocalDate.parse(discharge_date, dtf);
        long days_in_hospital = ChronoUnit.DAYS.between(startDate, endtDate);

        Random random = new Random();
        int bill_num = random.nextInt(100, 1000);

        JFrame bill_frame = new JFrame("Hospital Bill");
        bill_frame.setSize(850, 800);
        bill_frame.setForeground(Color.yellow);
        // bill_frame.getContentPane().setBackground(Color.lightGray);
        bill_frame.setResizable(false);
        bill_frame.setLocationRelativeTo(null);
        bill_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        bill_num_label = new JLabel("Invoice No.- " + bill_num);
        bill_num_label.setBounds(10, 10, 150, 20);
        bill_num_label.setFont(new Font("serif", Font.PLAIN, 16));
        bill_num_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(bill_num_label);

        current_date_label = new JLabel(current_date);
        current_date_label.setBounds(700, 10, 150, 20);
        current_date_label.setFont(new Font("serif", Font.PLAIN, 16));
        current_date_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(current_date_label);

        H_name_label = new JLabel("BIT BY BIT HOSPITAL");
        H_name_label.setBounds(300, 20, 400, 30);
        H_name_label.setFont(new Font("serif", Font.BOLD, 20));
        //H_name_label.setHorizontalTextPosition(JLabel.CENTER);
        H_name_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.setLayout(null);
        bill_frame.add(H_name_label);

        address_label = new JLabel("7, Lantern Square, Race Course Road,Indore,Madhya Pradesh 452001");
        address_label.setBounds(120, 60, 600, 30);
        address_label.setFont(new Font("serif", Font.CENTER_BASELINE, 18));
        address_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(address_label);

        p_name_label = new JLabel("Patient Name-");
        p_name_label.setBounds(100, 110, 200, 30);
        p_name_label.setFont(new Font("serif", Font.PLAIN, 18));
        p_name_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(p_name_label);

        p_name_text_label = new JLabel(": " + name);
        p_name_text_label.setBounds(400, 110, 200, 30);
        p_name_text_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_name_text_label);

        p_age_label = new JLabel("Patient Age-");
        p_age_label.setBounds(100, 155, 200, 30);
        p_age_label.setFont(new Font("serif", Font.PLAIN, 18));
        //H_name_label.setHorizontalTextPosition(JLabel.CENTER);
        p_age_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(p_age_label);

        p_age_text_label = new JLabel(": " + age);
        p_age_text_label.setBounds(400, 155, 200, 30);
        p_age_text_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_age_text_label);

        p_gender_label = new JLabel("Patient Gender-");
        p_gender_label.setBounds(100, 200, 200, 30);
        p_gender_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_gender_label);

        p_gender_text_label = new JLabel(": " + gender);
        p_gender_text_label.setBounds(400, 200, 200, 30);
        p_gender_text_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_gender_text_label);

        p_blood_label = new JLabel("Blood group-");
        p_blood_label.setBounds(100, 245, 200, 30);
        p_blood_label.setFont(new Font("serif", Font.PLAIN, 18));
        //H_name_label.setHorizontalTextPosition(JLabel.CENTER);
        p_blood_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(p_blood_label);

        p_blood_text_label = new JLabel(": " + bg);
        p_blood_text_label.setBounds(400, 245, 200, 30);
        p_blood_text_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_blood_text_label);

        p_doctor_label = new JLabel("Patient Doctor-");
        p_doctor_label.setBounds(100, 290, 200, 30);
        p_doctor_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_doctor_label);

        p_doctor_text_label = new JLabel(": " + doctor_name);
        p_doctor_text_label.setBounds(400, 290, 200, 30);
        p_doctor_text_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_doctor_text_label);

        p_ward_label = new JLabel("Patient's Ward-");
        p_ward_label.setBounds(100, 335, 200, 30);
        p_ward_label.setFont(new Font("serif", Font.PLAIN, 18));
        //H_name_label.setHorizontalTextPosition(JLabel.CENTER);
        p_ward_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(p_ward_label);

        p_ward_text_label = new JLabel(": " + ward_name);
        p_ward_text_label.setBounds(400, 335, 200, 30);
        p_ward_text_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_ward_text_label);

        p_bed_label = new JLabel("Bed Price/Day-");
        p_bed_label.setBounds(100, 380, 200, 30);
        p_bed_label.setFont(new Font("serif", Font.PLAIN, 18));
        p_bed_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(p_bed_label);

        p_bed_text_label = new JLabel(": " + bed_price);
        p_bed_text_label.setBounds(400, 380, 200, 30);
        p_bed_text_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_frame.add(p_bed_text_label);

        p_date_label = new JLabel("Admit Date-      " + admit_date + "                            Discharge Date-           " + discharge_date);
        p_date_label.setBounds(50, 425, 750, 30);
        p_date_label.setFont(new Font("serif", Font.PLAIN, 18));
        p_date_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(p_date_label);

        JLabel bill_label = new JLabel("                                                       BILL SUMMARY                  ");
        bill_label.setBounds(40, 465, 760, 30);
        bill_label.setFont(new Font("serif", Font.BOLD, 18));
        bill_label.setBorder(BorderFactory.createLineBorder(Color.black));
        bill_frame.add(bill_label);

        doc_fee_label = new JLabel("Doctor Fee-                               " + (doctor_fee * days_in_hospital) + "           Bed Fee                                " + (bed_price * days_in_hospital));
        doc_fee_label.setBounds(50, 520, 800, 30);
        doc_fee_label.setFont(new Font("serif", Font.PLAIN, 18));
        doc_fee_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(doc_fee_label);

        med_label = new JLabel("MEDICINES:-");
        med_label.setBounds(30, 560, 110, 30);
        med_label.setFont(new Font("serif", Font.BOLD, 16));
        med_label.setVerticalTextPosition(JLabel.CENTER);
        bill_frame.add(med_label);

        int a = 600;
        for (int i = 0; i < j; i++) {
            med_name_label = new JLabel(med_list[i]); //10 tab
            med_name_label.setBounds(50, a, 100, 30);
            med_name_label.setFont(new Font("serif", Font.PLAIN, 18));
            bill_frame.add(med_name_label);
            a += 30;
        }
        int b = 600;
        for (int i = 0; i < j; i++) {
            med_price_label = new JLabel(price_list[i] + " * " + num_list[i] + ":         " + price_list[i] * num_list[i]); //10 tab
            med_price_label.setBounds(150, b, 300, 30);
            med_price_label.setDisplayedMnemonic('N');
            med_price_label.setFont(new Font("serif", Font.PLAIN, 18));
            bill_frame.add(med_price_label);
            total_med_amt += price_list[i] * num_list[i];
            b += 30;

        }
        if ((choose.equals("yes") || choose.equals("YES")) && (test_list[0] != null)) {
            test_label = new JLabel("TEST:-");
            test_label.setBounds(400, 560, 100, 30);
            test_label.setFont(new Font("serif", Font.BOLD, 16));
            test_label.setVerticalTextPosition(JLabel.CENTER);
            bill_frame.add(test_label);

            int c = 600;
            for (int i = 0; i < k; i++) {
                test_price_label = new JLabel(test_list[i] + "-                " + test_price[i]); //10 tab
                test_price_label.setBounds(430, c, 300, 30);
                test_price_label.setDisplayedMnemonic('N');
                test_price_label.setFont(new Font("serif", Font.PLAIN, 18));
                bill_frame.add(test_price_label);
                c += 30;
                total_test_amt += test_price[i];
            }
        }

        double pay_amt = total_test_amt + total_med_amt + (doctor_fee * days_in_hospital) + (bed_price * days_in_hospital);
        if (medi_claim > 0) {
            if (medi_claim >= pay_amt) {
                pay_amt = 0;
            } else {
                pay_amt = pay_amt - medi_claim;
            }
        }
        bill_amt_label = new JLabel("TOTAL                                                                                              " + pay_amt);
        bill_amt_label.setBounds(40, 680, 760, 30);
        bill_amt_label.setFont(new Font("serif", Font.PLAIN, 18));
        bill_amt_label.setVerticalTextPosition(JLabel.CENTER);
        bill_amt_label.setBorder(BorderFactory.createLineBorder(Color.black));
        bill_frame.add(bill_amt_label);

        bill_frame.setVisible(true);

        JButton pay_btn = new JButton("Back");
        pay_btn.setBounds(250, 720, 250, 50);
        bill_frame.add(pay_btn);
        pay_btn.addActionListener(e -> {
            Main_menu.Mainmenu_Main();
            bill_frame.dispose();
        });

//        String to = email;
//        String from = "harshika.p3.hp@gmail.com";
//        String subject = "Welcome to Bit by Bit hospital";
//        String text = "Hello " + name + ".\nYour Bill Generated Successful\nYour doctor is- Dr. " + doctor_name + "\nYour Total Payable Amount is- " + pay_amt + ".\nThank You For Choosing Bit By Bit Hospital";
//        boolean bl = GemailSend.sendEmail(username, to, from, subject, text);
//        if (bl) {
//            System.out.println("Email is sent successfully");
//        } else {
//            System.out.println("There is problem in sending email");
//        }

        bill_frame.setForeground(Color.yellow);
        bill_frame.setVisible(true);
    }

//    @Override
//    public String toString() {
//        return med_name + "\t," + med_price + "\t," + number_of_med;
//    }

//    public static void main(String[] args) {
//        Bill.hospital_bill("3","YES","24/05/2023");
//    }
}
