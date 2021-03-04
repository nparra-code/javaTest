import java.util.Scanner;

public class Game{

  static String inputSecret(){
    System.out.println("No esta permitido ingresar caracteres diferentes a letras y numeros.");
    char[] param = {'a','b','c','d','e','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
    'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
    //List<char> param = new ArrayList<>(Arrays.asList(param));
    String w; System.out.println("Ingrese la palabra a adivinar: "); w = in.nextLine();
    /*for (String i : w) {
      if (param.contains(i)) {
      } else {
        System.out.println("Recuerde que no esta permitido ingresar caracteres diferentes a letras y numeros.");
        System.out.println("Ingrese la palabra a adivinar: "); w = in.nextLine();
      }
    }*/
    return w.toLowerCase();
  }
  public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int GameMode;
    //String playAgain;

    String playAgain = "y";
    int tries = 0;

    System.out.println("(1)Modo 1: Consiste en adivinar una palabra aleatoria seleccionada por el programa.");
    System.out.println("(2)Modo 2: Conisite en adivinar una palabra ingresada por uno de los jugadores.");
    System.out.println("Ingrese modo de juego: "); GameMode = in.nextInt();

    do {
      int lives = 8;

      if (GameMode == 1) {
        System.out.println("En desarrollo...");
      }
      else if (GameMode == 2) {
        String word = inputSecret();
      }
      else{

      }
    } while (playAgain == "y");

    System.out.println("Desea volver a jugar (y/n): "); playAgain = in.nextLine();

    System.out.println("Muchas gracias por jugar! Intento adivinar " + tries + " palabras/frases.");
  }
}
