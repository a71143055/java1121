package chp12.ex12_1;

public class MainException12_01 {
    public static void main(String[] args) {
        String[] arr = {"봄","여름","가을","겨울"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (String season: arr) {
            System.out.print(season + " ");
        }
        System.out.println();

        try{
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("나누는 수가 0이면 안되요!");
        } catch (Exception e) {
            System.out.println("배열의 인덱스 번호가 너무 크네요!!!");
        }
        System.out.println(arr[2]);
        System.out.println("프로그램이 종료됩니다.");
    }
}
