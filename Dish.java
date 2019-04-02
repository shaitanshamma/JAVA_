public class Dish {
    public int food;
    public int volume;

    Dish() {
    }

    Dish(int food, int volume) {
        this.food = food;
        this.volume = volume;
    }

    public int setFood() {
        return food;
    }

    public boolean checkFood(int appetit) {
        if (food > appetit) {
            return true;
        } else {
            return false;
        }
    }

    public int getFood(int appetite) {
        food = food - appetite ;
        return food;
    }

    public int setFoodFull() {
        food = volume;
        System.out.println("Миска наполнена");
        return food;
    }
}
