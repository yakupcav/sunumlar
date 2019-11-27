package Caezar;



import Vigenere.Vigenere;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("şifrelencek olan mesajı giriniz.");
        String plainText=sc.next();
        sc=new Scanner(System.in);
        System.out.println("anahtar kelimeyi giriniz.");
        int key=sc.nextInt();
        Caezar caezar=new Caezar(key);
        System.out.println("şifrelenmiş olan metin=");
        String ChiperText=caezar.encrypt(plainText);
        System.out.println(ChiperText);
        System.out.println("eski hali ise="+caezar.decrypt(ChiperText));

    }

}
