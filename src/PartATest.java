import static org.junit.Assert.*;

import org.junit.Test;

public class PartATest
{

  @Test
  public void testIsMultiple()
  {
    assertEquals("Positive multiple", true, PartA.isMultiple(9, 3));
    assertEquals("Positive nonmultiple", false, PartA.isMultiple(9, 4));
    assertEquals("negative multiple", true, PartA.isMultiple(-6, 3));
    assertEquals("zero", false, PartA.isMultiple(4, 0));
    assertEquals("other zero", true, PartA.isMultiple(0, 4));
  }

  @Test
  public void testIsOdd()
  {
    assertEquals("test for positive odd", true, PartA.isOdd(9));
    assertEquals("test for zero", false, PartA.isOdd(0));
    assertEquals("Test for positive even", false, PartA.isOdd(8));
    assertEquals("Test for negative even", false, PartA.isOdd(-2));
    assertEquals("Test for negative odd", true, PartA.isOdd(-3));
  }

  @Test
  public void testOddSumTo()
  {
    assertEquals("test for positive odd", 16, PartA.oddSumTo(9));
    assertEquals("test for positive even", 25, PartA.oddSumTo(10));
    assertEquals("test for 0", 0, PartA.oddSumTo(0));
    assertEquals("test for negative even", 0, PartA.oddSumTo(-2));
  }

  @Test
  public void testIsOddProd()
  {
    int[] test1 = {};
    int[] test2 = { 1 };
    int[] test3 = { 1, 2 };
    int[] test4 = { 1, 3 };
    int[] test5 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[] test6 = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };
    assertEquals("test for empty array", false, PartA.isOddProd(test1));
    assertEquals("test for singleton array", false, PartA.isOddProd(test2));
    assertEquals("test for array with one odd one even", false,
                 PartA.isOddProd(test3));
    assertEquals("test for array with two odds", true, PartA.isOddProd(test4));
    assertEquals("test for long array with several evens and odds", true,
                 PartA.isOddProd(test5));
    assertEquals("test for long array negative odds and evens", true,
                 PartA.isOddProd(test6));
  }

  @Test
  public void testAllDistinct()
  {
    int[] test1 = {};
    int[] test2 = { 1 };
    int[] test3 = { 1, 2 };
    int[] test4 = { 1, 3, 1 };
    int[] test5 = { 1, 2, 1, 2, 1, 2, 1 };
    int[] test6 = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 };
    assertEquals("test for empty array", false, PartA.allDistinct(test1));
    assertEquals("test for empty array", true, PartA.allDistinct(test2));
    assertEquals("test for empty array", true, PartA.allDistinct(test3));
    assertEquals("test for empty array", false, PartA.allDistinct(test4));
    assertEquals("test for empty array", false, PartA.allDistinct(test5));
    assertEquals("test for empty array", true, PartA.allDistinct(test6));

  }

  @Test
  public void testReverseInts()
  {
    assertArrayEquals(new int[] {}, PartA.reverseInts(new int[] {}));
    assertArrayEquals(new int[] { 1 }, PartA.reverseInts(new int[] { 1 }));
    assertArrayEquals(new int[] { 1, 2 }, PartA.reverseInts(new int[] { 2, 1 }));
    assertArrayEquals(new int[] { 1, 2, 3 },
                      PartA.reverseInts(new int[] { 3, 2, 1 }));
    assertArrayEquals(new int[] { 1, 2, 3, 4 },
                      PartA.reverseInts(new int[] { 4, 3, 2, 1 }));
    assertArrayEquals(new int[] { 1, 2, 3, 4, 5 },
                      PartA.reverseInts(new int[] { 5, 4, 3, 2, 1 }));

  }

}
