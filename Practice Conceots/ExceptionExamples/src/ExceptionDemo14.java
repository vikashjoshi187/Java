public class ExceptionDemo14 {
    public static void main(String[] args) {
        
        
        int valid=0,invalid=0;
           
        for(int i=0;i<args.length;i++){
               
            
            try{
                    Integer.parseInt(args[i]);
                    valid++;
                }
                
                catch(NumberFormatException e){
                    invalid++;
                }                
           
           
            }
            System.out.println("valid : "+valid+"\nInvalid : "+invalid);
    }
}
