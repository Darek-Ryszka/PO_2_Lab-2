import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Deklaracja zmiennych
        String s = "";
        int x;

        // Część odpowiedzialna za wyświetlenie tabliczki w konsoli
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) { // Zagnieżdżona pętla for, wyświetlająca 11 kolumn i 11 wierszy

                if(i == 0 && j == 0){
                    System.out.print("|   |"); // Warunek do wyświetlenie pustego pola w punkcie i = 0 oraz j = j
                }
                else if(i == 0 && j <= 9){ // Warunki sprawdzające długość liczb i dostosowujące ilość spacji
                    System.out.print( + j + "  |");
                }
                else if(i == 0 && j == 10){
                    System.out.print( + j + " |");
                }
                else if(j == 0 && i <= 9){
                    System.out.print("|" + i + "  |");
                }
                else if(j == 0 && i == 10){
                    System.out.print("|" + i + " |");
                }
                else if(i > 0 && j > 0){ // Obliczanie kolejnych pól tabliczki i * j
                    x = i * j;
                    if(x <= 9){
                        System.out.print(x + "  |");
                    }
                    else if (x >= 10 && x < 100) {
                        System.out.print(x + " |");
                    }
                    else if (x ==100) {
                        System.out.print(x + "|");
                    }
                }
            }
            System.out.print("\n");
        }

        // Część odpowiedzialna za wyświetlenie tabliczki w okienku informacyjnym
        for (int i = 0; i < 11; i++) {
            s+= "--------------------------------------------------------------------------------------------------------------------------\n";
            for (int j = 0; j < 11; j++) { // Zagnieżdżona pętla for, wyświetlająca 11 kolumn i 11 wierszy
                if(i == 0 && j == 0){  // Warunek do wyświetlenie pustego pola w punkcie i = 0 oraz j = j
                    s += "|\t\t|";
                }
                else if(i == 0 && j <= 10){ // Warunki odpowiedzialne za wyświetlenie 10 kolumn i 10 wierszy o wartościach od 1 do 10
                    s +="\t" + j + "\t|";
                }
                else if(j == 0 && i <= 10){
                    s += "|\t" + i + "\t|";
                }
                else if(i > 0 && j > 0){ // Obliczanie kolejnych pól tabliczki i * j
                    x = i * j;
                    s +="\t" + x + "\t|";
                }
            }
            s += "\n";
        }
        s+= "--------------------------------------------------------------------------------------------------------------------------\n";

        // Stworzenie pola tekstowego
        JTextArea tx = new JTextArea(s);
        tx.setEditable(false); //Ustawienei możliwości edycji
        tx.setOpaque(false);
        tx.setTabSize(2); // Ustawienie wielkości tabulacji
        tx.setPreferredSize(new Dimension(530, 400)); //Ustawienie rozmiaru pola tekstowego

        // Przekazanie pola tekstowego do massageboxa i wyświetlenie go na ekranie
       JOptionPane.showMessageDialog(null, tx , "Tabliczka", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}