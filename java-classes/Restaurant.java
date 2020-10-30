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
    private String typeOfFood;

    /**
      describe this constructor
    */
    public Restaurant(String _name)
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = _name;
      
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
    }

    /**
      describe each method
    */
    public double getAverageReview()
    {
      // needs completed
      return reviewScoreTotal/reviewCount;
    }
}
