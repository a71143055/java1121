package chp12.ex12_2;

public class MainException12_02 {
    public static void main(String[] args) {
        String[] seasons = {"봄", "여름", "가을", "겨울"};

        try{
            System.out.println(seasons[0]);
            System.out.println(seasons[4]);
            System.out.println(seasons[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        } finally {
            System.out.println("프로그램이 종료됩니다.");
        }
    }
}
