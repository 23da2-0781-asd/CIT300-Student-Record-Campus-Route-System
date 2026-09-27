import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentLinkedList list = new StudentLinkedList();
        Stack stack = new Stack();
        BST bst = new BST();
        HashTable hash = new HashTable();

        int choice;

        do {

            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Recent Actions");
            System.out.println("6. BST Display");
            System.out.println("7. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Programme: ");
                    String programme = sc.nextLine();

                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    Student student =
                            new Student(id, name, programme, marks);

                    list.addStudent(student);
                    bst.add(student);
                    hash.insert(student);

                    stack.push("Added Student " + id);

                    System.out.println("Student Added");
                    break;

                case 2:
                    list.displayStudents();
                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    int searchId = sc.nextInt();

                    hash.search(searchId);

                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int deleteId = sc.nextInt();

                    list.deleteStudent(deleteId);

                    stack.push("Deleted Student " + deleteId);

                    System.out.println("Deleted");
                    break;

                case 5:
                    stack.display();
                    break;

                case 6:
                    bst.display();
                    break;

                case 7:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 7);
    }
}