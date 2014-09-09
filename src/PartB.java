public class PartB
{
  /**
   * Compute the average of two integers.  Rounds toward zero if the
   * average is not a whole number.
   * 
   * The original function had an addition of left and right which we realized could cause 
   * a memory overflow since if (left + right) was greater than the maximum memory allocated 
   * for an integer.
   * 
   *  We side-stepped this by computing the average in a different way.
   */
  public static int average(int left, int right)
  {
    return (left + (right - left) / 2);
  } // average(int,int)
} // class PartB
