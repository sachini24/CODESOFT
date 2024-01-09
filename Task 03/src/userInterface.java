import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userInterface {
    JPanel mainPanel;
    private JButton balanceButton;
    private JButton depositeCashButton;
    private JButton quickWithdrawalButton;
    private JButton cancelButton;
    private JLabel wordLabel;
    private JLabel valueLabel;
    private JTextField textField1;
    private JLabel sucLabel;
    private JButton enterButton;
    private JTextField textField2;
    private JButton button1;
    private JButton deleteButton;
    private JButton button2;
    private JLabel surLabel;
    private double initialBalance;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ATM machine");
        frame.setContentPane(new userInterface().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1100,600);
        frame.setVisible(true);

    }
    public userInterface(){

        super();
        textField1.setVisible(false);
        enterButton.setVisible(false);
        textField2.setVisible(false);
        button1.setVisible(false);
        deleteButton.setVisible(false);
        button2.setVisible(false);

        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordLabel.setText("Your Amount is: ");
                if (textField1.getText().isEmpty() && textField2.getText().isEmpty())
                    valueLabel.setText("Rs. 50000");

                else {
                    if (!textField1.getText().isEmpty()) {
                        double value1 = Double.parseDouble(textField1.getText());
                        double total = 50000 + value1;
                        String input = String.valueOf(total);
                        valueLabel.setText("Rs: " + input);
                    }
                    else if (!textField2.getText().isEmpty()) {
                        double value2 = Double.parseDouble(textField2.getText());
                        double total = 50000 - value2;
                        String input = String.valueOf(total);
                        valueLabel.setText("Rs: " + input);
                    }
                }
                textField1.setVisible(false);
                textField2.setVisible(false);
                enterButton.setVisible(false);
                button1.setVisible(false);
                deleteButton.setVisible(false);
                button2.setVisible(false);
                sucLabel.setText("");

            }
        });

        depositeCashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordLabel.setText("Enter the amount: ");
                valueLabel.setText("");
                textField1.setVisible(true);
                enterButton.setVisible(true);
                textField2.setVisible(false);
                button1.setVisible(false);
                deleteButton.setVisible(true);
                button2.setVisible(false);

                enterButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String cash = textField1.getText();
                        String regex1 = "\\d+";
                        Pattern patternCash = Pattern.compile(regex1);
                        Matcher matcherCash = patternCash.matcher(cash);
                        if (!matcherCash.matches())
                        {
                            JOptionPane.showMessageDialog(mainPanel,"Invalid Cash format");

                        }
                        else {
                            sucLabel.setText("You are successfully add money to your account.");
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
        });

        quickWithdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wordLabel.setText("Enter the amount: ");
                valueLabel.setText("");
                textField2.setVisible(true);
                textField1.setVisible(false);
                enterButton.setVisible(false);
                button1.setVisible(true);
                deleteButton.setVisible(false);
                button2.setVisible(true);

                button1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String cash = textField2.getText();
                        String regex1 = "\\d+";
                        Pattern patternCash = Pattern.compile(regex1);
                        Matcher matcherCash = patternCash.matcher(cash);
                        if (!matcherCash.matches())
                        {
                            JOptionPane.showMessageDialog(mainPanel,"Invalid Cash format");

                        }
                        else if (Double.parseDouble(textField2.getText())>50000){
                            JOptionPane.showMessageDialog(mainPanel,"Not enough money.");
                        }
                        else {
                            sucLabel.setText("You are successfully withdraw money to your account.");
                        }
                    }
                });
                button2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField2.setText("");

                    }
                });
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}
