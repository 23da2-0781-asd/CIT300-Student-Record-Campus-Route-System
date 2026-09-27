import java.util.LinkedList;

public class Queue {
    LinkedList<ServiceRequest> queue = new LinkedList<>();

    public void addRequest(ServiceRequest request) {
        queue.add(request);
    }

    public void processRequest() {
        if (queue.isEmpty()) {
            System.out.println("No requests");
            return;
        }

        System.out.println("Processing: " + queue.poll());
    }
}