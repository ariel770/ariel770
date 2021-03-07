public class Main {
    public static void main(String[] args) {
        AnotherClass ac1 = new AnotherClass();
        System.out.printf("%n%s", ac1.toString());
        ac1.age = 30;
        ac1.name = "pinjas";
        System.out.printf("%n%s", ac1.toString());

    }
}


class AnotherClass {
    int age = 0;
    String name = "hello";

    public String toString() {
        return String.format("%n%s%n%s", name, age);
    }
}
