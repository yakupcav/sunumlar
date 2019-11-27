package vernam;

public class vernam {
    //private String alfabe="abcçdefgğhıijklmnoöpqrsştuüvwxyz";
    private String key;
    public vernam(String key){
        this.key=key;
    }
    public String encrypt(String plaintext){
        String s="";
        for(int i=0;i<plaintext.length();i++){
            s+=(char)(plaintext.charAt(i)^key.charAt(i));
        }
        return s;
    }
    public String decrypt(String chipertext){

        String s="";
        for(int i=0;i<chipertext.length();i++){
            s+=(char)(chipertext.charAt(i)^key.charAt(i));
        }

        return s;
    }


}
