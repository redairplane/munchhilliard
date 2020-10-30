/**
  describe this class
*/
public class Restaurant
{
    // declare private instance vars
    private int reviewCount;
    private double reviewScoreTotal;
    private String name;
    // add more
    private String location;

    /**
      describe this constructor
    */
    public Restaurant(String _name)
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = _name;
        location = "Not listed";
    }

    // accessors and mutators here

    /**
      describe each method
    */
    public double getAverageReview()
    {
      // needs completed
      return reviewScoreTotal/reviewCount;
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
