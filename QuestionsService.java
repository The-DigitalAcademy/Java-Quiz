// Service class to manage and conduct a quiz

import java.util.Scanner;

public class QuestionsService {

    // Array to store questions
    Question[] questions = new Question[5];

    // Array to store user selections
    String selection[] = new String[5];

    public void playQuiz() {

        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s : selection) {

            System.out.println(s);

        }

    }

}