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
    private int totalLikes;
    
    // add more
    private int userAge;
  
    private String userName;

    private String name;


    /**
      describe this constructor
    */
    public User()
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = "none";
        totalLikes = 0;
        userAge = 0;
    }

    // accessors and mutators here

    /**
      describe each method
    */
    public int getTotalLikes(){
      return totalLikes;
    }
  
    public setTotalLikes(_totalLikes){
      totalLikes = _totalLikes;
    }
    /**
    return the users age
    @return userAge which is the users age
    */
    public int getUserAge(){
      return userAge;
    }
    /**
    set the users age
    @param int _userAge
    */ 
    public void setUserAge(int _userAge){
      userAge = _userAge;
    }
  
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
      @param String _userName
    */
    public void setUserName(String _userName)
    {
      userName = _userName
    }

    /**
      setName(String _name)
      Sets the user's name to a string.
      @param _name the name of the user
    */
    public void setName(String _name)
    {
      name = _name;
    }
    
    /**
      getName()
      Accesses the name of the user.
      @return the name of the user
    */
    public String getName()
    {
      return name;
    }
  


}
