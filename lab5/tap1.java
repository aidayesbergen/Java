<<<<<<< HEAD
public class task1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            A[i] = (int)(Math.random()*40 - 20);
            System.out.print(A[i] + " ");
            if (A[i] < 0) sum += A[i];
        }

        System.out.println("\nТеріс элементтер қосындысы: " + sum);
    }
}
=======
import java.util.Scanner;

public class tap1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Оң сан");
        } else if (num < 0) {
            System.out.println("Теріс сан");
        } else {
            System.out.println("Нөл");
        }
    }
>>>>>>> origin/main
