import java.util.Scanner;

public class MathQuiz {
    private int score;

    MathQuiz(){
        score = 0;
    }

    public void startQuiz(){
        System.out.println("Welcome to the ultimate Math Quiz! Let's see how good you are! You have 5 Attempts");
        askQuestion();
    }

    private void askQuestion(){

        for (int i = 0; i < 5; i++){
            // Question object
            Question question = new Question();

            // Scanner object
            Scanner scanner = new Scanner(System.in);
            System.out.println("Your current score is: " + score);
            question.generateQuestion();

            double answer = scanner.nextDouble();
            boolean isCorrectAnswer = question.checkAnswer(answer);

            if (isCorrectAnswer){
                System.out.println("That's right!!");
                score++;
            }
            else{
                System.out.println("Wrong :(");
            }
        }
        //Final Score
        System.out.println("Your final Score is " + score);
    }
}
