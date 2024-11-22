
package com.mycompany.queues;

import java.util.Scanner;


public class Queues {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the queue size: ");
        int size = scanner.nextInt();

        QueuesClass queuesClass = new QueuesClass(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1: Enqueue ");
            System.out.println("2: Dequeue ");
            System.out.println("3: Peek Front");
            System.out.println("4: Peek Rear");
            System.out.println("5: Check if Queue is Empty");
            System.out.println("6: Check if Queue is Full");
            System.out.println("7: Print Queue Size");
            System.out.println("8: Print all elements");
            System.out.println("9: Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number to insert into the queue: ");
                    int data = scanner.nextInt();
                    queuesClass.insertData(data);
                    break;

                case 2:
                    int removedData = queuesClass.remove();
                    if (removedData != -1) {
                        System.out.println("Removed: " + removedData);
                    }
                    break;

                case 3:
                    System.out.println("Front of queue: " + queuesClass.peekFront());
                    break;

                case 4:
                    System.out.println("Rear of queue: " + queuesClass.peekRear());
                    break;

                case 5:
                    System.out.println("Is the queue empty? : " + queuesClass.isEmpty());
                    break;

                case 6:
                    System.out.println("Is the queue full? : " + queuesClass.isFull());
                    break;

                case 7:
                    System.out.println("Queue size: " + queuesClass.PrintSize());
                    break;
                    
                case 8:
                    System.out.println("All elements: " + queuesClass.PrintSize());
                    break;

                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
