/**
 * this1
 */
public class this1 {

    int c=21;
    int d=22;

   
    void  cool(int a,int b){
      System.out.println("This is c "+this.c+" "+this.d);
    }

    void dispaly(){System.out.println("This is display "+c+" "+d);}

    public static void main(String[] args) {
         
         this1 obj1= new this1();
         this1 obj2 =new this1();
         obj1.cool(10,15);
         obj1.dispaly();
         obj2.dispaly();

    }
}