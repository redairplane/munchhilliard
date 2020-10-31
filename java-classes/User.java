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
    private int userAge;
    
    // add more
    private int userAge;
  
    private String userName;

    private String name;
    
    private String birthday;
  
    private String reviewDate;

    /**
      describe this constructor
    */
    public User()
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = "none";
      birthday = "Unknown";
        totalLikes = 0;
        userAge = 0;
        reviewDate = "none"
    }

    // accessors and mutators here

    /**
      describe each method
    */
   
    /**
    sets the date that the review was posted
    @param String _reviewDate
    */
    public void setReviewDate(String _reviewDate){
  
      reviewDate = _reviewDate;
    }
  
    /**
    gets the date that the review was posted
    @return reviewDate which is the date that the review was posted
    */
    public String getReviewDate(){
     
      return reviewDate;
    }
     
    //returns the total number of likes
    public int getTotalLikes(){
      return totalLikes;
    }
    //sets the number of total likes
  //@param int _totalLikes
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
      Returns the age of the user
      @return userAge which is the user's age
    */
    public String getUserAge();
    {
      return userAge;
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
      Sets the age of the user
      @param int _age
    */
    public void setUserAge(int _age)
    {
      userAge = _age;
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
  
    /**
      setBirthday(String _birthday)
      Sets the user's birthday
    */
    public void setBirthday(String _birthday){
      bithday =  _birthday;
    }
    /**
    getBirthday()
    Accesses the user's birthday
    @return the user's birthday
    */
    public String getBirthday(){
      return birthday;
    }
  


}
