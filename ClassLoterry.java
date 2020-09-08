/*
*	Author: Patrick Gunawan
*	Github: woruya
*	Twitter: twitter.com/notworu
*
*	c: This program was made because I wanted to see what "luck" would
*	assign myself a DPS specialisation to play in the Shadowlands expansion
*	of World of Warcraft. After a few wheel spins, my friend suggested
*	this garbage. Alas.
*	
*	This can work for other specialisations (them being Tank or Healer),
*	too lazy to implement that, for now.
*/

import java.util.*;
import java.lang.Math;

public class ClassLoterry
{
    public static void main(String[] args)
    {
	DPSClass[] dps = new DPSClass[12];

        dps[0]= new DPSClass();
	dps[0].setClassName("DK");

	dps[1] = new DPSClass();
	dps[1].setClassName("DH");

	dps[2] = new DPSClass();
	dps[2].setClassName("Druid");

	dps[3] = new DPSClass();
	dps[3].setClassName("Hunter");

	dps[4] = new DPSClass();
	dps[4].setClassName("Mage");

	dps[5] = new DPSClass();
	dps[5].setClassName("Monk");

	dps[6] = new DPSClass();
	dps[6].setClassName("Paladin");

	dps[7] = new DPSClass();
	dps[7].setClassName("Priest");

	dps[8] = new DPSClass();
	dps[8].setClassName("Rogue");

	dps[9] = new DPSClass();
	dps[9].setClassName("Shaman");

	dps[10] = new DPSClass();
	dps[10].setClassName("Warlock");

	dps[11] = new DPSClass();
	dps[11].setClassName("Warrior");

        for(int i = 0; i < 100000; i++)
        {
            int compare = roll();
            if(compare == 0)
            {
                dps[0].addCount();
            }
            else if(compare == 1)
            {
                dps[1].addCount();
            }
            else if(compare == 2)
            {
                dps[2].addCount();
            }
            else if(compare == 3)
            {
                dps[3].addCount();
            }
            else if(compare == 4)
            {
                dps[4].addCount();
            }
            else if(compare == 5)
            {
                dps[5].addCount();
            }
            else if(compare == 6)
            {
                dps[6].addCount();
            }
            else if(compare == 7)
            {
                dps[7].addCount();
            }
            else if(compare == 8)
            {
                dps[8].addCount();
            }
            else if(compare == 9)
            {
                dps[9].addCount();
            }
            else if(compare == 10)
            {
                dps[10].addCount();
            }
            else if(compare == 11)
            {
                dps[11].addCount();
            }
        }

    	int sum = dps[0].getCount() + dps[1].getCount() + 
			dps[2].getCount() + dps[3].getCount() + 
			dps[4].getCount() + dps[5].getCount() + 
			dps[6].getCount() + dps[7].getCount() + 
			dps[8].getCount() + dps[9].getCount() + 
			dps[10].getCount() + dps[11].getCount();

	BubbleSort.bubbleSort(dps);

	for(int i = 0; i < dps.length; i++)
	{
		System.out.println(dps[i].toString());
	}        
	System.out.println("Total count: " + sum);


    }

    public static int roll()
    {
        int min = 0;
        int max = 12;
        int range = max - min;

        int randomNum = (int)(Math.random() * range) + min;

        return randomNum;
    }
}
