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
	int cost = 0, health = 0, healthRegen = 0, mana = 0, manaRegen = 0, 
			attackDamage = 0, attackSpeed = 0, critStrike = 0, lifeSteal = 0,
			abilityPower = 0, cooldownReduction = 0, spellVamp = 0, 
			armor = 0, magicResist = 0, armorPen = 0, magicPen = 0, 
			moveSpeed = 0, moveSpeedPercent = 0;
	int[] statsArray = new int[18];
	
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
//			button.setImageResource(R.drawable.imagei);
			button.setOnClickListener(buttonListener);
			
			LinearLayout row = (LinearLayout)this.findViewById(1000 + (i / 6));
			row.addView(button);
		}
	}
	
	public int[] getItemStats(int item, int[] stats)
	{
		switch(item)
		{
		//Abyssal scepter
		case 0:
			stats[0] = 2560;
			stats[9] = 70;
			stats[13] = 45;
			break;
		//Aegis of the Legion
		case 1:
			stats[0] = 1950;
			stats[1] = 200;
			stats[12] = 20;
			break;
		//Amplifying tome
		case 2:
			stats[0] = 435;
			stats[9] = 20;
			break;
		//Ancient coin
		case 3:
			stats[0] = 365;
			stats[2] = 5;
			stats[4] = 3;
			break;
		//Archangel's staff
		case 4:
			stats[0] = 2700;
			stats[3] = 250;
			stats[4] = 10;
			stats[9] = 60;
			break;
		//Athene's unholy grail
		case 5:
			stats[0] = 2600;
			stats[4] = 15;
			stats[9] = 60;
			stats[10] = 20;
			stats[13] = 40;
			break;
		//Atma's impaler
		case 6:
			stats[0] = 2300;
			stats[7] = 15;
			stats[12] = 45;
			break;
		//Augment: Death
		case 7:
			stats[0] = 1000;
			stats[9] = 45;
			break;
		//Augment: Gravity
		case 8:
			stats[0] = 1000;
			stats[3] = 200;
			stats[4] = 5;
			stats[10] = 10;
			break;
		//Augment: Power
		case 9:
			stats[0] = 1000;
			stats[1] = 220;
			stats[2] = 6;
			break;
		//Avarice blade
		case 10:
			stats[0] = 800;
			stats[7] = 10;
			break;
		//B. F. sword
		case 11:
			stats[0] = 1550;
			stats[5] = 45;
			break;
		//Banner of command
		case 12:
			stats[0] = 2400;
			stats[9] = 80;
			stats[10] = 20;
			break;
		//Banshee's veil
		case 13:
			stats[0] = 2750;
			stats[1] = 450;
			stats[13] = 55;
			break;
		//Berserker's greaves
		case 14:
			stats[0] = 900;
			stats[6] = 20;
			stats[16] = 45;
			break;
		//Bilgewater cutlass
		case 15:
			stats[0] = 1400;
			stats[5] = 25;
			stats[8] = 12;
			break;
		//Blade of the ruined king
		case 16:
			stats[0] = 3200;
			stats[5] = 25;
			stats[6] = 40;
			stats[8] = 15;
			break;
		//Blasting wand
		case 17:
			stats[0] = 860;
			stats[9] = 40;
			break;
		//Bonetooth necklace
		case 18:
			stats[0] = 800;
			stats[5] = 5;
			break;
		//Boots of mobility
		case 19:
			stats[0] = 1000;
			stats[16] = 105;
			break;
		//Boots of speed
		case 20:
			stats[0] = 325;
			stats[16] = 25;
			break;
		//Boots of swiftness
		case 21:
			stats[0] = 1000;
			stats[16] = 60;
			break;
		//Brawler's gloves
		case 22:
			stats[0] = 400;
			stats[7] = 8;
			break;
		//Catalyst the protector
		case 23:
			stats[0] = 1200;
			stats[1] = 200;
			stats[3] = 300;
			break;
		//Chain vest
		case 24:
			stats[0] = 720;
			stats[12] = 40;
			break;
		//Chalice of harmony
		case 25:
			stats[0] = 880;
			stats[4] = 7;
			stats[13] = 25;
			break;
		//Cloak of agility
		case 26:
			stats[0] = 730;
			stats[7] = 15;
			break;
		//Cloth armor
		case 27:
			stats[0] = 300;
			stats[12] = 15;
			break;
		//Dagger
		case 28:
			stats[0] = 400;
			stats[6] = 12;
			break;
		//Deathfire grasp
		case 29:
			stats[0] = 3100;
			stats[9] = 120;
			stats[10] = 10;
			break;
		//Doran's blade
		case 30:
			stats[0] = 440;
			stats[1] = 80;
			stats[5] = 8;
			break;
		//Doran's ring
		case 31:
			stats[0] = 400;
			stats[1] = 60;
			stats[4] = 3;
			stats[9] = 15;
			break;
		//Doran's shield
		case 32:
			stats[0] = 440;
			stats[1] = 100;
			stats[2] = 10;
			break;
		//Executioner's calling
		case 33:
			stats[0] = 1900;
			stats[5] = 25;
			stats[7] = 20;
			break;
		//Face of the mountain
		case 34:
			stats[0] = 2000;
			stats[1] = 375;
			stats[2] = 25;
			stats[10] = 10;
			break;
		//Faerie charm
		case 35:
			stats[0] = 180;
			stats[4] = 3;
			break;
		//Fiendish codex
		case 36:
			stats[0] = 820;
			stats[9] = 30;
			break;
		//Frost Queen's claim
		case 37:
			stats[0] = 2000;
			stats[4] = 10;
			stats[9] = 50;
			break;
		//Frostfang
		case 38:
			stats[0] = 850;
			stats[4] = 7;
			stats[9] = 20;
			break;
		//Frozen heart
		case 39:
			stats[0] = 2900;
			stats[3] = 400;
			stats[10] = 20;
			stats[12] = 95;
			break;
		//Frozen mallet
		case 40:
			stats[0] = 3300;
			stats[1] = 700;
			stats[5] = 30;
			break;
		//Giant's belt
		case 41:
			stats[0] = 1000;
			stats[1] = 380;
			break;
		//Glacial shroud
		case 42:
			stats[0] = 1350;
			stats[3] = 300;
			stats[12] = 45;
			break;
		//Guardian angel
		case 43:
			stats[0] = 2750;
			stats[12] = 50;
			stats[13] = 40;
			break;
		//Guinsoo's rageblade
		case 44:
			stats[0] = 2600;
			stats[5] = 30;
			stats[9] = 40;
			break;
		//Haunting guise
		case 45:
			stats[0] = 1485;
			stats[1] = 200;
			stats[9] = 25;
			break;
		//Hexdrinker
		case 46:
			stats[0] = 1350;
			stats[5] = 25;
			stats[13] = 25;
			break;
		//Hextech gunblade
		case 47:
			stats[0] = 3400;
			stats[5] = 45;
			stats[8] = 12;
			stats[9] = 65;
			break;
		//Hextech revolver
		case 48:
			stats[0] = 1200;
			stats[9] = 40;
			break;
		//Hunter's machete
		case 49:
			stats[0] = 300;
			break;
		//Iceborn gauntlet
		case 50:
			stats[0] = 3250;
			stats[3] = 500;
			stats[9] = 30;
			stats[10] = 10;
			stats[12] = 70;
			break;
		//Infinity edge
		case 51:
			break;
		}
		return stats;
	}
	
	private OnClickListener buttonListener = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			for(int i = 0; i < 18; i++)
				statsArray[i] = 0;
			getItemStats(v.getId(), statsArray);
			cost += statsArray[0];
			health += statsArray[1];
			healthRegen += statsArray[2];
			mana += statsArray[3];
			manaRegen += statsArray[4];
			attackDamage += statsArray[5];
			attackSpeed += statsArray[6];
			critStrike += statsArray[7];
			lifeSteal += statsArray[8];
			abilityPower += statsArray[9];
			cooldownReduction += statsArray[10];
			spellVamp += statsArray[11];
			armor += statsArray[12];
			magicResist += statsArray[13];
			armorPen += statsArray[14];
			magicPen += statsArray[15];
			moveSpeed += statsArray[16];
			moveSpeedPercent += statsArray[17];
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
