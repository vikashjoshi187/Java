import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Emolpoyee {
    public static void main(String[] args) {

        JFrame emp = new JFrame("Employee Information");
        Container container = emp.getContentPane();

        emp.setResizable(false);
        emp.setLayout(null);
        emp.setSize(600, 600);
        emp.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        emp.setLocationRelativeTo(null);// put it last
        JLabel emp_Label = new JLabel("Employee Registration Form");
        emp_Label.setBounds(150, 20, 300, 40);
        emp.add(emp_Label);
        emp_Label.setFont(new Font("Serif", Font.BOLD, 22));

        JLabel emp_name = new JLabel("Employee Name");
        emp_name.setBounds(50, 100, 200, 30);
        emp.add(emp_name);
        emp_name.setFont(new Font("Serif", Font.BOLD, 22));

        JTextField nameT = new JTextField();
        nameT.setBounds(260, 95, 200, 30);
        emp.add(nameT);
        nameT.setFont(new Font("Serif", Font.PLAIN, 18));

        JLabel gender = new JLabel("Gender");
        gender.setBounds(50, 160, 100, 30);
        emp.add(gender);
        gender.setFont(new Font("Serif", Font.BOLD, 22));

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(180, 160, 100, 30);
        male.setFont(new Font("Serif", Font.PLAIN, 20));
        male.setSelected(true);
        emp.add(male);
        container.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(300, 160, 100, 30);
        female.setFont(new Font("Serif", Font.PLAIN, 20));
        emp.add(female);
        container.add(female);

        ButtonGroup selectGender = new ButtonGroup();
        selectGender.add(male);
        selectGender.add(female);

        JLabel hobby = new JLabel("Hobbies");
        hobby.setBounds(50, 220, 100, 30);
        emp.add(hobby);
        hobby.setFont(new Font("Serif", Font.BOLD, 22));

        JCheckBox hplay = new JCheckBox("Playing");
        hplay.setBounds(180, 220, 100, 30);
        emp.add(hplay);

        JCheckBox hdance = new JCheckBox("Dancing");
        hdance.setBounds(300, 220, 100, 30);
        emp.add(hdance);

        JCheckBox hsing = new JCheckBox("Singing");
        hsing.setBounds(420, 220, 100, 30);
        emp.add(hsing);

        JLabel citys = new JLabel("City");
        citys.setBounds(50, 290, 100, 30);
        emp.add(citys);
        citys.setFont(new Font("Serif", Font.BOLD, 22));

        String cityar[] = { "Indore", "Bhopal", "Jablpur", "Dewas", "Ratlam" };

        JComboBox city = new JComboBox(cityar);
        city.setBounds(180, 290, 200, 30);
        city.setFont(new Font("Serif", Font.PLAIN, 16));
        emp.add(city);
        container.add(city);

        JLabel skills = new JLabel("Skills");
        skills.setBounds(50, 360, 150, 30);
        emp.add(skills);
        skills.setFont(new Font("Serif", Font.BOLD, 22));

        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Java");
        listModel.addElement("Python");
        listModel.addElement("C++");
        listModel.addElement("JavaScript");

        JList<String> itemList = new JList<>(listModel);
        itemList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(itemList);
        scrollPane.setBounds(140, 360, 100, 100);
        emp.add(scrollPane);

        JLabel address = new JLabel("Address");
        address.setBounds(300, 360, 150, 30);
        emp.add(address);
        address.setFont(new Font("Serif", Font.BOLD, 22));

        JTextField emp_add = new JTextField();
        emp_add.setBounds(300, 410, 250, 40);
        emp_add.setFont(new Font("Serif", Font.PLAIN, 16));
        emp.add(emp_add);

        JButton submit = new JButton("Submit");
        submit.setBounds(180, 480, 200, 40);
        submit.setFont(new Font("Serif", Font.PLAIN, 22));
        emp.add(submit);
        container.add(submit);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Employee Details");
                frame.setLayout(null);
                frame.setSize(600,600);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);

                JLabel Heading = new JLabel("Employee Selected");
                Heading.setBounds(50, 40, 200, 30);
                frame.add(Heading);
                Heading.setFont(new Font("Serif", Font.BOLD, 22));

                JLabel emp_name = new JLabel("Employee Name");
                emp_name.setBounds(50, 100, 200, 30);
                frame.add(emp_name);
                emp_name.setFont(new Font("Serif", Font.BOLD, 22));

                JLabel emp_name_selected = new JLabel(""+nameT.getText());
                emp_name_selected.setBounds(250, 100, 200, 30);
                frame.add(emp_name_selected);
                emp_name_selected.setFont(new Font("Serif", Font.BOLD, 22));

                JLabel gender = new JLabel("Gender");
                gender.setBounds(50, 160, 100, 30);
                frame.add(gender);
                gender.setFont(new Font("Serif", Font.BOLD, 22));

                String gender1 = null;
                ButtonModel genderselected = selectGender.getSelection();
                if (genderselected == male.getModel()) {
                    gender1 = "Male";
                } else if (genderselected == female.getModel()) {
                    gender1 = "Female";
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a gender");
                }

                JLabel gender_selected = new JLabel(""+gender1);
                gender_selected.setBounds(250, 160, 100, 30);
                frame.add(gender_selected);
                gender_selected.setFont(new Font("Serif", Font.BOLD, 22));

                JLabel hobby = new JLabel("Hobbies");
                hobby.setBounds(50, 220, 100, 30);
                frame.add(hobby);
                hobby.setFont(new Font("Serif", Font.BOLD, 22));

                String selectedOptions = "";
                if (hdance.isSelected()) {
                    selectedOptions += hdance.getText() + "   ";
                }
                if (hplay.isSelected()) {
                    selectedOptions += hplay.getText() + "   ";
                }
                if ( hsing.isSelected()) {
                    selectedOptions += hsing.getText() + "   ";
                }

                JLabel hobby_selected = new JLabel(""+selectedOptions);
                hobby_selected.setBounds(250, 220, 300, 30);
                frame.add(hobby_selected);
                hobby_selected.setFont(new Font("Serif", Font.BOLD, 20));

                JLabel city1 = new JLabel("City");
                city1.setBounds(50, 290, 100, 30);
                frame.add(city1);
                city1.setFont(new Font("Serif", Font.BOLD, 22));

                JLabel citys = new JLabel(""+city.getSelectedItem());
                citys.setBounds(250, 290, 100, 30);
                frame.add(citys);
                citys.setFont(new Font("Serif", Font.BOLD, 22));

                JLabel skills = new JLabel("Skills");
                skills.setBounds(50, 360, 150, 30);
                frame.add(skills);
                skills.setFont(new Font("Serif", Font.BOLD, 22));

                String selectedSkillsText = "";
                int i = 0;
                for (Object skill : itemList.getSelectedValuesList()) {
                    if(i>0){
                        selectedSkillsText += ", ";
                    }
                    selectedSkillsText += String.join(", ", (String)skill);
                    i++;
                }

                JLabel skills1 = new JLabel(""+selectedSkillsText);
                skills1.setBounds(250, 360, 300, 30);
                frame.add(skills1);
                skills1.setFont(new Font("Serif", Font.BOLD, 22));

                JLabel address = new JLabel("Address");
                address.setBounds(50, 420, 150, 30);
                frame.add(address);
                address.setFont(new Font("Serif", Font.BOLD, 22));

                JLabel address_selected = new JLabel(""+emp_add.getText());
                address_selected.setBounds(250, 420, 300, 22);
                frame.add(address_selected);
                address_selected.setFont(new Font("Serif", Font.BOLD, 22));

                frame.setVisible(true);
                emp.dispose();
            }
        });

        emp.setVisible(true);
    }
}