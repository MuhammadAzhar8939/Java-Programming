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
abstract class Calculator{
    float first=10;
    float second=5;
    float result;
    float add(){
        result=first+second;
        return result;
    }
    float subtract(){
        result=first-second;
        return result;
    }
}
public class Child2 extends Calculator{

    float multiply(){
        result=first*second;
        return result;
    }
    public static void main(String[] args) throws Exception {
        Child2 object=new Child2();

        float addResult=object.add();
        float subtractResult=object.subtract();
        float multiplyResult=object.multiply();
        System.out.println("Addition result is : "+addResult);
        System.out.println("Subtraction result is : "+subtractResult);
        System.out.println("Multiplication result is : "+multiplyResult);
    }
}

//now question is if we already have first and second variable with predefined values then what is the use of parameter and argument?

