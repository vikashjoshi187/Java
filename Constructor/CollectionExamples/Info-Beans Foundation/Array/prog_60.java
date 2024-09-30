import java.util.Scanner;
public class prog_60 {
    //56)  Java program to find nearest lesser and greater element in array
//Given an array of N elements and we have to find nearest lesser and nearest greater element using Java program.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array -> ");
        int size = sc.nextInt();
        int arr[] =new int[size];
        System.out.println("Enter the Elements of Array -> ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } 

        System.out.print("Enter Element To Find Nearest Lesser & Greater -> ");
        int element = sc.nextInt();
        
        int small = 0;
        int large = 0;
        int index = -1;
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                index = i;
            }
        }

        for(int i=index-1,j=index+1;i>=0 || j<size;i--,j++){
            if(j<size && arr[j]<element){
                small = arr[j];
                break;
            }
            else if(i>=0 && arr[i]<element){
                small = arr[i];
                break;
            }
        }
        for(int i=index-1,j=index+1;i>=0 || j<size;i--,j++){
            if(j<size && arr[j]>element){
                large = arr[j];
                break;
            }
            else if(i>=0 && arr[i]>element){
                large = arr[i];
                break;
            }
        }
        System.out.println("Nearest Element Lesser Than "+element+" -> "+small);
        System.out.println("Nearest Element Greater Than "+element+" -> "+large);
    
    }
}
