import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10 ; i++){
//            if (i == 1){
//                System.out.print("| ");
//            }
//            for (int j = 1; j <= 10; j++){
//                System.out.print(" | " + i * j );
//            }
//            System.out.println("\n");
//        }

//        String s = "";
//        int x;
////        int s = 0;
//
//        System.out.print("-----------------------------------------------------" + "\n");
//        for (int i = 1; i <= 10 ; i++){
////            s += "----------------------------------------------------------" + "\n";
//
//            if (i == 1){
////                s += "|    ";
//                System.out.print("|  ");
//            }
//            else {
//                System.out.print("|" + i);
//            }
//            for (int j = 1; j <= 10; j++){
//
//                x = i * j;
//
//                if (x <= 9){
////                    s += "|" + x + "  ";
//                    System.out.print("|" + x + "  ");
//                } else if (x >= 10 && x < 100) {
////                    s += "|" + x + " ";
//                    System.out.print("|" + x + " ");
//                } else if (x == 100) {
////                    s += "|" + x;
//                    System.out.print("|" + x);
//                }
//
////                System.out.print("| " + s + " " );
//            }
////            s += "|" + "\n";
//            System.out.println("|");
//            System.out.print("-----------------------------------------------------" + "\n");
//        }

//        JFrame frame = new JFrame("Tabliczka");
//        JPanel panel = new JPanel(new GridLayout(10,10));
//
//        panel.add(new JTextArea(s));
//        panel.setPreferredSize(new Dimension(400, 400));
//        JTextArea tx = new JTextArea(s);



//       JOptionPane.showMessageDialog(null, s , "Tabliczka", JOptionPane.PLAIN_MESSAGE);

//
//        String s = "  ";


// Działa w konsoli

//        int x;
//
//        for (int i = 0; i < 11; i++) {
//
//            for (int j = 0; j < 11; j++) {
//
//                if(i == 0 && j == 0){
//                    System.out.print("|   |");
//                }
//                else if(i == 0 && j <= 9){
//                    System.out.print( + j + "  |");
//                }
//                else if(i == 0 && j == 10){
//                    System.out.print( + j + " |");
//                }
//                else if(j == 0 && i <= 9){
//                    System.out.print("|" + i + "  |");
//                }
//                else if(j == 0 && i == 10){
//                    System.out.print("|" + i + " |");
//                }
//                else if(i > 0 && j > 0){
//                    x = i * j;
//                    if(x <= 9){
//                        System.out.print(x + "  |");
//                    }
//                    else if (x >= 10 && x < 100) {
//                        System.out.print(x + " |");
//                    }
//                    else if (x ==100) {
//                        System.out.print(x + "|");
//                    }
//                }
//            }
//            System.out.print("\n");
//        }

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
        for (int o = 1; o <= 121; o++){
            panel.add(new JTextArea(s));
        }
//        panel.setPreferredSize(new Dimension(1000, 1000));


       JOptionPane.showMessageDialog(null, panel , "Tabliczka", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}