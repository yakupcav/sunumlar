package Vigenere;
public class Vigenere {
    private String alfabe="abcçdefgğhıijklmnoöpqrsştüvwxyz";
    private int  alfabeUzunluk=alfabe.length();
    public int[] plainTextToIndex(String text){
        int [] index=new int[text.length()];
        for (int i=0;i<text.length();i++){
            index[i]=alfabe.indexOf(text.charAt(i));

        }
        return index;
    }
    public int[] keyTextToIndex(String key,String text){
        int [] index=new int[text.length()];
        int j=0;
        for (int i=0;i<text.length();i++){
            if(i%key.length()==0)
                j=0;
            index[i]=alfabe.indexOf(key.charAt(j));
            j++;

        }
        return index;
    }
    public int [] encrypt(int[] plainIndex,int[] keyIndex){
        int chiperTextIndex[]=new int[plainIndex.length];
        for(int i=0;i<plainIndex.length;i++){
            chiperTextIndex[i]=(plainIndex[i]+keyIndex[i])%alfabe.length();
        }
        return chiperTextIndex;
    }
    public String indexToString(int[] index){
        String text="";
        for(int i=0;i<index.length;i++){
            text+=alfabe.charAt(index[i]);
        }
        return  text;
    }
    public int[] decrypt(int[] chiperIndex,int[] keyIndex){
        int [] index=new int[chiperIndex.length];
        for (int i=0;i<chiperIndex.length;i++){
            index[i]=(chiperIndex[i]-keyIndex[i])%alfabeUzunluk;
        }
        return index;
    }
}
