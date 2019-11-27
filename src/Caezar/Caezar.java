package Caezar;

public class Caezar {
    private String alfabe="abcçdefgğhıijklmnoöpqrsştüvwxyz0123456789";
    private int key;

    public Caezar(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public int[] stringToIndex(String text){
        int [] index=new int[text.length()];
        for (int i=0;i<text.length();i++){
            index[i]=alfabe.indexOf(text.charAt(i));
        }
        return index;
    }
    public String indexToString(int[] index){
        String text="";
        for(int i=0;i<index.length;i++){
            text+=alfabe.charAt(index[i]);
        }
        return  text;
    }

    public String encrypt(String plaintext){
        int index[]=stringToIndex(plaintext);
        int index_new[]=new int[index.length];
        for(int i=0;i<index.length;i++){
            index_new[i]=(index[i]+key)%alfabe.length();
        }
        return indexToString(index_new);
    }
    public String decrypt(String chiptext){
        int index[]=stringToIndex(chiptext);
        int index_new[]=new int[index.length];
        for(int i=0;i<index.length;i++){
            index_new[i]=(index[i]-key+alfabe.length())%alfabe.length();
        }
        return indexToString(index_new);
    }

}
