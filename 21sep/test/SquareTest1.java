import Shapes.Square;
import org.junit.*;
import static org.junit.Assert.*;

public class SquareTest1 {

    private Square square;
    private double size = 5;


    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before SquareTest");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After SquareTest");
    }

    @Before
    public void initTest() {
        square = new Square(size);
    }

    @After
    public void afterTest() {
        square = null;
    }

    @Test
    public void calcSquare() throws Exception{
        assertEquals(25.0, square.area(), 0.1);
    }
}