// Service class to manage and conduct a quiz
public class QuestionsService {


// Array to store questions
    Question[] questions = new Question[5];

    // Array to store user selections
    String selection[] = new String[5];

    // Constructor to initialize the questions array with predefined questions
    public QuestionsService() {

        questions[0] = new Question(001, "What is the correct syntax to Output, 'Hello World'", "System.out.printIn(“hello World”);", "echo(“hello World”);",
        "System(“hello world”);", "print(“hello world”)", 
        "System.out.printIn(“hello World”);");

questions[1] = new Question(002, "How do you insert COMMENTS in Java code?", "// this is a comment",
        "# this is a comment", "* this is a comment", "==this is a comment",
        "// this is a comment");

questions[2] = new Question(003, "Which data type is used to create a variable that should store text?", "String",
        "string", "variables", "interger",
        "String");

questions[3] = new Question(004, "How do you create a variable with the numeric value 5?", "Int x =5;",
        "int =5;", "byte=5;",
        "byte=5;", "Int x =5;");

questions[4] = new Question(005, "Which operator is used to add together two values?", "The + sign",
        "the - sign", "The * sign", "The & sign",
        "The + sign");
        
        questions[5] = new Question(005, "How do you create a variable with the floating number 2.8?", "float x= 2.8f;",
        "Float=2.8f;", "float-28;", "float x =2.8f",
        "float x= 2.8f; ");

        questions[6] = new Question(005, "Which method can be used to return a string in upper case letters?", "toUpperCase()",
        "touppercase()", "ToUppercase()", "uppercase()",
        "toUpperCase()");

        questions[7] = new Question(005, "How do you create a method in Java?\n" + //
                                "", "methodName.",
        "methodName[]", "(methodName)", "methodName()",
        "methodName()");

        questions[8] = new Question(005, "What is the correct way to create an object called myObj of MyClass?", "class myObj = new MyClass();",
        "class MyClass = new myobj();", "MyClass myOb =new MyClass();", "new myObj = MyClass();",
        "");

        questions[9] = new Question(005, "Which method can be used to find the highest value of x and y?", "Math.largest(x,y)",
        "Math.max(x,y)", "Math.maxNum(x,y)", "Math.maximum(x,y)",
        "Math.max(x,y)");
    }

}