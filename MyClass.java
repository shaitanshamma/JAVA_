public class MyClass {
    byte a = 7;
    short b = 2344;
    int c = 777;
    long d = 334L; // Для объявления long в конце ставится буква L
    float e = 33535.00f; // Для объявления float в конце ставится буква f
    double f = 1343.3355;
    boolean j = true;
    char k = 'D';

    public static void main(String[] args) {
        hello("Василий");
        int arg = mathematic(3, 4, 5, 6);
        System.out.println("a * (b + (c / d))= " + arg);
        compare(7, 4);
        int yy = 5;
        nonNeg(7);
        System.out.println(yy + " отрицательное число? " + negative(9));
    }

    public static int mathematic(int a, int b, int c, int d) {
        System.out.println("Следующий пример:");
        System.out.println("Число a = " + a);
        System.out.println("Число b = " + b);
        System.out.println("Число c = " + c);
        System.out.println("Число d = " + d);
        return a * (b + (c / d));

    }

    public static void compare(int a, int b) {
        System.out.println("Следующий пример:");
        System.out.println("Число а = " + a);
        System.out.println("Число b = " + b);
        if ((a + b) >= 10 && ((a + b) <= 20)) {
            System.out.println("сумма a и b лежит в пределах от 10 до 20!");
        } else {
            System.out.println("сумма a и b лежит в пределах от 10 до 20");
        }
    }

        public static void nonNeg(int yy){
            System.out.println("Следующий пример:");
            if (yy >= 0) {
                System.out.println("Число " + yy + " положительное.");
            } else System.out.println("Число " + yy + " отрицательное.");
        }
        public static boolean negative(int yy){
            System.out.println("Следующий пример:");
            if (yy < 0) {
            return true;
             } else return false;
         }
        public static void hello(String name){
            System.out.println("Привет, " + name + "!");
        }
}

