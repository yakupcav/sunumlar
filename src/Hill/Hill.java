package Hill;

import Hill.EuclidAlgorithm.Mod;
import Hill.Matrix.matrixMultiple;

public class Hill {
    private String alfabe="abcçdefgğhıijklmnoöpqrsştuüvwxyz";
    private int [][]keyMatrix;
    private int [][]InverseKeyMatrix;

    public int[][] getKeyMatrix() {
        return keyMatrix;
    }

    public void setKeyMatrix(int[][] keyMatrix) {
        this.keyMatrix = keyMatrix;
    }

    public int[][] getInverseKeyMatrix() {
        Mod mod=new Mod(32);
        InverseKeyMatrix=mod.InverseMod(keyMatrix);
        return InverseKeyMatrix;
    }

    public void setInverseKeyMatrix(int[][] inverseKeyMatrix) {
        InverseKeyMatrix = inverseKeyMatrix;
    }

    public Hill(int [][]key){
        this.keyMatrix=key;
    }
    public int[][] StringToMatrix(String s){
        int matrix[][];
        int r=s.length()%3;
        if(r==0)
            r=3;
        for(int i=0;i<3-r;i++){
            s+='x';
        }
        System.out.println("s="+s);
        matrix=new int[s.length()/3][3];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<3;j++){
                matrix[i][j]=alfabe.indexOf(s.charAt(j+3*i));
            }
        }
        return matrix;
    }
    public String MatrixToString(int [][]matrix){
        String s="";
        Mod mod=new Mod(32);
        matrix=mod.ModMatrix(matrix);
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<3;j++){
                s+=alfabe.charAt(matrix[i][j]);
            }
        }
        return s;
    }
    public String encrypt(String plaintext){
        Mod mod=new Mod(32);
        int matrix[][]=StringToMatrix(plaintext);
        matrixMultiple matrixMultiple=new matrixMultiple(matrix,keyMatrix);
        System.out.println("şifrlenmiş matris:\n");
        mod.PirintMatrix(matrixMultiple.result());
        return MatrixToString(matrixMultiple.result());
    }
    public String decrypt(String chipertext){
        Mod mod=new Mod(32);
        int matrix[][]=StringToMatrix(chipertext);
        matrixMultiple matrixMultiple=new matrixMultiple(matrix,getInverseKeyMatrix());
        System.out.println("açık metin matris hali:\n");
        mod.PirintMatrix(matrixMultiple.result());
        return MatrixToString(matrixMultiple.result());

    }
}
