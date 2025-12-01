package QUEUE;

import java.util.Scanner;

import static sun.util.locale.LocaleUtils.isEmpty;

public class Insertion {
 static class  queue{
         int arr[];
         int front,rear,capacity;
         queue(int size){
             arr=new int[size];
             capacity=size;
             front=rear=-1;
         }
         public  void insert(int Data){
           if (rear==capacity-1){
               System.out.println ("queue is overflow" );
           }
           else {
               if (front == -1) {
                   front = 0;

               }
               rear = rear + 1;
               arr[rear] = Data;

           }

         }
     boolean isEmpty() {
         return front == -1 || front > rear;
     }
       public void display(){
           if (isEmpty()) {
               System.out.println("Queue is empty!");
               return;
           }
           for (int i = front; i <= rear; i++) {
               System.out.print(arr[i] + " ");
           }
           System.out.println();

        }
       int deque(){
             if (isEmpty ()){
                 System.out.println ("queue is overflow" );

             }
                  int val=arr[front];
                  front=front+1;
                   return val;
        }
     }
    public static void main(String[] args) {
         queue data=new queue (5);
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter the element  capacity of 5" );
        for (int i=0;i<5;i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            int element= sc.nextInt ( );
            data.insert (element);
        }
        sc.close ();
        System.out.println ("All the data as queue" );
        data.display ();

        data.deque ();
        System.out.println ("All the data as dqu" );
        data.display ();;




    }
}
