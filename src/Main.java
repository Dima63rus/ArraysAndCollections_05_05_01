public class Main {
    public static void main(String[] args) {
/*
1. —оздайте массив из мнемонической фразы:  аждый охотник желает знать, где сидит фазан.
2. Ќапишите код, который мен€ет пор€док расположени€ элементов внутри массива на обратный.
*/
        String lvStartText = " аждый охотник желает знать, где сидит фазан";
        String[] ltStartText = lvStartText.split("\\s+");

        StringBuilder lvEndText = new StringBuilder();
        for (int i = ltStartText.length - 1; i >= 0; i--) {
            lvEndText.append(ltStartText[i]);
            lvEndText.append(" ");
        }
        System.out.println(lvEndText);
    }
}