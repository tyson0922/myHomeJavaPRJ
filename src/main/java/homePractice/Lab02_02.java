package homePractice;

import java.util.Scanner;

public class Lab02_02 {
    public static void main(String[] args){
        int num1, num2;
        int resAdd;
        int resSub;
        int resMul;
        double resDiv;
//      정수1 ==> 333(사용자 입력)
//      정수2 ==> 100(사용자 입력)
//      333+100=433
//      333-100=233
//      333*100=333000
//      333/100=3.33

        Scanner s =new Scanner(System.in);

        System.out.println("정수1 ==> ");
        num1 = s.nextInt();

        System.out.println("정수2 ==> ");
        num2 = s.nextInt();

        resAdd = num1 + num2;
        resSub = num1 - num2;
        resMul = num1 * num2;
        resDiv = (double) num1 /num2;

        System.out.println(num1 + " + " + num2 + " = " + resAdd);
        System.out.println(num1 + " - " + num2 + " = " + resSub);
        System.out.println(num1 + " * " + num2 + " = " + resMul);
        System.out.println(num1 + " / " + num2 + " = " + resDiv);

        s.close();
    }
}
