package test_and_refactor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// JUnit 을 활용하여 해당 클래스가 가지는 전체 메서드를 한번에 실행할 수도 있고
// 각각 테스트 메서드를 독립적으로 실행할 수 있음 --> 다른 메서드에 영향 받지 않고 내가 현재 구현하는 프로덕션 코드에 집중 가능
public class JUnit4CalculatorTest {

    // 실행 결과를 눈으로 직접 확인해야 하는 문제를 해결하기 위해 JUnit 에서 제공하는 assertEquals() 메서드 활용
    @Test
    public void add() {
        Calculator cal = new Calculator();
        assertEquals(9, cal.add(6, 3));
    }

    @Test
    public void subtract() {
        Calculator cal = new Calculator();
        assertEquals(3, cal.subtract(6, 3));
    }

    @Test
    public void multiply() {
        Calculator cal = new Calculator();
        assertEquals(18, cal.multiply(6, 3));
    }

    @Test
    public void divide() {
        Calculator cal = new Calculator();
        assertEquals(2, cal.divide(6, 3));
    }
}