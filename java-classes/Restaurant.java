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
      // add more
    private int numOfMenuItems;

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
        numOfMenuItems = 0;
    }

    // accessors and mutators here
  
    /**
      Sets the number of items on the resturant's menu
      @param int _numOfMenuItems the number of menu items
    */
    public void setNumOfMenuItems(int _numOfMenuItems){
      numOfMenuItems = _numOfMenuItems;
    }
  
     /**
      Gets the number of items on the resturant's menu
      @return numOfMenuItems the number of menu items
    */
    public int getNumOfMenuItems(){
      return numOfMenuItems;
    }
  
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

  
}
