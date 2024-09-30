public class prog_2 {
    //2)WAP to set the characters of “Hello Andrew” in an array manually and print it by indexing, for loop, while loop, do while loop and for each loop separately.
    char arr[];
    prog_2() {
        char arr1[] = { 'H', 'E', 'L', 'L', 'O', ' ', ' ', 'A', 'N', 'D', 'R', 'E', 'W' };
        this.arr = arr1;
    }

    void prinArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        prog_2 obj = new prog_2();
        obj.prinArr();
    }
}