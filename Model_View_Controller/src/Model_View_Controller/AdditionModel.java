package Model_View_Controller;

public class AdditionModel {
    private AdditionView addView;

    //Result of calculations
    private int addValue;

    public void addTwoNumbers(int firstNumber, int secondNumber){
        addValue = firstNumber + secondNumber;
    }

    public int getEquationValue(){
        return addValue;
    }
}
