
package com.mycompany.queues;


public class QueuesClass {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int numberOfItems;

    public QueuesClass(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        numberOfItems = 0;
    }

    public void insertData(int data) {
        if (!isFull()) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = data;
            numberOfItems++;
        } else {
            System.out.println("Queue is full, cannot insert data");
        }
    }

    public int remove() {
        if (!isEmpty()) {
            int temporary = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            numberOfItems--;
            return temporary; 
        } else {
            System.out.println("Queue is empty, nothing to remove");
            return -1;
        }
    }

    public int peekFront() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty, no front element");
            return -1;
        }
    }

    public int peekRear() {
        if (!isEmpty()) {
            return queueArray[rear];
        } else {
            System.out.println("Queue is empty, no rear element");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (numberOfItems == 0);
    }

    public boolean isFull() {
        return (numberOfItems == maxSize);
    }

    public int PrintSize() {
        return numberOfItems;
    }
}