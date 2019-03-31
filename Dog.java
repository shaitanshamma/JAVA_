public class Dog extends Animal {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.maxRange = 200;
        dog1.maxHigth = 0.5;
        dog1.maxSwim = 10;
        int range = 100;
        int swim = 10;
        double hight = 0.3;
        System.out.println("A добежит ли сабакен на " + range + " м ?" + " " + dog1.run(range));
        System.out.println("A проплывет ли собакен на " + swim + " м ?" + " " + dog1.swim(swim));
        System.out.println("A прыгнет ли собакен на " + hight + " м ?" + " " + dog1.jump(hight));
    }
}
