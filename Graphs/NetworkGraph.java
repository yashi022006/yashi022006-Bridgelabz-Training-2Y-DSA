// File: NetworkGraph.java
import java.util.*;

class NetworkGraph {
    Map<String, List<String>> graph = new HashMap<>();

    void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // BFS connectivity
    boolean isConnected(String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String node = q.poll();
            for (String nei : graph.get(node)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    q.add(nei);
                }
            }
        }

        return visited.size() == graph.size();
    }

    // Shortest hops
    int minHops(String src, String dest) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(src);
        visited.add(src);
        int hops = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String node = q.poll();
                if (node.equals(dest)) return hops;

                for (String nei : graph.get(node)) {
                    if (!visited.contains(nei)) {
                        visited.add(nei);
                        q.add(nei);
                    }
                }
            }
            hops++;
        }
        return -1;
    }
}
