public class var_args {
    void Add(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        var_args obj=new var_args();

        int arr[]={10,20,30,100};
        obj.Add(arr);

    }
}