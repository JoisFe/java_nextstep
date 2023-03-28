package test_and_refactor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RefactoringJunit4CalculatorTest {

    // JUnit4CalculatorTest.java 에서 중복코드 리팩토링
    private Calculator cal;

    // @Before 를 활용하여 매 단위테스트 마다 인스턴스 생성 (그냥 필드로 두었어도 매 단위테스트 마다 인스턴스 생성)
    // 그냥 필드로 두지 않고 굳이 @Before 를 사용한 이유로는 @RunWith, @Rule 과 같은 어노테이션 사용해 기능 확장 가능
    // @Before, @After 를 이용하여 초기화, 후처리 작업을 하여 각 테스트간 영향을 끼치지 않도록 독립적인 실행 가능하도록 지원
    @Before
    public void setup() {
        cal = new Calculator();
    }
    @Test
    public void add() {
        assertEquals(9, cal.add(6, 3));
    }

    @Test
    public void subtract() {
        assertEquals(3, cal.subtract(6, 3));
    }

    @Test
    public void multiply() {
        assertEquals(18, cal.multiply(6, 3));
    }

    @Test
    public void divide() {
        assertEquals(2, cal.divide(6, 3));
    }
}
