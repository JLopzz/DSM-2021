import java.util.Scanner;
class Discusion3 {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    int impar = 0, par = 0, n;
    System.out.print("Ingrese la cantidad de numeros a ingresar: ");
    n = tec.nextInt();
    for(int i=0; i<n; i++){
      System.out.print("Ingrese la nota del alumno: ");
      int a = tec.nextInt();
      if(a%2 == 0) par++;
      else impar++;
    }
    System.out.print("Cantidad de numeros pares registrados: ");
    System.out.println(par);
    System.out.print("Cantidad de numeros impares registrados: ");
    System.out.println(impar);
  }
}