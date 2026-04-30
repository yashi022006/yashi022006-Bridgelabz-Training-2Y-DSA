// File: CourseGraph.java
import java.util.*;

class CourseGraph {
    Map<String, List<String>> graph = new HashMap<>();

    void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }

    // Cycle detection (DFS)
    boolean hasCycleUtil(String node, Set<String> visiting, Set<String> visited) {
        if (visiting.contains(node)) return true;
        if (visited.contains(node)) return false;

        visiting.add(node);
        for (String nei : graph.getOrDefault(node, new ArrayList<>())) {
            if (hasCycleUtil(nei, visiting, visited)) return true;
        }
        visiting.remove(node);
        visited.add(node);
        return false;
    }

    boolean hasCycle() {
        Set<String> visiting = new HashSet<>();
        Set<String> visited = new HashSet<>();

        for (String node : graph.keySet()) {
            if (hasCycleUtil(node, visiting, visited)) return true;
        }
        return false;
    }

    // Topological Sort (DFS)
    void topoDFS(String node, Set<String> visited, Stack<String> stack) {
        visited.add(node);
        for (String nei : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(nei))
                topoDFS(nei, visited, stack);
        }
        stack.push(node);
    }

    void topologicalSort() {
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();

        for (String node : graph.keySet()) {
            if (!visited.contains(node))
                topoDFS(node, visited, stack);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
