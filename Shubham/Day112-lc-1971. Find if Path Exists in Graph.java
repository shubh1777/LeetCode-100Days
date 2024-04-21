//method1

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;
        
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        priorityQueue.offer(new int[] {0, source});
        
        while (!priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int currentDistance = current[0];
            int currentNode = current[1];
            
            if (currentNode == destination) {
                return true;
            }
            
            if (currentDistance > distances[currentNode]) {
                continue;
            }
            
            for (int neighbor : graph.getOrDefault(currentNode, new ArrayList<>())) {
                int distance = currentDistance + 1; // Assuming unweighted graph
                if (distance < distances[neighbor]) {
                    distances[neighbor] = distance;
                    priorityQueue.offer(new int[] {distance, neighbor});
                }
            }
        }
        
        return false;
    }
}
//method2
class Solution {
    private int[] parent;
    private int[] rank;
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        rank = new int[n];
        
        // Initialize parent pointers and ranks
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
        
        // Union-find operations based on given edges
        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }
        
        // Check if source and destination belong to the same set
        return find(source) == find(destination);
    }
    
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }
    
    private void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
}

//method3

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.offer(source);
        visited.add(source);
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (node == destination) {
                return true;
            }
            List<Integer> neighbors = graph.getOrDefault(node, new ArrayList<>());
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        
        return false;
    }
}

//method4

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        
        Set<Integer> visited = new HashSet<>();
        return dfs(source, destination, graph, visited);
    }
    
    private boolean dfs(int node, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (node == destination) {
            return true;
        }
        visited.add(node);
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                if (dfs(neighbor, destination, graph, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
