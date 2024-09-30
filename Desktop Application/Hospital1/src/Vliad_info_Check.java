import org.jdatepicker.JDatePicker;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vliad_info_Check {

    static boolean isValidContactNumber(String contactNumber) {
        if (contactNumber.length() != 10) {
            return false;
        }
        for (int i = 0; i < contactNumber.length(); i++) {
            if (!Character.isDigit(contactNumber.charAt(i))) {
                return false;
            }
        }
        return contactNumber.charAt(0) >= '6' && contactNumber.charAt(0) <= '9';
    }

    static boolean isValidName(String name) {
        boolean Valid_name_boolen = false;
        if (name.length() > 0 && !name.equals("In-Valid Name")) {
            String[] words = name.split(" ");
            for (String word : words) {
                char[] chars = word.toCharArray();
                for (char aChar : chars) {
                    if (aChar >= 65 && aChar <= 90 || aChar >= 97 && aChar <= 122) {
                        Valid_name_boolen = true;
                    } else {
                        Valid_name_boolen = false;
                    }
                }
            }
        }
        return Valid_name_boolen;
    }

    static boolean IsValidEmail(String email) {
        if (email.length() == 0) {
            return false;
        } else {
            if (email.contains(" ")) {
                return false;
            } else {
                int count_SC = 0;
                char[] cha = email.toCharArray();
                for (int i = 0; i < cha.length; i++) {
                    if ((cha[i] > 31 && cha[i] < 48) || (cha[i] > 57 && cha[i] < 65) || (cha[i] > 90 && cha[i] < 97) || (cha[i] > 122 && cha[i] < 127)) {
                        count_SC++;
                    }
                }
                if (count_SC > 5) {
                    return false;
                } else {
                    String parts[] = email.split("@");
                    if (parts.length != 2) {
                        return false;
                    } else {
                        String userName = parts[0];
                        if (!(userName.length() >= 1)) {
                            return false;
                        } else {
                            String domainName = parts[1];
                            if (domainName.charAt(0) == '.') {
                                return false;
                            }
                            char ch[] = domainName.toCharArray();
                            int c = 0;
                            for (int i = 0; i < ch.length; i++) {
                                if (ch[i] == '.') c++;
                            }
                            if (c > 2) {
                                return false;
                            } else {
                                boolean res = (domainName.contains(".com") || domainName.contains(".co"));
                                if (!res) {
                                    return false;
                                } else {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static boolean isValidFee(String fee) {
        boolean validFee = true;
        if (!fee.equals("")) {
            if (Integer.parseInt(fee) <= 999) {
                return false;
            }
        } else {
            return false;
        }
        for (int i = 0; i < fee.length(); i++) {
            if (!Character.isDigit(fee.charAt(i))) {
                return false;
            }
        }
        return validFee;
    }

    static boolean isValidmediAmt(String fee) {
        boolean validFee = true;
        if (!fee.equals("")) {
            if (Integer.parseInt(fee) <= 0) {
                return false;
            }
        } else {
            return false;
        }
        for (int i = 0; i < fee.length(); i++) {
            if (!Character.isDigit(fee.charAt(i))) {
                return false;
            }
        }
        return validFee;
    }


    static boolean isValidQuantity(String fee) {
        boolean validFee = true;
        if (!fee.equals("")) {
            if (Integer.parseInt(fee) <= 99) {
                JOptionPane.showMessageDialog(null, "Invalid Medicine Quantity.\nPlease Re-enter Medicine Quantity must be >= 100.", " Invalid Medicine Quantity.", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            return false;
        }
        for (int i = 0; i < fee.length(); i++) {
            if (!Character.isDigit(fee.charAt(i))) {
                return false;
            }
        }
        return validFee;
    }

    static boolean isValidmedicinePrice(String fee) {
        boolean validFee = true;
        if (!fee.equals("")) {
            if (Integer.parseInt(fee) <= 0) {
                return false;
            }
        } else return false;

        for (int i = 0; i < fee.length(); i++) {
            if (!Character.isDigit(fee.charAt(i))) {
                return false;
            }
        }
        return validFee;
    }

    static boolean IsValidDate(JDatePicker datePicker) {
        LocalDate selectedDate = LocalDate.of(datePicker.getModel().getYear(), datePicker.getModel().getMonth() + 1, datePicker.getModel().getDay());
        LocalDate today = LocalDate.now();
        if (selectedDate.isAfter(today) || selectedDate.equals(today)) {
            String date1 = String.format("%02d/%02d/%d", datePicker.getModel().getDay(), datePicker.getModel().getMonth() + 1, datePicker.getModel().getYear());
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please select future date");
            return false;
        }
    }

    static boolean IsvalidPassword(String password) {
        boolean valid_password = false;
        if (password.length() >= 8 && password.length() <= 15) {
            int uCcout = 0, lCcount = 0, sCcount = 0, nMcount = 0;
            char passch[] = password.toCharArray();

            for (int i = 0; i < passch.length; i++) {
                if ((passch[i] >= 33 && passch[i] <= 47) || (passch[i] >= 58 && passch[i] <= 64)) {
                    nMcount++;
                }
                if (passch[i] >= 97 || passch[i] <= 122) {
                    uCcout++;
                }
                if (passch[i] >= 65 && passch[i] <= 90) {
                    lCcount++;
                }
                if (passch[i] >= 48 && passch[i] <= 57) {
                    sCcount++;
                }
            }
            if (nMcount > 0 && uCcout > 0 && lCcount > 0 && sCcount > 0) {
                valid_password = true;
            } else {
//                System.out.println("Invalid Password Please Re-Enter Should be  Between 8-12 Characters");
                valid_password = false;
            }
        }
        return valid_password;
    }

    static boolean isvalidOldPass(int id, String OldPass, String newNmae) {
        boolean checkOldPAss = false;
        String data_Oldpass = null;
        try {
            Connection con = Sconnection.connection();
            Statement stmnt = con.createStatement();

            ResultSet rs = stmnt.executeQuery("SELECT password FROM admin where admin_id = "+id);
            while (rs.next()) {
                data_Oldpass = rs.getString(1);
            }
        } catch (SQLException g) {
            System.out.println("Exception " + g);
        }
        if (OldPass.equals(data_Oldpass)) {
            checkOldPAss = true;
        }
        return checkOldPAss;
    }

    static boolean IsValidAdmitDate(String apt_date, String admit_date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate aptDate = LocalDate.parse(apt_date, formatter);
        LocalDate admitDate = LocalDate.parse(admit_date, formatter);
        boolean p_status;
        if (aptDate.isBefore(admitDate) || apt_date.equals(admit_date)) {
            p_status = true;
        } else {
            p_status = false;
        }
        return p_status;
    }
}
