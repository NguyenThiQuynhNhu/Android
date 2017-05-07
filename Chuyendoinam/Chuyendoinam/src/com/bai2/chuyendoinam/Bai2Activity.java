package com.bai2.chuyendoinam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Bai2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
    }
    public void Chuyen(View v){
    	EditText txtduong=(EditText)findViewById(R.id.editText1);
    	TextView txtam=(TextView)findViewById(R.id.textView4);
    	TextView txtam1=(TextView)findViewById(R.id.textView2);
    	int a=Integer.parseInt(txtduong.getText()+"");
    	String can ="";String chi="";
    	if(a%10==0) can="Canh";
    	else if(a%10==1) {
    		can="Tân";
    	}
    	else if(a%10==2) {
    		can="Nhâm";
    	}
    	else if(a%10==3){
    		can="Quý";
    	}
    	else if(a%10==4){
    		can="Giáp";
    	}
    	else if(a%10==5){
    		can="Ất";
    	}
    	else if(a%10==6){
    		can="Bính";
    	}
    	else if(a%10==7){
    		can="Đinh";
    	}
    	else if(a%10==8){
    		can="Mậu";
    	}
    	else if(a%10==9){
    		can="Kỷ";
    	}
    	if(a%12==0) chi="Thân";
    	else if(a%12==1) {
    		chi="Dậu";
    	}
    	else if(a%12==2) {
    		chi="Tức";
    	}
    	else if(a%12==3){
    		chi="Hợi";
    	}
    	else if(a%12==4){
    		chi="Tí";
    	}
    	else if(a%12==5){
    		chi="Sữu";
    	}
    	else if(a%12==6){
    		chi="Dần";
    	}
    	else if(a%12==7){
    		chi="mẹo";
    	}
    	else if(a%12==8){
    		chi="Thình";
    	}
    	else if(a%12==9){
    		chi="Tụy";
    	}
    	else if(a%12==10){
    		chi="Ngọ";
    	}
    	else if(a%12==11){
    		chi="Mùi";
    	}
    	txtam.setText(can);
    	txtam1.setText(chi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.bai2, menu);
        return true;
    }
    
}
