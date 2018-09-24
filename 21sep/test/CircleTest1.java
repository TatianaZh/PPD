

import Shapes.Circle;
import org.junit.*;
import static org.junit.Assert.*;

    public class CircleTest1 {

        private Circle circle;
        private double radius = 5;

        @BeforeClass
        public static void beforeClass() {
            System.out.println("Before CircleTest");
        }

        @AfterClass
        public  static void afterClass() {
            System.out.println("After CircleTest");
        }

        @Before
        public void initTest() {
            circle = new Circle(radius);
        }

        @After
        public void afterTest() {
            circle = null;
        }

        @Test
        public void area() throws Exception{
            assertEquals(78.539, circle.area(), 0.1);
        }
    }

