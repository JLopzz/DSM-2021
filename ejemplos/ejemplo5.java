import java.util.Scanner;
class estructuraFor {
  public static void main(String[] args) {

    Scanner tec = new Scanner(System.in);
    int suma = 0, val;
    float prom;

    for(int i=1; i<=10; i++){
      System.out.print("Ingrese el Valor: ");
      val = tec.nextInt();
      suma += val;
    }
  
    System.out.print("La Suma es:");
    System.out.println(suma);

    prom = (float) suma / 10;
    
    System.out.print("El promedio es:");
    System.out.println(prom);
  }
}