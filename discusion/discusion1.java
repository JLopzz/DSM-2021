import java.util.Scanner;
class Discusion1 {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    float n1, n2, mod;
    System.out.print("Ingrese el primer valor a evaluar: ");
    n1 = tec.nextFloat();
    System.out.print("Ingrese el segundo valor a evaluar: ");
    n2 = tec.nextFloat();

    if(n1 % n2 == 0 ) System.out.println("Si son divisibles.");
    else System.out.println("No son divisibles");
  }
}