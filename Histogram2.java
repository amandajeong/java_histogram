// Amanda Jeong
// advanced Histogram class

public class Histogram2
{
	private int[] num;
	int min, max;
	int weight = 1;
	Boolean flag = false;
	
	Histogram2(int max)
	{
		this.max = max;
		min = 1;
		num = new int[max];
	}
	
	Histogram2(int min, int max)
	{
		this.min = min;
		this.max = max;
		num = new int[max-min+1];
	}
	
	public void submit(int x)
	{
		num[x-min]++;
		if ((!flag) && (num[x-min] > 30)) flag = true;
	}
	
	public String toString()
	{
		String s = "";
		if (flag)
		{
			int largest = num[0];
			for (int i = 1; i < (max-min+1); i++)
				if(largest < num[i]) largest = num[i];
			weight = (int)((largest-1)/30) + 1;
		}
		
		for (int i = 0; i < (max-min+1); i++)
		{
			String stars = "";
			for (int n = 0; n < (int)(num[i]/weight); n++)
				stars += "*";
			s += (i+min) + " " + stars + "\n";
		}
		return s;
	}
}