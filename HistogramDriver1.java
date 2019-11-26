public class HistogramDriver1
{
	public static void main(String[] args)
	{
		Histogram h = new Histogram(4);
		h.submit(1); h.submit(1);
		h.submit(1); h.submit(2);
		h.submit(4); h.submit(4);
		System.out.println(h);
	}
}