package BasicPrograms;

class Island_2d_Program
{
static final int Row=3;
static final int Col=3;
public  static boolean isfound(int row,int col,int [][] grid,boolean visited[][]){
return (row<Row)&&(col<Col)&&(row>=0)&&(col>=0)&&(grid[row][col]==1)&&(!visited[row][col]);
}
public static void DFS(int [][] grid,int row,int col,boolean visited[][]){
int nbrrow[]=new int[]{-1,0,0,1};
int  nbrcol[]=new int[]{0,-1,1,0};
visited[row][col]=true;
for(int k=0;k<4;k++){
if(isfound(row+nbrrow[k],col+nbrcol[k],grid,visited))
DFS(grid,row+nbrrow[k],col+nbrcol[k],visited);

}
}
    public int numIslands(int [][] grid)
    {
    boolean visited[][]=new boolean[Row][Col];
    int count=0;
    for(int i=0;i<Row;i++){
    for(int j=0;j<Col;j++){
    if(grid[i][j]==1&&!visited[i][j]){
    DFS(grid,i,j,visited);
    count++;
    }
    
    }}
        
    
    return count;    
    }
    public static void main(String [] args){
    int [][] grid={{1,0,1},
    {1,1,1},
    {0,1,1}};
    Island_2d_Program ref=new Island_2d_Program();
    System.out.println("The number of islands is "+ref.numIslands(grid));
    
    }
}