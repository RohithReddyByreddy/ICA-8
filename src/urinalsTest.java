import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class urinalsTest {
urinals obj=new urinals();

@Test
void testCaseOne()
{
    Assertions.assertEquals( true , obj.goodString("0010"));
    System.out.println("====== Rohith Reddy == TEST one passed for goodString=======");
}
@Test
void testCaseTwo()
{
    Assertions.assertEquals( false , obj.goodString("011000"));
    System.out.println("====== Rohith Reddy == TEST two passed for goodString=======");
}
@Test
void testCaseThree()
{
    Assertions.assertEquals( 1 , obj.countUrinals("100001"));
    System.out.println("====== Rohith Reddy == TEST one passed for count Urinals=======");
}

@Test
void testCaseFour()
{
    Assertions.assertEquals( 2 , obj.countUrinals("10000"));
    System.out.println("====== Rohith Reddy == TEST two passed for count Urinals=======");
}
@Test
void testCaseFive()
{
    Assertions.assertEquals( -1 , obj.countUrinals("110001"));
    System.out.println("====== Rohith Reddy == TEST three passed for count Urinals=======");
}

@Test
void testCaseSix()
{
    obj.openFile("urinals.dat");
    Assertions.assertEquals( 4 , obj.inputs.size());
    System.out.println("====== Rohith Reddy == TEST one passed for open file=======");
}

@Test
void testCaseSeven()
{
    obj.openFile("urinals.dat");
    obj.writeFile("src/rule.txt");
    Assertions.assertEquals( obj.inputs.size(), obj.outputs.size());
    System.out.println("====== Rohith Reddy == TEST one passed for write file=======");
}

@Test
void TestFileNotFoundExecption()
{
    RuntimeException thrown = assertThrows(
            RuntimeException.class,
            () -> obj.openFile("urinalsdgysuas.dat"),
            "throw error"
    );
}
    @Test
    void TestIOExecption()
    {
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> obj.openFile("urinalsdgysuas.dat"),
                "throw error"
        );
    }

    @Test
    void EmptyFileTest()
    {
        Assertions.assertEquals( 0,obj.inputs.size());
        System.out.println("Rohith Reddy Byreddy --- File has 0 inputs");
    }
    @Test
    void TestIOExecptionWrite()
    {
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> obj.writeFile("src/rule3332.txt"),
                "throw error"
        );
    }




}
