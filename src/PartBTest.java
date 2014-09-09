import static org.junit.Assert.*;

import org.junit.Test;

public class PartBTest
{

  @Test
  public void testAverage()
  {
    assertEquals("Test for average", Integer.MAX_VALUE,
                 PartB.average(Integer.MAX_VALUE, Integer.MAX_VALUE));
  }
}
