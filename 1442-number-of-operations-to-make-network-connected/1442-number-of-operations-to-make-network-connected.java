class Solution {
    ArrayList<Integer> parent = new ArrayList<>();
    ArrayList<Integer> rank = new ArrayList<>();

    int find(int u){
        if(u != parent.get(u)){
            parent.set(u, find(parent.get(u)));
        }
        return parent.get(u);
    }

    void union(int u, int v){
        int parU = find(u);
        int parV = find(v);

        if (parU == parV) return;

        if(rank.get(parU) < rank.get(parV)){
            parent.set(parU, parV);
        } 
        else if (rank.get(parV) < rank.get(parU)){
            parent.set(parV, parU);
        }
        else{
            parent.set(parV, parU);
            rank.set(parU, rank.get(parU) + 1);
        }
    }

    public int makeConnected(int n, int[][] connections) {
        for (int i = 0; i < n; i++) {
            parent.add(i);
            rank.add(0);
        }

        int extraEdges = 0;

        for(int[] connection : connections){
            int u = connection[0];
            int v = connection[1];
            if(find(u) == find(v)){
                extraEdges++;
            } else {
                union(u, v);
            }
        }

        int uniqueParents = 0;
        for(int i = 0; i < n; i++){
            if(parent.get(i) == i) uniqueParents++;
        }

        int requiredEdges = uniqueParents - 1;
        if(extraEdges >= requiredEdges) return requiredEdges;

        return -1;
    }
}