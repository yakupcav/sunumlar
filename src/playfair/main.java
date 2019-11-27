package playfair;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("şifrelencek olan mesajı giriniz.");
        String plainText=sc.next();
        sc=new Scanner(System.in);
        System.out.println("anahtar kelimeyi giriniz.");
        String key=sc.next();
        PlayFair playFair=new PlayFair(key);
        System.out.println("şifrelenmiş olan metin=");
        String ChiperText=playFair.encrypt(plainText);
        System.out.println(ChiperText);
        System.out.println("eski hali ise="+playFair.decrypt(ChiperText));
    }
}
