package com.example.perbandingan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MainActivity extends Activity {
	ListView lutama;
	String[] menu = {"Profile", "Quiz", "Exit"};
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lutama=(ListView)findViewById(R.id.lvutama);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
        		android.R.layout.simple_list_item_1, menu);
        lutama.setAdapter(adapter);
        lutama.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				if(arg2 == 0){
					Intent intentprofil = new Intent(MainActivity.this, Profile.class);
					startActivity(intentprofil);
				}
				
				else if(arg2 == 1){
					Intent intentmenuquiz = new Intent(MainActivity.this, Menuquiz.class);
					startActivity(intentmenuquiz);
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
