package algorithm_1.unionfind;

public class QuickUnion extends Union{

    public QuickUnion(int N){
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int i=root(p);
        int j=root(q);

        id[i]=j;

    }

    public int root(int i){

        while(i!=id[i]) i=id[i];
        return i;
    }

    @Override
    public boolean isConnected(int p, int q) {
        int i=root(p);
        int j=root(q);

        return i==j;
    }
}
