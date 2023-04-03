package Testing_With_JUnit4;

import org.junit.*;

public class JUnitAnnotationTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }
    @Before
    public void before() {
        System.out.println("before");
    }
    @After
    public void after() {
        System.out.println("after");
    }
    @Test
    public void test() {
        System.out.println("test");
    }
    @Ignore
    public void ignoreTest() {
        System.out.println("ignore test");
    }
}


