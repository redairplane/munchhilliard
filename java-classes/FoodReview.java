import java.time.LocalDate;

/**
  describe this class
*/
public class FoodReview
{
    // declare private instance vars
    private Restaurant restaurant;
    private double reviewScore;
    private String reviewTitle;
    private String reviewBody;
    private User user;
    private LocalDate timestamp;
    private int numUsefulLikes; // similar to Like button, but says "Useful"
    private int numFunnyLikes; // similar to Like button, but says "Funny"
    private int numCoolLikes; // similar to Like button, but says "Cool"
    private int numDislikes; // similar to Like button, but says "Dislike"

    /**
      describe this constructor
      @param
      @param
      @param
      @param
      @param
    */
    public FoodReview(Restaurant _restaurant, double _reviewScore, String _reviewTitle, String _reviewBody, User _user)
    {
        numUsefulLikes = 0; // defaults to 0
        numFunnyLikes = 0; // defaults to 0
        numCoolLikes = 0; // defaults to 0
        numDislikes = 0; // defaults to 0
        // set instance var values using parameters
        // TO DO
    }

    // accessors and mutators here
  
    /**
      returns the number of useful likes on the review
      @return numUsefulLikes which is hoe many useful likes on the review
    */ 
    public int getNumUsefulLikes()
    {
      return numUsefulLikes;
    }
  
    /**
      returns the number of funny likes
      @return int numOfFunnyLikes - the amount of times the review was marked as funny
    */  
    public getFunnyLikes()
    {
      return numFunnyLikes;
    }
    
    /**
      retuns the number of cool likes
      @return number of cool likes
    */
    public int getNumCoolLikes()
    {
      return numCoolLikes; 
    }

    /**
      retuns the number of dislikes
      @return number of dislikes
    */
    public int getNumDislikes()
    {
      return numDislikes;
    }

    /**
      returns the date that the review was posted
      @return LocalDate object timestamp which is the date that the review was posted
    */
    public LocalDate getTimestamp()
    {
      return timestamp;
    }

  

}
