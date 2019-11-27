package TranspositionTechniques;

public class Transposition {

    private int key[];

    public Transposition(int[] key) {
        this.key = key;
    }

    public int[] getKey() {
        return key;
    }

    public void setKey(int[] key) {
        this.key = key;
    }
    public char[][] StringToMatrix(String s){
        char matrix[][];
        int r=s.length()%key.length;
        if(r==0)
            r=key.length;
        for(int i=0;i<(key.length-r);i++){
            s+='x';
        }
        System.out.println("s="+s);
        matrix=new char[s.length()/key.length][key.length];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                matrix[i][j]=s.charAt(j+key.length*i);
            }
        }
        return matrix;
    }
    public String MatrixToString(char [][]matrix){
        String s="";
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++)
                s+=matrix[i][j];
        }
        return s;
    }
    public void PirintMatrix(char [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public String encrypt(String plaintext){
        String s="";
        char [][]matrix=StringToMatrix(plaintext);
        for(int a:getKey()){
            for(int i=0;i<matrix.length;i++)
                s+=matrix[i][a];
        }
        return s;
    }
    public int IndisFind(int sayi){
        int a=0;
        for(int i=0;i<key.length;i++){
            if(sayi==key[i])
                 a=i;
        }
        return a;
    }
    public int []InverseKey(){
        int a[]=new int[key.length];
        for(int i=0;i<a.length;i++){
            a[i]=IndisFind(i);//i nin olduğu indis neresi
        }
        return a;
    }
    public String decrypt(String chiptext){
        char matrix[][];
        String s="";
        matrix=new char[key.length][chiptext.length()/key.length];
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                matrix[i][j]=chiptext.charAt(j+(chiptext.length()/key.length)*i);
            }
        }
        for(int j=0;j<matrix[0].length;j++){
            for(int a:InverseKey())
                s+=matrix[a][j];
        }
        return s;
    }
}
