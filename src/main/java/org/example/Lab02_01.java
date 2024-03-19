package org.example;

import java.util.Scanner;

public class Lab02_01 {
//    ## 택배 보내기입나다. 다음은 각각 입력하세요 ##
//    받는 사람 : 김난생
//    주소 : 서울 영등포구 여의도동
//    무게(g) : 721
//    ** 받는 사람 ==> 김난생
//    ** 주소 ==> 서울 영등포구 여의도동
//    ** 배송비 ==> 3605원
    public static void main(String[] args){
        int weight;
        String name, address;
        System.out.println("##  택배 보내기입니다. 다음은 각각 입력하세요.    ##");
        Scanner s = new Scanner(System.in);
        System.out.println("받는 사람 : ");
        name = s.nextLine();

        System.out.println("주소 : ");
        address = s.nextLine();

        System.out.println("무게(g) : ");
        weight = s.nextInt();

        System.out.println("** 받는 사람 ==> " + name);
        System.out.println("** 주소 ==> " + address);
        System.out.println("** 배송비 ==> " + weight*5 + "원");

        s.close();
    }
}
