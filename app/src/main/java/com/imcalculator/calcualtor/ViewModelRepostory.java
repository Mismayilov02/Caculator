package com.imcalculator.calcualtor;

import android.view.View;

import androidx.lifecycle.MutableLiveData;

import java.security.PublicKey;

public class ViewModelRepostory {

  private   MutableLiveData<String> number , firstNumber , operatorSet , dataText ,ansverText;
  private   MutableLiveData<Boolean>   first , firstEquals  , abc;
   private MutableLiveData<Float>  ansver;

    public ViewModelRepostory(){
        number = new MutableLiveData<>("");
        firstNumber = new MutableLiveData<>("");
        operatorSet = new MutableLiveData<>("");
        dataText = new MutableLiveData<>("");
        ansverText = new MutableLiveData<>("");
        first = new MutableLiveData<>(true);
        firstEquals = new MutableLiveData<>(true);
        abc = new MutableLiveData<>(true);
        ansver = new MutableLiveData<>(0f);
        
    }

    public  void operator(View view){
        this.abc.setValue(true);

        switch (view.getId()){
            case R.id.btnac:
                dataText.setValue("");
                number.setValue("");
                firstNumber.setValue("");
                ansverText.setValue("0");
                firstEquals.setValue(true);
                ansver.setValue(0f);
                break;

            case R.id.btnvur:
                equals("*");
                break;

            case R.id.btntop:
                equals("+");
                break;

            case R.id.btncix:
                equals("-");
                break;

            case R.id.btnbol:
                equals("/");
                break;

            case R.id.btnber:
                equals("=");
                break;
        }
    }
    public void equals(String choose){
        if(firstEquals.getValue()){
            if(choose.equals("=")){

            }else {
                firstNumber.setValue(dataText.getValue());
                operatorSet.setValue(choose);
                try {
                    ansver.setValue(Float.valueOf((String) dataText.getValue()));
                }catch (Exception e){

                }

                if(!dataText.getValue().equals("")){
                    firstEquals.setValue(false);

                    dataText.setValue("0");
                    ansverText.setValue(firstNumber.getValue());
                    number.setValue("");
                }
            }
        }else{
            if(!String.valueOf(dataText.getValue()).equals("") && !String.valueOf(dataText.getValue()).equals("0")) {
                switch (operatorSet.getValue()) {
                    case "=":
                        ansverText.setValue(String.valueOf(ansver));
                        break;

                    case "+":
                        ansver.setValue( ansver.getValue() + Float.valueOf((String) dataText.getValue()));
                        break;

                    case "-":
                        ansver.setValue( ansver.getValue() - Float.valueOf((String) dataText.getValue()));
                        break;

                    case "/":

                        ansver.setValue( ansver.getValue() / Float.valueOf((String) dataText.getValue()));
                        break;

                    case "*":
                        ansver.setValue( ansver.getValue() * Float.valueOf((String) dataText.getValue()));

                        break;


                }
                equalsSetText(choose);
            }else {
                operatorSet.setValue(choose);
            }
        }
    }

    private void equalsSetText(String choose ){
        ansverText.setValue(ondalik(ansver.getValue()));
        dataText.setValue("0");
        operatorSet.setValue(choose);
        number.setValue("");
    }
    public void btnClick(View view){
        switch (view.getId()){
            case R.id.btn0:
                if(!first.getValue() ){
                    number.setValue(number.getValue() +0);
                    dataText.setValue(number.getValue());
                }

                break;

            case R.id.btn1:
                btnClickSetText("1");
                break;

            case R.id.btn2:
                btnClickSetText("2");

                break;

            case R.id.btn9:
                btnClickSetText("9");
                break;

            case R.id.btn3:
                btnClickSetText("3");
                break;

            case R.id.btn4:
                btnClickSetText("4");
                break;

            case R.id.btn5:
                btnClickSetText("5");
                break;

            case R.id.btn6:
                btnClickSetText("6");
                break;

            case R.id.btn7:
                btnClickSetText("7");
                break;

            case R.id.btn8:
                btnClickSetText("8");
                break;

            case R.id.btn_oandalik:
                btnClickSetText(".");
                break;

            case R.id.btnabc:
                // number  = "-"+number;
                if(abc.getValue()) {
                    number.setValue( "-"+number.getValue());
                    dataText.setValue("-" + dataText.getValue());
                    this.abc.setValue( false);
                }else{
                    String abc = dataText.getValue();
                    String son = abc.substring(1 ,abc.length());
                    number.setValue( number.getValue().substring(1 , number.getValue().length()));
                    dataText.setValue(son);
                   this.abc.setValue( true);
                }
                //  first=false;
                break;

        }
    }

    private void btnClickSetText(String value){
        number.setValue(number.getValue() + value);
        dataText.setValue(number.getValue());
        first.setValue(false);
    }

    public MutableLiveData<String> getNumber() {
        return number;
    }

    public MutableLiveData<String> getFirstNumber() {
        return firstNumber;
    }

    public MutableLiveData<String> getOperatorSet() {
        return operatorSet;
    }

    public MutableLiveData<String> getDataText() {
        return dataText;
    }

    public MutableLiveData<String> getAnsverText() {
        return ansverText;
    }

    public MutableLiveData<Boolean> getFirst() {
        return first;
    }

    public MutableLiveData<Boolean> getFirstEquals() {
        return firstEquals;
    }

    public MutableLiveData<Boolean> getAbc() {
        return abc;
    }

    public MutableLiveData<Float> getAnsver() {
        return ansver;
    }


    private   String ondalik(float a){
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
