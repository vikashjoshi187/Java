package PACKAGE_NAME;

import java.util.Scanner;
class stack{
    int MAXSIZE=10;
    int arr[];
    int top;
    public stack(){
        this.init();
    }
    public void init(){
    this.arr=new int[MAXSIZE];
    this.top=0;
    }
    public int capacity()
    {
        return arr.length;
    }
    public boolean isEmpty(){
        if(this.top==0) return true;
        return  false;
    }
    public boolean isFull(){
        if(this.top==MAXSIZE){
            return  true;
        }
        return  false;
    }
    public  void  push(Scanner sc){
        int item;
        if(this.isFull()){
            System.out.println("\nSatck is Full");}
        else {
            System.out.println("Enter Any item\n");
            item= sc.nextInt();
            this.arr[top]=item;
            this.top++;}
        System.out.println("\nItem pushed Successfully!!");
    }
    public void pop(){
        int item;
        if(this.isEmpty()){
            System.out.println("\nStack is empty");
        }
        else {
            this.top--;
            item=this.arr[top];
            System.out.println(item+" is Deleted from Stack");
        }

    }
    public void peep(){
        int item;
        if(this.isEmpty()){
            System.out.println("\nEmpty Stack...");
        }
        else {
            System.out.print("Stack elements are");
            for (int i = this.top-1; i >=0 ; i--) {
                System.out.print(" "+this.arr[i]);
            }
        }
    }
    public void size(){
        if(this.top==0){
            System.out.println("\nStack is empty\n");}
        else {
            System.out.println("\nStack Size is "+(this.top)+"\n");}
    }
    public void update(Scanner sc){
        if(this.isEmpty()){
            System.out.println("\nStack Is empty");
        }
        else {
            int index=0;
            do {
                System.out.println("\nEnter Index That You want to Update");
                index=sc.nextInt();
                if(index>this.top-1 || index<0 ){System.out.println("\nPlease enter index less then or equal to "+(this.top-1));}
                else {
                    System.out.println("Enter new item \n");
                    int item=sc.nextInt();
                    this.arr[index]=item;
                    System.out.println("\nStack Updated Sucessfully");
                }
            }while (index>this.top-1 || index<0);

        }
    }
    public void count(Scanner sc){
        if(this.isEmpty()){System.out.println("\nStack is empty");}
        else {
            System.out.println("\nEnter item to count");
            final int item=sc.nextInt();
            int count=0;
            for (int i = 0; i < this.top-1 ; i++) {
                if (item==this.arr[i]){count++;}
            }
            System.out.println("\nThe Frequency of "+item+" is "+count);
        }
    }
    public void sum(){
        if(this.isEmpty()){System.out.println("\nStack is Empty");}
        else {
            int sum=0;
            for (int i = 0; i <this.top-1 ; i++) {
                sum+=this.arr[i];
            }
            System.out.println("\nThe sum of tack elements are"+sum);
        }
    }
    public void asc(){
        if(this.isEmpty()){System.out.println("\nStack is Empty");}
        else {
            int temparr[]=new int[MAXSIZE];
            for (int i = 0; i <= this.top-1; i++) {
                temparr[i]=this.arr[i];
            }
            for (int i = 0; i <=this.top-1 ; i++) {
                for (int j = i+1; j <=this.top-1 ; j++) {
                    if(temparr[i]>temparr[j]){
                        temparr[i]=temparr[i]+temparr[j];
                        temparr[j]=temparr[i]-temparr[j];
                        temparr[i]=temparr[i]-temparr[j];
                    }
                }
            }
            System.out.print("\nStack in ascending order is\n");
            for (int j = 0; j <this.top; j++) {
                System.out.print(" " + temparr[j]);
            }
        }
    }
    public void sort(){
        if(this.isEmpty()){System.out.println("\nStack is Empty");}
        else {
            for (int i = 0; i <=this.top-1 ; i++) {
                for (int j = i+1; j <=this.top-1 ; j++) {
                    if(this.arr[i]>this.arr[j]){
                        this.arr[i]=this.arr[i]+this.arr[j];
                        this.arr[j]=this.arr[i]-this.arr[j];
                        this.arr[i]=this.arr[i]-this.arr[j];
                    }
                }
            }
            this.peep();
        }
    }
    public void dsc(){
        if(this.isEmpty()){System.out.println("\nStack is Empty");}
        else {
            int temparr[]=new int[MAXSIZE];
            for (int i = 0; i <= this.top-1; i++) {
                temparr[i]=this.arr[i];
            }


            for (int i = 0; i <=this.top-1 ; i++) {
                for (int j = i+1; j <=this.top-1 ; j++) {
                    if(temparr[i]<temparr[j]){
                        temparr[i]=temparr[i]+temparr[j];
                        temparr[j]=temparr[i]-temparr[j];
                        temparr[i]=temparr[i]-temparr[j];
                    }
                }
            }
            System.out.println("\nStack in ascending order is\n");
            for (int j = 0; j <this.top; j++) {
                System.out.println(" " + temparr[j]);
            }
        }
    }
    public void reverse(){
        if (this.isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            for (int i = 0; i <this.top-1 ; i++) {
               int temp=this.arr[i];
               this.arr[i]=this.arr[this.top-1-i];
                this.arr[this.top-1-i]=temp;}
            System.out.println("Stack reversed Sucesssfully");

        }
    }
    public  void max(){
        if(this.isEmpty()){
            System.out.println("\nStack is Empty");
        }
        else {
            int max=this.arr[0];
            for (int i = 1; i <=this.top-1 ; i++) {
                if(this.arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.println("The Maximum element is "+max);
        }
    }
    public  void min(){
        if(this.isEmpty()){
            System.out.println("\nStack is Empty");
        }
        else {
            int min=this.arr[0];
            for (int i = 1; i <=this.top-1 ; i++) {
                if(this.arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.println("The Minimum element is "+min);
        }
    }
    public void search(Scanner sc){
        if(this.isEmpty()){
            System.out.println("\nStack is empty");
        }
        else {
            System.out.println("\nEnter element to search");
            int ele=sc.nextInt();
            boolean flag=false;
            for (int i = 0; i <=this.top-1 ; i++) {
                if(this.arr[i]==ele){
                    flag=true;
                    System.out.println("\nThe entered element is at index of "+i);
                    break;
                }
                else {
                    flag=false;
                }
            }
            if (flag==false)
                System.out.println("\nNo such element found in stack");

        }
    }
    public void seMin() {
        if (isEmpty())
            System.out.println("Stack is Empty...");
        else {
            int max = this.arr[0];
            int min = this.arr[0];
            for (int i = 1; i < this.top; i++) {
                if (this.arr[i] > max) {
                    max = this.arr[i];
                }
            }
            for (int i = 1; i < this.top; i++) {
                if (this.arr[i] < min) {
                    min = this.arr[i];
                }
            }
            int min2 = max;
            for (int i = 0; i < this.top; i++) {
                if (this.arr[i] < min2 && this.arr[i] > min) {
                    min2 = this.arr[i];
                }
            }
            System.out.println("Second Minimum Element is : " + min2);
        }
    }
    public void secMax() {
        if (isEmpty())
            System.out.println("Stack is Empty...");
        else {
            int max = this.arr[0];
            int min = this.arr[0];
            for (int i = 1; i < this.top; i++) {
                if (this.arr[i] > max) {
                    max = this.arr[i];
                }
            }
            for (int i = 1; i < this.top; i++) {
                if (this.arr[i] < min) {
                    min = this.arr[i];
                }
            }
            int max2 = min;
            for (int i = 0; i < this.top; i++) {
                if (this.arr[i] > max2 && this.arr[i] < max) {
                    max2 = this.arr[i];
                }
            }
            System.out.println("Second Maximum Element is : " + max2);
        }
    }
}
public class testStack {
    public static void main(String[] args) {
        stack obj=new stack();
        Scanner sc=new Scanner(System.in);
        int ch=0;
        do{
            System.out.println("\n" +
                    "Enter 0 for capacity\n" +
                    "Enter 1 for push\n" +
                    "Enter 2 for pop\n" +
                    "enter 3 for peep\n" +
                    "enter 4 for size\n" +
                    "enter 5 for update\n" +
                    "enter 6 for count\n" +
                    "enter 7 for sum\n" +
                    "Enter 8 for ascending order\n" +
                    "Enter 9 for descending order\n" +
                    "Enter 10 for reverse order\n" +
                    "Enter 11 for sort stack\n" +
                    "Enter 12 for max element\n" +
                    "Enter 13 for min element\n" +
                    "Enter 14 for search element\n" +
                    "Enter 15 for second max ele\n" +
                    "Enter 16 for second min ele\n" +
                    "");
            System.out.println("Enter Your Choice");
            ch=sc.nextInt();
            switch (ch){
                case 0 :obj.capacity();break;
                case 1 :obj.push(sc);break;
                case 2 :obj.pop();break;
                case 3 :obj.peep();break;
                case 4 :obj.size();break;
                case 5 :obj.update(sc);break;
                case 6 :obj.count(sc);break;
                case 7 :obj.sum();break;
                case 8 :obj.asc();break;
                case 9 :obj.dsc();break;
                case 10 :obj.reverse();break;
                case 11 :obj.sort();break;
                case 12 :obj.max();break;
                case 13 :obj.min();break;
                case 14 :obj.search(sc);break;
                case 15 :obj.secMax();break;
                case 16 :obj.secMax();break;
            }
        }while (ch!=17);
    }
}
