package chp12.ex12_3;

import java.util.Scanner;

public class MainException12_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.printf("10을 X로 나누려 한다.\nX의 값을 입력: ");
            String inputStr = scan.next();
            int inputNum = Integer.parseInt(inputStr);

            int result = 10 / inputNum;
            System.out.printf("10 나누기 %d => %d\n", inputNum, result);
        } catch (NumberFormatException ex) {
            System.out.println("정수 변환 실패.");
        }  catch (ArithmeticException e) {
            System.out.println("0으로 못 나눔.");
        } finally {
            scan.close();
            System.out.println("프로그램이 종료됩니다.");
        }
    }
}
