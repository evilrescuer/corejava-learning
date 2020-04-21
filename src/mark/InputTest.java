package mark;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name?");
        String name = scanner.nextLine();
        System.out.print("How old are you?");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + ", next year you will be " + (age + 1) + " years old.");
        System.out.printf("Hello, %s, next year you will be %d years old.", name, age + 1);
        scanner.close();
    }
}
