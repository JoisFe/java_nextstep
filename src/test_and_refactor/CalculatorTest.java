package test_and_refactor;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        // main() 메서드 하나에서 프로덕션 코드의 여러 메서드를 동시에 테스트 하는 문제점
        // 따라서 테스트 코드를 각 메서드별로 분리
        add(cal);
        subtract(cal);
        multiply(cal);
        divide(cal);
    }

    private static void divide(Calculator cal) {
        System.out.println(cal.divide(9, 3));
    }

    private static void multiply(Calculator cal) {
        System.out.println(cal.multiply(9, 3));
    }

    private static void subtract(Calculator cal) {
        System.out.println(cal.subtract(9, 3));

    }

    private static void add(Calculator cal) {
        System.out.println(cal.add(9, 3));
    }
}