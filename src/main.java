import java.util.Scanner;

public class main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      library bib = new library(); 
      boolean running = true;

      while (running) {
          System.out.println("\nMenü:");
          System.out.println("1 - Buch hinzufügen");
          System.out.println("2 - Bücher anzeigen");
          System.out.println("3 - Buch ausleihen");
          System.out.println("4 - Buch zurückgeben");
          System.out.println("5 - Programm beenden");
          System.out.print("Wähle eine Option: ");

          int eingabeMenue = scanner.nextInt();
          scanner.nextLine();

          System.out.println("Gewählte Option: " + eingabeMenue);

          switch (eingabeMenue) {
              case 1:
                  System.out.print("Wie ist der Titel des Buches? ");
                  String eingabeTitle = scanner.nextLine();
                  System.out.print("Wie ist der Autor des Buches? ");
                  String eingabeAuther = scanner.nextLine();
                  bib.addBook(new Book(eingabeTitle, eingabeAuther)); 
                  break;

              case 2:
                  bib.showAllBooks(); 
                  break;

              case 3:
                  System.out.print("Welches Buch möchtest du ausleihen? ");
                  String eingabeAusleihen = scanner.nextLine();
                  bib.borrowBook(eingabeAusleihen);
                  System.out.println("Buch ausgeliehen.");
                  break;

              case 4:
                  System.out.print("Welches Buch möchtest du zurückgeben? ");
                  String eingabeZurueckgeben = scanner.nextLine();
                  bib.returnBook(eingabeZurueckgeben); 
                  System.out.println("Buch zurückgegeben.");
                  break;

              case 5:
                  System.out.println("Programm wird beendet");
                  running = false;
                  break;

              default:
                  System.out.println("Diese Nummer ist nicht zur Auswahl");
          }
      }

      scanner.close();
  }
}
