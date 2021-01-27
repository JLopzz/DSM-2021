import java.util.Scanner;
class estructuraDoWhile {
  public static void main(String[] args) {

    Scanner tec = new Scanner(System.in);
    int suma = 0, cant = 0, val;
    float prom;

    do{
      System.out.print("Ingrese el Valor (0 para finalizar): ");
      val = tec.nextInt();
      if( val != 0){
        suma += val;
        cant++;
      }
    } while(val != 0);

    if(cant != 0){
      prom = (float) suma / cant;
      System.out.print("El promedio de los valores ingresados es:");
      System.out.println(prom);
    }
    else System.out.println("No se han ingresado Valores");
  }
}