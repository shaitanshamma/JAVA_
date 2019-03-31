public class Cat extends Animal {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.maxRange = 200;
        cat1.maxHigth = 2;
        cat1.maxSwim = 0;
        int range = 100;
        int swim = 10;
        double hight = 1;
        System.out.println("A добежит ли кот на " + range + " м ?" + " " + cat1.run(range));
        System.out.println("A проплывет ли кот на " + swim + " м ?" + " " + cat1.swim(swim));
        System.out.println("A прыгнет ли кот  на " + hight + " м ?" + " " + cat1.jump(hight));
    }
}
