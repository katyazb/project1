package HomeWork1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }


    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSing() {
        int a = 3;
        int b = 10;
        //   int sum = a + b;
        if (a + b >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    private static void printColor() {
        int value = 8;
        if (value <= 0) System.out.println("red");
        if (value > 0 & value <= 100) System.out.println("yellow");
        if (value > 100) System.out.println("green");

    }
    private static void compareNumbers() {
        int a = 354;
        int b = 486;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }
}
