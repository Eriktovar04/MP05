import java.util.Scanner;

/*Creem una classe que defineix l'algoritme */
public class PC{

public static void main(String[] args) {

    /*Creem 3 inputs per demanar les prestacions dels components (processador, GPU i enmagatzematge) a través del teclat mitjançant l'ordre "Scanner", la qual hem importat prèviament */
    System.out.println("Indica la generació del processador: ");
    Scanner scanner1 = new Scanner(System.in); 
    int processador = scanner1.nextInt();
    System.out.println("Indica la memòria gràfica: "); 
    Scanner scanner2 = new Scanner(System.in); 
    int GPU = scanner2.nextInt(); 
    System.out.println("Indica l'espai lliure: "); 
    Scanner scanner3 = new Scanner(System.in); 
    int storage = scanner3.nextInt(); 
    
    /*Tanquem els 3 inputs (scanners) */
    scanner1.close();
    scanner2.close();
    scanner3.close();

    /* Fem un condcional en el que, si les dades entrades per teclat dels 3 components compleien els requisits mínims demanats per l'Abel, ens indica que podem moure els jocs */
    /* I en cas de que no es compleixin tots els requisits mínims (independenment de quin es compleix i quin no), ens indica que no podem moure els jocs */

if (processador >= 5 && GPU >=2 && storage >=50){
    System.out.println("You can run the game");
}
else{
    System.out.println("You can't run the game");
}

}
}
