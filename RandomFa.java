package demo03;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class RandomFa {
    static int ch;
    int abc(){
        if(ch==1)
            System.out.print("请输入题目数:");
        if(ch==2)
            System.out.print("Please enter the number of questions:");
        if(ch==3)
            System.out.println("Veuillez saisir le nombre de questions:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }
    int ab(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        return num;
    }
    int choose(){
        if(ch==1)
            System.out.print("请选择整数运算或分数运算：");
        if(ch==2)
            System.out.print("Please select integer operation or fractional operation:");
        if(ch==3)
            System.out.print("Veuillez sélectionner une opération entière ou fractionnée:");
        Scanner reader=new Scanner(System.in);
        int cg= reader.nextInt();
        return cg;
    }
    float answer(){
        Scanner answer1=new Scanner(System.in);
        float an=answer1.nextFloat();
        return an;
    }
    void language(){
        System.out.println("清选择您的语言: 1");
        System.out.println("Please select your language: 2");
        System.out.println("Veuillez sélectionner votre langue: 3");
        Scanner reader=new Scanner(System.in);
        ch= reader.nextInt();
        if(ch==1)
            System.out.println("1：简单四则运算，2：高级四则运算: 3：自己输入答案程序判断对错");
        if(ch==2)
            System.out.println("1 simple operations, 2 advanced operations, and 3 processes for entering correct and wrong answers:");
        if(ch==3)
            System.out.println("1 opérations simples, 2 opérations avancées, 3 procédures d'entrée des réponses pour déterminer le bien et le mal:");
    }

    int Ran(){
        Random random1=new Random();
        int a=random1.nextInt(100)+1;
        return a;
    }
    char sign(){
        char operator = 0;
        Random ran = new Random();
        int i = ran.nextInt(4);
        switch(i){
            case 0:
                operator = '+';
                break;
            case 1:
                operator = '-';
                break;
            case 2:
                operator = '*';
                break;
            case 3:
                operator = '/';
                break;
        }
        return operator;
    }

    void file(String Str[]){
        File file=new File("D:/javacode/RJGC/src/demo03/file.txt");
        try {
            Writer out=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(out);
            for(int i=0;i<Str.length;i++){
                bufferedWriter.write(Str[i]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            out.close();
        }catch (IOException e){
            System.out.println(e.toString());
        }
    }
}
