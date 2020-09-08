/*
*	Author: Patrick Gunawan
*	Github: woruya
*	Twitter: twitter.com/notworu
*
*	c: Every class has a dps spec, but not every class
*	have a tanking spec and/or a healing spec.
*/

public class DPSClass
{
	private String className;
	private int count;

	public DPSClass()
	{
		className = "";
		count = 0;
	}

	public String getClassName()
	{
		return className;
	}

	public int getCount()
	{
		return count;
	}

	public void setClassName(String inClassName)
	{
		className = inClassName;
	}

	public void setCount(int inCount)
	{
		count = inCount;
	}

	public void addCount()
	{
		count++;
	}

	public String toString()
	{
		return getClassName() + ": " + getCount();
	}
}

