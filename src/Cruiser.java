public class Cruiser extends Ship {
    public String gun;

    // Перегрузка конструктора
    public Cruiser(String shipName, String color, int length, String gun) {
        super(shipName, color, length);
        this.gun = gun;
    }

    public void voice() {
        System.out.println("Щас спою!");
    }

    @Override
    public void shoot() {
        System.out.println("Крейсер выстрелил!");
    }

    @Override
    public void getShips() {
        System.out.println("Создан корабль:" + shipName + "," + "цвет:" + color + "," + "длина:" + length + "," + "оружие:" + gun);
    }

}

