package overloading;

public class Display {
    public void showInfo(String message) {
        System.out.println("Info: " + message);
    }

    public void showInfo(int number) {
        System.out.println("Info: " + number);
    }

    public void showInfo(double number) {
        System.out.println("Info: " + number);
    }

    public void showInfo(String name, int age) {
        System.out.println("Info: " + name + ", Age: " + age);
    }
}
