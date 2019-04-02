public class Cats extends Animal {
    int appetit;
    boolean hungry;

    Cats(int maxRange, int maxSwim, double maxHight, String name, int appetit, boolean hungry) {
        this.maxHigth = maxHight;
        this.maxRange = maxRange;
        this.maxSwim = maxSwim;
        this.name = name;
        this.appetit = appetit;
        this.hungry = hungry;
    }

    public boolean isHungry() {
        if (hungry == true) {
            System.out.println("Кот " + name + " голоден, покорми кота!");
        } else if (hungry == false) System.out.println("Котейка " + name + " сыт и есть не хочет!");
        return hungry;
    }

    public static void main(String[] args) {
        int range = 100;
        int swim = 10;
        double hight = 2;
        String name = "";
        Cats cat1 = new Cats(98, 0, 2, "Васька", 110, true);
        Dish dish1 = new Dish(100, 150);
        System.out.println("В миске " + dish1.food + " еды.");
        Cats[] cats = new Cats[3];
        cats[0] = new Cats(98, 0, 2, "Васька", 10, true);
        cats[1] = new Cats(88, 0, 1, "Рыжик", 60, true);
        cats[2] = new Cats(58, 0, 0.5, "Толстый", 80, true);
        for (int i = 0; i < cats.length; i++) {
            if ((cats[i].appetit < dish1.setFood()) && cats[i].isHungry()) {
                cats[i].catEat();
                cats[i].isHungry();
                dish1.getFood(cats[i].appetit);
                System.out.println("В миске " + dish1.food + " еды.");
            } else {
                System.out.println("Кот " + cats[i].name + " не может пожрать! Ему нужно " + cats[i].appetit + " еды!");
                System.out.println("В миске мало еды! Наполни миску!");
            }
        }
    }

    public boolean catEat() {
        System.out.println("Кот " + name + " жрет...");
        return hungry = false;
    }
}
