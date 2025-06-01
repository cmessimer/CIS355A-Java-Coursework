public class Stock
{
    // attributes
    private String companyName;
    private int numberOfShares;
    private double purchasePrice;
    private double currentPrice;

    // constructors
    public Stock()
    {
        companyName = "N/A";
        numberOfShares = 0;
        purchasePrice = 0.0; // double result = 9.0/10;
        currentPrice = 0.0;
    }

    public Stock( String companyName, int numberOfShares, double purchasePrice, double currentPrice)
    {
        setCompanyName( companyName );
        setNumberOfShares( numberOfShares );
        setPurchasePrice (purchasePrice );
        setCurrentPrice ( currentPrice );
    }

    // behaviors here
    public double getProfitLoss()
    {
        return numberOfShares * (currentPrice - purchasePrice);
    }

    @Override
    public String toString()
    {
        return companyName + ": " + numberOfShares + " shares";
    }

    // getters and setters
    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName( String companyName)
    {
        this.companyName = companyName;
    }

    public int getNumberOfShares()
    {
        return numberOfShares;
    }

    public void setNumberOfShares( int numberOfShares)
    {
        this.numberOfShares = numberOfShares;
    }

    public double getPurchasePrice()
    {
        return purchasePrice;
    }

    public void setPurchasePrice( double purchasePrice)
    {
        this.purchasePrice = purchasePrice;
    }

    public double getCurrentPrice()
    {
        return currentPrice;
    }

    public void setCurrentPrice( double currentPrice)
    {
        this.currentPrice = currentPrice;
    }
}
