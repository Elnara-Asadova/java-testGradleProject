import org.testng.annotations.*;

public class SimpleClassTest {
    @BeforeClass
    public void setupSimpleClassTest() {
        System.out.println("setupSimpleClassTest");
    }

    @BeforeMethod
    public void setupTestMethod() {
        System.out.println("setupTestMethod");
    }

    @AfterClass
    public void teardownSimpleClassTest() {
        System.out.println("teardownSimpleClassTest");
    }

    @AfterMethod
    public void teardownTestMethod() {
        System.out.println("teardownTestMethod");
    }

    @Test
    public void theOneTest() {
        System.out.println("theOneTest");
    }

    @Test
    public void theAnotherTest() {
        System.out.println("theAnotherTest");
    }

}