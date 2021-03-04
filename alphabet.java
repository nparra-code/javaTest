public class alphabet{
  public static void Main(String[] args){
    char[] armenianAlphabet = getAlphabet(LocaleLanguage.ARMENIAN);
    char[] russianAlphabet = getAlphabet(LocaleLanguage.RUSSIAN);

    // get uppercase alphabet
    char[] currentAlphabet = getAlphabet(true);

    System.out.println(armenianAlphabet);
    System.out.println(russianAlphabet);
    System.out.println(currentAlphabet);
  }
}
