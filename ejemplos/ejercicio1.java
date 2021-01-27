import java.util.Scanner;
class SumaProductoNumeros {
  public static void main(String[] args) {

    Scanner tec = new Scanner(System.in);
    int n1, n2, sum, prod;
    
    System.out.print("Ingrese el primer valor: ");
    n1 = tec.nextInt();
    
    System.out.print("Ingrese el segundo valor: ");
    n2 = tec.nextInt();

    sum = n1 + n2;
    prod = n1 * n2;

    System.out.print("La suma de los valores es: ");
    System.out.println(sum);
    
    System.out.print("El producto de los valores es: ");
    System.out.println(prod);
  }
}