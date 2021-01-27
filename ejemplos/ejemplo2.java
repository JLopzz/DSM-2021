import java.util.Scanner;
class condicionesSimples {
  public static void main(String[] args) {

    Scanner tec = new Scanner(System.in);
    float sueldo;
    
    System.out.print("Ingrese el Sueldo: ");
    sueldo = tec.nextFloat();
    
    if(sueldo > 3000)
      System.out.print("Esta persona debe abonar impuestos!");
  }
}