package com.bai3.bmi;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Bai3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
    }
    public void Chuyen(View v){
    	EditText editTen=(EditText) findViewById(R.id.editText1);
    	EditText editChieucao=(EditText) findViewById(R.id.editText2);
    	EditText editCannang=(EditText) findViewById(R.id.editText3);
    	EditText editBMI=(EditText) findViewById(R.id.editText4);
    	EditText editChandoan=(EditText) findViewById(R.id.editText5);
    	double H=Double.parseDouble(editChieucao.getText()+"");
    	double W=Double.parseDouble(editCannang.getText()+"");
    	double BMI=W/Math.pow(H, 2);
    	String chandoan="";
    	if(BMI<18)
    	{
    	chandoan="Bạn gầy";
    	}
    	else if(BMI<=24.9)
    	{
    	chandoan="Bạn bình thường";
    	}
    	else if(BMI<=29.9)
    	{
    	chandoan="Bạn béo phì độ 1";
    	}
    	else if(BMI<=34.9)
    	{
    	chandoan="Bạn béo phì độ 2";
    	}
    	else
    	{
    	chandoan="Bạn béo phì ở mức độ 3";
    	}
    	DecimalFormat dcf=new DecimalFormat("#.0");
    	editBMI.setText(dcf.format(BMI));
    	editChandoan.setText(chandoan);
  }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bai3, menu);
        return true;
    }
    
}
