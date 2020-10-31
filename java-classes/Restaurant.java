/**
  describe this class
*/
public class Restaurant
{
    // declare private instance vars
    private int reviewCount;
    private double reviewScoreTotal;
    private String name;
    private String typeOfFood;
    private int totalCustomers;
    private int starRating;
    private String address;
    private String location;
      // add more


    /**
      describe this constructor
    */
    public Restaurant(String _name)
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        this.name = _name;
        this.totalCustomers = 0;
        starRating = 0;
        location = "Not listed";

    }

    // accessors and mutators here
  

    /**
      Returns the type of food in the restaurant
      @return typeOfFood which is the type of food in the restaurant
    */
    public String getTypeOfFood()
    {
      return typeOfFood;
    }
  
    /**
      Sets the type of food in the restaurant
      @param _typeOfFood the type of food in the restaurant
    */
    public void setTypeOfFood(String _typeOfFood)
    {
      typeOfFood = _typeOfFood;

  
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
      getTotalCustomers()
      Gets the total customers and returns.
      @return  the total number of customers.
    */

    public int getTotalCustomers()
    {
      return totalCustomers;
    }
    /**
      getTotalCustomers()
      Sets the total customers.
      @param _totalCustomers Sets the total number of customers.
    */
    public void setTotalCustomers(int _totalCustomers){
      this.totalCustomers = _totalCustomers;

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

