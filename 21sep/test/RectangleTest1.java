import Shapes.Rectangle;
import org.junit.*;

import static org.junit.Assert.*;

public class RectangleTest1 {

    private Rectangle rectangle;
    private double height = 5.0;
    private double width = 10.0;


    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before RectangleTest");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After RectangleTest");
    }

    @Before
    public void initTest() {
        rectangle = new Rectangle(height,width);
    }

    @After
    public void afterTest() {
        rectangle = null;
    }

    @Test
    public void calcSquare() throws Exception{
        assertEquals(50.0, rectangle.area(), 0.1);
    }

}