/*Q5. Set and display thread priorities using setPriority() and getPriority(). */
class Test extends Thread{
    public void run(){
        System.out.println(getName()+ " Priority "+getPriority());
    }
}
public class Priority_Display {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
