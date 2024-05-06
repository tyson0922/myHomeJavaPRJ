package homePractice;

public class Exam1 { //Exam1이라는 클래스임
    public static void main(String[] args){ //프로그램 실행 메서드
        for (int i =0; i < 4; i++){ //초기값 0부터 시작. 조건식 4보자 작을때 까지 행을 1개씩 만듦 조건식 ㅑ< 4를 만족 못하면 for문 종료함
            for (int j = 1 ; j < 8; j++){ //칸수가 7개여서 1~7개 칸을 만듦.
                if (j >= 4-i && j <= 4+i){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
