
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
    @Parameters({"p1", "p2"})
    @Test
    public void testParameterData(String p1, String p2) {
        System.out.println(String.format("Parameterized test with parameters: %s / %s", p1, p2));
    }

    @DataProvider(name = "TestDataProvider")
    public Object[][] createData() {
        return new Object[][]{
                {"Homework", "is done."},
                {"Task", "is implemented."},
        };
    }

    @Test(dataProvider = "TestDataProvider")
    public void verifyData(String n1, String n2) {
        System.out.println(n1 + " " + n2);
    }
}
