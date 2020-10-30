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
    private String dishOfTheDay;
    /**
      describe this constructor
    */
    public Restaurant(String _name)
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = _name;
      dishOfTheDay = "Unknown";
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
    setDishOfTheDay(Sring _dishOfTheDay)
    Sets the dish of the day
    */
    public void setDishOfTheDay(String _dishOfTheDay){
      dishOfTheDay = _dishOfTheDay;
    }
  
    /**
    getDishOfTheDay()
    Accesses the dish of the day
    */
    public String getDishOfTheDay(){
      return dishOfTheDay;
    }
}
