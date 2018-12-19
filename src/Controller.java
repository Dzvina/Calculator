import javax.swing.*;

public class Controller {

    private Calculator Calculator;
    private JTextArea textArea1;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton dorivButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton dilButton;
    private JButton mnogButton;
    private JButton deleteButton;

    public Controller(){
        Calculator = new Calculator();
    }

    public void ShowCalculator(){
        Calculator.setVisible(true);
    }



}


