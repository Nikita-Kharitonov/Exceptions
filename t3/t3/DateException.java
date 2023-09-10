package t3;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.printf("Неверный формат: %s", i);
        System.out.println();
    }
}