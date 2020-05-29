package algorithm_1.unionfind;

public abstract class Union {


   protected int id[];
  //  private int count;

    public Union(int N){

        id=new int[N];
      //  count=N;
        for(int i=0;i<N;i++){

            id[i]=i;
        }
    }
    public abstract void union(int p,int q);
    public abstract int find(int p);
    public abstract boolean isConnected(int p,int q);
    public  int getCount(){
        return -1;
    }
    public  boolean isEmpty(){
        return id.length==0;
    }

    public int root(int i){
        return -1;
    }
//    public int count() {
//        return count;
//    }

   /* protected void setCount(int n) {
        this.count=count;
    }
    protected int getCount(){
        return this.count;
    }*/
}
