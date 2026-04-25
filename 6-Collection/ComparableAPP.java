import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // default sorting by id
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

public class ComparableAPP {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "A"));
        list.add(new Student(1, "B"));
        list.add(new Student(2, "C"));

        Collections.sort(list); // uses compareTo()

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}