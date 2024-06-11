import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        while (true) {
            int questionNumber = rand.nextInt(50) + 1;
            switch (questionNumber) {
                case 1:
                    System.out.println("Hvad er en metode?");
                    break;
                case 2:
                    System.out.println("Hvad skal en metode deklaration indeholde?");
                    break;
                case 3:
                    System.out.println("Hvad er parametre overførsel?");
                    break;
                case 4:
                    System.out.println("Hvad er et loop?");
                    break;
                case 5:
                    System.out.println("Hvad er forskellen på et for-loop og et for-each-loop?");
                    break;
                case 6:
                    System.out.println("Hvad er forskellen på en while-loop og et do-while-loop?");
                    break;
                case 7:
                    System.out.println("Hvad er et sentinel loop?");
                    break;
                case 8:
                    System.out.println("Hvad er et fence post loop");
                    break;
                case 9:
                    System.out.println("Hvad er break og continue?");
                    break;
                case 10:
                    System.out.println("Hvad kan man bruge if/else/switch til i programmering?");
                    break;
                case 11:
                    System.out.println("Hvad er forskellen på et if/else og en switch?");
                    break;
                case 12:
                    System.out.println("Hvad er relational operators?");
                    break;
                case 13:
                    System.out.println("Hvad er logiske operators?");
                    break;
                case 14:
                    System.out.println("Hvad bruges et scanner objekt til?");
                    break;
                case 15:
                    System.out.println("Hvad bruges et printStream objekt til?");
                    break;
                case 16:
                    System.out.println("Hvad er en exception?");
                    break;
                case 17:
                    System.out.println("Hvad bruges throw til?");
                    break;
                case 18:
                    System.out.println("Hvad er et Array?");
                    break;
                case 19:
                    System.out.println("Hvad er et multidimensionalt array?");
                    break;
                case 20:
                    System.out.println("Hvad betyder traversering?");
                    break;
                case 21:
                    System.out.println("Hvad er et index og hvor starter det?");
                    break;
                case 22:
                    System.out.println("Hvad er en arrayliste?");
                    break;
                case 23:
                    System.out.println("Hvad er forskellen på et array og en arrayListe?");
                    break;
                case 24:
                    System.out.println("Hvad kan wrapper klassen bruges til?");
                    break;
                case 25:
                    System.out.println("Hvad er en klasse og et objekt?");
                    break;
                case 26:
                    System.out.println("Hvad indeholder en klasse?");
                    break;
                case 27:
                    System.out.println("Hvad betyder encapsulation?");
                    break;
                case 28:
                    System.out.println("Hvad er en constructor?");
                    break;
                case 29:
                    System.out.println("Hvad er en super- og subklasse?");
                    break;
                case 30:
                    System.out.println("Hvad er formålet med inheritance?");
                    break;
                case 31:
                    System.out.println("Hvad gør inheritance?");
                    break;
                case 32:
                    System.out.println("Hvad bruges nøgleordet extend til?");
                    break;
                case 33:
                    System.out.println("Hvad er et interface?");
                    break;
                case 34:
                    System.out.println("Hvad er polymorfi?");
                    break;
                case 35:
                    System.out.println("Hvad bruges nøgleordet implements til?");
                    break;
                case 36:
                    System.out.println("Hvad er collections.sort()?");
                    break;
                case 37:
                    System.out.println("Hvad er comparable interfacet?");
                    break;
                case 38:
                    System.out.println("Hvad gør compareTo metoden?");
                    break;
                case 39:
                    System.out.println("Hvad er en variabel?");
                    break;
                case 40:
                    System.out.println("Hvad er en constant?");
                    break;
                case 41:
                    System.out.println("Hvad er en string?");
                    break;
                case 42:
                    System.out.println("Hvad gør System.out.printf?");
                    break;
                case 43:
                    System.out.println("Hvad er en escape sequence?");
                    break;
                case 44:
                    System.out.println("Hvad er en cumulative sum?");
                    break;
                case 45:
                    System.out.println("Hvad er overloading?");
                    break;
                case 46:
                    System.out.println("Hvad dækker nøgleordet static over?");
                    break;
                case 47:
                    System.out.println("Hvad er pseudo kode?");
                    break;
                case 48:
                    System.out.println("Hvad er primitive typer?");
                    break;
                case 49:
                    System.out.println("Hvad kan man med math biblioteket?");
                    break;
                case 50:
                    System.out.println("Hvad kan man bruge random objektet til i java?");
                    break;
                default:
                    System.out.println("ugyldigt input. prøv igen");
            }
            System.out.println("                                      >>Hvis du er klar igen så tryk 1<<");
            int readyCheck = scan.nextInt();
            if (readyCheck != 1) {
                break;
            }
        }
        scan.close();
    }
}