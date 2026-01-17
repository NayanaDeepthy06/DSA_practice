public class disjoint_set {

    static class Disjoint {
        int[] parent;
        int[] rank;

        Disjoint(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                parent[i] = i; // Make every node its own parent
                rank[i] = 0;
            }
        }

        // Find with Path Compression
        int find(int node) {
            if (node == parent[node]) {
                return node;
            }
            parent[node] = find(parent[node]);
            return parent[node];
        }

        // Union by Rank
        void union(int u, int v) {
            int ulp_u = find(u);
            int ulp_v = find(v);

            if (ulp_u == ulp_v) return;

            if (rank[ulp_u] < rank[ulp_v]) {
                parent[ulp_u] = ulp_v;
            } 
            else if (rank[ulp_v] < rank[ulp_u]) {
                parent[ulp_v] = ulp_u;
            } 
            else {
                parent[ulp_v] = ulp_u; // ✔ correct
                rank[ulp_u]++;
            }
        }
    }

    public static void main(String[] args) {

        Disjoint ds = new Disjoint(7);

        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);
        ds.union(6, 7);
        ds.union(5, 6);

        // Check if 3 and 7 are in same component
        if (ds.find(3) == ds.find(7)) {
            System.out.println("Same component");
        } else {
            System.out.println("Not same component");
        }

        ds.union(3, 7);

        if (ds.find(3) == ds.find(7)) {
            System.out.println("Same component");
        } else {
            System.out.println("Not same component");
        }
    }
}

