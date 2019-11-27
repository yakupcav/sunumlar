package Hill.EuclidAlgorithm;

public class Euclid {
    private int number1,number2;
    private int[] k=new int[2];//k[1]*number1+k[2]*number2=gcd(number1,number2); extends euclid algorithm;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public Euclid(int number1,int number2) {
        this.number1=number1;
        this.number2=number2;
    }



    public int[] getK() {
        k=ExtendsEuclidAlgorithm(number1,number2);
        return k;
    }



    private int max(int say1,int say2) {
        int result;
        if(say1>say2)
            result=say1;
        else
            result=say2;
        return result;
    }
    private int min(int say1,int say2) {
        int result;
        if(say1<say2)
            result=say1;
        else
            result=say2;
        return result;
    }
    public int GcdEuclid() {//öklid algoritması......
        int result;
        int a=max(number1,number2);
        int b=min(number1,number2);
        int c,d;           //a=b*c+d; a: bölünen, b:bölen, c:bölüm, d:kalan;
        while(a%b!=0) {
            d=a%b;
            c=(a-d)/b;
            a=b;
            b=d;
        }
        return b;
    }
    private  int[] ExtendsEuclidAlgorithm(int a,int b) {
        int q,r,s,t;
        if(b==0) {
            int p[]= {1,0};
            return p;
        }else {
            r=a%b;
            q=(a-r)/b;
            s=ExtendsEuclidAlgorithm(b,r)[0];
            t=ExtendsEuclidAlgorithm(b,r)[1];
            int p[]= {t,s-q*t};
            return p;
        }
    }

}
