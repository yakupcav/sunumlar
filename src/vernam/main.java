package vernam;

import java.util.Scanner;

public class main {
    public static void main(String Arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("şifrelencek olan mesajı giriniz.");
        String plainText = sc.next();
        sc = new Scanner(System.in);

        String key;
        do{
            System.out.println("anahtar kelime mesaj ile aynı uzunlukta olmalı anahtar kelimeyi giriniz.");
            key = sc.next();
        }while(key.length()!=plainText.length());
        vernam vernam = new vernam(key);
        System.out.println("şifrelenmiş olan metin=");
        String ChiperText = vernam.encrypt(plainText);
        System.out.println(ChiperText);
        System.out.println("eski hali ise=" + vernam.decrypt(ChiperText));
    }
}
