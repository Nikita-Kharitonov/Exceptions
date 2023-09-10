package t3;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Неверные данные");
        System.out.printf("Неверные данные: %s", i);
        System.out.println();
    }
}