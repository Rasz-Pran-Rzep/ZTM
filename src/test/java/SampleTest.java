import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @Test
    void test1(){
        int x = 5;
        int y = 5;
        assert x == y;
    }

    @Test
    void test4(){
        Calculator cal = new Calculator();
        int y = cal.power(5);
        assert y == 12;
    }

    @Test
    void test5(){
        Calculator cal = new Calculator();
        int y = cal.power(3);
        assert y != 10;
    }
}
