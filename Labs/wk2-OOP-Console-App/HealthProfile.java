public class HealthProfile 
{
    // attributes
    private String name;
    private int age;
    private double weight;
    private double height; // inches

    // constructors
    public HealthProfile()
    {
        name = "N/A";
        age = 0;
        weight = 0.0; // double result = 9/10; // 0.0
        height = 0.0;
    }

    public HealthProfile( String name, int age, double weight,
        int feet, double inches)
    {
        setName(name);
        setAge(age);
        setWeight(weight);
        setHeight(feet, inches);
    }

    // behaviors
    public double calculateBMI()
    {
        //double bmi = (weight * 703 ) / (Math.pow(height, 2) );
        //return bmi;

        return (weight * 703 ) / (Math.pow(height, 2) );
    }

    public String calculateCategory()
    {
        double bmi = calculateBMI();

        if ( bmi < 18.5 )
            return "Underweight";
        else if ( bmi < 25 )
            return "Normal";
        else if ( bmi < 30 )
            return "Overweight";
        else
            return "Obese";
    }

    public int calculateMaxHR()
    {
        return 220 - age;
    }

    // getters and setters (get methods and set methods)
    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age )
    {
        this.age = age;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight( double weight )
    {
        this.weight = weight;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight( int feet, double inches )
    {
        this.height = (feet * 12) + inches;
    }
    
}
