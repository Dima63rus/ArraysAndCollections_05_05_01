public class Main {
    public static void main(String[] args) {
/*
1. Создайте массив из мнемонической фразы: Каждый охотник желает знать, где сидит фазан.
2. Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
*/
        String lvText = "Каждый охотник желает знать, где сидит фазан";
        String[] ltText = lvText.split(",^?\\s+");
        for (int i = 0; i < ltText.length; i++) {
            System.out.println(ltText[i]);
        }
    }
}