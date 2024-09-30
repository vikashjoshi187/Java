import org.jdatepicker.JDatePicker;
import javax.swing.*;
import java.time.LocalDate;

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

    static boolean isValidName(String name ){
        boolean Valid_name_boolen = false;
        if(name.length()>0 && !name.equals("In-Valid Name")){
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
       return  Valid_name_boolen;
    }

    static boolean IsValidEmail(String email){
        if(email.length()==0)
        {
            return false;
        }
        else
        {
            if(email.contains(" ")){
                return false;
            } else {
                int count_SC=0;
                char[] cha = email.toCharArray();
                for(int i=0;i<cha.length;i++)
                {
                    if((cha[i]>31 && cha[i]<48)||(cha[i]>57 && cha[i]<65)||(cha[i]>90 && cha[i]<97)||(cha[i]>122 && cha[i]<127))
                    {
                        count_SC++;
                    }
                }
                if(count_SC>5)
                {
                    return false;
                }
                else
                {
                    String parts[] = email.split("@");
                    if(parts.length!=2)
                    {
                        return false;
                    }
                    else
                    {
                        String userName = parts[0];
                        if(!(userName.length()>=1))
                        {
                            return false;
                        }else{
                            String domainName = parts[1];
                            if (domainName.charAt(0)=='.'){
                                return false;


                            }
                            char ch[] = domainName.toCharArray();
                            int c=0;
                            for(int i=0;i<ch.length;i++)
                            {
                                if(ch[i]=='.')
                                    c++;
                            }
                            if(c>2)
                            {
                                return false;
                            }
                            else
                            {
                                boolean res = (domainName.contains(".com")||domainName.contains(".co"));
                                if(!res)
                                {
                                    return false;
                                }
                                else
                                {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static boolean isValidFee(String fee){
boolean validFee=true;
        if (Integer.parseInt(fee) <= 999) {
            return false;
        }
        for (int i = 0; i < fee.length(); i++) {
            if (!Character.isDigit(fee.charAt(i))) {
                return false;
            }
        }
        return validFee;
    }
    static boolean isValidmedicinePrice(String fee){
        boolean validFee=true;
        if (Integer.parseInt(fee) <= 0) {
            return false;
        }
        for (int i = 0; i < fee.length(); i++) {
            if (!Character.isDigit(fee.charAt(i))) {
                return false;
            }
        }
        return validFee;
    }
    static boolean IsValidDate(JDatePicker datePicker){
        LocalDate selectedDate = LocalDate.of(datePicker.getModel().getYear(), datePicker.getModel().getMonth() + 1, datePicker.getModel().getDay());
        LocalDate today = LocalDate.now();
//        if (selectedDate.isAfter(today)){
        if (selectedDate.isAfter(today) || selectedDate.equals(today)) {
            String date1 = String.format("%02d/%02d/%d", datePicker.getModel().getDay(), datePicker.getModel().getMonth() + 1, datePicker.getModel().getYear());
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Please select future date");
            return false;
        }
    }
}
