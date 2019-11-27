package playfair;

public class PlayFair {
    private String alfabe="abcçdefgğhıijklmnoöpqrsştuüvwxyz";
    private String key;
    private char matrix[][]=new char[8][4];
   // private int indis1,indis2;

    public PlayFair(String key){
        this.key=key;
        String s=SwapAlphabe();

        for (int i=0;i<8;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=s.charAt(j+4*i);
            }
        }
    }
    public String SwapAlphabe(){
        String s=alfabe;
        StringBuffer stringBuffer;
        for(int i=0;i<key.length();i++){
            stringBuffer=new StringBuffer();
            stringBuffer.append(s);
            stringBuffer.deleteCharAt(s.indexOf(key.charAt(i)));
            s=stringBuffer.toString();
        }
        s=key+s;
       return s;
    }
    public Indis findIndis(char a){
        Indis indis=new Indis();
        for (int i=0;i<8;i++){
            for(int j=0;j<4;j++){
                if(matrix[i][j]==a){
                    indis.setI(i);
                    indis.setJ(j);
                    return indis;
                }
            }
        }
        return null;
    }
    public String encrypt(String plaintext){
        if(plaintext.length()%2!=0)
            plaintext+="x";
        String s="";
        Indis indis1,indis2;
        for (int i=0;i<plaintext.length();i+=2){
            indis1=findIndis(plaintext.charAt(i));
            indis2=findIndis(plaintext.charAt(i+1));
            if(indis1.getI()==indis2.getI()){
                s+=matrix[indis1.getI()][(indis1.getJ()+1)%4];
                s+=matrix[indis2.getI()][(indis2.getJ()+1)%4];
            }else if(indis1.getJ()==indis2.getJ()){
                s+=matrix[(indis1.getI()+1)%8][indis1.getJ()];
                s+=matrix[(indis2.getI()+1)%8][indis2.getJ()];
            }else{
                s+=matrix[indis1.getI()][indis2.getJ()];
                s+=matrix[indis2.getI()][indis1.getJ()];
            }
        }
        return s;
    }
    public String decrypt(String chipertext){

        String s="";
        Indis indis1,indis2;
        for (int i=0;i<chipertext.length();i+=2){
            indis1=findIndis(chipertext.charAt(i));
            indis2=findIndis(chipertext.charAt(i+1));
            if(indis1.getI()==indis2.getI()){
                s+=matrix[indis1.getI()][(indis1.getJ()+3)%4];
                s+=matrix[indis2.getI()][(indis2.getJ()+3)%4];
            }else if(indis1.getJ()==indis2.getJ()){
                s+=matrix[(indis1.getI()+7)%8][indis1.getJ()];
                s+=matrix[(indis2.getI()+7)%8][indis2.getJ()];
            }else{
                s+=matrix[indis1.getI()][indis2.getJ()];
                s+=matrix[indis2.getI()][indis1.getJ()];

            }
        }
        return s;
    }

}
