// File: SocialNetwork.java
import java.util.*;

class SocialNetwork {
    Map<String, List<String>> graph = new HashMap<>();

    void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // b) Friends of user
    List<String> getFriends(String user) {
        return graph.getOrDefault(user, new ArrayList<>());
    }

    // c) Direct connection
    boolean isDirect(String u, String v) {
        return graph.getOrDefault(u, new ArrayList<>()).contains(v);
    }

    // d) Shortest path (BFS)
    int shortestPath(String src, String dest) {
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

    public static void main(String[] args) {
        SocialNetwork sn = new SocialNetwork();

        sn.addEdge("Alice", "Bob");
        sn.addEdge("Alice", "Charlie");
        sn.addEdge("Bob", "David");
        sn.addEdge("Charlie", "Eve");
        sn.addEdge("David", "Eve");

        System.out.println(sn.getFriends("Alice"));
        System.out.println(sn.isDirect("Bob", "Eve"));
        System.out.println(sn.shortestPath("Alice", "Eve"));
    }
}