package com.mamstricks.swalath;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.TextView;

public class ActivityE12 extends Activity {

	TextView t1,t2,t3,t4,t5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_e12);
		t1=(TextView) findViewById(R.id.textView2);
		t2=(TextView) findViewById(R.id.textView3);
		t3=(TextView) findViewById(R.id.textView1);
		t4=(TextView) findViewById(R.id.textView4);
		t5=(TextView) findViewById(R.id.textView5);
		t4.setTextSize(20);
		t5.setTextSize(19);
		t5.setTextColor(Color.rgb(12, 37, 5));
		t1.setTextSize(20);
		t2.setTextSize(24);
		t1.setTextColor(Color.rgb(12, 37, 5));
		t3.setTextSize(30);
	}



}
