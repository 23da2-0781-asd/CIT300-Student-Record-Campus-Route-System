import java.util.ArrayList;

public class Stack {
    ArrayList<String> actions = new ArrayList<>();

    public void push(String action) {
        actions.add(action);
    }

    public void display() {
        if (actions.isEmpty()) {
            System.out.println("No recent actions");
            return;
        }

        for (int i = actions.size() - 1; i >= 0; i--) {
            System.out.println(actions.get(i));
        }
    }
}