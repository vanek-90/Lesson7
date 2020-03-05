
public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Cruiser cruiser = new Cruiser("Фёдор Шаляпин", "зеленый", 3, "зенитка");
        count++;
        Авианосец v = new Авианосец("Адмирал Кузнецов", "серый", 2, 33);
        count++;
        cruiser.setLength(4);//Устанавливаем длину строки >4. Ошибка!
        cruiser.getShips();/*Выводим характеристики унаследованного корабля используя
        переопределенный метод класса Ship */
        v.getShips();
        v.sweem();// Метод из интерфейса(используется в наследнике)
        cruiser.shoot();// Переопределенный метод
        cruiser.voice();// Метод класса Cruiser
        System.out.println("Адмирал Кузнецов плывет со скоростью:" + v.getSpeed() + " км/ч");
        Helper.print("Создано кораблей:" + " ");
        Helper.print(count);
        System.out.println();
        // Я не нашел, где можно  вызвать исключение, поэтому породил его.
        try {
            throw (new NullPointerException());
        } catch (NullPointerException e) {
            //  e.printStackTrace(); Проверял, как выглядит трассировка исключения
            e.fillInStackTrace();
        } finally {
            System.out.println("Возникало исключение NullPointerException. Оно было обработано");
            //Ниже собственное исключение
            try {
                Helper.checkingError(1);
                Helper.checkingError(5);
            } catch (MyException e) {
                System.out.println(e + " > 4");
            }
        }

    }
}






