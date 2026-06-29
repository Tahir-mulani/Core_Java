class Singleton {

    private static Singleton obj = new Singleton();

    private Singleton() {
        System.out.println("Object Created");
    }

    public static Singleton getInstance() {
        return obj;
    }
}
public class SingletonClassApp {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();

        Singleton s2 = Singleton.getInstance();

        System.out.println(s1);

        System.out.println(s2);
    }
}