package demo03;

public class MainClass {
    public static void main(String[] args){
        RandomFa randomFa=new RandomFa();
        newThree newthree=new newThree();
        Junior junior=new Junior();
        Senior senior=new Senior();
        randomFa.language();
        int num=randomFa.ab();
        if(num==1)
            newthree.major();
        if(num==2)
            senior.major();
        if(num==3)
            junior.major();
    }
}
