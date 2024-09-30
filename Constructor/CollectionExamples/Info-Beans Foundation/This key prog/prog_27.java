import java.util.Scanner;

public class prog_27 {
  // )WAP to reverse individual elements of an array
  int arr[], size;

  void setData(int size, int arr[]) {
    this.arr = arr;
    this.size = size;
  }

  void reverseIndividual() {

    for (int i = 0; i < size; i++) {
      int rev = 0;
      while (arr[i] > 0) {
        int rem = arr[i] % 10;
        rev = rev * 10 + rem;
        arr[i] /= 10;
      }
      arr[i] = rev;
    }
    System.out.println("reverse individual elements of an array is: ");
    for (int a : arr) {
      System.out.print("\t" + a);
    }

  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    System.out.println("Enter array elements");
    int arr[] = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    prog_27 obj = new prog_27();
    obj.setData(size, arr);
    obj.reverseIndividual();

  }
}
