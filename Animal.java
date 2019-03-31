public class Animal {
    int maxRange;
    int maxSwim;
    double maxHigth;
    public boolean run(int range){
        boolean result = false;
        if (range < maxRange){
            result = true;
        }return result;
    }
    public boolean swim(int rangeSwim){
        boolean result = false;
        if (rangeSwim < maxSwim){
            result = true;
        }return result;
    }
    public boolean jump( double higth){
        boolean result = false;
        if (higth < maxHigth){
            result = true;
        }return result;
    }
}
