// Craig Kimball 8/23/23

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.*;

public class window{

    private static void createWindow() throws IOException {
        try {
            Board board = new Board();
            ArrayList<JTextArea> squares = board.GenerateJTextArea();
            JFrame frame = new JFrame("GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            for (int i = 0; i < squares.size(); i++) {
                if (i == 12){
                    JTextArea freeSpace = new JTextArea("Free Space");
                    freeSpace.setWrapStyleWord(true);
                    freeSpace.setBounds(250, 250, 110, 110);
                    frame.add(freeSpace);
                }

                if (i < 5) {
                    squares.get(i).setBounds((10 + (i * 120)), (10), 110, 110);
                    frame.add(squares.get(i));
                }
                else if (i < 10){
                    squares.get(i).setBounds((10 + ((i - 5) * 120)), (130), 110, 110);
                    frame.add(squares.get(i));
                }
                else if (i < 15 && i != 12){
                    squares.get(i).setBounds((10 + ((i - 10) * 120)), (250), 110, 110);
                    frame.add(squares.get(i));
                }
                else if (i < 20){
                    squares.get(i).setBounds((10 + ((i - 15) * 120)), (370), 110, 110);
                    frame.add(squares.get(i));
                }
                else if (i < 25){
                    squares.get(i).setBounds((10 + ((i - 20) * 120)), (490), 110, 110);
                    frame.add(squares.get(i));
                }

                //To display the window
                frame.setSize(800, 700);
                frame.setLayout(null);
                frame.setVisible(true);
            }
        }
        catch (IOException ex){
            System.out.println("Error IOException");
            System.exit(3);
        }
    }



    public static void main (String[] args) throws IOException {

        createWindow();
    }
}