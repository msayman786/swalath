package com.mamstricks.swalath;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class EnglishMenu extends Activity {
	Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.english_menu);
	}

	public void onClicked(View v) {
	if(v.getId()==R.id.button1){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE1");
		startActivity(intent);
		
		
	}
	if(v.getId()==R.id.button2){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE2");
		startActivity(intent);
		}
	if(v.getId()==R.id.button3){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE3");
		startActivity(intent);
		}
	if(v.getId()==R.id.button4){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE4");
		startActivity(intent);
		}
	if(v.getId()==R.id.button5){
		
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE5");
		startActivity(intent);
		}
	if(v.getId()==R.id.button6){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE6");
		startActivity(intent);
		}
	if(v.getId()==R.id.button7){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE7");
		startActivity(intent);
		}
	if(v.getId()==R.id.button8){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE8");
		startActivity(intent);
		}
	if(v.getId()==R.id.button9){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE9");
		startActivity(intent);
		}
	if(v.getId()==R.id.button10){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE10");
		startActivity(intent);
		}
	if(v.getId()==R.id.button11){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE11");
		startActivity(intent);
		}
	if(v.getId()==R.id.button12){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.ActivityE12");
		startActivity(intent);
		}
	
	
}

}
