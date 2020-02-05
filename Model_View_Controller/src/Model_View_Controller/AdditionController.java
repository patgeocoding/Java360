package Model_View_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionController {
    private AdditionView addView;
    private AdditionModel addModel;

    public AdditionController(AdditionView addView, AdditionModel addModel) {
        this.addView = addView;
        this.addModel = addModel;


        this.addView.addAdditionListener(new AdditionController.AdditionListener());
    }

    class AdditionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber = 0;

            try{
                firstNumber = addView.getFirstNumber();
                secondNumber = addView.getSecondNumber();
                addModel.addTwoNumbers(firstNumber, secondNumber);
                addView.setEquationSolution(addModel.getEquationValue());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                addView.displayErrorMessage("Only Integers Allowed");
            }
        }
    }
}
