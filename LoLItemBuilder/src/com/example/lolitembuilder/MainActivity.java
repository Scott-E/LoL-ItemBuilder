package com.example.lolitembuilder;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buildGrid();
		buildItems();
		undoListener();
		clearListener();
	}
	
	private static final int ITEMS = 130;
	int cost = 0, health = 0, healthRegen = 0, mana = 0, manaRegen = 0, 
			attackDamage = 0, attackSpeed = 0, critStrike = 0, lifeSteal = 0,
			abilityPower = 0, cooldownReduction = 0, spellVamp = 0, 
			armor = 0, magicResist = 0, armorPen = 0, magicPen = 0, 
			moveSpeed = 0, moveSpeedPercent = 0, itemMax = 0, lastItemId = 0;
	int[] statsArray = new int[18];
	int[] itemSlots = new int[]{0, 0, 0, 0, 0, 0, 0};
	
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
			switch(i)
			{
			case 0:
				button.setImageResource(R.drawable.image0);
				break;
			case 1:
				button.setImageResource(R.drawable.image1);
				break;
			case 2:
				button.setImageResource(R.drawable.image2);
				break;
			case 3:
				button.setImageResource(R.drawable.image3);
				break;
			case 4:
				button.setImageResource(R.drawable.image4);
				break;
			case 5:
				button.setImageResource(R.drawable.image5);
				break;
			case 6:
				button.setImageResource(R.drawable.image6);
				break;
			case 7:
				button.setImageResource(R.drawable.image7);
				break;
			case 8:
				button.setImageResource(R.drawable.image8);
				break;
			case 9:
				button.setImageResource(R.drawable.image9);
				break;
			case 10:
				button.setImageResource(R.drawable.image10);
				break;
			case 11:
				button.setImageResource(R.drawable.image11);
				break;
			case 12:
				button.setImageResource(R.drawable.image12);
				break;
			case 13:
				button.setImageResource(R.drawable.image13);
				break;
			case 14:
				button.setImageResource(R.drawable.image14);
				break;
			case 15:
				button.setImageResource(R.drawable.image15);
				break;
			case 16:
				button.setImageResource(R.drawable.image16);
				break;
			case 17:
				button.setImageResource(R.drawable.image17);
				break;
			case 18:
				button.setImageResource(R.drawable.image18);
				break;
			case 19:
				button.setImageResource(R.drawable.image19);
				break;
			case 20:
				button.setImageResource(R.drawable.image20);
				break;
			case 21:
				button.setImageResource(R.drawable.image21);
				break;
			case 22:
				button.setImageResource(R.drawable.image22);
				break;
			case 23:
				button.setImageResource(R.drawable.image23);
				break;
			case 24:
				button.setImageResource(R.drawable.image24);
				break;
			case 25:
				button.setImageResource(R.drawable.image25);
				break;
			case 26:
				button.setImageResource(R.drawable.image26);
				break;
			case 27:
				button.setImageResource(R.drawable.image27);
				break;
			case 28:
				button.setImageResource(R.drawable.image28);
				break;
			case 29:
				button.setImageResource(R.drawable.image29);
				break;
			case 30:
				button.setImageResource(R.drawable.image30);
				break;
			case 31:
				button.setImageResource(R.drawable.image31);
				break;
			case 32:
				button.setImageResource(R.drawable.image32);
				break;
			case 33:
				button.setImageResource(R.drawable.image33);
				break;
			case 34:
				button.setImageResource(R.drawable.image34);
				break;
			case 35:
				button.setImageResource(R.drawable.image35);
				break;
			case 36:
				button.setImageResource(R.drawable.image36);
				break;
			case 37:
				button.setImageResource(R.drawable.image37);
				break;
			case 38:
				button.setImageResource(R.drawable.image38);
				break;
			case 39:
				button.setImageResource(R.drawable.image39);
				break;
			case 40:
				button.setImageResource(R.drawable.image40);
				break;
			case 41:
				button.setImageResource(R.drawable.image41);
				break;
			case 42:
				button.setImageResource(R.drawable.image42);
				break;
			case 43:
				button.setImageResource(R.drawable.image43);
				break;
			case 44:
				button.setImageResource(R.drawable.image44);
				break;
			case 45:
				button.setImageResource(R.drawable.image45);
				break;
			case 46:
				button.setImageResource(R.drawable.image46);
				break;
			case 47:
				button.setImageResource(R.drawable.image47);
				break;
			case 48:
				button.setImageResource(R.drawable.image48);
				break;
			case 49:
				button.setImageResource(R.drawable.image49);
				break;
			case 50:
				button.setImageResource(R.drawable.image50);
				break;
			case 51:
				button.setImageResource(R.drawable.image51);
				break;
			case 52:
				button.setImageResource(R.drawable.image52);
				break;
			case 53:
				button.setImageResource(R.drawable.image53);
				break;
			case 54:
				button.setImageResource(R.drawable.image54);
				break;
			case 55:
				button.setImageResource(R.drawable.image55);
				break;
			case 56:
				button.setImageResource(R.drawable.image56);
				break;
			case 57:
				button.setImageResource(R.drawable.image57);
				break;
			case 58:
				button.setImageResource(R.drawable.image58);
				break;
			case 59:
				button.setImageResource(R.drawable.image59);
				break;
			case 60:
				button.setImageResource(R.drawable.image60);
				break;
			case 61:
				button.setImageResource(R.drawable.image61);
				break;
			case 62:
				button.setImageResource(R.drawable.image62);
				break;
			case 63:
				button.setImageResource(R.drawable.image63);
				break;
			case 64:
				button.setImageResource(R.drawable.image64);
				break;
			case 65:
				button.setImageResource(R.drawable.image65);
				break;
			case 66:
				button.setImageResource(R.drawable.image66);
				break;
			case 67:
				button.setImageResource(R.drawable.image67);
				break;
			case 68:
				button.setImageResource(R.drawable.image68);
				break;
			case 69:
				button.setImageResource(R.drawable.image69);
				break;
			case 70:
				button.setImageResource(R.drawable.image70);
				break;
			case 71:
				button.setImageResource(R.drawable.image71);
				break;
			case 72:
				button.setImageResource(R.drawable.image72);
				break;
			case 73:
				button.setImageResource(R.drawable.image73);
				break;
			case 74:
				button.setImageResource(R.drawable.image74);
				break;
			case 75:
				button.setImageResource(R.drawable.image75);
				break;
			case 76:
				button.setImageResource(R.drawable.image76);
				break;
			case 77:
				button.setImageResource(R.drawable.image77);
				break;
			case 78:
				button.setImageResource(R.drawable.image78);
				break;
			case 79:
				button.setImageResource(R.drawable.image79);
				break;
			case 80:
				button.setImageResource(R.drawable.image80);
				break;
			case 81:
				button.setImageResource(R.drawable.image81);
				break;
			case 82:
				button.setImageResource(R.drawable.image82);
				break;
			case 83:
				button.setImageResource(R.drawable.image83);
				break;
			case 84:
				button.setImageResource(R.drawable.image84);
				break;
			case 85:
				button.setImageResource(R.drawable.image85);
				break;
			case 86:
				button.setImageResource(R.drawable.image86);
				break;
			case 87:
				button.setImageResource(R.drawable.image87);
				break;
			case 88:
				button.setImageResource(R.drawable.image88);
				break;
			case 89:
				button.setImageResource(R.drawable.image89);
				break;
			case 90:
				button.setImageResource(R.drawable.image90);
				break;
			case 91:
				button.setImageResource(R.drawable.image91);
				break;
			case 92:
				button.setImageResource(R.drawable.image92);
				break;
			case 93:
				button.setImageResource(R.drawable.image93);
				break;
			case 94:
				button.setImageResource(R.drawable.image94);
				break;
			case 95:
				button.setImageResource(R.drawable.image95);
				break;
			case 96:
				button.setImageResource(R.drawable.image96);
				break;
			case 97:
				button.setImageResource(R.drawable.image97);
				break;
			case 98:
				button.setImageResource(R.drawable.image98);
				break;
			case 99:
				button.setImageResource(R.drawable.image99);
				break;
			case 100:
				button.setImageResource(R.drawable.image100);
				break;
			case 101:
				button.setImageResource(R.drawable.image101);
				break;
			case 102:
				button.setImageResource(R.drawable.image102);
				break;
			case 103:
				button.setImageResource(R.drawable.image103);
				break;
			case 104:
				button.setImageResource(R.drawable.image104);
				break;
			case 105:
				button.setImageResource(R.drawable.image105);
				break;
			case 106:
				button.setImageResource(R.drawable.image106);
				break;
			case 107:
				button.setImageResource(R.drawable.image107);
				break;
			case 108:
				button.setImageResource(R.drawable.image108);
				break;
			case 109:
				button.setImageResource(R.drawable.image109);
				break;
			case 110:
				button.setImageResource(R.drawable.image110);
				break;
			case 111:
				button.setImageResource(R.drawable.image111);
				break;
			case 112:
				button.setImageResource(R.drawable.image112);
				break;
			case 113:
				button.setImageResource(R.drawable.image113);
				break;
			case 114:
				button.setImageResource(R.drawable.image114);
				break;
			case 115:
				button.setImageResource(R.drawable.image115);
				break;
			case 116:
				button.setImageResource(R.drawable.image116);
				break;
			case 117:
				button.setImageResource(R.drawable.image117);
				break;
			case 118:
				button.setImageResource(R.drawable.image118);
				break;
			case 119:
				button.setImageResource(R.drawable.image119);
				break;
			case 120:
				button.setImageResource(R.drawable.image120);
				break;
			case 121:
				button.setImageResource(R.drawable.image121);
				break;
			case 122:
				button.setImageResource(R.drawable.image122);
				break;
			case 123:
				button.setImageResource(R.drawable.image123);
				break;
			case 124:
				button.setImageResource(R.drawable.image124);
				break;
			case 125:
				button.setImageResource(R.drawable.image125);
				break;
			case 126:
				button.setImageResource(R.drawable.image126);
				break;
			case 127:
				button.setImageResource(R.drawable.image127);
				break;
			case 128:
				button.setImageResource(R.drawable.image128);
				break;
			case 129:
				button.setImageResource(R.drawable.image129);
				break;
			}
			button.setOnClickListener(buttonListener);
			
			LinearLayout row = (LinearLayout)this.findViewById(1000 + (i / 6));
			row.addView(button);
		}
	}
	
	public void clearListener()
	{
		Button clear = (Button)this.findViewById(R.id.clear);
		clear.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				for(int i = 0; i < 6; i++)
				{
					deleteItemImage(i);
				}
				
				for(int i = 0; i < 7; i++)
				{
					itemSlots[i] = 0;
				}
				cost = 0; health = 0; healthRegen = 0; mana = 0; manaRegen = 0; 
				attackDamage = 0; attackSpeed = 0; critStrike = 0; lifeSteal = 0;
				abilityPower = 0; cooldownReduction = 0; spellVamp = 0; 
				armor = 0; magicResist = 0; armorPen = 0; magicPen = 0; 
				moveSpeed = 0; moveSpeedPercent = 0; itemMax = 0; lastItemId = 0;
				
				displayStats();
			}
		});
	}
	
	public void deleteItemImage(int itemId)
	{
		switch(itemId)
		{
		case 0:
			ImageView slot1 = (ImageView)this.findViewById(R.id.item1);
			slot1.setImageResource(R.drawable.empty);
			break;
		case 1:
			ImageView slot2 = (ImageView)this.findViewById(R.id.item2);
			slot2.setImageResource(R.drawable.empty);
			break;
		case 2:
			ImageView slot3 = (ImageView)this.findViewById(R.id.item3);
			slot3.setImageResource(R.drawable.empty);
			break;
		case 3:
			ImageView slot4 = (ImageView)this.findViewById(R.id.item4);
			slot4.setImageResource(R.drawable.empty);
			break;
		case 4:
			ImageView slot5 = (ImageView)this.findViewById(R.id.item5);
			slot5.setImageResource(R.drawable.empty);
			break;
		case 5:
			ImageView slot6 = (ImageView)this.findViewById(R.id.item6);
			slot6.setImageResource(R.drawable.empty);
			break;
		}
	}
	
	public void deleteNewItem(int buttonId)
	{
		int slotNumber = 6;
		for(int i = 0; i < 7; i++)
		{
			if(itemSlots[i] == 0 && i > 0)
			{
				slotNumber = i - 1;
				break;
			}
		}
		deleteItemImage(slotNumber);
	}
	
	public void displayNewItem(int buttonId)
	{
		int slotNumber = 0;
		for(int i = 0; i < 6; i++)
		{
			if(itemSlots[i] == 0)
			{
				slotNumber = i;
				break;
			}
		}
		
		switch(slotNumber)
		{
		case 0:
			ImageView itemSlot1 = (ImageView)this.findViewById(R.id.item1);
			getItemImage(itemSlot1, buttonId);
			break;
		case 1:
			ImageView itemSlot2 = (ImageView)this.findViewById(R.id.item2);
			getItemImage(itemSlot2, buttonId);
			break;
		case 2:
			ImageView itemSlot3 = (ImageView)this.findViewById(R.id.item3);
			getItemImage(itemSlot3, buttonId);
			break;
		case 3:
			ImageView itemSlot4 = (ImageView)this.findViewById(R.id.item4);
			getItemImage(itemSlot4, buttonId);
			break;
		case 4:
			ImageView itemSlot5 = (ImageView)this.findViewById(R.id.item5);
			getItemImage(itemSlot5, buttonId);
			break;
		case 5:
			ImageView itemSlot6 = (ImageView)this.findViewById(R.id.item6);
			getItemImage(itemSlot6, buttonId);
			break;
		}
	}
	
	public void displayStats()
	{
		TextView costView = (TextView)this.findViewById(R.id.cost);
		costView.setText("Cost:  " + cost);
		
		TextView healthView = (TextView)this.findViewById(R.id.health);
		healthView.setText("Health:  " + health);
		
		TextView healthRegenView = (TextView)this.findViewById(R.id.healthRegen);
		healthRegenView.setText("Health regen/5 seconds:  " + healthRegen);
		
		TextView manaView = (TextView)this.findViewById(R.id.mana);
		manaView.setText("Mana:  " + mana);
		
		TextView manaRegenView = (TextView)this.findViewById(R.id.manaRegen);
		manaRegenView.setText("Mana regen/5 seconds:  " + manaRegen);
		
		TextView attackDamageView = (TextView)this.findViewById(R.id.attackDamage);
		attackDamageView.setText("Attack damage:  " + attackDamage);
		
		TextView attackSpeedView = (TextView)this.findViewById(R.id.attackSpeed);
		attackSpeedView.setText("Attack Speed:  " + attackSpeed + "%");
		
		TextView critStrikeView = (TextView)this.findViewById(R.id.critStrike);
		int critStrikeCap = critStrike;
		if(critStrikeCap > 100)
			critStrikeCap = 100;
		critStrikeView.setText("Critical Strike Chance:  " + critStrikeCap + "%");
		
		TextView lifeStealView = (TextView)this.findViewById(R.id.lifeSteal);
		int lifeStealCap = lifeSteal;
		if(lifeStealCap > 100)
			lifeStealCap = 100;
		lifeStealView.setText("Lifesteal:  " + lifeStealCap + "%");
		
		TextView abilityPowerView = (TextView)this.findViewById(R.id.abilityPower);
		abilityPowerView.setText("Ability Power:  " + abilityPower);
		
		TextView cooldownView = (TextView)this.findViewById(R.id.cooldownReduction);
		int cooldownCap = cooldownReduction;
		if(cooldownCap > 40)
			cooldownCap = 40;
		cooldownView.setText("Cooldown Reduction:  " + cooldownCap);
		
		TextView armorView = (TextView)this.findViewById(R.id.armor);
		armorView.setText("Armor:  " + armor);
		
		TextView magicResistView = (TextView)this.findViewById(R.id.magicResist);
		magicResistView.setText("Magic Resistance:  " + magicResist);
		
		TextView armorPenView = (TextView)this.findViewById(R.id.armorPen);
		armorPenView.setText("Armor Penetration:  " + armorPen);
		
		TextView magicPenView = (TextView)this.findViewById(R.id.magicPen);
		magicPenView.setText("Magic Penetration:  " + magicPen);
		
		TextView moveSpeedView = (TextView)this.findViewById(R.id.moveSpeed);
		double moveSpeedDecimal = moveSpeedPercent / 100;
		moveSpeedView.setText("Movement Speed:  (Base champion movement speed) + " + 
		moveSpeedDecimal + "((Base champion movement speed) + " + moveSpeed + ")");
	}
	
	public void getItemStats(int item, int[] stats)
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
			stats[0] = 3800;
			stats[5] = 70;
			stats[7] = 25;
			break;
		//Ionian boots of lucidity
		case 52:
			stats[0] = 1000;
			stats[10] = 15;
			stats[16] = 45;
			break;
		//Kindlegem
		case 53:
			stats[0] = 850;
			stats[1] = 200;
			break;
		//Last whisper
		case 54:
			stats[0] = 2300;
			stats[5] = 40;
			break;
		//Liandry's torment
		case 55:
			stats[0] = 2900;
			stats[1] = 300;
			stats[9] = 50;
			break;
		//Lich bane
		case 56:
			stats[0] = 3000;
			stats[3] = 250;
			stats[9] = 80;
			stats[17] = 5;
			break;
		//Locket of the iron solari
		case 57:
			stats[0] = 2550;
			stats[1] = 300;
			stats[10] = 10;
			stats[12] = 20;
			break;
		//Long sword
		case 58:
			stats[0] = 360;
			stats[5] = 10;
			break;
		//Madred's razors
		case 59:
			stats[0] = 700;
			stats[12] = 20;
			break;
		//Manamune
		case 60:
			stats[0] = 2100;
			stats[3] = 250;
			stats[4] = 7;
			stats[5] = 20;
			break;
		//Maw of malmortis
		case 61:
			stats[0] = 3200;
			stats[5] = 60;
			stats[13] = 40;
			break;
		//Mejai's soulstealer
		case 62:
			stats[0] = 1235;
			stats[9] = 20;
			break;
		//Mercurial scimitar
		case 63:
			stats[0] = 3700;
			stats[5] = 60;
			stats[13] = 45;
			break;
		//Mercury's treads
		case 64:
			stats[0] = 1200;
			stats[13] = 25;
			stats[16] = 45;
			break;
		//Mikael's crucible
		case 65:
			stats[0] = 1600;
			stats[4] = 12;
			stats[13] = 40;
			break;
		//Morellonomicon
		case 66:
			stats[0] = 2200;
			stats[4] = 12;
			stats[9] = 75;
			stats[10] = 20;
			break;
		//Muramana
		case 67:
			stats[0] = 2100;
			stats[3] = 1000;
			stats[4] = 7;
			stats[5] = 20;
			break;
		//Nashor's tooth
		case 68:
			stats[0] = 2920;
			stats[6] = 50;
			stats[9] = 60;
			break;
		//Needlessly large rod
		case 69:
			stats[0] = 1600;
			stats[9] = 80;
			break;
		//Negatron cloak
		case 70:
			stats[0] = 720;
			stats[13] = 40;
			break;
		//Ninja tabi
		case 71:
			stats[0] = 1000;
			stats[12] = 25;
			stats[16] = 45;
			break;
		//Nomad's medallion
		case 72:
			stats[0] = 850;
			stats[2] = 8;
			stats[4] = 11;
			break;
		//Null-magic mantle
		case 73:
			stats[0] = 400;
			stats[13] = 20;
			break;
		//Ohmwrecker
		case 74:
			stats[0] = 2000;
			stats[1] = 350;
			stats[9] = 50;
			break;
		//Phage
		case 75:
			stats[0] = 1325;
			stats[1] = 200;
			stats[5] = 20;
			break;
		//Phantom dancer
		case 76:
			stats[0] = 2800;
			stats[6] = 50;
			stats[7] = 30;
			stats[17] = 5;
			break;
		//Pickaxe
		case 77:
			stats[0] = 875;
			stats[5] = 25;
			break;
		//Quicksilver sash
		case 78:
			stats[0] = 1550;
			stats[13] = 45;
			break;
		//Rabadon's deathcap
		case 79:
			stats[0] = 3300;
			stats[9] = 120;
			break;
		//Randuin's omen
		case 80:
			stats[0] = 3000;
			stats[1] = 500;
			stats[12] = 70;
			break;
		//Ravenous hydra
		case 81:
			stats[0] = 3300;
			stats[2] = 15;
			stats[5] = 75;
			stats[8] = 12;
			break;
		//Recurve bow
		case 82:
			stats[0] = 900;
			stats[6] = 30;
			break;
		//Rejuvenation bead
		case 83:
			stats[0] = 180;
			stats[2] = 5;
			break;
		//Relic shield
		case 84:
			stats[0] = 365;
			stats[1] = 50;
			stats[2] = 6;
			break;
		//Rod of ages
		case 85:
			stats[0] = 2800;
			stats[1] = 450;
			stats[3] = 450;
			stats[9] = 60;
			break;
		//Ruby crystal
		case 86:
			stats[0] = 475;
			stats[1] = 180;
			break;
		//Ruby sightstone
		case 87:
			stats[0] = 1550;
			stats[1] = 360;
			break;
		//Runaan's hurricane
		case 88:
			stats[0] = 2400;
			stats[6] = 70;
			break;
		//Rylai's crystal scepter
		case 89:
			stats[0] = 2900;
			stats[1] = 500;
			stats[9] = 80;
			break;
		//Sapphire crystal
		case 90:
			stats[0] = 400;
			stats[3] = 200;
			break;
		//Seeker's armguard
		case 91:
			stats[0] = 1160;
			stats[9] = 20;
			stats[12] = 30;
			break;
		//Seraph's embrace
		case 92:
			stats[0] = 2700;
			stats[3] = 1000;
			stats[4] = 10;
			stats[9] = 60;
			break;
		//Sheen
		case 93:
			stats[0] = 1200;
			stats[3] = 200;
			stats[9] = 25;
			break;
		//Sightstone
		case 94:
			stats[0] = 950;
			stats[1] = 180;
			break;
		//Sorceror's shoes
		case 95:
			stats[0] = 1100;
			stats[15] = 15;
			break;
		//Spectre's cowl
		case 96:
			stats[0] = 1400;
			stats[1] = 200;
			stats[13] = 45;
			break;
		//Spellthief's edge
		case 97:
			stats[0] = 365;
			stats[4] = 3;
			stats[9] = 10;
			break;
		//Spirit stone
		case 98:
			stats[0] = 700;
			stats[2] = 14;
			stats[4] = 7;
			break;
		//Spirit visage
		case 99:
			stats[0] = 2750;
			stats[1] = 400;
			stats[2] = 20;
			stats[10] = 20;
			stats[13] = 55;
			break;
		//Spirit of the ancient golem
		case 100:
			stats[0] = 2000;
			stats[1] = 350;
			stats[2] = 14;
			stats[4] = 7;
			stats[10] = 10;
			break;
		//Spirit of the elder lizard
		case 101:
			stats[0] = 2000;
			stats[2] = 14;
			stats[4] = 7;
			stats[5] = 30;
			stats[10] = 10;
			break;
		//Spirit of the spectral wraith
		case 102:
			stats[0] = 2000;
			stats[2] = 14;
			stats[4] = 7;
			stats[9] = 50;
			stats[10] = 10;
			break;
		//Statikk shiv
		case 103:
			stats[0] = 2500;
			stats[6] = 40;
			stats[7] = 20;
			stats[17] = 6;
			break;
		//Stinger
		case 104:
			stats[0] = 1250;
			stats[6] = 40;
			break;
		//Sunfire cape
		case 105:
			stats[0] = 2650;
			stats[1] = 450;
			stats[12] = 45;
			break;
		//Sword of the divine
		case 106:
			stats[0] = 2150;
			stats[6] = 45;
			break;
		//Sword of the occult
		case 107:
			stats[0] = 1200;
			stats[5] = 10;
			break;
		//Talisman of ascension
		case 108:
			stats[0] = 2000;
			stats[2] = 10;
			stats[4] = 15;
			stats[10] = 20;
			break;
		//Targon's brace
		case 109:
			stats[0] = 850;
			stats[1] = 175;
			stats[2] = 12;
			break;
		//Tear of the goddess
		case 110:
			stats[0] = 700;
			stats[3] = 250;
			stats[4] = 7;
			break;
		//The black cleaver
		case 111:
			stats[0] = 3000;
			stats[1] = 200;
			stats[5] = 50;
			stats[10] = 10;
			break;
		//Bloodthirster
		case 112:
			stats[0] = 3200;
			stats[5] = 70;
			stats[8] = 12;
			break;
		//The brutalizer
		case 113:
			stats[0] = 1337;
			stats[5] = 25;
			break;
		//Thornmail
		case 114:
			stats[0] = 2200;
			stats[12] = 100;
			break;
		//Tiamat
		case 115:
			stats[0] = 1900;
			stats[2] = 15;
			stats[5] = 40;
			break;
		//Trinity force
		case 116:
			stats[0] = 3703;
			stats[1] = 250;
			stats[3] = 200;
			stats[5] = 30;
			stats[6] = 30;
			stats[7] = 10;
			stats[9] = 30;
			stats[17] = 8;
			break;
		//Twin shadows
		case 117:
			stats[0] = 2000;
			stats[9] = 50;
			stats[13] = 40;
			stats[17] = 6;
			break;
		//Vampiric scepter
		case 118:
			stats[0] = 800;
			stats[5] = 10;
			stats[8] = 10;
			break;
		//Void staff
		case 119:
			stats[0] = 2295;
			stats[9] = 70;
			break;
		//Warden's mail
		case 120:
			stats[0] = 1000;
			stats[12] = 50;
			break;
		//Warmog's armor
		case 121:
			stats[0] = 2830;
			stats[1] = 1000;
			break;
		//Will of the ancients
		case 122:
			stats[0] = 2000;
			stats[4] = 10;
			stats[9] = 50;
			stats[10] = 10;
			break;
		//Wit's end
		case 123:
			stats[0] = 2400;
			stats[6] = 42;
			stats[13] = 25;
			break;
		//Wriggle's lantern
		case 124:
			stats[0] = 1650;
			stats[6] = 25;
			stats[12] = 20;
			break;
		//Youmuu's ghostblad
		case 125:
			stats[0] = 2700;
			stats[5] = 30;
			stats[7] = 15;
			stats[10] = 10;
			break;
		//Zeal
		case 126:
			stats[0] = 1175;
			stats[6] = 18;
			stats[7] = 10;
			stats[17] = 5;
			break;
		//Zeke's herald
		case 127:
			stats[0] = 2450;
			stats[1] = 250;
			stats[10] = 20;
			break;
		//Zephyr
		case 128:
			stats[0] = 2850;
			stats[5] = 25;
			stats[6] = 50;
			stats[10] = 10;
			stats[17] = 10;
			break;
		//Zhonya's hourglass
		case 129:
			stats[0] = 3260;
			stats[9] = 120;
			stats[12] = 50;
			break;
		}
	}
	
	public void getItemImage(ImageView slot, int itemId)
	{
		switch(itemId)
		{
		case 0:
			slot.setImageResource(R.drawable.image0);
			break;
		case 1:
			slot.setImageResource(R.drawable.image1);
			break;
		case 2:
			slot.setImageResource(R.drawable.image2);
			break;
		case 3:
			slot.setImageResource(R.drawable.image3);
			break;
		case 4:
			slot.setImageResource(R.drawable.image4);
			break;
		case 5:
			slot.setImageResource(R.drawable.image5);
			break;
		case 6:
			slot.setImageResource(R.drawable.image6);
			break;
		case 7:
			slot.setImageResource(R.drawable.image7);
			break;
		case 8:
			slot.setImageResource(R.drawable.image8);
			break;
		case 9:
			slot.setImageResource(R.drawable.image9);
			break;
		case 10:
			slot.setImageResource(R.drawable.image10);
			break;
		case 11:
			slot.setImageResource(R.drawable.image11);
			break;
		case 12:
			slot.setImageResource(R.drawable.image12);
			break;
		case 13:
			slot.setImageResource(R.drawable.image13);
			break;
		case 14:
			slot.setImageResource(R.drawable.image14);
			break;
		case 15:
			slot.setImageResource(R.drawable.image15);
			break;
		case 16:
			slot.setImageResource(R.drawable.image16);
			break;
		case 17:
			slot.setImageResource(R.drawable.image17);
			break;
		case 18:
			slot.setImageResource(R.drawable.image18);
			break;
		case 19:
			slot.setImageResource(R.drawable.image19);
			break;
		case 20:
			slot.setImageResource(R.drawable.image20);
			break;
		case 21:
			slot.setImageResource(R.drawable.image21);
			break;
		case 22:
			slot.setImageResource(R.drawable.image22);
			break;
		case 23:
			slot.setImageResource(R.drawable.image23);
			break;
		case 24:
			slot.setImageResource(R.drawable.image24);
			break;
		case 25:
			slot.setImageResource(R.drawable.image25);
			break;
		case 26:
			slot.setImageResource(R.drawable.image26);
			break;
		case 27:
			slot.setImageResource(R.drawable.image27);
			break;
		case 28:
			slot.setImageResource(R.drawable.image28);
			break;
		case 29:
			slot.setImageResource(R.drawable.image29);
			break;
		case 30:
			slot.setImageResource(R.drawable.image30);
			break;
		case 31:
			slot.setImageResource(R.drawable.image31);
			break;
		case 32:
			slot.setImageResource(R.drawable.image32);
			break;
		case 33:
			slot.setImageResource(R.drawable.image33);
			break;
		case 34:
			slot.setImageResource(R.drawable.image34);
			break;
		case 35:
			slot.setImageResource(R.drawable.image35);
			break;
		case 36:
			slot.setImageResource(R.drawable.image36);
			break;
		case 37:
			slot.setImageResource(R.drawable.image37);
			break;
		case 38:
			slot.setImageResource(R.drawable.image38);
			break;
		case 39:
			slot.setImageResource(R.drawable.image39);
			break;
		case 40:
			slot.setImageResource(R.drawable.image40);
			break;
		case 41:
			slot.setImageResource(R.drawable.image41);
			break;
		case 42:
			slot.setImageResource(R.drawable.image42);
			break;
		case 43:
			slot.setImageResource(R.drawable.image43);
			break;
		case 44:
			slot.setImageResource(R.drawable.image44);
			break;
		case 45:
			slot.setImageResource(R.drawable.image45);
			break;
		case 46:
			slot.setImageResource(R.drawable.image46);
			break;
		case 47:
			slot.setImageResource(R.drawable.image47);
			break;
		case 48:
			slot.setImageResource(R.drawable.image48);
			break;
		case 49:
			slot.setImageResource(R.drawable.image49);
			break;
		case 50:
			slot.setImageResource(R.drawable.image50);
			break;
		case 51:
			slot.setImageResource(R.drawable.image51);
			break;
		case 52:
			slot.setImageResource(R.drawable.image52);
			break;
		case 53:
			slot.setImageResource(R.drawable.image53);
			break;
		case 54:
			slot.setImageResource(R.drawable.image54);
			break;
		case 55:
			slot.setImageResource(R.drawable.image55);
			break;
		case 56:
			slot.setImageResource(R.drawable.image56);
			break;
		case 57:
			slot.setImageResource(R.drawable.image57);
			break;
		case 58:
			slot.setImageResource(R.drawable.image58);
			break;
		case 59:
			slot.setImageResource(R.drawable.image59);
			break;
		case 60:
			slot.setImageResource(R.drawable.image60);
			break;
		case 61:
			slot.setImageResource(R.drawable.image61);
			break;
		case 62:
			slot.setImageResource(R.drawable.image62);
			break;
		case 63:
			slot.setImageResource(R.drawable.image63);
			break;
		case 64:
			slot.setImageResource(R.drawable.image64);
			break;
		case 65:
			slot.setImageResource(R.drawable.image65);
			break;
		case 66:
			slot.setImageResource(R.drawable.image66);
			break;
		case 67:
			slot.setImageResource(R.drawable.image67);
			break;
		case 68:
			slot.setImageResource(R.drawable.image68);
			break;
		case 69:
			slot.setImageResource(R.drawable.image69);
			break;
		case 70:
			slot.setImageResource(R.drawable.image70);
			break;
		case 71:
			slot.setImageResource(R.drawable.image71);
			break;
		case 72:
			slot.setImageResource(R.drawable.image72);
			break;
		case 73:
			slot.setImageResource(R.drawable.image73);
			break;
		case 74:
			slot.setImageResource(R.drawable.image74);
			break;
		case 75:
			slot.setImageResource(R.drawable.image75);
			break;
		case 76:
			slot.setImageResource(R.drawable.image76);
			break;
		case 77:
			slot.setImageResource(R.drawable.image77);
			break;
		case 78:
			slot.setImageResource(R.drawable.image78);
			break;
		case 79:
			slot.setImageResource(R.drawable.image79);
			break;
		case 80:
			slot.setImageResource(R.drawable.image80);
			break;
		case 81:
			slot.setImageResource(R.drawable.image81);
			break;
		case 82:
			slot.setImageResource(R.drawable.image82);
			break;
		case 83:
			slot.setImageResource(R.drawable.image83);
			break;
		case 84:
			slot.setImageResource(R.drawable.image84);
			break;
		case 85:
			slot.setImageResource(R.drawable.image85);
			break;
		case 86:
			slot.setImageResource(R.drawable.image86);
			break;
		case 87:
			slot.setImageResource(R.drawable.image87);
			break;
		case 88:
			slot.setImageResource(R.drawable.image88);
			break;
		case 89:
			slot.setImageResource(R.drawable.image89);
			break;
		case 90:
			slot.setImageResource(R.drawable.image90);
			break;
		case 91:
			slot.setImageResource(R.drawable.image91);
			break;
		case 92:
			slot.setImageResource(R.drawable.image92);
			break;
		case 93:
			slot.setImageResource(R.drawable.image93);
			break;
		case 94:
			slot.setImageResource(R.drawable.image94);
			break;
		case 95:
			slot.setImageResource(R.drawable.image95);
			break;
		case 96:
			slot.setImageResource(R.drawable.image96);
			break;
		case 97:
			slot.setImageResource(R.drawable.image97);
			break;
		case 98:
			slot.setImageResource(R.drawable.image98);
			break;
		case 99:
			slot.setImageResource(R.drawable.image99);
			break;
		case 100:
			slot.setImageResource(R.drawable.image100);
			break;
		case 101:
			slot.setImageResource(R.drawable.image101);
			break;
		case 102:
			slot.setImageResource(R.drawable.image102);
			break;
		case 103:
			slot.setImageResource(R.drawable.image103);
			break;
		case 104:
			slot.setImageResource(R.drawable.image104);
			break;
		case 105:
			slot.setImageResource(R.drawable.image105);
			break;
		case 106:
			slot.setImageResource(R.drawable.image106);
			break;
		case 107:
			slot.setImageResource(R.drawable.image107);
			break;
		case 108:
			slot.setImageResource(R.drawable.image108);
			break;
		case 109:
			slot.setImageResource(R.drawable.image109);
			break;
		case 110:
			slot.setImageResource(R.drawable.image110);
			break;
		case 111:
			slot.setImageResource(R.drawable.image111);
			break;
		case 112:
			slot.setImageResource(R.drawable.image112);
			break;
		case 113:
			slot.setImageResource(R.drawable.image113);
			break;
		case 114:
			slot.setImageResource(R.drawable.image114);
			break;
		case 115:
			slot.setImageResource(R.drawable.image115);
			break;
		case 116:
			slot.setImageResource(R.drawable.image116);
			break;
		case 117:
			slot.setImageResource(R.drawable.image117);
			break;
		case 118:
			slot.setImageResource(R.drawable.image118);
			break;
		case 119:
			slot.setImageResource(R.drawable.image119);
			break;
		case 120:
			slot.setImageResource(R.drawable.image120);
			break;
		case 121:
			slot.setImageResource(R.drawable.image121);
			break;
		case 122:
			slot.setImageResource(R.drawable.image122);
			break;
		case 123:
			slot.setImageResource(R.drawable.image123);
			break;
		case 124:
			slot.setImageResource(R.drawable.image124);
			break;
		case 125:
			slot.setImageResource(R.drawable.image125);
			break;
		case 126:
			slot.setImageResource(R.drawable.image126);
			break;
		case 127:
			slot.setImageResource(R.drawable.image127);
			break;
		case 128:
			slot.setImageResource(R.drawable.image128);
			break;
		case 129:
			slot.setImageResource(R.drawable.image129);
			break;
		}
	}
	
	public void undoListener()
	{
		Button undo = (Button)this.findViewById(R.id.undo);
		undo.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				if(itemMax > 0)
				{
					for(int i = 0; i < 18; i++)
						statsArray[i] = 0;
					getItemStats(lastItemId, statsArray);
					cost -= statsArray[0];
					health -= statsArray[1];
					healthRegen -= statsArray[2];
					mana -= statsArray[3];
					manaRegen -= statsArray[4];
					attackDamage -= statsArray[5];
					attackSpeed -= statsArray[6];
					critStrike -= statsArray[7];
					lifeSteal -= statsArray[8];
					abilityPower -= statsArray[9];
					cooldownReduction -= statsArray[10];
					spellVamp -= statsArray[11];
					armor -= statsArray[12];
					magicResist -= statsArray[13];
					armorPen -= statsArray[14];
					magicPen -= statsArray[15];
					moveSpeedPercent -= statsArray[17];
					
					displayStats();
					deleteNewItem(lastItemId);
					itemMax--;
					for(int i = 0; i < 7; i++)
					{
						if(itemSlots[i] == 0 && i > 0)
						{
							if(i > 1)
								lastItemId = itemSlots[i - 2] - 1;
							itemSlots[i - 1] = 0;
							break;
						}
					}
				}
			}
		});
	}
	
	private OnClickListener buttonListener = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			if(itemMax < 6)
			{
				for(int i = 0; i < 18; i++)
					statsArray[i] = 0;
				lastItemId = v.getId();
				getItemStats(lastItemId, statsArray);
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
				moveSpeed = statsArray[16];
				moveSpeedPercent += statsArray[17];
				
				displayStats();
				displayNewItem(lastItemId);
				itemMax++;
				for(int i = 0; i < 6; i++)
				{
					if(itemSlots[i] == 0)
					{
						itemSlots[i] = lastItemId + 1;
						break;
					}
				}
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
