import java.util.Scanner;
class estructuraWhile {
  public static void main(String[] args) {

    Scanner tec = new Scanner(System.in);
    int n, x = 1;
    
    System.out.print("Ingrese el valor de paro: ");
    n = tec.nextInt();
    
    while(x <= n){
      System.out.print(x++);
      System.out.print("-");
    }
  }
}