import java.lang.module.FindException;

public class Launcher {
    public static void main(String[] args) {
        System.out.println(("I have no idea what I am doing but I'm trying my best ;-;\nLet's see how it goes.\n"));

        var scan = new java.util.Scanner(System.in);
        var input = scan.nextLine();

        while (!input.equals("quit")) {
            if (input.equals("fibo")) {
                System.out.println("Enter a integer:");
                System.out.println(Fibo(scan.nextInt()) + "\n");
                input = scan.nextLine();
            } else {
                System.out.println("Unknown command.\n");
            }
//            switch (input) {
//                case "fibo":
//                    System.out.println("Enter a integer:");
//                    System.out.println(Fibo(scan.nextInt()));
//                    input = scan.nextLine();
//                    break;
//                default:
//                    System.out.println("Unknown command.\n");
//                    break;
//            }
            input = scan.nextLine();
        }
    }

    public static int Fibo(int n) {
        int f0 = 0;
        int f1 = 1;

        if (n < 2)
            return n;

        for (int i = 2; i <= n; i++) {
            int tmp = f1;
            f1 += f0;
            f0 = tmp;
        }

        return f1;
    }
}
