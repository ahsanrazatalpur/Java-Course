// mini project to generate random number and guess what is the number.
import java.util.Scanner;
public class miniproject{
    public static void main(String args[]){
        int rannumber = (int)(Math.random()*100);
        Scanner in = new Scanner(System.in);
        int mynumber =0;;
        do{
        System.out.println("please guess the randomn number");
        mynumber = in . nextInt();
        if(rannumber == mynumber ){
            System.out.println("WOHOOOOO  number is same");
            break;
        }
        else if(rannumber < mynumber){
            System.out.println("number is lesser");
        }
        else if(rannumber > mynumber){
            System.out.println("number is greater");
        }
        
        }
        while(mynumber >= 0);
        System.out.println("here is randomn number"+rannumber);
        


    }
}