package com.corejava.concurrency.thread.sleep;

/*
 * Example of Thread Sleep method in Java
 */
public class SleepTest {
      
       public static void main(String... args){
              System.out.println(Thread.currentThread().getName() + " is going to sleep for 1 Second");
              try {
					Thread.sleep(1000);
              } catch (InterruptedException e) {
                     e.printStackTrace();
              }
              System.out.println("Main Thread is woken up now");
       }

}



