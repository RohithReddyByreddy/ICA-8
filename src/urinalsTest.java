import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
    obj.openFile("src/urinals.dat");
    Assertions.assertEquals( 3 , obj.inputs.size());
    System.out.println("====== Rohith Reddy == TEST one passed for open file=======");
}

@Test
void testCaseSeven()
{
    obj.writeFile("src/list.dat");
    Assertions.assertEquals( 3, obj.outputs.size());
    System.out.println("====== Rohith Reddy == TEST one passed for write file=======");
}


}
