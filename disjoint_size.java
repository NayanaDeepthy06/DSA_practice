public class disjoint_size {

    static class Disjoint {
        int[] parent;
        int[] size;

        Disjoint(int n) {
            parent = new int[n + 1];
            size = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                parent[i] = i; // Make every node its own parent
                size[i] = 1;
            }
        }

        // Find with Path Compression
        int findPar(int node) {
            if (node == parent[node]) {
                return node;
            }
            parent[node] = findPar(parent[node]);
            return parent[node];
        }

        // Union by Rank
        void union(int u, int v) {
            int ulp_u = findPar(u);
            int ulp_v = findPar(v);

            if (ulp_u == ulp_v) return;

            if (size[ulp_u] < size[ulp_v]) {
                parent[ulp_u] = ulp_v;
                size[ulp_v] += size[ulp_u];
            } 
            else{
                parent[ulp_u] = ulp_v;
                size[ulp_u] += size[ulp_v];
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
        if (ds.findPar(3) == ds.findPar(7)) {
            System.out.println("Same component");
        } else {
            System.out.println("Not same component");
        }

        ds.union(3, 7);

        if (ds.findPar(3) == ds.findPar(7)) {
            System.out.println("Same component");
        } else {
            System.out.println("Not same component");
        }
    }
}
