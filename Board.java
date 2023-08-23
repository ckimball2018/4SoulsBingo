// Craig Kimball 8/23/23

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Board {

    private ArrayList<String> GenerateConditions() throws IOException {
        // Creates an ArrayList of Strings read from the list of win conditions provided from conditions.txt.
        // If the file is not found the program will print an error message and exit with status code: 1

        try{
            FileReader reader = new FileReader("Conditions.txt");
            BufferedReader buffer = new BufferedReader(reader);
            ArrayList<String> conditions = new ArrayList<>();

            while (buffer.ready()) {
                String cond = buffer.readLine();
               // System.out.println(cond);
                conditions.add(cond);
            }

            return conditions;
        }
        catch (FileNotFoundException ex){
            System.out.println("Error file not found");
        }
        System.exit(1);
        return null;

    }

    public ArrayList<JTextArea> GenerateJTextArea() throws IndexOutOfBoundsException, IOException {
        // Creates an ArrayList of JTextAreas by choosing 25 random win conditions from the ArrayList of provided conditions
        // As long as there are more than 25 win conditions in conditions, there shouldn't be any OutOfBoundsExceptions
        // In the case of an OutOfBoundsException the program displays an error message and exits with a status: 2

        Random random = new Random();
        ArrayList<Integer> randNums = new ArrayList<Integer>();
        ArrayList<String> conditions = GenerateConditions();
        ArrayList<JTextArea> squares = new ArrayList<>();

        try {

            while (squares.size() <25){
                int index = random.nextInt(conditions.size());
                if (!(randNums.contains(index))){
                    randNums.add(index);
                    String cond = conditions.get(index);
                    JTextArea textArea = new JTextArea(cond);
                    textArea.setLineWrap(true);
                    squares.add(textArea);
                }
            }

            return squares;
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Error index out of bounds.");
            System.exit(2);
        }
        return null;
    }


    public static void main(String[] args) throws IOException {
//        Board board = new Board();
//        ArrayList<String> conditions = board.GenerateConditions();
//        ArrayList<JTextArea> list = board.GenerateJTextArea(conditions);

    }
}
