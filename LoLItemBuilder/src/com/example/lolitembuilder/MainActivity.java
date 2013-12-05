package com.example.lolitembuilder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buildGrid();
		buildItems();
	}
	
	private static final int ITEMS = 131;
	
	private void buildGrid()
	{
		LinearLayout list = (LinearLayout)this.findViewById(R.id.items);
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, 
                LinearLayout.LayoutParams.WRAP_CONTENT);
		
		//Desired 6 columns, "i" number of rows.
		//numRows represents number of rows filled with column variables.
		//<= comparison is used to create the last row not entirely filled with column variables.
		int numRows = ITEMS/6;
		for(int i = 0; i <= numRows; i++)
		{
			LinearLayout row = new LinearLayout(this);
			row.setId(1000 + i);
			list.addView(row, params);
		}
	}
	
	private void buildItems()
	{
		for(int i = 0; i < ITEMS; i++)
		{
			ImageButton button = new ImageButton(this);
			button.setId(i);
//			button.setImageResource(R.drawable.imageName);
			button.setOnClickListener(buttonListener);
			
		}
	}
	
	private OnClickListener buttonListener = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			switch(v.getId())
			{
			case 1:
				break;
			case 2:
				break;
			default:
			}
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
