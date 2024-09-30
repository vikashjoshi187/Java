import java.util.Scanner;

public class prog_29 {
//29)WAP to find out the frequency of all the elements of an array
    int s;
    int arr[];

    prog_29(int s) {
        Scanner sc=new Scanner(System.in);

        this.s = s;
        
        int arr[]=new int [s];
        System.out.println("Enter arry elemets");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        this.arr=arr;
    }

    void eleeFreq() {
        int frq[] = new int[arr.length];
        int ctd = -1;
        for (int i = 0; i < s; i++) {
            int count = 1;
            for (int j = i + 1; j < s; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frq[j] = ctd;
                }
                
            }
            if (frq[i] != ctd) {
                frq[i] = count;
                System.out.println("element :-" + arr[i] + "\tFrequency:- " + frq[i]);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arr");
        int s = sc.nextInt();
        prog_29 obj = new prog_29(s);
        obj.eleeFreq();

    }
}
