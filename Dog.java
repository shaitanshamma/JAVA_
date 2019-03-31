public class Dog extends Animal {

    Dog(int maxRange, int maxSwim, double maxHight, String name) {
        this.maxHigth = maxHight;
        this.maxRange = maxRange;
        this.maxSwim = maxSwim;
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog(500, 15, 1, "Суровый");
        Dog dog2 = new Dog(400, 12, 1.5, "Тузик");
        int range = 100;
        int swim = 10;
        double hight = 0.3;
        System.out.println("A добежит ли сабакен " + dog1.name + " на " + range + " м ?" + " " + dog1.run(range));
        System.out.println("A проплывет ли собакен " + dog1.name + " на " + swim + " м ?" + " " + dog1.swim(swim));
        System.out.println("A прыгнет ли собакен " + dog1.name + " на " + hight + " м ?" + " " + dog1.jump(hight) + "\n");
        System.out.println("A добежит ли сабакен " + dog2.name + " на " + range + " м ?" + " " + dog2.run(range));
        System.out.println("A проплывет ли собакен " + dog2.name + " на " + swim + " м ?" + " " + dog2.swim(swim));
        System.out.println("A прыгнет ли собакен " + dog2.name + " на " + hight + " м ?" + " " + dog2.jump(hight));
    }
}
