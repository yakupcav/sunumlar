package Hill;

import Hill.EuclidAlgorithm.Mod;
import Hill.Matrix.InverseMatrix;
import Hill.Matrix.Determinant;
import Hill.Matrix.matrixMultiple;

public class main {
    public static void main(String[] args) {
        int matrix[][]={{3,2,3},{5,2,0},{2,3,5}};
        /*Determinant determinant=new Determinant(matrix);
        System.out.println(determinant.det3x3());
        Mod mod=new Mod(32);
        System.out.println("mevcut matris:\n");
        mod.PirintMatrix(matrix);
        System.out.println("\nters matrsi:\n");
        mod.PirintMatrix(mod.InverseMod(matrix));
        System.out.println("\nÇarpım matrsi:\n");
        matrixMultiple matrixMultiple=new matrixMultiple(matrix, mod.InverseMod(matrix));
        int sonuc[][]=mod.ModMatrix(matrixMultiple.result());
        mod.PirintMatrix(sonuc);*/
        Hill hill=new Hill(matrix);
        String sifre=hill.encrypt("merhabadünya");
        System.out.println(" aaaa="+sifre);
        String metin=hill.decrypt(sifre);
        System.out.println("bbbb="+metin);

    }
}
