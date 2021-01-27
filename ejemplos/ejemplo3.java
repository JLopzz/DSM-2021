import java.util.Scanner;
class condicionesAnidadas {
  public static void main(String[] args) {

    Scanner tec = new Scanner(System.in);
    float n1, n2, n3, prom;
    
    System.out.print("Ingrese la primera nota: ");
    n1 = tec.nextFloat();
    
    System.out.print("Ingrese la segunda nota: ");
    n2 = tec.nextFloat();
    
    System.out.print("Ingrese la tercera nota: ");
    n3 = tec.nextFloat();
    
    prom = (n1 + n2 + n3) / 3;

    if(prom < 4) System.out.print("Reprobado");
    else if(prom <7 ) System.out.print("Promocionado");
    else System.out.print("Aprobado");
  }
}