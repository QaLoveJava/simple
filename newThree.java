package demo03;

import java.util.Random;

public class newThree extends RandomFa{

    public void major() {
        RandomFa randomFa=new RandomFa();
        InversePolish inversePolish=new InversePolish();
        int num= randomFa.abc();
        Random random=new Random();
        String ex1[]=new String[num];
        for(int i=0;i<num;i++){
            int length=random.nextInt(4);
            String []exception=new String[10];
            for(int j=0;j<10;j++)
                exception[j]="";
            switch (length){
                case 0:
                    for(int j=0;j<3;j++){
                        int rannum= randomFa.Ran();
                        char sign= randomFa.sign();
                        if(j==0||j==2)
                            exception[j]=String.valueOf(rannum);
                        if(j==1)
                            exception[j]=String.valueOf(sign);
                    }
                    break;
                case 1:
                    for(int j=0;j<5;j++){
                        int rannum= randomFa.Ran();
                        char sign= randomFa.sign();
                        if(j%2==0)
                            exception[j]=String.valueOf(rannum);
                        if(j%2!=0)
                            exception[j]=String.valueOf(sign);
                    }
                    break;
                case 2:
                    for(int j=0;j<7;j++){
                        int rannum= randomFa.Ran();
                        char sign= randomFa.sign();
                        if(j%2==0)
                            exception[j]=String.valueOf(rannum);
                        if(j%2!=0)
                            exception[j]=String.valueOf(sign);
                    }
                    break;
                case 3:
                    for(int j=0;j<9;j++){
                        int rannum= randomFa.Ran();
                        char sign= randomFa.sign();
                        if(j%2==0)
                            exception[j]=String.valueOf(rannum);
                        if(j%2!=0)
                            exception[j]=String.valueOf(sign);
                    }
                    break;
            }
            String postE=inversePolish.postFix(exception);
            System.out.println(inversePolish.solution(postE));
            for(int j=0;j<10;j++){
                if(exception[j]!="")
                    ex1[i]+=exception[j];
            }
            ex1[i]=ex1[i]+"="+inversePolish.solution(postE);
        }
        randomFa.file(ex1);
    }
}
