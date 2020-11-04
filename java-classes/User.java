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
    private String recentLoginDay;
    private int userAge;
    private String userName;
    private String name;
    private String birthday;
    private String gender;
    private String userEmail;
    private String affiliation;
    // add more

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
        this.recentLoginDay = "";
        userAge = 0;
        userEmail = "none";
        affiliation = "none";

    }

    // accessors and mutators here

    /**
      sets the user's affiliation
      @param _affiliation provides the users affiliation
    */
    public void setAffiliation(_affiliation){
     
      affiliation = _affiliation;
    }
    /**
      gets the user's affiliation
      @return affiliation which is the user's affiliation
     */
    public String getAffiliation(){
      
     return affiliation; 
    }
  
    /**
      sets the users's email
      @param _userEmail provides the user's email
    */
    public void setUserEmail(String _userEmail){
      userEmail = _userEmail;
    }
  
   /**
      returns the users's email
      @return userEmail the user's email
    */
    public String getUserEmail(){
      return userEmail;
    }
  
    /**
      describe each method
    */
   
   
     
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
    set the users gender
    @param String _gender
    */ 
    public void setUserGender(String _gender){
      gender = _gender;
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
      Returns the gender of the user
      @return gender which is the user's gender
    */
    public String userGender();
    {
      return gender;
    }

    /**
      describe each method
    */
    public void setFavRestaurant(Restaurant _restaurant)
    {
      favRestaurant = _restaurant;
    }
  
    /**
      Sets the user's name
      @param String _userName
    */
    public void setUserName(String _userName)
    {
      userName = _userName;
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
      getrecentLoginDay()
      Accesses the last login day of the user.
      @return the last login day of the user.
    */
    public String getrecentLoginDay()
    {
      return recentLoginDay;
    }
  
    /**
      setRecentLoginDay()
      Sets the last login day of the user.
      @param _recentLoginDay last login day of the user.
    */
    public void setRecentLoginDay(String _recentLoginDay){
      this.recentLoginDay = _recentLoginDay;
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
  
    /**
      setUserEmail(String email)
      Sets the user's email
      @param String email which is the user's email
    */
    public void setUserEmail(String email){
      userEmail = email;
    }
    
    /**
      getUserEmail()
      Accesses the user's email
      @return the user's email
    */
    public String getUserEmail(){
      return userEmail;
    }
      
  
  


}
