package monoalphabetic;

public class MonoAlphabetic {
    private String alfabe="abcçdefgğhıijklmnoöpqrsştuüvwxyz";
    private String permuAlfabe="nbajyşfüçowğlzmpxıikuövcdegrqsth";
    public String encrypt(String plaintext){
        int index;
        String s="";
        for(int i=0;i<plaintext.length();i++) {
            index=alfabe.indexOf(plaintext.charAt(i));
            s+=permuAlfabe.charAt(index);
        }
        return s;
    }
    public String decrypt(String chipertext){
        int index;
        String s="";
        for(int i=0;i<chipertext.length();i++) {
            index=permuAlfabe.indexOf(chipertext.charAt(i));
            s+=alfabe.charAt(index);
        }
        return s;
    }
}
