package com.ezc.fambisakahle;

public class QuestionsList {

    private String questao,option1, option2, option3, option4, answer;
    private String userSelectedAnswer;

    public String getQuestao() {
        return questao;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }

    public QuestionsList(String questao, String option1, String option2, String option3, String option4, String answer, String userSelectedAnswer) {
        this.questao = questao;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;



    }
}
