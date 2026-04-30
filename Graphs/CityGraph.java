// File: CityGraph.java
import java.util.*;

class CityGraph {
    Map<String, List<String>> graph = new HashMap<>();

    void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }

    // Reachable nodes (DFS)
    void dfs(String node, Set<String> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (String nei : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(nei))
                dfs(nei, visited);
        }
    }

    // BFS shortest path (unweighted)
    int bfs(String src, String dest) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(src);
        visited.add(src);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String node = q.poll();
                if (node.equals(dest)) return level;

                for (String nei : graph.get(node)) {
                    if (!visited.contains(nei)) {
                        visited.add(nei);
                        q.add(nei);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
