package algorithm_1.unionfind;

public class QuickFind extends Union {



    public QuickFind(int N){
        super(N);
    }
    public boolean isConnected(int p,int q){

        return id[p]==id[q];
    }
    public void union(int p,int q){
       int pid=id[p];
       int qid=id[q];
       for(int i=0; i<id.length;i++){

           if(id[i]==pid) id[i]=qid;
       }

    }

    @Override
    public int find(int p) {
        return id[p];
    }

}
