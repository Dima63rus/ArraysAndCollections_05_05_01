public class Main {
    public static void main(String[] args) {
/*
1. �������� ������ �� ������������� �����: ������ ������� ������ �����, ��� ����� �����.
2. �������� ���, ������� ������ ������� ������������ ��������� ������ ������� �� ��������.
*/
        String lvStartText = "������ ������� ������ �����, ��� ����� �����";
        String[] ltStartText = lvStartText.split("\\s+");

        StringBuilder lvEndText = new StringBuilder();
        for (int i = ltStartText.length - 1; i >= 0; i--) {
            lvEndText.append(ltStartText[i]);
            lvEndText.append(" ");
        }
        System.out.println(lvEndText);
    }
}