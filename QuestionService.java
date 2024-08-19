import java.util.Scanner;

import javax.swing.text.html.FormView;

public class QuestionService
{
    private Question[] questions = new Question[5];
    private String userAnswers[] = new String[5];

    public QuestionService()
    {
        questions[0] = new Question(1, "size of int ?", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double ?", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char ?", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long ?", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean ?", "2", "6", "4", "1", "1");
    }

    public void PlayQuiz()
    {
        int i = 0;
        for(Question q : questions)
        {
            System.out.println("Question no : " + q.getId());

            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            userAnswers[i] = sc.nextLine();
            i++;
        }
    }

    public void PrintScore()
    {
        int score = 0;

        for (int i = 0; i < questions.length; i++) 
        {
            Question currentQuestion = questions[i];
            String  answer = currentQuestion.getAnswer();  

            String  userAnswer = userAnswers[i];
            
            if(answer.equals(userAnswer))
            {
                score++;
            }
            else
            {
            }
        }

        System.out.println("Your score is: " + score);
    }
}
