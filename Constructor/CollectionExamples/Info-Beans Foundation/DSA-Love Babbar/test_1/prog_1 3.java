import java.util.Scanner;
public class prog_1
{   
    int arr[],size ;
    prog_1(int arr[] ,int size){
    this.arr = arr;
    this.size = size;
    }
    void display(){
        System.out.println("\nArray elements are : ");
        for(int i=0;i<size;i++)
        {
            System.out.println("\t"+arr[i]);
        }
    }
    int[] freq(){
        int freq[] = new int[arr.length];
            int counted = -1;
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                count++;
                freq[j]=counted;     
                }
            }
            if(freq[i]!=counted)
            {
                freq[i] = count;
            }
        } 
        return freq;  
        
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array  ");
        int size = sc.nextInt();
        
        int arr[]=new int[size];
        
        System.out.println("Enter array elements ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        prog_1 obj = new prog_1(arr,size);
        obj.display();
        int a[] = obj.freq();
        System.out.println("\nArray elements are : ");
        for(int i=0;i<size;i++)
        {
            if(a[i] != -1){

                System.out.println("element : "+arr[i]+"\tfreq : "+a[i]);
            }
            }

    }
}