// Amanda Jeong, Libby Carter
// Part 1 Driver 1

public class HistogramDriver1
{
	public static void main(String[] args)
	{
		Histogram h = new Histogram(5);
		h.submit(1); h.submit(1);
		h.submit(1); h.submit(30);
		h.submit(3); h.submit(5);
		System.out.println(h);
	}
}