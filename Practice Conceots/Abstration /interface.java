

// /**
//  * interface
//  */
//  interface outerinterface  {
   

//     void display();
    
//      interface innerinterface extends outerinterface {
    
//        void show();

//     }
    
// }

// class interface1 {

//     public static void main(String[] args) {
//         outerinterface.innerinterface obj = new outerinterface.innerinterface(){
//             public void display(){
//                 System.out.println("Display method called");
//             }
//             public void show(){
                
//                 System.out.println("show method called");
//             }
//         };




//     }
// }



/**
 * interface
 */
 interface outerinterface  {
   

    void display();
    
     interface innerinterface extends outerinterface {
    
       void show();

    }
    
}

class interface1 implements outerinterface.innerinterface  {

    public void display(){
          System.out.println("Vikas joshi");
    }

     public void show(){
          System.out.println("Aarti joshi");
    }



    public static void main(String[] args) {
         new interface1().show();




    }
}

