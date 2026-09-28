import java.util.*;

public class Graph {

    HashMap<String, ArrayList<String>> graph = new HashMap<>();

    public void addLocation(String location) {
        graph.putIfAbsent(location, new ArrayList<>());
    }

    public void addConnection(String l1, String l2) {
        graph.get(l1).add(l2);
        graph.get(l2).add(l1);
    }

    public void displayGraph() {
        for (String location : graph.keySet()) {
            System.out.println(location + " -> " + graph.get(location));
        }
    }

    public void bfs(String start) {

        Queue<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            String current = queue.poll();
            System.out.print(current + " ");

            for (String neighbour : graph.get(current)) {

                if (!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.add(neighbour);
                }
            }
        }
    }
}