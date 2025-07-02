import java.util.Scanner;

public class main {
    boolean loginweiter = false;
      boolean loginweitern = false;
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      library bib = new library(); 
      boolean running = true;
      boolean loginweiter = false;
      boolean loginweitern = false;
    

      User max = new User("max", 1234, false);

             boolean nameErfolgreich = false;
    while (!nameErfolgreich) {
        System.out.println("Bitte gib deinen namen ein:");
        String eingegebenername = scanner.nextLine();
        

        if (eingegebenername.equals(max.name)) {
            System.out.println("Login erfolgreich!");
            nameErfolgreich = true;
        } else {
            System.out.println("Falscher name. Versuch es erneut.");
        }
    }

       boolean loginErfolgreich = false;
    while (!loginErfolgreich) {
        System.out.println("Bitte gib deinen PIN ein:");
        int eingegebenerPin = scanner.nextInt();
        scanner.nextLine();

        if (eingegebenerPin == max.login) {
            System.out.println("Login erfolgreich!");
            loginErfolgreich = true;
        } else {
            System.out.println("Falscher PIN. Versuch es erneut.");
        }
    }


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
                if(max.admin){
                    System.out.print("Wie ist der Titel des Buches? ");
                    String eingabeTitle = scanner.nextLine();
                    System.out.print("Wie ist der Autor des Buches? ");
                    String eingabeAuther = scanner.nextLine();
                    bib.addBook(new Book(eingabeTitle, eingabeAuther)); 
                }else{
                    System.out.print("Dazu bist du nicht berechtigt ");
                }
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
  public void setloginweiter(){
    loginweiter = true;
    }
}


