package home0324;

import java.util.Scanner;

public class Code02_111 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("실수를 입력하세요.");
        double num;
        num = s.nextDouble();
        System.out.println(num);

        System.out.println("문자열을 입력하세요.");
        String str;
        str = s.next();
        System.out.println("사용자가 입력한 값 ==> " + str);
    }
}
