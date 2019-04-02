public class Animal {
    int maxRange;
    int maxSwim;
    double maxHigth;
    String name;

    public Animal() {

    }

    Animal(int maxRange, int maxSwim, double maxHight) {
        this.maxHigth = maxHight;
        this.maxRange = maxRange;
        this.maxSwim = maxSwim;
    }


    public boolean run(int range) {
        boolean result = false;
        if (range <= maxRange) {
            result = true;
        }
        return result;
    }

    public boolean swim(int rangeSwim) {
        boolean result = false;
        if (rangeSwim <= maxSwim) {
            result = true;
        }
        return result;
    }

    public boolean jump(double higth) {
        boolean result = false;
        if (higth <= maxHigth) {
            result = true;
        }
        return result;
    }
}
