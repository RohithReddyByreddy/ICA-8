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
    Assertions.assertEquals( 1 , obj.countUrinals("0010"));
    System.out.println("====== Rohith Reddy == TEST one passed for countY=Urinals=======");
}


}
