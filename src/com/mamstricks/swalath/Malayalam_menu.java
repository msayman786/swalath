package com.mamstricks.swalath;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Malayalam_menu extends Activity {
	
	

	Intent intent;
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.malayalam_menu);
		btn1=(Button) findViewById(R.id.button1);
		btn2=(Button) findViewById(R.id.button2);
		btn3=(Button) findViewById(R.id.button3);
		btn4=(Button) findViewById(R.id.button4);
		btn5=(Button) findViewById(R.id.button5);
		btn6=(Button) findViewById(R.id.button6);
		btn7=(Button) findViewById(R.id.button7);
		btn8=(Button) findViewById(R.id.button8);
		btn9=(Button) findViewById(R.id.button9);
		btn10=(Button) findViewById(R.id.button10);
		btn11=(Button) findViewById(R.id.button11);
		btn12=(Button) findViewById(R.id.button12);
		Typeface customfont1=Typeface.createFromAsset(getAssets(), "fonts/Meera.ttf");
		btn1.setTypeface(customfont1);
		btn2.setTypeface(customfont1);
		btn3.setTypeface(customfont1);
		btn4.setTypeface(customfont1);
		btn5.setTypeface(customfont1);
		btn6.setTypeface(customfont1);
		btn7.setTypeface(customfont1);
		btn8.setTypeface(customfont1);
		btn9.setTypeface(customfont1);
		btn10.setTypeface(customfont1);
		btn11.setTypeface(customfont1);
		btn12.setTypeface(customfont1);
		
		
		
		
		
	}

	public void onClicked(View v) {
	if(v.getId()==R.id.button1){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity1");
		startActivity(intent);
		
		
	}
	if(v.getId()==R.id.button2){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity2");
		startActivity(intent);
		}
	if(v.getId()==R.id.button3){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity3");
		startActivity(intent);
		}
	if(v.getId()==R.id.button4){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity4");
		startActivity(intent);
		}
	if(v.getId()==R.id.button5){
		
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity5");
		startActivity(intent);
		}
	if(v.getId()==R.id.button6){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity6");
		startActivity(intent);
		}
	if(v.getId()==R.id.button7){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity7");
		startActivity(intent);
		}
	if(v.getId()==R.id.button8){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity8");
		startActivity(intent);
		}
	if(v.getId()==R.id.button9){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity9");
		startActivity(intent);
		}
	if(v.getId()==R.id.button10){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity10");
		startActivity(intent);
		}
	if(v.getId()==R.id.button11){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity11");
		startActivity(intent);
		}
	if(v.getId()==R.id.button12){
		intent=new Intent();
		intent.setClassName("com.mamstricks.swalath","com.mamstricks.swalath.Activity12");
		startActivity(intent);
		}
	
	
}

}
