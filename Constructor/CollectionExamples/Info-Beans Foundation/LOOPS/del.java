// WAP to interchange first and last digit of a number
import java.util.Scanner;
class Interchange{
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter number");
    int count,first,temp,rem,last,middle,num = sc.nextInt();
    count =0;
    temp = num;
    while(temp>0){
        temp = temp/10;
        count++;
    }
    first =num/(int)Math.pow(10,count-1);
    System.out.println("first "+first);
    middle =num%((int)Math.pow(10,count-1))/10;
    System.out.println("middle "+middle);
    last =num%10;
    System.out.println("last "+last);
    //  int result=(count==1)?num:last*((int)Math.pow(10,count-1))+middle*(((int)Math.pow(10,count-1))/10)+first;
     int result=(count==1)?num:last*((int)Math.pow(10,count-1))+middle*10+first;
    System.out.println(result);
}
}