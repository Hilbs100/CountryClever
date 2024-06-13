package com.example.countryapp;

import java.util.ArrayList;

public class WrongAnswers {
    private String incorrectAnswer;
    private String correctAnswer;
    private static ArrayList<WrongAnswers> answers = new ArrayList<WrongAnswers>();
    public WrongAnswers(String inc, String corr) {
        incorrectAnswer = inc;
        correctAnswer = corr;
        answers.add(this);
    }
    public static String getAnswers() {
        String out = "";
        for (int i = 0; i < answers.size(); i++) {
            out += "Correct Country: " + answers.get(i).correctAnswer;
            out += "\nYou Picked: " + answers.get(i).incorrectAnswer + "\n\n";
        }
        return out;
    }

    public static void resetAnswers() {
        while(answers.size() > 0) {
            answers.remove(0);
        }
    }

}
