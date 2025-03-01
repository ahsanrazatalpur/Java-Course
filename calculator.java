import java.util.Scanner;
public class calculator {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int num1,num2,num3,operation,sum,div,mul,mod,dif;
        System.out.println("***    CALCULATOR   ***");
        System.out.println("please enter number 1");
         num1 = in.nextInt();
        System.out.println("please enter second number");
         num2 = in.nextInt();
        System.out.println("please choose operation");
        switch(operation){
            case '+' : num1 + num2 = sum;
                    System.out.println("The sum of two number is"+sum);
                    break;
            case '-' : num1 - num2 = dif;
                    System.out.println("The Difference of two number is :"+dif);
                    break;
            case '*' : num1 * num2 = mul;
                    System.out.println("The multiplication of two number is :"+mul);
                    break;
            case '/' : num1 / num2 = div;
                    System.out.println("The division of two number is :"+div);
                    break;
            case '%' : num1 % num2 = mod;
                    System.out.println("The modules of two number is :"+mod);
                    break;
                    

        }


    }
    
}
