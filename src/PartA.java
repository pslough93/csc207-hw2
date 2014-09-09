public class PartA
{
  /**
   * Determine if a  is a multiple of b
   */
  public static boolean isMultiple(long a, long b)
  {
    //if a/b is an integer, then a is a multiple of b
    return ((double) a / (double) b) % 1 == 0;
  } //isMultiple(long a, long b)

  /**
   * Determine if i is odd
   */
  public static boolean isOdd(int i)
  {
    //if i is odd, its ones bit will be 1, so i%1 must equal 1
    return (i & 1) == 1;
  } //isOdd(int i)

  /**
   * Returns sum of odd integers below n
   */
  public static int oddSumTo(int n)
  {
    int sum = 0; //Initialize sum
    for (int i = 1; i < n; i += 2)
      //loop i to n incrementing by 2
      sum += i; // add i to sum
    return sum;
  } //oddSumTo(int n)

  /**
   * Determines if a pair of numbers in the array will make an odd product
   */
  public static boolean isOddProd(int[] ints)
  {
    //If the array has 2 or more odd numbers, there exists at
    //least one pair that will make an odd product (odd x odd = odd)
    int odds = 0; //counter for odd #'s
    for (int i = 0; i < ints.length; i++)
      if (ints[i] % 2 == 1) //tests if each number is odd
        odds++;
    if (odds >= 2)
      return true; //true if 2 or more odds
    else
      return false; //false otherwise
  } //isOddProd

  /**
   * Determines if array elements are all distinct
   */
  public static boolean allDistinct(int[] arr)
  {
    if (arr.length == 0)
      return false;
    else
      {
        for (int i = 0; i < arr.length; i++)
          {
            //starts at i
            for (int j = i + 1; j < arr.length; j++)
              {
                //compares each number
                //beyond i to i to see if they are equal
                if (arr[j] == arr[i])
                  {
                    return false;
                  }
              }
          } //returns false if any element is equal
        return true;
      }//returns true if there are no matches
  } //allDistinct

  /**
   *Reverses an array of integers 
   */
  public static int[] reverseInts(int[] arr)
  {
    int temp;
    int mid = arr.length / 2;
    for (int i = 0; i < mid; i++)
      { //for everything up to the midpoint
        temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp; //swap array element i and length - i
      } //swapping for loop
    return arr;
  } //reverse ints        
} //class PartA