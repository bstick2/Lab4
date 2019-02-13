/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0.0, animal.getHeight());
        Assert.assertEquals(0.0, animal.getWeight());
    }

    public void constructorTest() throws AssertException {
    	Animal animal = new Animal("red", "BILLY", 150.3, 72.4);
    	
    	Assert.assertEquals("red", animal.getColor());
    	Assert.assertEquals("BILLY", animal.getName());
    	Assert.assertEquals(150.3, animal.getWeight());
    	Assert.assertEquals(72.4, animal.getHeight());
    	
    }
    
    public void toStringTest() throws AssertException
    {
    	Animal animal = new Animal("red", "BILLY", 150.3, 72.4);
    	
      	String expected = "BILLY, a red-colored animal. 150.3 pounds, 72.4 inches.\n";
    	String actual = animal.toString();
    	
    	Assert.assertEquals(expected, actual);
    	
    }
    
    public void getterTests() throws AssertException
    {
    	Animal animal = new Animal("red", "BILLY", 150.3, 72.4);
    	
    	String expectedName = "BILLY";
    	String expectedColor = "red";
    	Double expectedWeight = 150.3;
    	Double expectedHeight = 72.4;
    	
    	String actualName = animal.getName();
    	String actualColor = animal.getColor();
    	Double actualWeight = animal.getWeight();
    	Double actualHeight = animal.getHeight();
    	
    	Assert.assertEquals(expectedName, actualName);
    	Assert.assertEquals(expectedColor, actualColor);
    	Assert.assertEquals(expectedWeight, actualWeight);
    	Assert.assertEquals(expectedHeight, actualHeight);
    	
    }
}
