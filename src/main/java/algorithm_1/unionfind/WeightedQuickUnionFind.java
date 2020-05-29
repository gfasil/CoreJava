package algorithm_1.unionfind;

public class WeightedQuickUnionFind extends Union {
        int size[];
        // holds maximum values for each component in index root(i)
        int maximum[];
      int count;

        public WeightedQuickUnionFind(int N) {
        super(N);
       this.count=N;
        size=new int[N];
        maximum=new int[N];
        for(int i=0;i<N;i++){

            size[i]=1;
            maximum[i]=i;
        }
    }

    @Override
    public void union(int p, int q) {

        int i=root(p);
        int j=root(q);
        if(i==j) return;
        updateWeight(i,j);
        updateMaximum(i,j);

        count--;
        System.out.println(count);
    }
    @Override
    public int getCount()
    {
        return this.count;
    }

    private void updateWeight(int i, int j){
        if(size[i]<size[j]) {

            id[i]=j;
            size[j]+=size[i];
        }
        else {

            id[j]=i;
            size[i]+=size[j];
        }

    }
    private void updateMaximum(int i, int j){
        int iMaximum=maximum[i];
        int jMaximum=maximum[j];
        if(iMaximum<jMaximum)
            maximum[i]=jMaximum;
        else
            maximum[j]=iMaximum;
    }
        // findthe maximum from the components
    @Override
    public int find(int p) {

        int pRoot=root(p);
        return maximum[pRoot];
    }

    @Override
    public boolean isConnected(int p, int q) {
          int i=root(p);
        int j=root(q);
        return i==j;
    }
    public int root(int i){
            validate(i);
        while(i!=id[i]) {
         //   id[i]=id[id[i]];

            i=id[i];
        }

        return i;
    }
    private void validate(int p) {
        int n = id.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n-1));
        }
    }
}
