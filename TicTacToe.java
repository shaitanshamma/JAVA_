import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static char[][] map; // матрица
    private static int size = 3;
    private static final char DOT_Empty = 'o';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private static final boolean SILLY_MODE = true;

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            humanTurn();
            if (isGameEnd(DOT_X)) {
                break;
            }
            computerTurn();
            if (isGameEnd(DOT_O)) {
                break;
            }

        }
        System.out.println("End game");
    }

    private static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_Empty;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты ячейки (X Y)");
            y = scanner.nextInt() - 1; // Считывание номера строки
            x = scanner.nextInt() - 1; // Считывание номера столбца
        }
        while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    private static void computerTurn() {
        int x = -1;
        int y = -1;
        if (SILLY_MODE) {
            do {
                x = random.nextInt(size);
                y = random.nextInt(size);
            } while (!isCellValid(x, y));
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
// Проверяем клетки по направлениям
                    if (map[i][j] == DOT_Empty && (map[i][j + 1] == DOT_O || map[i][j - 1] ==
                            DOT_O || map[i + 1][j] == DOT_O || map[i - 1][j] == DOT_O ||
                            map[i + 1][j - 1] == DOT_O)) {
                        map[i][j] = DOT_O;
                    } else do {
                        x = random.nextInt(size);
                        y = random.nextInt(size);
                    } while (!isCellValid(x, y));
                }
            }
        }
        System.out.println("Компьютер выбрал ячейку " + (y + 1) + " " + (x + 1));
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        boolean result = true;
        if (x < 0 || x >= size || y < 0 || y >= size) {
            result = false;
        }
        if (map[y][x] != DOT_Empty) {
            result = false;
        }
        return result;
    }

    private static boolean isGameEnd(char playerSymbol) {
        boolean rezult = false;
        printMap();
        if (checkWin(playerSymbol)) {
            rezult = true;
        }
        if (isMapFull()) {
            System.out.println("Ничья!");
            rezult = true;
        }
        return rezult;
    }

    private static boolean isMapFull() {
        boolean rezult = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_Empty) {
                    rezult = false;
                }
            }
        }
        return rezult;
    }
    private static boolean checkGorizont(int i, char playerSymbol) {
        int gorizont = 0;
        boolean result = false;
        for (int j = 0; j < size; j++) {
            if (map[i][j] == playerSymbol) {
                gorizont++;
            }
            if (gorizont == size) {
                result = true;
            }
        }
        return result;
    }

    private static boolean checkVertic(int j, char playerSymbol) {
        int vert = 0;
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (map[i][j] == playerSymbol) {
                vert++;
            }
            if (vert == size) {
                result = true;
            }
        }
        return result;
    }

    private static boolean checkDiag(char playerSymbol) {
        boolean result = false;
        int diag = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == j && map[i][j] == playerSymbol) {
                    diag++;
                    if (diag == size) {
                        result = true;
                    }
                } else if ((i == (size - 1) - j) && map[i][j] == playerSymbol) {
                    diag++;
                    if (diag == size) {
                        result = true;
                    }
                }
            }
        }
        return result;
    }

    private static boolean checkWin(char playerSymbol) {
        boolean rezult = false;
        for (int i = 0; i < size; i++) {
            if (checkGorizont(i, playerSymbol)) {
                rezult = true;
                System.out.println("Победа " + playerSymbol);
            }
        }
        for (int j = 0; j < size; j++) {
            if (checkVertic(j, playerSymbol)) {
                rezult = true;
                System.out.println("Победа " + playerSymbol);
            }
        }
        if (checkDiag(playerSymbol)) {
            rezult = true;
            System.out.println("Победа " + playerSymbol);
        }
        return rezult;
    }
}

