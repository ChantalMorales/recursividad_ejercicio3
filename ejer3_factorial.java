import java.util.Scanner;
public class Main {
  static int factorial (int numero) {
    if (numero == 0) return 1;
    else return numero * factorial(numero-1);
  }
  
  public static void main(String[] args) {
    int n;
    Scanner s= new Scanner(System.in);
    System.out.println("Ingrese un numero: ");
    n = s.nextInt();
    System.out.println("Factorial de "+ n +" es: "+ factorial(n));
  }
}