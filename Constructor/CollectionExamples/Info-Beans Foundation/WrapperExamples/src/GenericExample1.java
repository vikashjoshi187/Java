// generic class
public class GenericExample1<DT> 
{
        void swap(DT a,DT b){
            DT temp;
            temp=a;
            a=b;
            b=temp;
            System.out.println("After swapping : \na : "+a+"\nb : "+b);
        }
        public static void main(String[] args) {
        GenericExample1<Integer> obj = new GenericExample1<>();
        int a=5,b=6;
        obj.swap(a,b);

        GenericExample1<Double> obj1 = new GenericExample1<>();
        double a1=55.67,b1=6.66;
        obj1.swap(a1,b1);

        GenericExample1<Character> obj2 = new GenericExample1<>();
        char a2='x',b2='y';
        obj2.swap(a2,b2);        
   
        }
}






