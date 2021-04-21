import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = { "mainGroup" })
public class SeveralTestGroups {
    @BeforeGroups("groupTest")
    public void setupGroupTest() {
        System.out.println("setupGroupTest");
    }

    @AfterGroups("groupTest")
    public void teardownGroupOne() {
        System.out.println("teardownGroupOne");
    }

    @Test(groups = "toExclude")
    public void excludedTest(){
        System.out.println("Excluded Test");
    }

    @Test(groups = "groupTest")
    public void groupTestOne(){
        System.out.println("groupTestOne");
    }

    @Test(groups = "dependency")
    public void groupDependencyTest(){
        System.out.println("groupDependency test which should be run before groupTest");
    }
}
