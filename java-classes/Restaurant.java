/**
  describe this class
*/
public class Restaurant
{
    // declare private instance vars
    private int reviewCount;
    private double reviewScoreTotal;
    private String name;
    private int totalCustomers;
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
  }