/**
 * Innerlmda_var
 */
interface Innerlmda_var {

    void sum(int... a);
}
class cool implements Innerlmda_var {

    public void sum(int... a) {
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 100 };
        
        Innerlmda_var obj = (int arr1[]) -> {

            int sum = 0;
            for (int i : arr1) {
                sum = sum + i;
            }
            System.out.println("Sum is " + sum);
        };
        obj.sum(arr);

    }

}
