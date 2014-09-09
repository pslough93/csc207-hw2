public class PartD
{
  public static String nameGame(String name)
  {
    int i; //stores index of first vowel
    for (i = 0; i < name.length(); i++) //searches through characters in name
      {
        char letter = name.charAt(i);
        if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E'
            || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O'
            || letter == 'u' || letter == 'U' || letter == 'y' || letter == 'Y')
          break; //stops at first vowel found
      }//for loop
    if (i == name.length()) //error message if no vowels
      {
        return "No vowels in this name";
      }//if statement
    else
      {
        String namePart = name.substring(i); //Takes substring of name 
        //starting at first vowel
        String rhyme = name + "!\n"; // rhyme is formed
        rhyme +=
            (name + ", " + name + " bo B" + namePart + " Bonana fanna fo F"
             + namePart + "\n");
        rhyme += ("Fee fy mo M" + namePart + ", " + name + "!\n");
        return rhyme; //returns the rhyme
      }//else statement
  }//nameGame(String name)

  public static void main(String args[])
  {
    String test1 = nameGame("nmjk");
    String test2 = nameGame("Patrick");
    String test3 = nameGame("Albert");
    String test4 = nameGame("Larry");
    System.out.println(test1);
    System.out.println(test2);
    System.out.println(test3);
    System.out.println(test4);
  }//main function
}// PartD class

/* 
 Output of main Function:
 No vowels in this name
 Patrick!
 Patrick, Patrick bo Batrick Bonana fanna fo Fatrick
 Fee fy mo Matrick, Patrick!

 Albert!
 Albert, Albert bo BAlbert Bonana fanna fo FAlbert
 Fee fy mo MAlbert, Albert!

 Larry!
 Larry, Larry bo Barry Bonana fanna fo Farry
 Fee fy mo Marry, Larry!
*/
