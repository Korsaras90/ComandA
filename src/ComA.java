import java.util.Scanner;

public class ComA {
    public static void main(String[] args) {

        int solution = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Читаем с клавиатуры размер массива

        int[] mas = new int[n]; //Создаём массив
        in.nextLine();
        for (int i = 0; i < n; i++) {
            mas[i] = in.nextInt();   // Заполняем массив
        }
        for (int i = 0; i < n; i++) {
            int r = 0;
            while (mas[i] >= 10) {
                int t = mas[i] % 10;
                mas[i] = mas[i] / 10;
                if (t == 1) {
                    r++;
                }
                if (mas[i] == 1) {
                    r++;
                }
                if (r >= 2) {
                    solution++;
                }
            }
        }
        System.out.println("solution = " + solution);
        System.out.println("solution = " + solution);
    }
}



