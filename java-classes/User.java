import java.util.Random;

/**
  describe this class
*/
public class User
{
    // declare private instance vars
    private Restaurant favRestaurant;
    private FoodReview lastReview;
    private int reviewCount;
    private double reviewScoreTotal;
    // add more
    private String userName;

    /**
      describe this constructor
    */
    public User()
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
    }

    // accessors and mutators here

    /**
      describe each method
    */
    public double getAverageReview()
    {
      // needs completed
      return 0.0;
    }
  
    /**
      Returns the user name
      @return userName which is the user's name
    */
    public String getUserName()
    {
      return userName;
    }

    /**
      describe each method
    */
    public void setFavRestaurant(Restaurant _restaurant)
    {
      restaurant = _restaurant;
    }
  
    /**
      Sets the user's name
    */
    public void setUserName(_userName)
    {
      userName = _userName
    }

}
