package TranspositionTechniques;

public class main {
    public static void main(String[] args) {
        int key[]={0,1,5,4,2,3,6};
        Transposition transposition=new Transposition(key);
        String plaintext="jhjsömncşküqpwkşlzmxcşıjwey8ghkj";
        String chiptext=transposition.encrypt(plaintext);
        System.out.println("şifreli metin="+chiptext);
        String s=transposition.decrypt(chiptext);
        System.out.println("çözülmüş hali="+s);
    }
}
