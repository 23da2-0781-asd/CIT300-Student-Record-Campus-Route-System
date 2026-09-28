public class StudentLinkedList {
    StudentNode head;

    public void addStudent(Student student) {
        StudentNode newNode = new StudentNode(student);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void displayStudents() {
        StudentNode temp = head;

        if (temp == null) {
            System.out.println("No records found");
            return;
        }

        while (temp != null) {
            System.out.println(temp.student);
            temp = temp.next;
        }
    }

    public Student searchStudent(int id) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.student.id == id) {
                return temp.student;
            }
            temp = temp.next;
        }

        return null;
    }

    public void deleteStudent(int id) {
        if (head == null) return;

        if (head.student.id == id) {
            head = head.next;
            return;
        }

        StudentNode temp = head;

        while (temp.next != null) {
            if (temp.next.student.id == id) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }
}