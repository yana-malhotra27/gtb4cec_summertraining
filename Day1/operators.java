package Day1;

public class operators {
    public static void main(String[] args) {
        int a=7, b=9;
        System.out.println(a+b);
        // arithematic operators
        int c=2, d=3;
        //+,-,*, /, %, ++, --
        a=a+b; //5
        b=b+a; //8
        a=a-b; //-3
        b=b-a; //11
        ++a; a++; --b; b--;
        // comparison operators
        // <, >,!=, ==, <=, >=
        // logical operators
        // (and, or, not) &&, ||, !
       // if(!(a>b || a<10));
        // assignment operators
        // =, +=, -=, *=, /=, %=, |=
        // homework: bitwise &, |, ^, >>, <<, ~
        //loops: for, while, Do-while
       // for (int i=1,i<10,i++){
            //code
        //}
        int sum=0;
        //using for loop print sum numbers from 1 to 25
        for(int i=1;i<=25;i++){
            sum+=i;
            System.out.print(sum+" ");
        }
       //while
       //while(i<15){
        //code
       //}
       // output the first multiple of two and 7
       System.out.println(" ");
       int i=1;
       while(i<15){
        if (i%2==0 && i%7==0){
            System.out.println(i);
            break;
        }
        else{
            i++;
        }
        }
       }
    }
    
