class MyClass{}
// generic class
public class GenericExample3<DT> 
{
    // generic method
        <DT>void swap(DT a,DT b){
            DT temp;
            temp=a;
            a=b;
            b=temp;
            System.out.println("After swapping : \na : "+a+"\nb : "+b);
        }
        public static void main(String[] args) {
        GenericExample3<MyClass> obj = new GenericExample3<>();
        int a=5,b=6;
        obj.swap(a,45.56);

        double a1=55.67,b1=6.66;
        obj.swap(a1,b1);

        char a2='x',b2='y';
        obj.swap(a2,b2);        
   
        }
}






