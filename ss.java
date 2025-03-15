import java.util.Scanner;

public class ss {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x ;
        System.out.println("enter the number ");
        x = scanner.nextInt();
        int y;
        System.out.println("enter the power ");
        y = scanner.nextInt();
        double z = Math.pow(x, y);
        System.out.println(z);

    }
}
