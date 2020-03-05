public class MyException extends Exception {
    private int b;

    MyException(final int b) {
        this.b = b;
    }

    public String toString() {
        return "Ошибка! Введенное число " + b;
    }
}


