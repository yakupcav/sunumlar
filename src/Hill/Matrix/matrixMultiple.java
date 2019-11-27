package Hill.Matrix;

public class matrixMultiple {
    private int  matrix1[][],matrix2[][];

    public matrixMultiple(int[][] matrix1, int[][] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public int[][] getMatrix1() {
        return matrix1;
    }

    public void setMatrix1(int[][] matrix1) {
        this.matrix1 = matrix1;
    }

    public int[][] getMatrix2() {
        return matrix2;
    }

    public void setMatrix2(int[][] matrix2) {
        this.matrix2 = matrix2;
    }
    public int[][]  result(){
        int a1=matrix1.length,a2=matrix2[0].length;
        int temp[][]=new int[a1][a2];
        for(int i=0;i<a1;i++){
            for(int j=0;j<a2;j++){
                temp[i][j]=0;
                for(int k=0;k<3;k++){
                    temp[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
            }
        }
        return temp;
    };
}
