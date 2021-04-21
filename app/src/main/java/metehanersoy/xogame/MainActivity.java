package metehanersoy.xogame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView_winner,textView_turn;
    Button button,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    boolean xTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("XOGame");

        xTurn =false;

        textView_turn = findViewById(R.id.textView_turn);
        textView_winner = findViewById(R.id.textView_winner);

        button = findViewById(R.id.button);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xTurn =false;
                textView_turn.setText("O Turn");
                textView_winner.setText("Winner");
                setAllButtonsEnabled();

                button1.setText("");
                button2.setText("");
                button3.setText("");
                button4.setText("");
                button5.setText("");
                button6.setText("");
                button7.setText("");
                button8.setText("");
                button9.setText("");


            }

        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button1.isClickable()) {
                    if (xTurn) {
                        button1.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button1.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button1.setClickable(false);
                    update();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button2.isClickable()) {
                    if (xTurn) {
                        button2.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button2.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button2.setClickable(false);
                    update();
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button3.isClickable()) {
                    if (xTurn) {
                        button3.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button3.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button3.setClickable(false);
                    update();
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button4.isClickable()) {
                    if (xTurn) {
                        button4.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button4.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button4.setClickable(false);
                    update();
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button5.isClickable()) {
                    if (xTurn) {
                        button5.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button5.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button5.setClickable(false);
                    update();
                }

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button6.isClickable()) {
                    if (xTurn) {
                        button6.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button6.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button6.setClickable(false);
                    update();
                }

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button7.isClickable()) {
                    if (xTurn) {
                        button7.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button7.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button7.setClickable(false);
                    update();
                }

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button8.isClickable()) {
                    if (xTurn) {
                        button8.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button8.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button8.setClickable(false);
                    update();
                }

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (button9.isClickable()) {
                    if (xTurn) {
                        button9.setText("X");
                        textView_turn.setText("O Turn");
                        xTurn = false;


                    } else {
                        button9.setText("O");
                        textView_turn.setText("X Turn");
                        xTurn = true;
                    }
                    button9.setClickable(false);
                    update();
                }

            }
        });







    }

    public void update() {

        if (calculate()) {

            if (xTurn) {
                textView_winner.setText("Winner O");
                setAllButtonsDisabled();
            }
            else {
                textView_winner.setText("Winner X");
                setAllButtonsDisabled();
            }
        }
    }

    public boolean calculate() {


        if(!button1.getText().toString().isEmpty() && !button2.getText().toString().isEmpty() && !button3.getText().toString().isEmpty()  ){
            if(button1.getText().toString().equals(button2.getText().toString()) && button1.getText().toString().equals(button3.getText().toString())  ){
                return true;
            }

        }

        if(!button4.getText().toString().isEmpty() && !button5.getText().toString().isEmpty() && !button6.getText().toString().isEmpty()  ){
            if(button4.getText().toString().equals(button5.getText().toString()) && button4.getText().toString().equals(button6.getText().toString())  ){
                return true;
            }
        }
        if(!button7.getText().toString().isEmpty() && !button8.getText().toString().isEmpty() && !button9.getText().toString().isEmpty()  ){
            if(button7.getText().toString().equals(button8.getText().toString()) && button7.getText().toString().equals(button9.getText().toString())  ){
                return true;
            }

        }



        if(!button1.getText().toString().isEmpty() && !button4.getText().toString().isEmpty() && !button7.getText().toString().isEmpty()  ){
            if(button1.getText().toString().equals(button4.getText().toString()) && button1.getText().toString().equals(button7.getText().toString())  ){
                return true;
            }

        }

        if(!button2.getText().toString().isEmpty() && !button5.getText().toString().isEmpty() && !button8.getText().toString().isEmpty()  ){
            if(button2.getText().toString().equals(button5.getText().toString()) && button2.getText().toString().equals(button8.getText().toString())  ){
                return true;
            }

        }
        if(!button3.getText().toString().isEmpty() && !button6.getText().toString().isEmpty() && !button9.getText().toString().isEmpty()  ){
            if(button3.getText().toString().equals(button6.getText().toString()) && button3.getText().toString().equals(button9.getText().toString())  ){
                return true;
            }

        }



        if(!button1.getText().toString().isEmpty() && !button5.getText().toString().isEmpty() && !button9.getText().toString().isEmpty()    ){

            if(button1.getText().toString().equals(button5.getText().toString()) && button1.getText().toString().equals(button9.getText().toString())  ){
                return true;
            }

        }
        if(!button3.getText().toString().isEmpty() && !button5.getText().toString().isEmpty() && !button7.getText().toString().isEmpty()    ){

            if(button3.getText().toString().equals(button5.getText().toString()) && button3.getText().toString().equals(button7.getText().toString())  ){
                return true;
            }

        }


        return false;



    }
    public void setAllButtonsDisabled(){
        button1.setClickable(false);;
        button2.setClickable(false);
        button3.setClickable(false);
        button4.setClickable(false);
        button5.setClickable(false);
        button6.setClickable(false);
        button7.setClickable(false);
        button8.setClickable(false);
        button9.setClickable(false);

    }
    public void setAllButtonsEnabled(){
        button1.setClickable(true);
        button2.setClickable(true);
        button3.setClickable(true);
        button4.setClickable(true);
        button5.setClickable(true);
        button6.setClickable(true);
        button7.setClickable(true);
        button8.setClickable(true);
        button9.setClickable(true);

    }





}