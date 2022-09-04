package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class MainClassForLessonOne {

    public static void main(String[] args) {
//        System.out.println("Hello!");
//        printHello();
//        printHello();
//        printHello();
//        printHello();

        //testVars();

        checAppraisal();

    }

    static void printHello(){
        System.out.println("Всем привет!");
    }

    private static void testVars() {
        int varA = 9;
        int varB = 5;
        double result = varA / (double) varB;
        System.out.println(result);

        double doubleVar1 = 9.0;
        float floatVar2 = 5.1f;
        System.out.println(doubleVar1/floatVar2);
        varA +=3;
        varA *=3;
        varA %=3;

        boolean isRed = true;
        isRed = false;
        String helloEstr = "Hello";
        String world = "world";

        System.out.println(helloEstr + ", " + world + "!");


    }

    private static void checAppraisal() {

        int appraisal = ThreadLocalRandom.current().nextInt(8) - 2;
        System.out.println( "Школьник принес оценку: " + appraisal);

        if (appraisal == 5) {
            System.out.println("Great!!!");

        }else if (appraisal == 4) {
            System.out.println("Хорошо, но ты можешь лучше.");
        }else if (appraisal >= 1 && appraisal <= 3) {

//        }else if (appraisal == 3) {
//            System.out.println("Не очень хорошо, ты можешь лучше.");
//
//        }else if (appraisal == 2 || appraisal == 1) {
                        System.out.println( "Плохо!");
            }else {
            System.out.println("What?!");
        }

        System.out.println( "Проверка дневника окончена.");
    }
}
