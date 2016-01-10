package com.mamstricks.swalath;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.TextView;

public class ActivityE1 extends Activity {

	TextView t1,t2,t3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_e1);
		t1=(TextView) findViewById(R.id.textView2);
		t2=(TextView) findViewById(R.id.textView3);
		t3=(TextView) findViewById(R.id.textView1);
		t1.setTextSize(20);
		t2.setTextSize(24);
		t3.setTextSize(30);
		t3.setTextColor(Color.rgb(12, 37, 5));
	}

	
}
