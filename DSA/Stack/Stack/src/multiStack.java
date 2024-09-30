import java.util.Scanner;

class MyStack1 {
    private int arr[];
    private int top1;
    private int top2;
    private final int MAXSIZE = 10;

    public MyStack1() {
        this.init();
    }

    public void init() {
        this.arr = new int[MAXSIZE];
        this.top1 = 0;
        this.top2 = MAXSIZE;
    }

    public boolean isEmpty1() {
        if (this.top1 == 0)
            return true;
        return false;
    }

    public boolean isEmpty2() {
        if (this.top2 == MAXSIZE)
            return true;
        return false;
    }

    public boolean isFull() {
        if (this.top1 == this.top2)
            return true;
        return false;
    }

    public void push1(Scanner sc) {
        int item;
        if (this.isFull())
            System.out.println("\nStack is Full from top1...\n");
        else {
            System.out.println("Enter Any Element :");
            item = sc.nextInt();
            this.arr[this.top1] = item;
            this.top1++;
        }
    }

    public void push2(Scanner sc) {
        int item;
        if (this.isFull())
            System.out.println("\nStack is Full from top2...\n");
        else {
            this.top2--;
            System.out.println("Enter Any Element :");
            item = sc.nextInt();
            this.arr[this.top2] = item;
        }
    }

    public void pop1() {
        int item;
        if (this.isEmpty1())
            System.out.println("\nStack is Empty form top1...\n");
        else {
            this.top1--;
            item = this.arr[top1];
            System.out.println(item + " is deleted from the stack...");
        }
    }

    public void pop2() {
        int item;
        if (this.isEmpty2())
            System.out.println("\nStack is Empty form top2...\n");
        else {
            this.top1++;
            item = this.arr[top1];
            System.out.println(item + " is deleted from the stack...");
        }
    }

    public void peep1() {
        if (this.isEmpty1())
            System.out.println("\nStack is Empty from top1...\n");
        else {
            System.out.println("Stack elements are:");
            for (int i = this.top1 - 1; i >= 0; i--) {
                System.out.print(this.arr[i] + "\t");
            }
            System.out.println();
        }
    }

    public void peep2() {
        if (this.isEmpty2())
            System.out.println("\nStack is Empty from top2...\n");
        else {
            System.out.println("Stack elements are:");
            for (int i = this.top2; i < MAXSIZE; i++) {
                System.out.print(this.arr[i] + "\t");
            }
            System.out.println();
        }
    }

}

 class Teststack1 {
    public static void main(String[] args) {
        MyStack1 obj = new MyStack1();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1 For Pop From Top1 \n2 For Push From Top1 \n3 For Peep From Top1");
            System.out.println("4 For Pop From Top2 \n5 For Push From Top2 \n6 For Peep From Top1 \n7 For Exit");
            System.out.println("Enter Your Choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.pop1();
                    break;
                case 2:
                    obj.push1(sc);
                    break;
                case 3:
                    obj.peep1();
                    break;
                case 4:
                    obj.pop2();
                    break;
                case 5:
                    obj.push2(sc);
                    break;
                case 6:
                    obj.peep2();
                    break;
            }
        } while (choice != 7);
    }
}