public class ExceptionDemo10 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        try{
        System.out.println("arr[6] : "+arr[6]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
        
        String str = "Anderson";
        try{
        System.out.println("str.charAt(20) : "+str.charAt(20));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
    }
}
