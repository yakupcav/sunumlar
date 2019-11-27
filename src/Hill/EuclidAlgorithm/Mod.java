package Hill.EuclidAlgorithm;
import Hill.Matrix.*;

import static sun.misc.Version.println;

public class Mod {
    private int modNumber;
    private Euclid euclid;
    public Mod(int modNumber){
        this.modNumber=modNumber;
    }

    public int getModNumber() {
        return modNumber;
    }

    public void setModNumber(int modNumber) {
        this.modNumber = modNumber;
    }

    public Euclid getEuclid() {
        return euclid;
    }

    public void setEuclid(Euclid euclid) {
        this.euclid = euclid;
    }

    public Integer inverseNumber(int a){
        int sayi=0;
        euclid=new Euclid(a,modNumber);
        if(euclid.GcdEuclid()!=1){
            System.out.println("tersi bulunamaz....");
            return null;
        }else{
            sayi=euclid.getK()[0];
        }
        return sayi;
    }
    public int[][] InverseMod(int [][]matrix){
        int inverse[][];
        Determinant determinant=new Determinant(matrix);
        if(inverseNumber(determinant.det3x3())==null)
            return null;
        else{
            InverseMatrix inverseMatrix =new InverseMatrix(matrix);
            inverse=inverseMatrix.InverseMatrixMod();
        }
        return inverse;
    }
    public int[][] ModMatrix(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]%=modNumber;
                if(matrix[i][j]<0)
                    matrix[i][j]+=modNumber;
            }
        }
        return matrix;
    }
    public void PirintMatrix(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
