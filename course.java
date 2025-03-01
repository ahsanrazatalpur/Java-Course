import java.util.Arrays;
public class course{
    public static void main(String args[]){
        // our  first program
        System.out.print("hello world!");
        // variables (to save anydata in memory temporary) we can also assign one variable value to another
        String name ="Ahsan Raza";
        int age = 20;
        String brother = "Ali Raza";
        int age2 = 25;
        String caste = "Talpur";
        String lastname = caste; 

        // variable two types
        //1. primative (to store simple value)
         // byte 1 byte memory ( -128 to 127 )
         // int  4 byte 1,2,3,4..
         // char 2 byte a,b,c....
         // short 2 byte 343...
         // long 8 byte 3445343L
         // float 4 byte 12.4F
         // double 8 byte 233454.45D
        //  boolean 1 byte true/false

        //2. non-primative / Reference (to store complex value)
        // String 
        // difference bw primative and non premative (non-premative have their own functions / methods) 
        // primative has fix length but non primative not
        // non_primative has to decalre with "new" keyword.
        String name5 ="Mir Ahsan Raza Talpur";
        System.out.print(name5.length()); //to find length of any String variable
        // concatenate String (+)
        String name1 ="Ahsan";
        String name2 ="Ali";
        String fullname = name1+" "+name2;
        System.out.print(fullname);
        //charAt (to find location of character)
        String realname="Ahsan Raza";
        System.out.println(realname.charAt(0));
        System.out.println(realname.charAt(5));
        //replace 
        String myname ="irfan"; //doesnt change in original string
        String myname1 = name.replace('i','f');
        System.out.println(myname1); // String are imutable (doesnot change) in java
        // substring (part of long string) always +1 endindex
        String isname = "Ahsan raza talpur";
        System.out.println(isname.substring(6,11));
        //Arrays (list of any type of variable) non-primitive data-type
        int[] marks = new int[3];
        marks[0]=56;
        marks[1]=77;
        marks[2]=98;
        System.out.println(marks[2]);
        //array length
        int [] count = new int[5];
        count[0]=2;
        count[1]=3;
        count[2]=4;
        count[3]=5;
        count[4]=6;
        System.out.println(count.length);

      // sort array need predefined class and pkg to sort array
      int[] mark = new int[3];
        mark[0]=99;
        mark[1]=77;
        mark[2]=98;
       System.out.println(mark[0]);
       Arrays.sort(mark);
       System.out.println(mark[0]);
    
      //if we know what type and how much value we want to store in array so we dont need new keyword
      int [] mark0 ={12,34,45,67};

      //2D array to store two student mark
      int [][] finalmark={{56,67,78},{23,45,56}};
      System.out.prinnt(finalmark[0][0]);
      System.out.print(finalmarks[1][1]);
       
      //casting (convert one datatype type to another)
      1.Explict
      2.Implict(default)
      double price = 100.00;
      double finalprice = price + 18;
      System.out.println(finalprice);
      //explict
      int p=100;
      int fp = p +(int) 18.0;
      system.out.print(fp);

      //constants(make value doesnot change)
      int age = 20;
      age = 21;
      age = 22;
      final int AGE =20; // (wite our final value datatype in uppercase so we will not change the value of final or constant)
       
      // operators
      // 1.arithmatic operator (*,-,/,+ and %)   
      int n=1,n1=3;
      int sum=n+n1;
      System.out.println();
      // 2.Assignment operator
      //  =  which assign value from right to left
      // unary opeartor (which need only one opefrand eg. ++  or  --)
      // num ++ increament operator (first print then increase)
      // ++ num (firdt increase and then increase)
      // -- decreament operator 

      // 3.logical operator
      // && logical and 
      // || logical or

      int num1 = 30;
      int num2 = 40;

      if( num1 <= 50 && num2 <= 50)
      System.out.println("both are less than 50");
      else
      System.out.println("Greater than 50");

      if(num1 <50 || num2 < 50)
      System.out.println("onne of them are less than 50");
      else
      System.out.println("both are not less than 50");

      // !
      boolean isAdult =true;
      if(isAdult)//  true valur no need to write true  // or if(!isadult) for making our value false
      System.out.println("is adult");
      else
      System.out.println("not adult");
      
      // 10rs  pencil   30rs for pencil
      Scanner in = new Scanner (System.in); // no need block {} for one line code 
      System.out.println("how much cash do you have");
      int cash = in.nextLine();
      if(cash < 10)
      System.out.println("cant buy anything");
      else if(cash >10 )
      System.out.println("can buy pencil");
      else
      System.out.println("pen and pencil both can buy");

      // 4.camparison
      // a == b if yes then true otherwise falsse
      // a != b 
      // a > b
      // a < b
      // a <= b
      // a >= b

      // conditional statement
      boolean sunset = true;
      if(sunset == true)
      System.out.println("day");
      else
      System.out.println("night");

      int age = "30";
      if(age >= 18 )
      System.out.println("eligible for vote");
      else
      System.out.println("not eligible for vote");

      
       // take input  // we need scanner pkg and object
       Scanner in = new Scanner(System.in);
       System.out.println("Please enter your name");
       String name = in.nextLine(); // only next for one word name(tokens) and nextLine for sentense or multiplae words name.
       System.out.println(name);

       // Math predefined classes
       //  5 , 6
       System.out.println(Math.max(5,6)); // 6
       // 5 , 6
       System.out.println(Math.min(5,6)) // 5
       // randomn (for any randomn value from 0.0 to 1.0) write datataype before class to get input in that datatype and multiply 0  to get proper value instaed of 0
       System.out.println((int)Math.randomn()*100);

      //  switch statement take one value and check all condition on the basis of that one value
      // day  1 . monday   2 .tuesday ...
      switch(day){
        case 1 : 
                System.out.println("monday");
                break;
       case 2 : 
                System.out.println("tuesday");
                break;
       case 3 : 
                System.out.println("wednesday");
                break;
       case 4 : 
                System.out.println("thursday");
                break;
       case 5 : 
                System.out.println("friday");
                break;
       case 6 : 
                System.out.println("saturday");
                break;
        case 7 : 
                System.out.println("sunday");
                break;
      }

      // loops in java 
      // for loops 
      // while loops
      // do while loops

      //for loops
      // 1 to 10
      for(int i=0; i<=10; i++)
      System.out.println(i);
      // 100 to 1
      for(int i=100; i>=1; i--)
      System.out.println(i);

      // while loop (condition check than run code)
      // 1 to 100
      int i =100;
      while(i >= 1)
      System.out.println(i);
      i-=1;

      // do while loop(run code than check condition)
      int i=100;
      do{
        System.out.println(i);
        i-=1;
      }
      while(i >= 1);

      // practrice question
      Scanner in = new Scanner(System.in);
      System.out.println("Enter any number");
      int number = in.nextInt();
      do{
        System.out.println(number);
      }
      while(number >= 0 );
      System.out.println("invalid input");
        
     //break and contiinue  
     int number = 0;
     while(true){
      System.out.println(number);
      i+=1;
      if(number > 5){
        break; // exit statement 
      }
     }

     // continue  to jump any statement
     int num = 0;
     while(true){
      System.out.println(num);
      if(i == 3)
      i=+1;
      continue;
      if(num < 5)
      break;
     }

     // Exception handling (try - catch)
     int marks[] = {45,56,88};
     try{
      System.out.println(marks[4]);
     }
     catch(Exception exception){
     
     }
     System.out.println("here is the marks");
     
     System.out.println("name is Ahsan");
     


     // method / function (to perform any operation) or block of code that can be reused
     // class has so many methods and each method have different functions
     public static void printjava(){
      System.out.println("hello java!");
     }
     printjava();

     public static void myName(String name){
      System.out.println(name);
     }
     myName("Ahsan raza");
     myName("Ali raza");

     public static void addNumber(int num1,int num2){
      int sum = num1 + num2;
      System.out.println(sum);
     }
     addnumber(5,7);

    }

}