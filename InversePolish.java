package demo03;

import java.util.Stack;

public class InversePolish {
    static Stack<String> s1=new Stack<>();
    static Stack<String> s2=new Stack<>();
    public String postFix(String []exception) {
        String str = "";
        for(int j=0;j<exception.length;j++){
            if(exception[j]!="")
                System.out.print(exception[j]);
        }
        System.out.print("=");
        for (int i = 0; i < exception.length; i++) {
            str = exception[i];
            if (str.matches("\\d+")) {
                s1.push(str);
            } else if(str!=""){
                if (str.equals("(") || s2.isEmpty())
                    s2.push(str);
                else if (str.equals(")")) {
                    while (!(s2.peek()).equals("("))
                        s1.push(s2.pop());
                    s2.pop();
                }
                else if ((s2.peek()).equals("(") || getPriority(str)>=
                getPriority((s2.peek()))) {
                    s2.push(str);
                }
                else if(getPriority(str)<getPriority(s2.peek())){
                    s1.push(s2.pop());
                    i--;
                }
            }
        }
        while (!s2.isEmpty())
            s1.push(s2.pop());
        String inverseResult="";
        while(!s1.isEmpty())
            inverseResult=inverseResult+s1.pop()+" ";
        String result="";
        String []result1=inverseResult.split(" ");
        for(int i=result1.length-1;i>=0;i--)
            result=result+result1[i]+" ";
        return result.substring(0);
    }
    int getPriority(String symbol){
        if(symbol.equals("-") || symbol.equals("+"))
            return 1;
        else if (symbol.equals("*") || symbol.equals("/"))
            return 2;
        else return 0;
    }
    float solution(String exception){
        Stack<String> stack=new Stack();
        String []strs=exception.split(" ");
        for(String str:strs){
            if(str.matches("\\d+"))
                stack.push(str);
            else {
                float result=calculate(stack,str);
                stack.push((result+""));
            }
        }
        return Float.parseFloat(stack.pop());
    }
    float calculate(Stack stack,String str){
        float num1 = Float.parseFloat((String) stack.pop());
        float num2 = Float.parseFloat((String) stack.pop());
        float result = 0;
        switch (str){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num2 - num1;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num2 / num1;
        }
        return result;

    }

}
