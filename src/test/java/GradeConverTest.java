import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GradeConverTest {

        private GradeConverTer converter;

        public GradeConverTest() {
        }

        @Before
        public void setUp() throws Exception {
            this.converter = new GradeConverTer();
        }

        @Test
        public void testConvert1() {
            String expected = "A";
            String actual = this.converter.convert(100);
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testConvert2() {
            String expected = "A";
            String actual = this.converter.convert(90);
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testConvert3() {
        String expected = "B";
        String actual = this.converter.convert(80);
        Assert.assertEquals(expected, actual);
      }



}
