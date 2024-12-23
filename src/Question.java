import java.util.Random;

public class Question {
    private int operand1, operand2;
    private char operator;
    double correctAnswer;


    Question(){
        // random object
        Random rand = new Random();

        // Random operands
        operand1 = rand.nextInt(101);
        operand2 = rand.nextInt(101);

        // Random operator
        char[] operators = {'+', '-', '*', '/'};
        operator = operators[rand.nextInt(operators.length)];
    }

    public void generateQuestion(){
        System.out.println("Calculate: " + operand1 + operator + operand2);
    }
    private void calculateAnswer(){
        switch (operator){
            case '+':
                correctAnswer = operand1 + operand2;
                break;
            case '-':
                correctAnswer = operand1 - operand2;
                break;
            case '*':
                correctAnswer = operand1 * operand2;
                break;
            case '/':
                correctAnswer = (double) operand1 / operand2;
                break;
        }
    }

    public boolean checkAnswer(double answer){
        // Calculate the Answer
        calculateAnswer();

        // Check if is correct or not using 0.01 of tolerance
        return Math.abs(answer-correctAnswer) < 0.01;
    }

}
