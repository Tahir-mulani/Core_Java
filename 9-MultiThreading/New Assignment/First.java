/*Q1. Write a Java program to create three threads using the Thread class.
 Each thread should print numbers from 1 to 5 along with its thread name.
Input :- No user input.
          Threads start automatically.
Output :- Numbers from 1 to 5 printed by different threads.
	   Order may vary.

	  	Thread-0 : 1
        Thread-1 : 1
        Thread-2 : 1
        Thread-0 : 2
        Thread-2 : 2
        Thread-1 : 2
 */
class Print extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {

			System.out.println(getName()+" "+i);
				 if(i==3){
					 wait(10000);
				 }
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Error is ---> " + e);
        }

    }
}
public class First {
    public static void main(String[] args) {
        Print p1 = new Print();
        p1.start();

        Print p2 = new Print();
        p2.start();

        Print p3 = new Print();
        p3.start();

    }
}