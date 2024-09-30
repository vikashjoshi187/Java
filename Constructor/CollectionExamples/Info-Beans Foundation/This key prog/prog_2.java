import java.util.Scanner;
public class prog_2 {
  //13) WAP to find out average of 5 numbers
  float sub1,sub2,sub3,sub4,sub5;
        
  void setData(float sub1,float sub2,float sub3,float sub4,float sub5){
               
               this.sub1 = sub1;
               this.sub2 = sub2;
               this.sub3 = sub3;
               this.sub4 = sub4;
               this.sub5 = sub5;
        }
      
      
      
        float avg(){
      float avrg = (sub1+sub2+sub3+sub4+sub5)/5;
      return avrg;
      }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        prog_2 obj = new prog_2();
        System.out.println("Enter subject 1");
        int sub1 =sc.nextInt();
        System.out.println("Enter subject 2");
        int sub2 =sc.nextInt();
        System.out.println("Enter subject 3");
        int sub3 =sc.nextInt();
        System.out.println("Enter subject 5");
        int sub4 =sc.nextInt();
        System.out.println("Enter subject 6");
        int sub5 =sc.nextInt();

        obj.setData(sub1,sub2,sub3,sub4,sub5);
        System.out.println("Avrage of 5 subjects is :");
        float x =obj.avg();
        System.out.println(x);
    }
}
