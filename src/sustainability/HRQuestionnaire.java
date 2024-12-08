/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sustainability;

/**
 *
 * @author HARRY
 */
public class HRQuestionnaire {
    private String question;
    private String[] guess;
    private String secret;

    //constructor
    public HRQuestionnaire(String question, String[] guess, String secret) {
        this.question = question;
        this.guess = guess;
        this.secret = secret;
    }

    //get the question
    public String getQuestion() {
        return question;
    }
    
    //check if users input is correct
    public boolean checkAnswer (String answer) {
        return secret.equalsIgnoreCase(answer);
    }
}
