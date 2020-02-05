package Model_View_Controller;

import javax.swing.*;
import java.awt.event.ActionListener;

public class AdditionView extends JFrame {
    private JTextField firstNumber = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton equalsButton = new JButton("=");
    private JTextField equationSolution = new JTextField(10);

    AdditionView() {

        // Sets up view and adds components

        JPanel jPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550, 200);

        jPanel.add(firstNumber);
        jPanel.add(additionLabel);
        jPanel.add(secondNumber);
        jPanel.add(equalsButton);
        jPanel.add(equationSolution);

        this.add(jPanel);

    }

    public int getFirstNumber() {
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(secondNumber.getText());
    }

    public void setEquationSolution(int solution) {
        equationSolution.setText(Integer.toString(solution));
    }

    void addAdditionListener(ActionListener listenForCalcButton) {
        equalsButton.addActionListener(listenForCalcButton);
    }

    //Error Alert
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
