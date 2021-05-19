public class Launcher {
    public static void main(String[] args) {
        System.out.println(("I have no idea what I am doing but I'm trying my best ;-;"));

        var scan = new java.util.Scanner(System.in);
        var input = scan.nextLine();

        while (!input.equals("quit")) {
            System.out.println("Unknown command");
            input = scan.nextLine();
        }
    }
}
