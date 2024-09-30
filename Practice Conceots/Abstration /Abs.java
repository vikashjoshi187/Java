/**
 * Abs
 */
abstract class Abs {
  
    static void diplay(){
        System.out.println("cool");
    };
   
}

/**
 * InnerAbs
 */
 class InnerAbs extends Abs {
//  void diplay(){
//         System.out.println("Vikas");
//     }
public static void main(String[] args) {
       Abs obj= new InnerAbs();
       obj.diplay();
    }
    
}