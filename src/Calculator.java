import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

    public static final int WIGHT = 350;
    public static final int HEIGHT = 500;



    double num1;
    double num2;
    double result;
    String operation;


    private JPanel mainPanel;
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
    private JButton doutButton;
    private JButton znachButton;

    public Calculator(){

        setSize(WIGHT, HEIGHT);
        setContentPane(mainPanel);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a0Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a1Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a2Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a3Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a4Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a5Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a6Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a7Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a8Button.getText();
                textArea1.setText(inputnam);
            }
        });


        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + a9Button.getText();
                textArea1.setText(inputnam);
            }
        });


        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
            }
        });


        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textArea1.getText());
                textArea1.setText("");
                operation = "+";
            }
        });


        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textArea1.getText());
                textArea1.setText("");
                operation = "-";
            }
        });


        dilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textArea1.getText());
                textArea1.setText("");
                operation = "/";
            }
        });


        mnogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textArea1.getText());
                textArea1.setText("");
                operation = "*";
            }
        });


        znachButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double plusminus = Double.parseDouble(String.valueOf(textArea1.getText()));
               plusminus = plusminus * (-1);
               textArea1.setText(String.valueOf(plusminus));
            }
        });

        doutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputnam = textArea1.getText() + doutButton.getText();
                textArea1.setText(inputnam);
            }
        });


        dorivButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             num2 = Double.parseDouble(textArea1.getText());
            String total;
             if (operation == "+"){
             result = num1 + num2;
             total = String.format("%.2f", result);
             textArea1.setText(total);
             } else  if (operation == "-"){
                 result = num1 - num2;
                 total = String.format("%.2f", result);
                 textArea1.setText(total);
             } else if (operation == "*"){
                 result = num1 * num2;
                 total = String.format("%.2f", result);
                 textArea1.setText(total);
             } else if (operation == "/"){
                 result = num1 / num2;
                 total = String.format("%.2f", result);
                 textArea1.setText(total);
             }



            }
        });



    }
}
