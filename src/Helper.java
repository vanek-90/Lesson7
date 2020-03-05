public class Helper {
    public static void print(int a) {
        System.out.print(a);
    }

    public static void print(String b) {
        System.out.print(b);
    }
    // Выше была реализована перегрузка метода

    //Метод для ввода числа, если >4 выкидывает собственное исключение
    static void checkingError(int a)
            throws MyException {
        System.out.println("Было введено число (" + a + ")");
        if (a > 4)
            throw new MyException(a);
        System.out.println("Такое число допустимо");
    }
}
