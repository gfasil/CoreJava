package algorithm_1.unionfind;

public abstract class Union {


    int id[];
    public Union(int N){

        id=new int[N];
        for(int i=0;i<N;i++){

            id[i]=i;
        }
    }
    public abstract void union(int p,int q);
    public abstract boolean isConnected(int p,int q);
    public  boolean isEmpty(){
        return id.length==0;
    }
}
