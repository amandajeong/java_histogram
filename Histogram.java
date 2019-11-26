// Amanda Jeong
// Histogram class

public class Histogram
{
	private int[] num;
	int max;
	
	Histogram(int max)
	{
		this.max = max;
		num = new int[max];
	}
	
	public void submit(int x)
	{
		num[x-1] ++;
	}
	
	public String toString()
	{
		String s = "";
		for (int i = 0; i < max; i++)
		{
			String stars = "";
			for (int n = 0; n < num[i]; n++)
				stars += "*";
			s += (i+1) + " " + stars + "\n";
		}
		return s;
	}
}