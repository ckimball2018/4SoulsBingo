// Craig Kimball 8/23/23

import java.awt.*;
import javax.swing.*;

public class window {

    private static void createWindow() {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea field = new JTextArea("A player killed 2 or more monsters  in the same turn");
        field.setLineWrap(true);
        frame.add(field);

        field.setBounds(10,0, 100, 100);

        JTextArea field1 = new JTextArea("The top of the treasure deck is placed on the bottom of the treasure deck");
        field1.setLineWrap(true);
        frame.add(field1);

        field1.setBounds(120,0, 100, 100);


//        String buttonText = new String("A player killed 2 monsters in 1 turn");
//        JButton square = new JButton();
//        square.setBounds(120, 0, 120, 120);
//        frame.add(square);


        //To display the window
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main (String[] args){
        createWindow();
    }
}
