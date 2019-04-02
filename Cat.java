public class Cat extends Animal {
    static int appetit;
    boolean hungry;


    Cat(int maxRange, int maxSwim, double maxHight, String name, int appetit, boolean hungry) {
        this.maxHigth = maxHight;
        this.maxRange = maxRange;
        this.maxSwim = maxSwim;
        this.name = name;
        this.appetit = appetit;
        this.hungry = hungry;
    }

    public void isHungry() {
        if (hungry == true) {
            System.out.println("Кот " + name + " голоден, покорми кота!");
        } else if (hungry == false) System.out.println("Котейка " + name + " сыт и есть не хочет!");
    }

    public static void main(String[] args) {
        int range = 100;
        int swim = 10;
        double hight = 2;
        String name = "";
        Cat cat1 = new Cat(98, 0, 2, "Васька", 110, true);
        Dish dish1 = new Dish(100, 150);
        System.out.println("В миске " + dish1.food + " еды.");
        System.out.println("Кот " + cat1.name + " должен есть по " + cat1.appetit + " еды.");
        if (dish1.checkFood(cat1.appetit)) {
            cat1.catEat();
            System.out.println("В миске осталось " + dish1.getFood(cat1.appetit) + " еды");
        } else {
            System.out.println("В миске мало еды! Наполни миску!");
            dish1.setFoodFull();
            System.out.println("В миске стало " + dish1.food + " еды.");
            cat1.catEat();
            cat1.isHungry();
            System.out.println("В миске осталось " + dish1.getFood(cat1.appetit) + " еды.");
        }
    }

    public boolean catEat() {
        System.out.println("Кот " + name + " жрет...");
        return hungry = false;
    }
}


