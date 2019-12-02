import java.util.Random;

public class Die
{
  private int faceValue;
  private Random rand;
  
  private final int NUMSIDES = 6;
  
  public Die ( )
  {
    faceValue = 1;
    rand = new Random();
  }

  public void roll()
  {
    faceValue = rand.nextInt(NUMSIDES) + 1;
  }

  public int value()
  { 
    return faceValue;
  }

  public String toString()
  {
    return "The value is " + faceValue;
  }
 
}
