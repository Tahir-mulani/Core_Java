class Teacher extends Thread {
    public void run() {
        System.out.println("Teacher entered");
    }
}

class Student extends Thread {
    public void run() {
        System.out.println("Students entered");
    }
}

public class ClassRoomApp {
    public static void main(String[] args) throws Exception {

        Teacher t = new Teacher();
        Student s = new Student();

        t.start();
        t.join();     // wait for teacher

        s.start();
		s.join();
        System.out.println("Class Started...");
		
    }
}