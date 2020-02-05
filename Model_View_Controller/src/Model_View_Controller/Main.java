package Model_View_Controller;

public class Main {

    public static void main(String[] args) {
        AdditionView addView = new AdditionView();
        AdditionModel addModel = new AdditionModel();
        AdditionController addController = new AdditionController(addView, addModel);
        addView.setVisible(true);
    }
}
