// Craig Kimball 8/23/23

import java.awt.*;
import javax.swing.*;

public class window {

    private static void createWindow() {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton square = new JButton("Click here");
        square.setBounds(120, 0, 120, 120);
        frame.add(square);

        //To display the window
        frame.setSize(800,600);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main (String[] args){
        createWindow();
    }
}
