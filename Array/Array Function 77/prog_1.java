public class prog_1 {
    // 1)WAP to set marks of 5 subjects manually and print it by indexing.
    int arr[];

    prog_1() {
        int arr[] = { 87, 90, 85, 65, 99 };
        this.arr = arr;
    }

    void prinMrks() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Marks of subject " + (i + 1) + " is " + arr[i]);
        }
    }

    public static void main(String[] args) {
        prog_1 obj = new prog_1();
        obj.prinMrks();
    }
}