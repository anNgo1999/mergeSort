import javax.swing.*;
import java.awt.*;

public class DisplayInterface
{
    private JFrame mainFrame;

    private JPanel mainPanel;

    private JTextField inputArraySize;

    private JButton sortArray;
    private JLabel askForInput;

    private JTable outPut = new JTable();

    public DisplayInterface()
    {
          mainFrame = new JFrame();
          mainPanel = new JPanel();
          inputArraySize = new JTextField(10);
          sortArray = new JButton("Generate and Sort Array");
          askForInput = new JLabel("Enter a size for the array");
          outPut = new JTable();

          GridLayout gridLayout = new GridLayout(3,2);
          mainPanel.add(askForInput);
          mainPanel.add(inputArraySize);
          mainPanel.add(sortArray);

          mainFrame.add(mainPanel);
          mainFrame.setVisible(true);
          mainFrame.setSize(200,200);
          mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        DisplayInterface userInterface = new DisplayInterface();
    }
}
