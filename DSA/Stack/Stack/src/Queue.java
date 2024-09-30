package PACKAGE_NAME;

import java.util.Scanner;

class MyQueue {

    private final int MAXSIZE = 10;
    private int front;
    private int rear;
    private int arr[];

    MyQueue() {
        this.init();
    }

    public void init() {
        this.front = 0;
        this.rear = 0;
        this.arr = new int[MAXSIZE];
    }

    public boolean isEmpty() {
        if (this.front == this.rear)
            return true;
        return false;

    }

    public boolean isFull() {
        if (this.rear == MAXSIZE)
            return true;
        return false;
    }

    public int size() {
        return this.rear;
    }

    public int capacity() {
        return MAXSIZE;
    }

    public void insert(Scanner sc) {
        if (this.isFull()) {
            System.out.println("Queue is full...");
        } else {
            System.out.println("Enter the Element :");
            int item = sc.nextInt();
            this.arr[rear] = item;
            this.rear++;

        }

    }

    public void delete() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            int item = this.arr[this.front];
            this.front++;
            System.out.println(item + " Element successfully deleted....!");

        }
    }

    public void traverse() {
        if (this.isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            System.out.println("Queue Elements :");
            for (int i = this.front; i < this.rear; i++) {

                System.out.println(this.arr[i]);
            }

        }
    }

    public void search(Scanner sc) {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            this.sort();

            int searchElement;
            boolean flag = false;

            System.out.println("Enter search element :");
            searchElement = sc.nextInt();
            int first = 0;
            int last = MAXSIZE - 1;
            int mid = (first + last) / 2;

            while (first <= last) {
                if (arr[mid] < searchElement) {
                    first = mid + 1;
                } else if (arr[mid] == searchElement) {
                    System.out.println("Element Found at Index No." + (mid + 1));
                    break;
                } else {
                    last = mid - 1;
                    mid = (first + last) / 2;
                }
            }

            if (first > last) {
                System.out.println("Element not found in Queue");
            }
        }

    }

    public void update(Scanner sc) {
        int index = 0;
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            this.traverse();
            System.out.println("\nEnter element for update : ");
            int searchElement = sc.nextInt();

            for (int i = this.front; i < this.rear; i++) {
                if (arr[i] == searchElement) {
                    index = i;
                    break;
                }
            }

            System.out.println("Enter updated element : ");
            int updateElement = sc.nextInt();

            this.arr[index] = updateElement;
            System.out.println("Element update succesfully");
        }

    }

    public void duplicateCount() {

        if (this.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            int countArr[] = new int[MAXSIZE];
            int counted = -1;
            for (int i = this.front; i < this.rear; i++) {
                int count = 1;
                for (int j = i + 1; j < this.rear; j++) {
                    if (this.arr[i] == this.arr[j]) {
                        count++;
                        countArr[j] = counted;
                    }
                }
                if (countArr[i] != counted)
                    countArr[i] = count;
            }

            System.out.println("Queue elements : ");
            for (int i = this.front; i < this.rear; i++) {
                if (countArr[i] != counted)
                    System.out.println("element  : " + this.arr[i] + "  : count  :   " + countArr[i]);
            }

        }

    }

    public void sum() {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            int sum = 0;
            for (int i = this.front; i < this.rear; i++) {
                sum += arr[i];
            }
            System.out.println("Sum  of allElement in Queue : " + sum);
        }
    }

    public void asc() {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            int arr1[] = this.arr;
            int temp;
            for (int i = this.front; i < this.rear; i++) {
                for (int j = i + 1; j < this.rear; j++) {
                    if (arr1[i] > arr1[j]) {
                        temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    }
                }
            }
            System.out.println("Queue Element in Ascending Order : ");
            for (int i = this.front; i < this.rear; i++) {
                System.out.print("\t" + arr1[i]);
            }
        }

    }

    public void desc() {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            int arr2[] = this.arr;
            int temp;
            for (int i = this.front; i < this.rear; i++) {
                for (int j = i + 1; j < this.rear; j++) {
                    if (arr2[i] < arr2[j]) {
                        temp = arr2[i];
                        arr2[i] = arr2[j];
                        arr2[j] = temp;
                    }
                }
            }
            System.out.println("Queue Element in Ascending Order : ");
            for (int i = this.front; i < this.rear; i++) {
                System.out.print("\t" + arr2[i]);
            }
        }
    }

    public void sort() {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            int temp;
            for (int i = this.front; i < this.rear; i++) {
                for (int j = i + 1; j < this.rear; j++) {
                    if (this.arr[i] > this.arr[j]) {
                        temp = this.arr[i];
                        this.arr[i] = this.arr[j];
                        this.arr[j] = temp;
                    }
                }
            }
            this.traverse();
        }
    }

    public void reverse() {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            int temp;
            this.traverse();
            for (int i = this.front; i < this.rear / 2; i++) {
                temp = this.arr[i];
                this.arr[i] = this.arr[this.rear - 1 - i];
                this.arr[this.rear - 1 - i] = temp;
            }

            System.out.println("\nQueue Element after Reversing Order : ");
            for (int i = this.front; i < this.rear; i++) {
                System.out.print("\t" + this.arr[i]);
            }
        }

    }

    public void secondMax() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            System.out.println("Queue Element : ");
            for (int i = this.front; i < this.rear; i++) {
                System.out.print("\t" + this.arr[i]);
            }
            int max = this.arr[0];
            int min = this.arr[0];
            for (int i = this.front + 1; i < this.rear; i++) {
                if (this.arr[i] > max) {
                    max = this.arr[i];
                }
            }
            for (int i = this.front = 1; i < this.rear; i++) {
                if (this.arr[i] < min) {
                    min = this.arr[i];
                }
            }
            int max2 = min;
            for (int i = this.front; i < this.rear; i++) {
                if (this.arr[i] > max2 && this.arr[i] < max) {
                    max2 = this.arr[i];
                }
            }
            System.out.println("Second Maximum Element is : " + max2);
        }
    }

    public void secondMin() {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            System.out.println("Queue Element : ");
            for (int i = this.front; i < this.rear; i++) {
                System.out.print("\t" + this.arr[i]);
            }
            int max = this.arr[0];
            int min = this.arr[0];
            for (int i = this.front + 1; i < this.rear; i++) {
                if (this.arr[i] > max) {
                    max = this.arr[i];
                }
            }
            for (int i = this.front + 1; i < this.rear; i++) {
                if (this.arr[i] < min) {
                    min = this.arr[i];
                }
            }
            int min2 = max;
            for (int i = this.front; i < this.rear; i++) {
                if (this.arr[i] < min2 && this.arr[i] > min) {
                    min2 = this.arr[i];
                }
            }
            System.out.println("Second Minimum Element is : " + min2);
        }
    }

    public void max() {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            System.out.println("Queue Element : ");
            for (int i = this.front; i < this.rear; i++) {
                System.out.print("\t" + this.arr[i]);
            }
            int max = this.arr[0];
            for (int i = this.front + 1; i < this.rear; i++) {
                if (this.arr[i] > max) {
                    max = this.arr[i];
                }
            }
            System.out.println("Maximum Element is : " + max);
        }
    }

    public void min() {
        if (isEmpty())
            System.out.println("Queue is Empty...");
        else {
            System.out.println("Queue Element : ");
            for (int i = this.front; i < this.rear; i++) {
                System.out.print("\t" + this.arr[i]);
            }
            int min = this.arr[0];
            for (int i = this.front + 1; i < this.rear; i++) {
                if (this.arr[i] < min) {
                    min = this.arr[i];
                }
            }
            System.out.println("Minimum Element is : " + min);
        }
    }

}

 class TestQu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyQueue obj = new MyQueue();
        int ch;

        do {
            System.out.println("\nYour choises are");
            System.out.println("1 for Insert\n2 for Delete\n3 for Traverse\n4 for Size\n5 for Capacity\n" +
                    "6 for Search \n7 for Update\n8 for Duplicate\n9 for Sum\n10 for Ascending Order\n11 for Descending Order"
                    +
                    "\n12 for Sorting Queue\n13 for Reverse\n14 for Minimum Element\n15 for Maximum\n16 for Second Minimum\n17 for Second Maximum\n18 for Exit ");
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
                case 4:
                    System.out.println("Size of Queue : " + obj.size());
                    break;
                case 5:
                    System.out.println("Capacity of Queue : " + obj.capacity());
                    break;
                case 6:
                    obj.search(sc);
                    break;
                case 7:
                    obj.update(sc);
                    break;
                case 8:
                    obj.duplicateCount();
                    break;
                case 9:
                    obj.sum();
                    break;
                case 10:
                    obj.asc();
                    break;
                case 11:
                    obj.desc();
                    break;
                case 12:
                    obj.sort();
                    break;
                case 13:
                    obj.reverse();
                    break;
                case 14:
                    obj.min();
                    break;
                case 15:
                    obj.max();
                    break;
                case 16:
                    obj.secondMin();
                    break;
                case 17:
                    obj.secondMax();
                    break;

            }
        } while (ch != 18);

    }
}