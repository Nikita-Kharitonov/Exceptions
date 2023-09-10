package t3;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.printf("Неверный формат: %s", i);
        System.out.println();
    }
}