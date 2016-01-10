package com.mamstricks.swalath;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {

	Intent intent;
	RadioGroup rdgr;
	Button btn;
	RadioButton rdbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rdgr=(RadioGroup) findViewById(R.id.radioGroup1);
		btn=(Button) findViewById(R.id.button1);
		addClikedItem();
	}

	public void addClikedItem() {
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(rdgr.getCheckedRadioButtonId()==R.id.rd_Eng){
					intent=new Intent();
					intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.EnglishMenu");
					startActivity(intent);
					
					
				}if(rdgr.getCheckedRadioButtonId()==R.id.rd_Mala){
					
					intent=new Intent();
					intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Malayalam_menu");
					startActivity(intent);
					
				}
				
				
			}
		});
		
         
		
	}
	public void aboutpage(View v) {
		if(v.getId()==R.id.About){
			
			intent=new Intent();
			intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityAbout");
			startActivity(intent);
			
		}	
	}

}
