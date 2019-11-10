package com.example.perbandingan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Quiz2 extends Activity{
	
	EditText ebil1quiz2, ebil2quiz2, ebil3quiz2;
	Button bbandingquiz2;
	TextView tkedua2,tketiga2;
	

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz2);
        
        ebil1quiz2=(EditText)findViewById(R.id.etbil1quiz2);
        ebil2quiz2=(EditText)findViewById(R.id.etbil2quiz2);
        ebil3quiz2=(EditText)findViewById(R.id.etbil3quiz2);
        bbandingquiz2=(Button)findViewById(R.id.btnbandingquiz2);
        tkedua2=(TextView)findViewById(R.id.tvkedua2);
        tketiga2=(TextView)findViewById(R.id.tvketiga2);
        
        
        bbandingquiz2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int bil1quiz2=Integer.parseInt(ebil1quiz2.getText().toString());
				int bil2quiz2=Integer.parseInt(ebil2quiz2.getText().toString());
				int bil3quiz2=Integer.parseInt(ebil3quiz2.getText().toString());
				
				
				if(bil1quiz2 == bil2quiz2 && bil2quiz2 == bil3quiz2){
					tkedua2.setText("They are the same number :");
					tketiga2.setText(String.valueOf(bil1quiz2));
				}
				
				else if(bil1quiz2 == bil2quiz2 && bil1quiz2 > bil3quiz2){
					tkedua2.setText("The first and second number ("+String.valueOf(bil1quiz2)+") are the biggest");
					tketiga2.setText("The third number ("+String.valueOf(bil3quiz2)+") is the smallest");				
				}
				
				else if(bil2quiz2 == bil3quiz2 && bil2quiz2 > bil1quiz2){
					tkedua2.setText("The second and third number ("+String.valueOf(bil2quiz2)+") are the biggest");
					tketiga2.setText("The first number ("+String.valueOf(bil1quiz2)+") is the smallest"); 
				}
				
				else if(bil1quiz2 == bil3quiz2 && bil1quiz2 > bil2quiz2){
					tkedua2.setText("The first and third number ("+String.valueOf(bil1quiz2)+") are the biggest");
					tketiga2.setText("The second number ("+String.valueOf(bil2quiz2)+") is the smallest");
				}
				
				else {
					if(bil1quiz2 > bil2quiz2 && bil1quiz2 > bil3quiz2){
						tkedua2.setText("The first number ("+String.valueOf(bil1quiz2)+") is the biggest");
						if(bil2quiz2 < bil3quiz2){
							tketiga2.setText("The second number ("+String.valueOf(bil2quiz2)+") is the smallest");
						}
						else if(bil2quiz2 == bil3quiz2){
							tketiga2.setText("The rest are equals");
						}						
						else {
							tketiga2.setText("The third number ("+String.valueOf(bil3quiz2)+") is the smallest");
						}
						
					}
					else if(bil2quiz2 > bil1quiz2 && bil2quiz2 > bil3quiz2){
						tkedua2.setText("The second number ("+String.valueOf(bil2quiz2)+") is the biggest");
						if(bil1quiz2 < bil3quiz2){
							tketiga2.setText("The first number ("+String.valueOf(bil1quiz2)+") is the smallest");
						}
						else if(bil1quiz2 == bil3quiz2){
							tketiga2.setText("The rest are equals");
						}						
						else {
							tketiga2.setText("The third number ("+String.valueOf(bil3quiz2)+") is the smallest");
						}
						
					}
					
					else {
						tkedua2.setText("The third number ("+String.valueOf(bil3quiz2)+") is the biggest");
						if (bil1quiz2 < bil2quiz2) {
							tketiga2.setText("The first number ("+String.valueOf(bil1quiz2)+") is the smallest");
						}
						else if(bil1quiz2 == bil2quiz2){
							tketiga2.setText("The rest are equals");							
						}						
						else {
							tketiga2.setText("The second number ("+String.valueOf(bil2quiz2)+") is the smallest");
						}
					}
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
