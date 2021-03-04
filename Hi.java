import java.util.Scanner;

public class Hi{
  static void greetings(String name, String lastname){
    System.out.println("Hello " + name + " " + lastname + ".");
  }
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    String Nm = "";
    String LastN = "";

    System.out.println("Ingrese nombre: ");
    Nm = in.nextLine();
    System.out.println("Ingrese apellido: ");
    LastN = in.nextLine();

    greetings(Nm, LastN);
  }
}
