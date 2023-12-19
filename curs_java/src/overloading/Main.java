package overloading;


public class Main {
    public static void main(String[] args) {
        Display display = new Display();

        display.showInfo("Welcome to Java");
        display.showInfo(42);
        display.showInfo(3.14);
        display.showInfo("Alice", 25);
    }
}
