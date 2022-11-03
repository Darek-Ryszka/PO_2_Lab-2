import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Deklaracja zmiennych
        String s = "";
        int x;

        // Część konsolowa
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {

                if(i == 0 && j == 0){
                    System.out.print("|   |");
                }
                else if(i == 0 && j <= 9){
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
                else if(i > 0 && j > 0){
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

        // Część JOptionPane
        for (int i = 0; i < 11; i++) {
            s+= "--------------------------------------------------------------------------------------------------------------------------\n";
            for (int j = 0; j < 11; j++) {
                if(i == 0 && j == 0){
                    s += "|\t\t|";
                }
                else if(i == 0 && j <= 10){
                    s +="\t" + j + "\t|";
                }
                else if(j == 0 && i <= 10){
                    s += "|\t" + i + "\t|";
                }
                else if(i > 0 && j > 0){
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