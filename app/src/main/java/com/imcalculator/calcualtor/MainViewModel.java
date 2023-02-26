package com.imcalculator.calcualtor;

import android.view.View;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

  private    MutableLiveData<String> number , firstNumber , operatorSet , dataText ,ansverText;
   private MutableLiveData<Boolean>   first , firstEquals  , abc;

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



    private   MutableLiveData<Float>  ansver;
   private ViewModelRepostory repostory = new ViewModelRepostory();

  public  MainViewModel(){

        number = repostory.getNumber();
        firstNumber = repostory.getFirstNumber();
        operatorSet = repostory.getOperatorSet();
        dataText = repostory.getDataText();
        ansverText = repostory.getAnsverText();
        first = repostory.getFirst();
        firstEquals = repostory.getFirstEquals();
        abc = repostory.getAbc();
        ansver = repostory.getAnsver();
    }


    public void btnClick(View view){
        repostory.btnClick(view);
    }
    public void eguals(String choose){
        repostory.equals(choose);
    }
    public void operator(View view){
      repostory.operator(view);
    }
}
