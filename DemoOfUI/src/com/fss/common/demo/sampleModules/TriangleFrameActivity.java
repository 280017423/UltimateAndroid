/*
 * Copyright (c) 2014. Marshal Chen.
 */

package com.fss.common.demo.sampleModules;

import android.os.Bundle;
import android.app.Activity;
import android.widget.LinearLayout;
import com.fss.common.demo.R;
import com.fss.common.uiModule.triangle.RotaryView;
import com.fss.common.uiModule.triangle.TriangleView;

public class TriangleFrameActivity extends Activity {

	LinearLayout main_linearLayout, main_linearLayout_button;
	private float[] humidity = new float[6];

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.triangle_frame_activity);
		main_linearLayout = (LinearLayout) findViewById(R.id.main_linearLayout);
		main_linearLayout.addView(new TriangleView(this, 1, 95));

		main_linearLayout_button = (LinearLayout) findViewById(R.id.main_linearLayout_button);
		humidity[0] = 0.0f;
		humidity[1] = 100f;
		humidity[2] = 50f;
		humidity[3] = 60f;
		humidity[4] = 70f;
		humidity[5] = 80f;
		main_linearLayout_button.addView(new RotaryView(this, humidity));
	}
}
