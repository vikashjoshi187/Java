import java.util.Scanner;
public class prog_55 {
//55) Find the first non-repeating element in a given array arr of N integers.
//Note: Array consists of only positive and negative integers and not zero.
    static Scanner sc = new Scanner(System.in);
    int size, arr[];

    prog_55(int arr[],int size) {
        this.arr = arr;
        this.size = size;
    }

    void getElement() {
        System.out.println("Enter the elements of the array 1");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
    }
	static void display(){
     System.out.println("Display Method Called");
	}

    void nonRepeat() 
	{
        int firstNonRepeating = 0;
		for (int i = 0; i < size; i++) 
		{
			int count = 0;
			for (int j = 0; j < size; j++) 
			{
				if (arr[i] == arr[j])
					count++;
			}
			if (count == 1) 
			{
				firstNonRepeating = arr[i];
				break;
			}
		}
		if (firstNonRepeating == 0) 
		{
			System.out.println("All elements repeat");
		} 
		else
		{
			System.out.println("The first non-repeating element is: " + firstNonRepeating);
		}
    }


	public static void main(String[] args) {

		prog_55.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array 1");
		int size = sc.nextInt();
		int arr[] = new int [size];
        prog_55 obj = new prog_55(arr,size);
        obj.getElement();
        obj.nonRepeat();
	}
}