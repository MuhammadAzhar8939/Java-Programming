/*
 * class Calculator
 * float first
 * float second
 * float result
 * //
 * float add(float float)
 * float subtract(float float) 
 */
/*
 * class Child
 * float multiply()
 */
class Calculator {
    float first, second, result;
    Calculator(float a, float b) {
        this.first = a;
        this.second = b;
    }
    float add() {
        result = first + second;
        return result;
    }
    float subtract() {
        result = first - second;
        return result;
    }
}
public class Child3 extends Calculator {
    Child3(float a, float b) {
        super(a, b);
    }
    float multiply() {
        result = first * second;
        return result;
    }
    public static void main(String[] args) throws Exception {
        Child3 object = new Child3(10, 5);
        float addResult = object.add();
        float subtractResult = object.subtract();
        float multiplyResult = object.multiply();
        System.out.println("Addition result is : " + addResult);
        System.out.println("Subtraction result is : " + subtractResult);
        System.out.println("Multiplication result is : " + multiplyResult);
    }
}
// now question is if we do not use abstract class and use initilize first and
// second variable using constructor still why we need to use parameter in add
// and subtract method?
