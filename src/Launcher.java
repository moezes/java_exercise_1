public class Launcher {
    public static void main(String[] args) {
        System.out.println(("I have no idea what I am doing but I'm trying my best ;-;"));
        var input = new java.util.Scanner(System.in);
        var newInput = input.nextLine();
        if (!newInput.equals("quit")) {
            System.out.println("Unknown command");
        }
    }
}
