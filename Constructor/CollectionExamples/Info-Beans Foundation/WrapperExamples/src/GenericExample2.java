// generic class
public class GenericExample2<DT1,DT2> 
{
        void swap(DT1 a,DT2 b){
            System.out.println("a :  "+a);
            System.out.println("b :  "+b);
        }
        public static void main(String[] args) {
        GenericExample2<Integer,Double> obj = new GenericExample2<>();
        obj.swap(100,45.56);


        

        // GenericExample2<String,Float> obj1 = new GenericExample2<>();
        // obj1.swap("Andrew",45.56f);

        }
}






