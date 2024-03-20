import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int SmallestNumber = Integer.MAX_VALUE;

    for (int i = 0; i < 5; i++) {
      System.out.print("Podaj liczbę :" + (i + 1) + ": ");
      int number = scanner.nextInt();
      if (number < SmallestNumber) {
        SmallestNumber = number;
      }
    }
    System.out.println("Najmniejsza liczba to: " + SmallestNumber);
  }
}