import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorAPP {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student(3, "A"));
        list.add(new Student(1, "C"));
        list.add(new Student(2, "B"));

        Collections.sort(list, new NameComparator());

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}