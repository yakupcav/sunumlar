package Hill.Matrix;

public class InverseMatrix {
    private int matrix[][];

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public InverseMatrix(int[][] matrix) {
        this.matrix = matrix;
    }
    public int[][] InverseMatrixMod(){
        int [][]temp=new int[3][3];
        int carpan;
        Determinant determinant=new Determinant(matrix);
        int det=determinant.det3x3();
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if((i+j)%2==0)
                    carpan=1;
                else
                    carpan=-1;
                altmatrix altmatrix=new altmatrix();
                altmatrix.setSubmatris(matrix,i,j);
                temp[j][i]=determinant.det2x2(altmatrix.getSubmatris())*carpan*determinant.mod32det3x3();
            }
        }
        return temp;
    }
}
