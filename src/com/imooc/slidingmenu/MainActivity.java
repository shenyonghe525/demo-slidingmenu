package com.imooc.slidingmenu;

import com.imooc.slidingmenu.view.SlidingMenu;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	private SlidingMenu mLeftMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		mLeftMenu = (SlidingMenu) findViewById(R.id.id_menu);
		LinearLayout layout = (LinearLayout)findViewById(R.id.ly_content);
		layout.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				mLeftMenu.toggleLy();
			}
		});
	}

	public void toggleMenu(View view) 
	{
		mLeftMenu.toggle();
	}

}
