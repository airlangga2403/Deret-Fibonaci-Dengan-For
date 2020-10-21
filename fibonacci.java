import java.util.*;
/*
Program Deret Fibonacci Dengan value 1&2 dari iputUser
 */
public class fibonacci {
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Program Deret Fibonacci");
        int input1,input2,inputKeN;
        masukkan("1 ");
        input1 = inputUser.nextInt();
        masukkan("2 ");
        input2 = inputUser.nextInt();
        masukkan("N ");
        inputKeN = inputUser.nextInt();

        //array List
        ArrayList fibonacci = new ArrayList();

        // Loop
        int i,fn;
        for (i = 1; i<=inputKeN; i++){
            fn=input1+input2;
            input1=input2;
            input2=fn;
            fibonacci.add(fn);

        }
        System.out.println("Deret Fibonaccinya  adalah : " + fibonacci);

    } private static void masukkan (String input){
        System.out.print("Masukkan Input Ke " + input + " : ");

    }
}
//Airlangga Permana Putra
//D3 RPLA 44-01