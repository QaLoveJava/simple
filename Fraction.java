package demo03;

import org.jetbrains.annotations.NotNull;

class Opertion {
    int a, b, c, d, m, n;

    public Opertion(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    //分式约分
    public void print(int m, int n) {
        int x = Math.abs(m);
        int y = Math.abs(n);
        if (x < y) {
            int t = x;
            x = y;
            y = t;
        }
        while (y != 0) {
            int k = x % y;
            x = y;
            y = k;
        }
        m = m / x;
        n = n / x;
        if (n == 1)
            System.out.println(m);
        else
            System.out.println(m + "/" + n);
    }
    //四则运算
    public void sum() {
        m = a * d + b * c;
        n = b * d;
        print(m, n);
    }

    public void jian() {
        m = a * d - b * c;
        n = b * d;
        print(m, n);
    }

    public void cheng() {
        m = a * c;
        n = b * d;
        print(m, n);
    }

    public void chu() {
        m = a * d;
        n = b * c;
        print(m, n);
    }
    //判断四则运算类型
    public void oper(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            if (ss == '+') {
                sum();
                break;
            } else if (ss == '-') {
                jian();
                break;
            } else if (ss == '*') {
                cheng();
                break;
            } else if (ss == '\\') {
                chu();
                break;
            }
        }
    }
}

public class Fraction {

    public void FraCount(String @NotNull [] exception) {
        int i=0;
        String str="";
        for(;i<7;i++) {
            str+=exception[i];
        }
        String s1[] = str.split("\\+|\\-|\\*|\\\\");//分离出两个分式
        String fir[] = s1[0].split("/");//将第一个分式的分子和分母分离并求出值
        int a = Integer.parseInt(fir[0]);
        int b = Integer.parseInt(fir[1]);
        String sec[] = s1[1].split("/");//将第二个分式的分子和分母分离并求出值
        int c = Integer.parseInt(sec[0]);
        int d = Integer.parseInt(sec[1]);
        Opertion opertion = new Opertion(a, b, c, d);
        opertion.oper(str);
    }

}

