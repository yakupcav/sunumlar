package Vigenere;

import java.util.Scanner;
public class mainVigenere {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("şifrelencek olan mesajı giriniz.");
        String PlainText=sc.next();
        sc=new Scanner(System.in);
        System.out.println("anahtar kelimeyi giriniz.");
        String key=sc.next();
        Vigenere vigenereObject=new Vigenere();
        int[] plainIndex=vigenereObject.plainTextToIndex(PlainText);
        int[] keyIndex=vigenereObject.keyTextToIndex(key,PlainText);
        String ChiperText=vigenereObject.indexToString(vigenereObject.encrypt(plainIndex,keyIndex));
        int[] chiperIndex=vigenereObject.plainTextToIndex(ChiperText);
        String plaintextNew=vigenereObject.indexToString(vigenereObject.decrypt(chiperIndex,keyIndex));
        System.out.println("şifreli mesaj="+ChiperText+" \neski hali= "+plaintextNew);

    }


}
