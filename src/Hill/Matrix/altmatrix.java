package Hill.Matrix;

public class altmatrix {
    private int [][]submatris=new int[2][2];


    public int[][] getSubmatris() {
        return submatris;
    }

    public void setSubmatris(int[][] matris,int i,int j) {
        int [][]temp=new int[2][2];
        int i1=0,j1=0;
        for(int k=0;k<3;k++){
            for (int l=0;l<3;l++){

                if(i!=k&&j!=l){
                    temp[i1][j1++]=matris[k][l];
                    if(j1==2){
                        j1=0;
                        i1++;
                    }

                }
            }
        }
        this.submatris = temp;
    }
}
