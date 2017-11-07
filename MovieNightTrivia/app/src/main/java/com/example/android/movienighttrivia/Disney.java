package com.example.android.movienighttrivia;
/*
Jacquelyn Gboyor
8/7/2017
Disney
 */
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Disney extends AppCompatActivity {

    /*
    Declare necessary variables
     */
    String font = "fonts/walt.ttf"; //Path to Disney font that I am using in the Assets folder.
    TextView q1, q2, q3, q4, q5, q6, q7, q8, q9, q10; //TextViews of all 10 questions
    RadioGroup group1, group2, group3, group4, group5, group7, group8, group10;
    //TextViews of all answer choices
    TextView q1a1, q1a2, q1a3, q1a4,
            q2a1, q2a2, q2a3, q2a4,
            q3a1, q3a2, q3a3, q3a4,
            q4a1, q4a2, q4a3, q4a4,
            q5a1, q5a2, q5a3, q5a4, q6a,
            q7a1, q7a2, q7a3, q7a4,
            q8a1, q8a2, q8a3, q8a4,
            q9a1, q9a2, q9a3, q9a4,
            q10a1, q10a2, q10a3, q10a4;
    TextView submit, score;
    EditText answer6;
    int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0,
        score6 = 0, score7 = 0, score8 = 0, score9 = 0, score10 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disney);

        fonts();//Call on fonts method to set all TextView fonts in Disney activity

    }//End onCreate

    /******************************************************************************************/
    private void fonts() {

        //Accessing the font and setting it to Typeface
        Typeface typeface = Typeface.createFromAsset(getAssets(), font);

        /*
        Setting font for each TextView
         */
        q1 = (TextView) findViewById(R.id.questions);
        q1.setTypeface(typeface);
        q2 = (TextView) findViewById(R.id.question2);
        q2.setTypeface(typeface);
        q3 = (TextView) findViewById(R.id.question3);
        q3.setTypeface(typeface);
        q4= (TextView) findViewById(R.id.question4);
        q4.setTypeface(typeface);
        q5 = (TextView) findViewById(R.id.question5);
        q5.setTypeface(typeface);
        q6 = (TextView) findViewById(R.id.question6);
        q6.setTypeface(typeface);
        q7 = (TextView) findViewById(R.id.question7);
        q7.setTypeface(typeface);
        q8 = (TextView) findViewById(R.id.question8);
        q8.setTypeface(typeface);
        q9 = (TextView) findViewById(R.id.question9);
        q9.setTypeface(typeface);
        q10 = (TextView) findViewById(R.id.question10);
        q10.setTypeface(typeface);

        //Answers for Q1 *******************************************
        q1a1 = (TextView) findViewById(R.id.Q1A1);
        q1a1.setTypeface(typeface);
        q1a2 = (TextView) findViewById(R.id.Q1A2);
        q1a2.setTypeface(typeface);
        q1a3 = (TextView) findViewById(R.id.Q1A3);
        q1a3.setTypeface(typeface);
        q1a4 = (TextView) findViewById(R.id.Q1A4);
        q1a4.setTypeface(typeface);

        //Answer Q2 ************************************************
        q2a1 = (TextView) findViewById(R.id.Q2A1);
        q2a1.setTypeface(typeface);
        q2a2 = (TextView) findViewById(R.id.Q2A2);
        q2a2.setTypeface(typeface);
        q2a3 = (TextView) findViewById(R.id.Q2A3);
        q2a3.setTypeface(typeface);
        q2a4 = (TextView) findViewById(R.id.Q2A4);
        q2a4.setTypeface(typeface);

        //Answer Q3 ************************************************
        q3a1 = (TextView) findViewById(R.id.Q3A1);
        q3a1.setTypeface(typeface);
        q3a2 = (TextView) findViewById(R.id.Q3A2);
        q3a2.setTypeface(typeface);
        q3a3 = (TextView) findViewById(R.id.Q3A3);
        q3a3.setTypeface(typeface);
        q3a4 = (TextView) findViewById(R.id.Q3A4);
        q3a4.setTypeface(typeface);

        //Answer Q4 ************************************************
        q4a1 = (TextView) findViewById(R.id.Q4A1);
        q4a1.setTypeface(typeface);
        q4a2 = (TextView) findViewById(R.id.Q4A2);
        q4a2.setTypeface(typeface);
        q4a3 = (TextView) findViewById(R.id.Q4A3);
        q4a3.setTypeface(typeface);
        q4a4 = (TextView) findViewById(R.id.Q4A4);
        q4a4.setTypeface(typeface);

        //Answer Q5 ************************************************
        q5a1 = (TextView) findViewById(R.id.Q5A1);
        q5a1.setTypeface(typeface);
        q5a2 = (TextView) findViewById(R.id.Q5A2);
        q5a2.setTypeface(typeface);
        q5a3 = (TextView) findViewById(R.id.Q5A3);
        q5a3.setTypeface(typeface);
        q5a4 = (TextView) findViewById(R.id.Q5A4);
        q5a4.setTypeface(typeface);

        //Answer Q6 ************************************************
        q6a = (TextView) findViewById(R.id.question_6);
        q6a.setTypeface(typeface);

        //Answer Q7 ************************************************
        q7a1 = (TextView) findViewById(R.id.Q7A1);
        q7a1.setTypeface(typeface);
        q7a2 = (TextView) findViewById(R.id.Q7A2);
        q7a2.setTypeface(typeface);
        q7a3 = (TextView) findViewById(R.id.Q7A3);
        q7a3.setTypeface(typeface);
        q7a4 = (TextView) findViewById(R.id.Q7A4);
        q7a4.setTypeface(typeface);

        //Answer Q8 ************************************************
        q8a1 = (TextView) findViewById(R.id.Q8A1);
        q8a1.setTypeface(typeface);
        q8a2 = (TextView) findViewById(R.id.Q8A2);
        q8a2.setTypeface(typeface);
        q8a3 = (TextView) findViewById(R.id.Q8A3);
        q8a3.setTypeface(typeface);
        q8a4 = (TextView) findViewById(R.id.Q8A4);
        q8a4.setTypeface(typeface);

        //Answer Q9 ************************************************
        q9a1 = (TextView) findViewById(R.id.Q9A1);
        q9a1.setTypeface(typeface);
        q9a2 = (TextView) findViewById(R.id.Q9A2);
        q9a2.setTypeface(typeface);
        q9a3 = (TextView) findViewById(R.id.Q9A3);
        q9a3.setTypeface(typeface);
        q9a4 = (TextView) findViewById(R.id.Q9A4);
        q9a4.setTypeface(typeface);

        //Answer Q10 ************************************************
        q10a1 = (TextView) findViewById(R.id.Q10A1);
        q10a1.setTypeface(typeface);
        q10a2 = (TextView) findViewById(R.id.Q10A2);
        q10a2.setTypeface(typeface);
        q10a3 = (TextView) findViewById(R.id.Q10A3);
        q10a3.setTypeface(typeface);
        q10a4 = (TextView) findViewById(R.id.Q10A4);
        q10a4.setTypeface(typeface);

        /************Other*******************************/
        submit = (TextView) findViewById(R.id.submit);
        submit.setTypeface(typeface);
        score = (TextView) findViewById(R.id.score_);
        score.setTypeface(typeface);
    }
    /*******************************************************************************************/
    //Method that gets called when submit button is clicked
    public void getScore (View view){

        questions(view);//calls on questions method to get correct answers

    }//End getScore

    /******************Questions***************************************************************/
    public void questions (View view) {

        /*
        Question 1------------------------
         */
        group1 = (RadioGroup) findViewById(R.id.question1);
        RadioButton answer = (RadioButton) findViewById(group1.getCheckedRadioButtonId());
        if(group1.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "You didn't select an answer for #1", Toast.LENGTH_LONG).show();
        }else{
            if (answer.getText().equals("Nala")){
                score1 = 10;
            }else {

                score1 = 0;
            }//End else
        }
        /*
        Question 2------------------------
         */
        group2 = (RadioGroup) findViewById(R.id.question_2);
        RadioButton answer2 = (RadioButton) findViewById(group2.getCheckedRadioButtonId());
        if(group2.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "You didn't select an answer for #2", Toast.LENGTH_LONG).show();
        }else{
            if (answer2.getText().equals("Snow White")){
                score2 = 10;
            }else {
                score2 = 0;
            }//End else
        }
         /*
        Question 3------------------------
         */
        group3 = (RadioGroup) findViewById(R.id.question_3);
        RadioButton answer3 = (RadioButton) findViewById(group3.getCheckedRadioButtonId());

        if(group3.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "You didn't select an answer for #3", Toast.LENGTH_LONG).show();
        }else{
            if (answer3.getText().equals("Pride Rock")){
                score3 = 10;
            }else {
                score3 = 0;
            }//End else
        }
         /*
        Question 4------------------------
         */
        group4 = (RadioGroup) findViewById(R.id.question_4);
        RadioButton answer4 = (RadioButton) findViewById(group4.getCheckedRadioButtonId());
        if(group4.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "You didn't select an answer for #4", Toast.LENGTH_LONG).show();
        }else{
            if (answer4.getText().equals("8:00PM")){
                score4 = 10;
            }else {
                score4 = 0;
            }//End else
        }
         /*
        Question 5------------------------
         */
        group5 = (RadioGroup) findViewById(R.id.question_5);
        RadioButton answer5 = (RadioButton) findViewById(group5.getCheckedRadioButtonId());
        if(group5.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "You didn't select an answer for #5", Toast.LENGTH_LONG).show();
        }else{
            if (answer5.getText().equals("Elephant")){
                score5 = 10;
            }else {
                score5 = 0;
            }//End else
        }
         /*
        Question 6------------------------
         */
        answer6 = (EditText) findViewById(R.id.question_6);
        String ans6 = answer6.getText().toString().trim().toLowerCase();
        if(ans6.isEmpty()){
            Toast.makeText(this, "You didn't enter an answer for #6", Toast.LENGTH_LONG).show();
        }else{
            if(ans6.equals("mulan")){
                score6 = 10;
            }else{
                score6 = 0;
            }
        }
         /*
        Question 7------------------------
         */
        group7 = (RadioGroup) findViewById(R.id.question_7);
        RadioButton answer7 = (RadioButton) findViewById(group7.getCheckedRadioButtonId());
        if(group7.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "You didn't select an answer for #7", Toast.LENGTH_LONG).show();
        }else{
            if (answer7.getText().equals("France")){
                score7 = 10;
            }else {
                score7 = 0;
            }//End else
        }
         /*
        Question 8------------------------
         */
        group8 = (RadioGroup) findViewById(R.id.question_8);
        RadioButton answer8 = (RadioButton) findViewById(group8.getCheckedRadioButtonId());
        if(group8.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "You didn't select an answer for #8", Toast.LENGTH_LONG).show();
        }else{
            if (answer8.getText().equals("Rapunzel")){
                score8 = 10;
            }else {
                score8 = 0;
            }//End else
        }
        /*
        Question 9 is a checkbox and has its own onClick method
         */
        onClick(view); //Question 9's method
         /*
        Question 10------------------------
         */
        group10 = (RadioGroup) findViewById(R.id.question_10);
        RadioButton answer10 = (RadioButton) findViewById(group10.getCheckedRadioButtonId());
        if(group10.getCheckedRadioButtonId() == -1){
            Toast.makeText(this, "You didn't select an answer for #10", Toast.LENGTH_LONG).show();
        }else{
            if (answer10.getText().equals("10 years")){
                score10 = 10;
            }else {
                score10 = 0;
            }//End else
        }

        //Pass all ten scores into this method to get tally up final score
        display(score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);

    }//End q1

    public void onClick(View view){

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.Q9A1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.Q9A2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.Q9A3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.Q9A4);

        if(checkBox2.isChecked() == false && checkBox4.isChecked() == false &&
                checkBox1.isChecked() == false && checkBox3.isChecked() == false){
            Toast.makeText(this, "You didn't select an answer for #9", Toast.LENGTH_LONG).show();
        }else{
            if (checkBox2.isChecked() && checkBox4.isChecked() && checkBox1.isChecked() == false && checkBox3.isChecked() == false) {
                score9 = 10;
            }else{
                score9 = 0;
            }
        }

    }//End
    /**********************************/
    private void display(int score1, int score2, int score3, int score4, int score5, int score6,
                         int score7, int score8, int score9, int score10) {

        int finalScore = score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10;
        TextView ScoreTextView = (TextView) findViewById(R.id.score_);
        ScoreTextView.setText("" + finalScore + "%");

        if (finalScore == 100){
            Toast.makeText(this, "Congrats got 100%!", Toast.LENGTH_SHORT).show();
        }else if (finalScore == 90){
            Toast.makeText(this, "Great Job! You got 90%!", Toast.LENGTH_SHORT).show();
        }else if (finalScore == 80) {
            Toast.makeText(this, "Good Job! You got 80%!", Toast.LENGTH_SHORT).show();
        }else if (finalScore == 70) {
            Toast.makeText(this, "Wow! You got 70%!", Toast.LENGTH_SHORT).show();
        }else if (finalScore < 70){
                Toast.makeText(this, "You got below 70% :( !", Toast.LENGTH_SHORT).show();
        }
    }//End display
}//End class
