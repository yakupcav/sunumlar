package Hill.Matrix;

import Hill.EuclidAlgorithm.Euclid;

public class Determinant {
    private int matrix[][];

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Determinant(int[][] matrix) {
        this.matrix = matrix;
    }
    public int det2x2(int matrix[][]){
        return matrix[1][1]*matrix[0][0]-matrix[0][1]*matrix[1][0];
    }
    public int det3x3(){
        int result=0;
        int carpan;
        for(int i=0;i<3;i++){

                altmatrix altmatrix=new altmatrix();
                if(i%2==0)
                    carpan=1;
                else
                    carpan=-1;
                altmatrix.setSubmatris(matrix,i,0);
                result+=matrix[i][0]*det2x2(altmatrix.getSubmatris())*carpan;

        }
        return result;
    }
    public int mod32det3x3(){
        int a;
        a=det3x3();
        Euclid euclid=new Euclid(a,32);
        if(euclid.GcdEuclid()!=1){
            System.out.println("modüler tersi bukunamaz");
            return 0;
        }else{
            a=euclid.getK()[0];
        }
        return a;
    }
}

