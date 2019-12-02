// Amanda Jeong, Libby Carter
// Part 2 Driver 1
// Utilizes Die.java from class webite

public class Dice
{
	public static void main(String[] args)
	{
		Histogram2 h = new Histogram2(2,12);
		Die d1 = new Die();
		Die d2 = new Die();
		
		int sum;
		
		for (int i=0; i<100000; i++)
		{
			d1.roll();
			d2.roll();
			
			sum = d1.value() + d2.value();
			
			h.submit(sum);
		}
		
		System.out.println(h);
	}
}