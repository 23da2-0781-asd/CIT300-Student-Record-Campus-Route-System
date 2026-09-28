import java.util.HashMap;

public class HashTable {

    HashMap<Integer, Student> table = new HashMap<>();

    public void insert(Student student) {
        table.put(student.id, student);
    }

    public void search(int id) {
        Student s = table.get(id);

        if (s == null) {
            System.out.println("Student not found");
        } else {
            System.out.println(s);
        }
    }
}