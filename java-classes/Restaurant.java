/**
  describe this class
*/
public class Restaurant
{
    // declare private instance vars
    private int reviewCount;
    private double reviewScoreTotal;
    private String name;
    private int starRating;
    private String address;
    private String location;
    private String typeOfFood;
      // add more

    /**
      describe this constructor
    */
    public Restaurant(String _name)
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = _name;
        starRating = 0;
        location = "Not listed";
        typeOfFood = "";
    }

    // accessors and mutators here
  
  
  /**
      Sets the resturant's address
      @param String _address
    */
    public void setAddress(String _address){
      address = _address;
    }
  
     /**
      Returns the resturant's address
      @return String address which is the address of the resturant
    */
  
    public String getAddress(){
      return address;
    }

    /**
      describe each method
    */
    public double getAverageReview()
    {
      // needs completed
      return reviewScoreTotal/reviewCount;
    }

  
    /**
    return the star rating
    @return starRating
    */
    public int getStarRating(){
      return starRating;
    }
    
    /** 
    set the star rating
    @param starRating
    *// 
    public void setStarRating(int _starRating){
      starRating = _starRating;
    }
      

    
    /**
      setLocation(String _location)
      Assigns a specific location to the restaurant.
      @param _location the location of the restaurant
    */
    public void setLocation(String _location)
    {
      location = _location;
    }
    
    /**
      getLocation()
      Returns the location of the restaurant.
      @return the location of the restaurant
    */
    public String getLocation()
    {
      return location;
    }
  
    /**
      setTypeOfFood(String foodType)
      Sets the type of food that the restaurant serves
      @param String foodType the type of food the restaurant serves
    */
    public void setTypeOfFood(String foodType){
      typeOfFood = foodType;
    }
  
    /**
      getTypeOfFood()
      Accesses and returns the type of food the restaurant serves
      @return typeOfFood the type of food the restaurant serves
    */
    public String getTypeOfFood(){
      return typeOfFood;
    }

  
}
