
public class ZooTest {
	/**
     * Test the empty Animal constructor and the getters
     */
    public void constructorTest() throws AssertException
    {
        // Use the default constructor
    	Zoo myZoo = new Zoo(2);
    	
    	Assert.assertEquals(2, myZoo.getCapacity());
    }
    
    public void toStringTest () throws AssertException
    {
    	
    }

  
}
