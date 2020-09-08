/*
*	Author: Patrick Gunawan
*	Github: woruya
*	Twitter: twitter.com/notworu
*
*	c: This program was written in First Year Comp Sci degree.
*	It has been altered to work with Objects, instead of the
*	typical number or letter comparison.
*/


public class BubbleSort
{
    //bubbleSort
    public static DPSClass[] bubbleSort(DPSClass[] dps)
    {
          int pass = 0;
          boolean sorted = false;
          while(!sorted)
          {
              sorted = true;
              for(int i = 0; i < dps.length-1; i++)
              {
                if(dps[i].getCount() < dps[i +1].getCount())
                {
			String tempName = dps[i].getClassName();
			int tempCount = dps[i].getCount();
			
			dps[i].setClassName(dps[i+1].getClassName());
			dps[i].setCount(dps[i+1].getCount());

			dps[i+1].setClassName(tempName);
			dps[i+1].setCount(tempCount);
                  	sorted = false;
                }
              }
              pass++;
          }
          return dps;
      }
}
