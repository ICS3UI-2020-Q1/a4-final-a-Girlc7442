import java.util.Scanner;

/**
 * Determines the number of factors the input integer has
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Scanner for user input
    Scanner input = new Scanner(System.in);

    //initializes the users number before the do while statement to avoid an infinite loop
    int userNumber;

    //asks the user for a positive integer until a positive integer is entered
    do{
      System.out.println("Please enter a positive integer to determine its factors:");
      userNumber = input.nextInt();
    }while(userNumber <= 0);
    
    //initializes and starts the count at 0
    int count = 0;
    
    //prints this before the factors are printed
    System.out.println("The factors of " + userNumber + " are:");

    //runs while userNumber is greater than or equal to count
    while(userNumber >= count){
      //increases count by 1
      count = count + 1;
      //if the user number and count divided have n reamainder then displays the number count is on
      if(userNumber % count == 0){
        System.out.println(count);
      }
    }
  }
}
