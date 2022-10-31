import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String s = "";
        int x;

        for (int i = 0; i < 11; i++) {
            s+= "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n";
            for (int j = 0; j < 11; j++) {

                if(i == 0 && j == 0){
                    System.out.print("|   |");
                    s += "|\t\t|";
                }
                else if(i == 0 && j <= 9){
                    System.out.print( + j + "  |");
                    s +="\t" + j + "\t|";
                }
                else if(i == 0 && j == 10){
                    System.out.print( + j + " |");
                    s +="\t" + j + "\t|";
                }
                else if(j == 0 && i <= 9){
                    System.out.print("|" + i + "  |");
                    s += "|\t" + i + "\t|";
                }
                else if(j == 0 && i == 10){
                    System.out.print("|" + i + " |");
                    s += "|\t" + i + "\t|";
                }
                else if(i > 0 && j > 0){
                    x = i * j;
                    if(x <= 9){
                        System.out.print(x + "  |");
                        s +="\t" + x + "\t|";
                    }
                    else if (x >= 10 && x < 100) {
                        System.out.print(x + " |");
                        s +="\t" + x + "\t|";
                    }
                    else if (x ==100) {
                        System.out.print(x + "|");
                        s +="\t" + x + "\t|";
                    }
                }
            }
            System.out.print("\n");
            s += "\n";
        }

        JTextArea tx = new JTextArea(s);
        tx.setEditable(false);
        tx.setOpaque(false);
        tx.setTabSize(3);
        tx.setPreferredSize(new Dimension(800, 500));

       JOptionPane.showMessageDialog(null, tx , "Tabliczka", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}