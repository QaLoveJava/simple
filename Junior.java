package demo03;

import java.util.Random;
import java.util.Scanner;

public class Junior {
    public void major() {
        RandomFa randomFa = new RandomFa();
        InversePolish inversePolish = new InversePolish();
        int num = randomFa.abc();
        int answerNum=0;
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            int length = random.nextInt(7);
            String[] exception = new String[12];
            for (int j = 0; j < 12; j++)
                exception[j] = "";
            switch (length) {
                case 0:
                    for (int j = 0; j < 3; j++) {
                        int rannum = randomFa.Ran();
                        char sign = randomFa.sign();
                        if (j == 0 || j == 2)
                            exception[j] = String.valueOf(rannum);
                        if (j == 1)
                            exception[j] = String.valueOf(sign);
                    }
                    break;
                case 1:
                    for (int j = 0; j < 5; j++) {
                        int rannum = randomFa.Ran();
                        char sign = randomFa.sign();
                        if (j % 2 == 0)
                            exception[j] = String.valueOf(rannum);
                        if (j % 2 != 0)
                            exception[j] = String.valueOf(sign);
                    }
                    break;
                case 2:
                    for (int j = 0; j < 7; j++) {
                        int rannum = randomFa.Ran();
                        char sign = randomFa.sign();
                        if (j % 2 == 0)
                            exception[j] = String.valueOf(rannum);
                        if (j % 2 != 0)
                            exception[j] = String.valueOf(sign);
                    }
                    break;
                case 3:
                    for (int j = 0; j < 9; j++) {
                        int rannum = randomFa.Ran();
                        char sign = randomFa.sign();
                        if (j % 2 == 0)
                            exception[j] = String.valueOf(rannum);
                        if (j % 2 != 0)
                            exception[j] = String.valueOf(sign);
                    }
                    break;
                case 4:
                    for (int j = 0; j < 7; j++) {
                        int rannum = randomFa.Ran();
                        char sign = randomFa.sign();
                        if (j == 0)
                            exception[j] = "(";
                        if (j == 1 || j == 3 || j == 6)
                            exception[j] = String.valueOf(rannum);
                        if (j == 2 || j == 5)
                            exception[j] = String.valueOf(sign);
                        if (j == 4)
                            exception[j] = ")";
                    }
                    break;
                case 5:
                    for (int j = 0; j < 7; j++) {
                        int rannum = randomFa.Ran();
                        char sign = randomFa.sign();
                        if (j == 2)
                            exception[j] = "(";
                        if (j == 0 || j == 3 || j == 5)
                            exception[j] = String.valueOf(rannum);
                        if (j == 1 || j == 4)
                            exception[j] = String.valueOf(sign);
                        if (j == 6)
                            exception[j] = ")";
                    }
                    break;
                case 6:
                    for (int j = 0; j < 11; j++) {
                        int rannum = randomFa.Ran();
                        char sign = randomFa.sign();
                        if (j == 0 || j == 6)
                            exception[j] = "(";
                        if (j == 1 || j == 3 || j == 7 || j == 9)
                            exception[j] = String.valueOf(rannum);
                        if (j == 2 || j == 5 || j == 8)
                            exception[j] = String.valueOf(sign);
                        if (j == 4 || j == 10)
                            exception[j] = ")";
                    }
                    break;
            }
            String postE = inversePolish.postFix(exception);
            float trueanswer=inversePolish.solution(postE);
            float answer=randomFa.answer();
            if(answer==trueanswer)
                answerNum++;
        }
        System.out.println("你一共做对了"+answerNum+"道题目");
    }


}

