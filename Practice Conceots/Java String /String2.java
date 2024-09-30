// program showing the concept of String
class StringDemo2{
    public static void main(String args[]){
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Welcome";
        String s4 = new String("Hello");
        String s5 = new String("Hello");
        String s6 = new String("Welcome");
        
        System.out.println("s1.equals(s2) : "+s1.hashCode()+"  "+s2.hashCode());//T
        System.out.println("s1.equals(s3) : "+s1==s3);//F
        System.out.println("s1.equals(s4) : "+s1==s4);//T F
        System.out.println("s4.equals(s5) : "+s4==s5);//F
        System.out.println("s4.equals(s6) : "+s4==s6);//F
        System.out.println("s3.equals(s6) : "+s3==s6);//F
      }
}