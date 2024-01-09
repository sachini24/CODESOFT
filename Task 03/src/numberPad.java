import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numberPad {
    private JPanel numberMain;
    JTextField textField1;
    private JButton a1Button;
    private JButton a3Button;
    private JButton enterButton;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton deleteButton;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton cancelButton;
    private JButton button13;
    private JButton a0Button;
    private JButton button15;
    private JButton helpButton;

    public JTextField getTextField1() {
        return textField1;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM machine");
        frame.setContentPane(new numberPad().numberMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,400);
        frame.setVisible(true);
    }
    public numberPad(){

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "2");
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "3");
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "4");
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "5");
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "6");
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "7");
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "8");
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "9");
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText(textField1.getText() + "0");
            }
        });


        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(numberMain,"Enter your credit card number.");
            }
        });

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (textField1.getText().equals("2355")){

                    String userInput = textField1.getText();
                    numberPad obj = new numberPad();
                    obj.saveDetails(userInput);



                    JFrame frame = new JFrame("ATM machine");
                    frame.setContentPane(new numberPad().numberMain);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(false);

                    frame.setContentPane(new userInterface().mainPanel);
                    frame.setSize(1000,600);
                    frame.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(numberMain,"Your credit card number is invalid.");
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });

    }
    public void saveDetails (String input){
        System.out.println(input);
    }


}
