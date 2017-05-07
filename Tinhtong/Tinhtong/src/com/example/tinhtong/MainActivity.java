package com.example.tinhtong;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

  
	Button Tingtong;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	public void Tinhtong(View v){
		  EditText editsoa=(EditText)findViewById(R.id.edita);
		int a=Integer.parseInt(editsoa.getText()+"");
		  EditText editsob =(EditText)findViewById(R.id.editb);
		int b=Integer.parseInt(editsob.getText()+"");
		 TextView  txtkq=(TextView)findViewById(R.id.txtkq);
		txtkq.setText((a+b)+"");
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
