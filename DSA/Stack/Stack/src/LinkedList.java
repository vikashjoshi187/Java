package PACKAGE_NAME;

import java.util.Scanner;
 class LinkedListMenu {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        void delete(int key) {
            Node temp = head, prev = null;

            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }

            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }

            if (temp == null) {
                return;
            }

            prev.next = temp.next;
        }

        void update(int oldData, int newData) {
            Node current = head;
            while (current != null) {
                if (current.data == oldData) {
                    current.data = newData;
                    return;
                }
                current = current.next;
            }
            System.out.println("Element not found in the list.");
        }

        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        int length() {
            int count = 0;
            Node current = head;
            while (current != null) {
                count++;
                current = current.next;
            }
            return count;
        }

        boolean contains(int value) {
            Node current = head;
            while (current != null) {
                if (current.data == value) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        Node find(int value) {
            Node current = head;
            while (current != null) {
                if (current.data == value) {
                    return current;
                }
                current = current.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert at the Beginning");
            System.out.println("2. Insert at the End");
            System.out.println("3. Delete");
            System.out.println("4. Update");
            System.out.println("5. Display");
            System.out.println("6. Find Element by Value");
            System.out.println("7. Calculate Length");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert at the beginning: ");
                    int data1 = scanner.nextInt();
                    linkedList.insertAtBeginning(data1);
                    break;
                case 2:
                    System.out.print("Enter data to insert at the end: ");
                    int data2 = scanner.nextInt();
                    linkedList.insertAtEnd(data2);
                    break;
                case 3:
                    System.out.print("Enter data to delete: ");
                    int data3 = scanner.nextInt();
                    linkedList.delete(data3);
                    break;
                case 4:
                    System.out.print("Enter the data to update: ");
                    int oldData = scanner.nextInt();
                    System.out.print("Enter the new data: ");
                    int newData = scanner.nextInt();
                    linkedList.update(oldData, newData);
                    break;
                case 5:
                    System.out.print("Linked List: ");
                    linkedList.display();
                    break;
                case 6:
                    System.out.print("Enter the value to find: ");
                    int valueToFind = scanner.nextInt();
                    if (linkedList.contains(valueToFind)) {
                        Node foundNode = linkedList.find(valueToFind);
                        System.out.println("Element found: " + foundNode.data);
                    } else {
                        System.out.println("Element not found in the list.");
                    }
                    break;
                case 7:
                    int length = linkedList.length();
                    System.out.println("Length of the list: " + length);
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }while (true);
        }
    }