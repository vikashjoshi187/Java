import java.util.Scanner;
public class prog_46 {
    //41) Java Program to Sort Names in an Alphabetical Order
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int s=sc.nextInt();

    String name[]=new String[s];
    System.out.println("Enter the names");
    for (int i = 0; i < name.length; i++) {
        if(i==0){
            sc.nextLine();
        }
        name[i]=sc.nextLine();
        
    }

    for (int i = 0; i < name.length; i++) {
            for (int j = i+1; j < name.length; j++) {
                if (name[i].compareTo(name[j])>0) {
                    String temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is");
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]+"\t");
        }
    }
}

