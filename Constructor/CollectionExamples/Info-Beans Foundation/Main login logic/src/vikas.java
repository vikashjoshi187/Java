import java.util.Scanner;
public class vikas {
    static int  count =0;
    String name,password,mobile,email;
    static boolean isValidContactNumber(String contactNumber) {
        if (contactNumber.length() != 10) {
            return false;
        }
        for (int i = 0; i < contactNumber.length(); i++) {
            if (!Character.isDigit(contactNumber.charAt(i))) {
                return false;
            }
        }
        char first = contactNumber.charAt(0);
        if (contactNumber.charAt(0) < '6' || contactNumber.charAt(0) > '9'){
            return false;
        }
        return true;
    }
    void Login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Sign up\nEnter 2 For Lon-in");
        int a;

        do {
            a=sc.nextInt();
            if (a==1){//FOR Sign-Up
                System.out.println("Sign-up Page");
                boolean valid_name=true;
                do {
                    if (valid_name=true){
                        System.out.println("Enter Name");
                    }
                    sc.nextLine();
                    this.name=sc.nextLine();
                    String words[] = name.split(" ");
                    for(String word : words) {
                        char charr[]=word.toCharArray();
                        for (int i = 0; i < charr.length; i++) {
                            if(charr[i]>=65 && charr[i]<=90 || charr[i]>=97 && charr[i]<=122){
                                valid_name=false;
                            }
                            else {
                                System.out.println("Invalid Name Please Re-enter");
                                valid_name=true;
                                break;
                            }
                        }
                    }
                }while (valid_name);
                boolean mobileb = true;
                String mobile;
                do {
                    System.out.println("Enter Mobile Number : ");
                    this.mobile = sc.nextLine();
                    if (isValidContactNumber(this.mobile)) {
                        System.out.println("Valid contact number");
                        mobileb = false;
                    } else {
                        System.out.println("Invalid contact number");
                        mobileb = true;
                    }
                }while (mobileb);
                int count = 0;



                boolean isValid=true;
                do
                {
                    System.out.println("Enter Your Email Id :");
                     this.email = sc.nextLine();
                    if(email.length()==0)
                    {
                        isValid=true;
                        System.out.println("Re Enter : 1");
                    }
                    else
                    {
                        if(email.contains(" ")){
                            isValid = true;
                            System.out.println("Re Enter : 7");
                        } else {
                            int count_SC=0;
                            char cha[] = email.toCharArray();
                            for(int i=0;i<cha.length;i++)
                            {
                                if((cha[i]>31 && cha[i]<48)||(cha[i]>57 && cha[i]<65)||(cha[i]>90 && cha[i]<97)||(cha[i]>122 && cha[i]<127))
                                {
                                    count_SC++;
                                }
                            }
                            if(count_SC>5)
                            {
                                isValid=true;
                                System.out.println("Re Enter : 2");
                            }
                            else
                            {
                                String parts[] = email.split("@");
                                if(parts.length!=2)
                                {
                                    isValid=true;
                                    System.out.println("Re Enter : 3");
                                }
                                else
                                {
                                    String userName = parts[0];
                                    if(!(userName.length()>=1))
                                    {
                                        isValid = true;
                                        System.out.println("Re Enter : 4");
                                    }else{
                                        String domainName = parts[1];
                                        if (domainName.charAt(0)=='.'){
                                            isValid=true;
                                            System.out.println("Re Enter Email");
                                            continue;

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
                                            isValid=true;
                                            System.out.println("Re enter : 5");
                                        }
                                        else
                                        {
                                            boolean res = (domainName.contains(".com")||domainName.contains(".co"));
                                            if(!res)
                                            {
                                                isValid=true;
                                                System.out.println("Re Enter : 6");
                                            }
                                            else
                                            {
                                                isValid=false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }while(isValid);



                boolean valid_password=true;
                do {
                    System.out.println("Create Password");
                    this.password=sc.nextLine();
                    if (password.length()>=8 && password.length()<=12){
                        int uCcout=0,lCcount=0,sCcount=0,nMcount=0;
                        char passch[]=password.toCharArray();

                        for (int i = 0; i < passch.length; i++) {
                            if((passch[i]>=33 && passch[i]<=47) || (passch[i] >= 58 && passch[i] <= 64)){
                                nMcount++;
                            }
                            if (passch[i]>=97 || passch[i]<=122){
                                uCcout++;
                            }
                            if (passch[i]>=65 && passch[i]<=90){
                                lCcount++;
                            }
                            if (passch[i]>=48 && passch[i]<=57){
                                sCcount++;
                            }
                        }
                        if (nMcount>0 && uCcout>0 && lCcount>0 && sCcount>0){
                            valid_password=false;
                        }
                        else {
                            System.out.println("Invalid Password Please Re-Enter Should be  Between 8-12 Characters");
                            valid_password=true;
                        }
                    }
                    else {
                        System.out.println("Invalid Password Please Re-Enter Should be  Between 8-12 Characters");
                        valid_password=true;
                    }
                }while (valid_password);//For Valid Password
                String Chckpass;
                System.out.println("Confirm Password");
                do {
                    Chckpass=sc.next();
                    if (!Chckpass.equals(password)){
                        System.out.println("Please Enter Same Password as Above");
                    }
                    else {
                        System.out.println("Sign Up SuccessFull!!!");
                        vikas.count++;
                    }
                }while (!Chckpass.equals(password));

                this.Login();
            }





            else if (a==2 && count>0) {//FOR Log-in
                this.Signup(this);
            }
            if(a==2 && count==0){//FOR NO ENTRIES
                System.out.println("There Are No Entries Yet Please Sign Up First");
                vikas calllogin=new vikas();
                calllogin.Login();
            }
            if (a<=0 || a>2){//FOR IN-VALID CHOICE
                System.out.println("Invalid Choice PLease Re-enter");
            }
        }while (a<=0 || a>2 || a==2 && count==0 );//FOR RE-Entering Correct Choice
    }
    void Signup(vikas v){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome To Login Page");
        String loginName,loginpass;
do {
    System.out.println("Enter Name");
    loginName=sc.nextLine();
    System.out.println("Enter Your Passwaord");
        loginpass=sc.nextLine();
        if (this.name.equals(loginName)){
            System.out.println("User"+loginName+" not Found in database");
        }
        if (!this.password.equals(loginpass)){
            System.out.println("Enter a Correct user Password");
        }
}while ((!this.name.equals(loginName) && (!this.password.equals(loginpass))));

        System.out.println("Log In Success Full");

        System.out.println("Hello "+this.name);
           int c;
        do {
            System.out.println("Enter 1 To Show Account Information \nOtherwise press any key");
            c=sc.nextInt();
            if (c==1){
                System.out.println("User Name : "+this.name);
                System.out.println("User Email : "+this.email);
                System.out.println("Mobile Number is : "+this.mobile);

            }
            else {
                System.out.println("Thank You "+this.name+" For loging in");
            }
       }while (c!=1);
    }



    public static void main(String[] args) {
vikas v=new vikas();
v.Login();
     }
}
