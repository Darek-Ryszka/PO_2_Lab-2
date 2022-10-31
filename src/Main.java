import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        JFrame frame = new JFrame("Tabliczka");
//        JPanel panel = new JPanel(new GridLayout(10,10));
//
//        panel.add(new JTextArea(s));
//        panel.setPreferredSize(new Dimension(400, 400));
//        JTextArea tx = new JTextArea(s);



//       JOptionPane.showMessageDialog(null, s , "Tabliczka", JOptionPane.PLAIN_MESSAGE);

        String s = "";
        int x;

        JPanel panel = new JPanel(new GridLayout(1, 1));

        for (int i = 0; i < 11; i++) {

            for (int j = 0; j < 11; j++) {

                if(i == 0 && j == 0){
                    System.out.print("|   |");
                    s += "|   |";
                }
                else if(i == 0 && j <= 9){
                    System.out.print( + j + "  |");
                    s += j + "  |";
                }
                else if(i == 0 && j == 10){
                    System.out.print( + j + " |");
                    s += j + " |";
                }
                else if(j == 0 && i <= 9){
                    System.out.print("|" + i + "  |");
                    s += "|" + i + "  |";
                }
                else if(j == 0 && i == 10){
                    System.out.print("|" + i + " |");
                    s += "|" + i + " |";
                }
                else if(i > 0 && j > 0){
                    x = i * j;
                    if(x <= 9){
                        System.out.print(x + "  |");
                        s += x + "  |";
                    }
                    else if (x >= 10 && x < 100) {
                        System.out.print(x + " |");
                        s += x + " |";
                    }
                    else if (x ==100) {
                        System.out.print(x + "|");
                        s += x + "|";
                    }
                }
            }
            System.out.print("\n");
            s += "\n";
        }
        panel.add(new JTextArea(s));

       JOptionPane.showMessageDialog(null, panel , "Tabliczka", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}