package algorithm_1.unionfind;


public class MapWithUF {

    int map[][];
    Union uf;
    int rowLen;
    int colLen;

    public MapWithUF(){

    }


    private boolean isOpen(int index,int row, int col ){
        System.out.printf("index %s -- row %s --- col %s \n",index,row,col);
        return index==map[row][col];
    }

    private int getIndex(int i,int j){
        if (i==0) return j;
        return colLen*(i) + j;
    }
    public int countries(int[][] map){
        this.map=map;
        rowLen=map.length;
        colLen=map[0].length;

        uf=new WeightedQuickUnionFind(rowLen*colLen);

        for(int row=0;row<rowLen;row++){
            for(int col=0;col<colLen;col++){
                System.out.println(row +"," + col);
                open(row,col);
            }

        }

        return uf.getCount();
    }
public void open(int i,int j){

     int site=getIndex(i,j);
     int index=map[i][j];

   if(i>0 && isOpen(index,i-1,j))
        uf.union(site,getIndex(i-1,j));
    if(i<rowLen-1 && isOpen(index,i+1,j))
        uf.union(site,getIndex(i+1,j));

    if(j>1 && isOpen(index,i,j-1))
        uf.union(site,getIndex(i,j-1));

    if(j<colLen-1 && isOpen(index,i,j+1))
        uf.union(site,getIndex(i,j+1));
    }

    public static void main(String[] args) {
        MapWithUF main=new MapWithUF();
       

        int input[][]={
                {5,4,4},
                {4,3,4},
                {3,2,4},
                {2,2,2},
                {3,3,4},
                {1,4,4},
                {4,1,1}
        };
        System.out.println(main.countries(input));
    }
}
