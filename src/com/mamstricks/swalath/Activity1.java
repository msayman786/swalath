package com.mamstricks.swalath;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity1 extends Activity implements OnTouchListener {

	TextView t1,t2,t3;
	Button btn;
	final static float STEP = 200;
    
    float mRatio = 1.0f;
    int mBaseDist;
    float mBaseRatio;
    float fontsize = 13;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity1);
		btn=(Button) findViewById(R.id.button1);
		t1=(TextView) findViewById(R.id.textView1);
		t2=(TextView) findViewById(R.id.textView2);
		t3=(TextView) findViewById(R.id.textView3);
		t1.setTextSize(mRatio + 13);
		t2.setTextSize(mRatio + 24);
		t3.setTextSize(mRatio + 30);
		t1.setTextColor(Color.rgb(12, 37, 5));
		Typeface customfont1=Typeface.createFromAsset(getAssets(), "fonts/Meera.ttf");
		Typeface customfont2=Typeface.createFromAsset(getAssets(), "fonts/ishtika.ttf");
		t1.setTypeface(customfont1);
		t2.setTypeface(customfont1);
		
		
	}
	
	public boolean onTouchEvent(MotionEvent event) {
        if (event.getPointerCount() == 2) {
            int action = event.getAction();
            int pureaction = action & MotionEvent.ACTION_MASK;
            if (pureaction == MotionEvent.ACTION_POINTER_DOWN) {
                mBaseDist = getDistance(event);
                mBaseRatio = mRatio;
            } else {
                float delta = (getDistance(event) - mBaseDist) / STEP;
                float multi = (float) Math.pow(2, delta);
                mRatio = Math.min(1024.0f, Math.max(0.1f, mBaseRatio * multi));
                t1.setTextSize(mRatio + 13);
                t2.setTextSize(mRatio + 13);
                t3.setTextSize(mRatio + 13);
            }
        }
        return true;
    }

    int getDistance(MotionEvent event) {
        int dx = (int) (event.getX(0) - event.getX(1));
        int dy = (int) (event.getY(0) - event.getY(1));
        return (int) (Math.sqrt(dx * dx + dy * dy));
    }
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		onTouchEvent(event);
		return false;
	}

	

}
