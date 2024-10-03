import java.util.*;

public class p9 {

    // Method to find the path between start and end node in a directed graph
    public static List<String> findPath(Map<String, List<String>> graph, String start, String end) {
        // Queue for BFS and a map to track the predecessors for path reconstruction
        Queue<String> queue = new LinkedList<>();
        Map<String, String> predecessors = new HashMap<>();
        queue.add(start);
        predecessors.put(start, null); // Start node has no predecessor

        // Perform BFS to find the path
        while (!queue.isEmpty()) {
            String node = queue.poll();

            // If we reach the end node, reconstruct the path
            if (node.equals(end)) {
                return buildPath(predecessors, start, end);
            }

            // Explore all neighbors
            if (graph.containsKey(node)) {
                for (String neighbor : graph.get(node)) {
                    if (!predecessors.containsKey(neighbor)) { // Not visited
                        queue.add(neighbor);
                        predecessors.put(neighbor, node);
                    }
                }
            }
        }

        // If no path found
        return null;
    }

    // Method to build the path from start to end using the predecessors map
    private static List<String> buildPath(Map<String, String> predecessors, String start, String end) {
        List<String> path = new LinkedList<>();
        for (String at = end; at != null; at = predecessors.get(at)) {
            path.add(at);
        }
        Collections.reverse(path); // Reverse to get the path from start to end
        return path;
    }

    // Method to check if the path exists and print the path
    public static void pathExists(Map<String, List<String>> graph, String start, String end) {
        List<String> path = findPath(graph, start, end);
        if (path == null || path.size() == 1) { // No path or path is just the start node
            System.out.println("False");
        } else {
            System.out.println("True (" + String.join(" --> ", path) + ")");
        }
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Define the graph
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B"));
        graph.put("B", Arrays.asList("A", "C", "D"));
        graph.put("C", Arrays.asList());
        graph.put("D", Arrays.asList("E", "G"));
        graph.put("E", Arrays.asList("F"));
        graph.put("F", Arrays.asList("B"));
        graph.put("G", Arrays.asList());

        // Example 1
        System.out.print("Input: Start = D, End = B\nExpected output: ");
        pathExists(graph, "D", "B");

        // Example 2
        System.out.print("\nInput: Start = F, End = A\nExpected output: ");
        pathExists(graph, "F", "A");

        // Example 3
        System.out.print("\nInput: Start = G, End = C\nExpected output: ");
        pathExists(graph, "G", "C");

        // Example 4
        System.out.print("\nInput: Start = E, End = D\nExpected output: ");
        pathExists(graph, "E", "D");
    }
}
