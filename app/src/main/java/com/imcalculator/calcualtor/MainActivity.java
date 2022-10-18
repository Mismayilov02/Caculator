package com.imcalculator.calcualtor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navigationView;
    String number = "" , firstnmber="" , operatorset ;
    boolean first = true , first_equals = true , abc = true;
    TextView data_text ,ansver_text;
    CardView cardView ;
    float ansver=0;
    Button btn1 , btn2 , btn3  ,btn4 , btn5 ,btn6 ,btn7 , btn8 , btn9 , btn , btncix , btntop , btnfaiz , btnber  , btnvur , btnbol , btn0 , btnac , btnabc , btnnull;
    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = findViewById(R.id.layout);
        cardView = findViewById(R.id.cardView);
        data_text = findViewById(R.id.data_text);

        btnnull = findViewById(R.id.btnnull);
        ansver_text  =findViewById(R.id.equals_text);
       navigationView = findViewById(R.id.bottom_navi);
       btnac= findViewById(R.id.btnac);
       btnabc = findViewById(R.id.btnabc);
        btn = findViewById(R.id.btn_oandalik);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnbol = findViewById(R.id.btnbol);
        btntop = findViewById(R.id.btntop);
        btncix = findViewById(R.id.btncix);
        btnfaiz = findViewById(R.id.btnfaiz);
        btnber = findViewById(R.id.btnber);
        btnvur = findViewById(R.id.btnvur);

    navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.sun_menu:
                        ansver_text.setTextColor(Color.BLACK);
                        data_text.setTextColor(Color.BLACK);
                        btnnull.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btnabc.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btnac.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn0.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn1.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn2.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn3.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn4.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn5.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn6.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn7.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn8.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btn9.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btnvur.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btntop.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btncix.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btnfaiz.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btnber.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        btnbol.setBackgroundColor(Color.parseColor("#FFFFFFFF"));
                        navigationView.setBackgroundResource(R.drawable.round_cornes_white);
                        btn.setTextColor(Color.BLACK);
                        btn1.setTextColor(Color.BLACK);
                        btn2.setTextColor(Color.BLACK);
                        btn3.setTextColor(Color.BLACK);
                        btn4.setTextColor(Color.BLACK);
                        btn5.setTextColor(Color.BLACK);
                        btn6.setTextColor(Color.BLACK);
                        btn7.setTextColor(Color.BLACK);
                        btn8.setTextColor(Color.BLACK);
                        btn9.setTextColor(Color.BLACK);
                        btn0.setTextColor(Color.BLACK);
                        cardView.setBackgroundColor(Color.parseColor("#FCF8F6F6"));
                        cardView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#FCF8F6F6")));
                        constraintLayout.setBackgroundTintList(ColorStateList.valueOf(Color.WHITE));
                        return true;
                    case R.id.moon_menu:
                        ansver_text.setTextColor(Color.WHITE);
                        data_text.setTextColor(Color.WHITE);
                        btnnull.setBackgroundColor(Color.parseColor("#222121"));
                        btnabc.setBackgroundColor(Color.parseColor("#222121"));
                        btnac.setBackgroundColor(Color.parseColor("#222121"));
                        btn.setBackgroundColor(Color.parseColor("#222121"));
                        btn0.setBackgroundColor(Color.parseColor("#222121"));
                        btn1.setBackgroundColor(Color.parseColor("#222121"));
                        btn2.setBackgroundColor(Color.parseColor("#222121"));
                        btn3.setBackgroundColor(Color.parseColor("#222121"));
                        btn4.setBackgroundColor(Color.parseColor("#222121"));
                        btn5.setBackgroundColor(Color.parseColor("#222121"));
                        btn6.setBackgroundColor(Color.parseColor("#222121"));
                        btn7.setBackgroundColor(Color.parseColor("#222121"));
                        btn8.setBackgroundColor(Color.parseColor("#222121"));
                        btn9.setBackgroundColor(Color.parseColor("#222121"));
                        btnvur.setBackgroundColor(Color.parseColor("#222121"));
                        btntop.setBackgroundColor(Color.parseColor("#222121"));
                        btncix.setBackgroundColor(Color.parseColor("#222121"));
                        btnfaiz.setBackgroundColor(Color.parseColor("#222121"));
                        btnber.setBackgroundColor(Color.parseColor("#222121"));
                        btnbol.setBackgroundColor(Color.parseColor("#222121"));
                        navigationView.setBackgroundResource(R.drawable.round_corners);
                        btn.setTextColor(Color.WHITE);
                        btn1.setTextColor(Color.WHITE);
                        btn2.setTextColor(Color.WHITE);
                        btn3.setTextColor(Color.WHITE);
                        btn4.setTextColor(Color.WHITE);
                        btn5.setTextColor(Color.WHITE);
                        btn6.setTextColor(Color.WHITE);
                        btn7.setTextColor(Color.WHITE);
                        btn8.setTextColor(Color.WHITE);
                        btn9.setTextColor(Color.WHITE);
                        btn0.setTextColor(Color.WHITE);
                        cardView.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#2C2B2B")));
                        constraintLayout.setBackgroundTintList(ColorStateList.valueOf(Color.BLACK));
                        return true;


                    default: return  false;
                }


            }
        });
        
        
    }


    public  void btnset(View vview){
        switch (vview.getId()){
            case R.id.btn0:
                if(!first ){
                    number +=0;
                    data_text.setText(number);
                }

                break;

            case R.id.btn1:
                number +=1;
                data_text.setText(number);
                first=false;
                break;

            case R.id.btn2:
                number +=2;
                data_text.setText(number);
                first=false;

                break;

            case R.id.btn9:
                number +=9;
                data_text.setText(number);
                first=false;
                break;

            case R.id.btn3:
                number +=3;
                data_text.setText(number);
                first=false;
                break;

            case R.id.btn4:
                number +=4;
                data_text.setText(number);
                first=false;
                break;

            case R.id.btn5:
                number +=5;
                data_text.setText(number);
                first=false;
                break;

            case R.id.btn6:
                number +=6;
                data_text.setText(number);
                first=false;
                break;

            case R.id.btn7:
                number +=7;
                data_text.setText(number);
                first=false;
                break;

            case R.id.btn8:
                number +=8;
                data_text.setText(number);
                first=false;
                break;

            case R.id.btn_oandalik:
                number +=".";
                data_text.setText(number);
                first=false;
                break;

            case R.id.btnabc:
               // number  = "-"+number;
                if(abc) {
                    number  = "-"+number;
                    data_text.setText("-" + data_text.getText());
                    abc = false;
                }else{
                    String abc = data_text.getText().toString();
                   String son = abc.substring(1 ,abc.length());
                    number  = number.substring(1 , number.length());
                    data_text.setText(son);
                    this.abc = true;
                }
              //  first=false;
                break;

        }

    }

    public  void operator(View view){
        this.abc = true;

        switch (view.getId()){
            case R.id.btnac:
                data_text.setText("");
                number="";
                firstnmber="";
                ansver_text.setText("0");
                first_equals =true;
                ansver =0;
                break;

            case R.id.btnvur:
                equaals("*");
                break;

            case R.id.btntop:
                equaals("+");
                break;

            case R.id.btncix:
                equaals("-");
                break;

            case R.id.btnbol:
                equaals("/");
                break;

            case R.id.btnber:
                equaals("=");
                break;
        }
    }

    public  void equaals(String choose){
        if(first_equals){
            if(choose.equals("=")){

            }else {
                firstnmber = (String) data_text.getText();
                operatorset = choose;
                try {
                    ansver =Float.valueOf((String) data_text.getText());
                }catch (Exception e){

                }

                if(!data_text.getText().equals("")){
                    first_equals =false;

                    data_text.setText("0");
                    ansver_text.setText(firstnmber);
                    number ="";
                }
            }
        }else{
            if(!String.valueOf(data_text.getText()).equals("") && !String.valueOf(data_text.getText()).equals("0")) {
                switch (operatorset) {
                    case "=":
                        ansver_text.setText(String.valueOf(ansver));
                        break;

                    case "+":
                        ansver += Float.valueOf((String) data_text.getText());
                        ansver_text.setText(ondalik(ansver));

                        data_text.setText("0");
                        number = "";
                        operatorset = choose;
                        break;

                    case "-":
                        ansver -= Float.valueOf((String) data_text.getText());
                        ansver_text.setText(ondalik(ansver));
                        data_text.setText("0");
                        operatorset = choose;
                        number = "";
                        break;

                    case "/":
                        ansver /= Float.valueOf((String) data_text.getText());
                        ansver_text.setText(ondalik(ansver));
                        data_text.setText("0");
                        operatorset = choose;
                        number = "";
                        break;

                    case "*":
                        ansver *= Float.valueOf((String) data_text.getText());
                        ansver_text.setText(ondalik(ansver));

                        data_text.setText("0");
                        operatorset = choose;
                        number = "";
                        break;

                }
            }else {
                operatorset = choose;
            }
        }

    }

    public  String ondalik(float a){
        int b = (int) a;
        if((a-b) == 0 ){
           // System.out.println("denemeye");
            return String.valueOf(Math.round(b));

        }
        else {
            return String.valueOf(a);
        }
    }

}