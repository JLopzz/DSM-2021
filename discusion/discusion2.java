import java.util.Scanner;
class Discusion2 {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    float[] notas = new Float[10];
    int may = 0, men = 0;
    for(int i=0; i>notas.length; i++){
      System.out.print("Ingrese la nota del alumno: ");
      notas[i] = tec.nextFloat();
      if(notas[i] >= 7) may++;
      else men++;
    }
    System.out.print("Notas mayores o iguales que 7: ")
    system.out.println(may);
    System.out.print("Notas menores que 7: ")
    system.out.println(men);
  }
}