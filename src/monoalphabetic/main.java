package monoalphabetic;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("şifrelencek olan mesajı giriniz.");
        String plainText=sc.next();sc=new Scanner(System.in);
        MonoAlphabetic monoalphabetic=new MonoAlphabetic();
        String ChiperText=monoalphabetic.encrypt(plainText);
        System.out.println("şifrelenmiş olan metin="+ChiperText);
        System.out.println("eski hali ise="+monoalphabetic.decrypt(ChiperText));

    }
}
