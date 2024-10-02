import java.util.*;

public class p9 {
    public static void main(String[] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('A', Arrays.asList('B'));
        graph.put('B', Arrays.asList('C', 'D'));
        graph.put('C', Arrays.asList());
        graph.put('D', Arrays.asList('F'));
        graph.put('F', Arrays.asList('A'));

        char start = 'F';
        char end = 'A';
        List<Character> path = new ArrayList<>();
        boolean result = pathExists(graph, start, end, path);
        System.out.println("Path exists: " + result);
        if (result) {
            System.out.println("Path: " + path);
        }
    }

    // Method to check if a path exists between two nodes
    public static boolean pathExists(Map<Character, List<Character>> graph, char start, char end, List<Character> path) {
        Set<Character> visited = new HashSet<>();
        return dfs(graph, start, end, path, visited);
    }

    // Depth-First Search (DFS) to find path
    private static boolean dfs(Map<Character, List<Character>> graph, char start, char end, List<Character> path, Set<Character> visited) {
        visited.add(start);
        path.add(start);

        if (start == end) {
            return true;
        }

        for (char neighbor : graph.getOrDefault(start, new ArrayList<>())) {
            if (!visited.contains(neighbor) && dfs(graph, neighbor, end, path, visited)) {
                return true;
            }
        }
        path.remove(path.size() - 1); // Backtrack
        return false;
    }
}
