/*
 * class Calculator
 * float first
 * float second
 * float result
 * //////////////
 * float add(float float)
 * float subtract(float float) 
 */
/*
 * class Child
 * float multiply()
 */
abstract class Calculator{
    float first;
    float second;
    float result;
    float add(float a,float b){
        result=a+b;
        return result;
    }
    float subtract(float a,float b){
        result=a-b;
        return result;
    }
}
public class Child1 extends Calculator{

    float multiply(float a, float b){
        result=a*b;
        return result;
    }
    public static void main(String[] args) throws Exception {
        Child1 object=new Child1();

        float addResult=object.add(12,15);
        float subtractResult=object.subtract(15,10);
        float multiplyResult=object.multiply(10,15);
        System.out.println("Addition result is : "+addResult);
        System.out.println("Subtraction result is : "+subtractResult);
        System.out.println("Multiplication result is : "+multiplyResult);
    }
}

//now question is why we use first and second variable in abstract without any usage?

