public abstract class Ship implements ISweemer {
    public String shipName; //Название корабля
    public String color;
    public int length;


    public Ship(String shipName, String color, int length) {
        this.shipName = shipName;
        this.color = color;
        this.length = length;
    }

    // Метод с входным параметром
    public void setLength(int length) {
        if (length <= 4) {
            this.length = length;
        } else {
            System.out.println("Длина корабля не может быть больше 4");
        }
    }

    public void getShips() {
        System.out.println("Создан корабль:" + shipName + "," + "цвет:" + color + "," + "длина:" + length);
    }

    public void shoot() {
        System.out.println("Корабль выстрелил из пушки!");
    }

    @Override
    public void sweem() {
        System.out.println("Я плыву!");
    }
}




