public class Cat extends Animal {

    Cat(int maxRange, int maxSwim, double maxHight, String name) {
        this.maxHigth = maxHight;
        this.maxRange = maxRange;
        this.maxSwim = maxSwim;
        this.name = name;

    }

    public static void main(String[] args) {
        int range = 100;
        int swim = 10;
        double hight = 2;
        String name = " ";
        Cat cat1 = new Cat(98, 0, 2, "Васька");
        Cat cat2 = new Cat(80, 0, 1.5, "Рыжик");
        System.out.println("A добежит ли кот " + cat1.name + " на " + range + " м ?" + " " + cat1.run(range));
        System.out.println("A проплывет ли кот " + cat1.name + " на " + swim + " м ?" + " " + cat1.swim(swim));
        System.out.println("A прыгнет ли кот " + cat1.name + " на " + hight + " м ?" + " " + cat1.jump(hight) + "\n");
        System.out.println("A добежит ли кот " + cat2.name + " на " + range + " м ?" + " " + cat2.run(range));
        System.out.println("A проплывет ли кот " + cat2.name + " на " + swim + " м ?" + " " + cat2.swim(swim));
        System.out.println("A прыгнет ли кот " + cat2.name + " на " + hight + " м ?" + " " + cat2.jump(hight));
    }
}
