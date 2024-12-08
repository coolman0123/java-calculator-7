package calculator.controller;

import calculator.util.InputParser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    InputParser inputParser = new InputParser();
    public void run(){
        outputView.requestInput();
        String input = inputView.input();
        input = InputParser.handleCustomer(input);
        String[] caculate = InputParser.parseInput(input);
        int result = sum(caculate);
        outputView.printResult(result);


    }

    public int sum(String[] caculateInputs){
        int total = 0;
        for(String input : caculateInputs){
            total += Integer.parseInt(input);
        }
        return total;
    }
}
