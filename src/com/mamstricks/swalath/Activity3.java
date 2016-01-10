package com.mamstricks.swalath;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.widget.TextView;

public class Activity3 extends Activity {

	TextView t1,t2,t3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity3);
		t1=(TextView) findViewById(R.id.textView2);
		t2=(TextView) findViewById(R.id.textView3);
		t3=(TextView) findViewById(R.id.textView1);
		t1.setTextSize(20);
		t2.setTextSize(24);
		t3.setTextSize(30);
		t1.setTextColor(Color.rgb(12, 37, 5));
		Typeface customfont1=Typeface.createFromAsset(getAssets(), "fonts/Meera.ttf");
		Typeface customfont2=Typeface.createFromAsset(getAssets(), "fonts/ishtika.ttf");
		t1.setTypeface(customfont1);
		t2.setTypeface(customfont1);
	}

	
}
