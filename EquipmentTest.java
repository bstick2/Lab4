
public class EquipmentTest {
	/**
     * Test the Equipment constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
   
        // Use the default constructor
        Equipment eq = new Equipment("knife/5,2.5,20.0,just a normal knife");

      
        Assert.assertEquals("knife", eq.getName());
        Assert.assertEquals(5, eq.getCount());
        Assert.assertEquals(2.5, eq.getTotalWeight());
        Assert.assertEquals(20.0, eq.getTotalPrice());
        Assert.assertEquals("just a normal knife", eq.getDescription());
    }
    
    public void getterTests() throws AssertException
    {
    	Equipment eq = new Equipment("knife/5,2.5,20.0,just a normal knife");
    	
    	String expectedName = "knife";
    	int expectedCount = 5;
    	double expectedWeight = 2.5;
    	double expectedPrice = 20.0;
    	String expectedDescription = "just a normal knife";
    	String actualName = eq.getName();
    	int actualCount = eq.getCount();
    	double actualWeight = eq.getTotalWeight();
    	double actualPrice = eq.getTotalPrice();
    	String actualDescription = eq.getDescription();
    	
    	Assert.assertEquals(expectedName, actualName);
    	Assert.assertEquals(expectedCount, actualCount);
    	Assert.assertEquals(expectedWeight, actualWeight);
    	Assert.assertEquals(expectedPrice, actualPrice);
    	Assert.assertEquals(expectedDescription, actualDescription);
    }
    
    public void toStringTest() throws AssertException
    {
    	Equipment eq = new Equipment("knife/5,2.5,20.0,just a normal knife");
    	String expected = "Name: knife, Number: 5, Weight: 2.50 lbs, Price: $20.00 - just a normal knife";
    	String actual = eq.toString();
    	
    	Assert.assertEquals(expected, actual);
    }

    
}
