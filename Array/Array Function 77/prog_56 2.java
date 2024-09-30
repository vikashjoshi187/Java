import java.util.Scanner;
public class prog_56 {
    //ava program to find nearest lesser and greater element in array
//Given an array of N elements and we have to find nearest lesser and nearest greater element using Java program.
    static Scanner sc = new Scanner(System.in);
    int size, arr[];

    prog_56(int arr[],int size) {
        this.arr = arr;
        this.size = size;
    }

    void getElement() {
        System.out.println("Enter the elements of the array-1 :- ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
    }

    void smallestLargest() {
        System.out.print("Enter Element To Find Nearest Lesser & Greater :- ");
        int element = sc.nextInt();
        
        int small = 0;
        int large = 0;
        int index = -1;
        for(int i=0;i<size;i++){
            if(arr[i]==element){
                index = i;
            }
        }
        /// 1 2 3 4 5

        for(int i=index-1,j=index+1;i>=0 || j<size;i--,j++){
            if(j<size && arr[j]<element){
                small = arr[j];
                //break;
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
        System.out.println("Nearest Element Lesser Than "+element+" :- "+small);
        System.out.println("Nearest Element Greater Than "+element+" :- "+large);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array -> ");
		int size = sc.nextInt();
		int arr[] = new int [size];
        prog_56 obj = new prog_56(arr,size);
        obj.getElement();
        obj.smallestLargest();
	}
}