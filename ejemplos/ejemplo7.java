import java.util.Scanner;
class Cadena {
  private Scanner tec;
  private String[] nombre;
  private String[] mail;

  public Cadena(){
    tec = new Scanner(System.in);
    nombre = new String[5];
    mail = new String[5];
    for(int i=0; i < nombre.length; i++){
      System.out.print("Ingrese nombre: ");
      nombre[i] = tec.nextLine();

      System.out.print("Ingrese el mail: ");
      mail[i] = tec.nextLine();  
    }
  }
  
  public void listar(){
    for(int i=0; i<nombre.length; i++)
      System.out.println(nombre[i] + " - "+mail[i]);
  }
  
  public void consultaMail(){
    String aux;
    System.out.print("Ingrese el nombre de la persona: ");
    aux = tec.nextLine();
    boolean e = false;
    for(int i=0; i<nombre.length; i++)
      if(aux.equals(nombre[i])){
        System.out.println("Mail de "+aux+": "+mail[i]);
        e = true;
      }
    if(!e) System.out.println("No existe una persona con ese nombre registrada");
  }

  public void sinArroba(){
    for(int i=0; i < mail.length; i++){
      boolean e = false;
      for(int j=0; j < mail[i].length(); j++)
        if(mail[i].charAt(j)== '@') e = true;
      if(!e) System.out.println(mail[i] + " no tiene @");
    }
  }

  public static void main(String[] args) {
    Cadena cad = new Cadena();
    cad.listar();
    cad.consultaMail();
    cad.sinArroba();
  }
}