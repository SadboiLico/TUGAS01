package com.example.perbandingan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quiz1 extends Activity{
	EditText ebil1, ebil2;
	Button bbandingquiz1;
	TextView tkedua1;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
        
        ebil1=(EditText)findViewById(R.id.etbil1);
        ebil2=(EditText)findViewById(R.id.etbil2);
        bbandingquiz1=(Button)findViewById(R.id.btnbandingquiz1);
        tkedua1=(TextView)findViewById(R.id.tvkedua1);
        
        bbandingquiz1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int bil1 = Integer.parseInt(ebil1.getText().toString());
				int bil2 = Integer.parseInt(ebil2.getText().toString());
				
				if(bil1 > bil2){
					tkedua1.setText("The first number ("+String.valueOf(bil1)+") is bigger than the second ("+String.valueOf(bil2)+")");
					
				}
				else if(bil1 < bil2) {
					tkedua1.setText("The second number ("+String.valueOf(bil2)+") is bigger than the first ("+String.valueOf(bil1)+")");
					
				}
				
				else{
					tkedua1.setText("Both are equals");
					
				}
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
