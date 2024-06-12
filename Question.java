
// Class representing a Question with multiple-choice options
public class Question {

    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;
    
    // variables to store question details
    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {

        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;

    }


}
