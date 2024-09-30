package PACKAGE_NAME;

import java.util.Scanner;

class MyCqueue {
    private final int MAXSIZE = 5;
    private int front, rear, count;
    private int arr[];

    MyCqueue() {
        this.init();
    }

    public void init() {
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.arr = new int[MAXSIZE];
    }

    public boolean isEmpty() {
        if (this.count == 0)
            return true;
        return false;
    }

    public boolean isFull() {
        if (this.count == this.MAXSIZE)
            return true;
        return false;
    }

    public void insert(Scanner sc) {
        if (this.isFull()) {
            System.out.println("Queue is full...");
        } else {
            if (this.rear == this.MAXSIZE) {
                this.rear = 0;
            }
            System.out.println("Enter the Element :");
            int item = sc.nextInt();
            this.arr[rear] = item;
            this.rear++;
            this.count++;
        }
    }

    public void delete() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            if (this.front == this.MAXSIZE) {
                this.front = 0;
            }
            int item = this.arr[this.front];
            this.front++;
            this.count--;
            System.out.println(item + " Element successfully deleted....!");
        }
    }

    public void traverse() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            System.out.println(this.front+"Queue Elemets are:"+this.rear);


            for (int i = this.front,j=1;j<=this.count; i++,j++) {
                if (i == this.MAXSIZE) {
                    i = 0;
                }
                System.out.print(this.arr[i] + "\t");
            }
            System.out.println();
        }
    }
}

 class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyCqueue obj = new MyCqueue();
        int ch;

        do {
            System.out.println("\nYour choises are");
            System.out.println("1 for Insert\n2 for Delete\n3 for Traverse\n4 for EXIT");
            System.out.print("Enter Your Choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    obj.insert(sc);
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
            }
        } while (ch != 4);
    }
}