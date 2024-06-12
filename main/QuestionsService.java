package main;
// Service class to manage and conduct a quiz

import java.util.Scanner;

public class QuestionsService {

    // Array to store questions
    Question[] questions = new Question[10];

    // Array to store user selections
    String selection[] = new String[10];

    public QuestionsService() {
        questions[0] = new Question(1, "What is the correct syntax to Output, 'Hello World'",
                "System.out.printIn(“hello World”);", "echo(“hello World”);",
                "System(“hello world”);", "print(“hello world”)",
                "System.out.printIn(“hello World”);");

        questions[1] = new Question(2, "How do you insert COMMENTS in Java code?", "// this is a comment",
                "# this is a comment", "* this is a comment", "==this is a comment",
                "// this is a comment");

        questions[2] = new Question(3, "Which data type is used to create a variable that should store text?",
                "String",
                "string", "variables", "interger",
                "String");

        questions[3] = new Question(4, "How do you create a variable with the numeric value 5?", "Int x =5;",
                "int =5;", "byte=5;",
                "byte=5;", "Int x =5;");

        questions[4] = new Question(5, "Which operator is used to add together two values?", "The + sign",
                "the - sign", "The * sign", "The & sign",
                "The + sign");

        questions[5] = new Question(6, "How do you create a variable with the floating number 2.8?", "float x= 2.8f;",
                "Float=2.8f;", "float-28;", "float x =2.8f",
                "float x= 2.8f; ");

        questions[6] = new Question(7, "Which method can be used to return a string in upper case letters?",
                "toUpperCase()",
                "touppercase()", "ToUppercase()", "uppercase()",
                "toUpperCase()");

        questions[7] = new Question(8, "How do you create a method in Java?" + //
                "", "methodName.",
                "methodName[]", "(methodName)", "methodName()",
                "methodName()");

        questions[8] = new Question(9, "What is the correct way to create an object called myObj of MyClass?",
                "class myObj = new MyClass();",
                "class MyClass = new myobj();", "MyClass myOb =new MyClass();", "new myObj = MyClass();",
                "new myObj = MyClass();");

        questions[9] = new Question(10, "Which method can be used to find the highest value of x and y?",
                "Math.largest(x,y)",
                "Math.max(x,y)", "Math.maxNum(x,y)", "Math.maximum(x,y)",
                "Math.max(x,y)");

    }

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

    // Method to calculate and print the user's score
    public void printScore() {

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i].toLowerCase();

            // Compare user answer with actual answer
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }

            // Display the final score5
            System.out.println("Your score is : " + score + "/1");

        }

    }

}