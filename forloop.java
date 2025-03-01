// to repeat anything more than one time or multiple time is called loop
// for loop  (is usually used to execute piece of code at  specific number of time)
// for loop is the most commomly used loop,its used when we want to perform initializtion , condition and inc/dec operation in single line
// when we know number of iteration
// entery_control loop
// thinks to know of for loop
//1. what think you want to repeat
//2.how many time you want to repeat
// syntax
// for(initialization ; condition ; inc/dec or updation)
// DRY RUN mean to analyze our code whithout coding (just imagine)
// in this loop we use counter variable (i) t must be in int type
public class forloop {
    public static void main(String args[]){
        System.out.println("Assending order");
        for(int i=0; i<=100; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Desending order");
        for(int i=100; i>=0; i-- ){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Loop the name");
        for(int i=0; i<=23; i++){
            System.out.print("Ahsan ");
        }
        
         // 2 table
         System.out.println("Table of 2");
         for(int i=2; i<=20; i+=2){
            System.out.println(i);
         }
         // 2 table reverse
         System.out.println("reverse table of 2");
         for(int i=20; i>=2; i=i-2){
            System.out.println(i);
         }
         System.out.println("repetation of string");
         for(int i=1; i<=10; i++){
            System.out.println("i love java");
         }
         // you can also print array through for loop
         System.out.println("printing array");
         int[] mark= {45,68,89,90,78};
         for(int i=0; i<mark.length; i++){
            System.out.println(mark[i]);
         }
         //odd number
         System.out.println("odd number");
         for(int i=1; i<=20; i+=2){
            System.out.println(i);
         }

    
    // write n of of odd number where n is natural number or i in loop
    // 2n even number
    // 2n+1 odd number
    System.out.println("odd number by 2n+1 formula");
    for(int i=0; i<=10; i++){
        System.out.println(2*i+1);
    }
    System.out.println("Even number by 2n formula");
    for(int i=0; i<=20; i++){
        System.out.println(2*i);
    }
    // try to ad boolean in odd number --------------------------------------
    // boolean n = true;
    // for(int i=0; i<=5; i++){
    //     System.out.println(if(2*i+1) == boolean);
    // }
    System.out.println("decrement by not equal to !=");
    for(int i=5; i!=0; i--){
        System.out.println(i);
    }
    
}
    
}
