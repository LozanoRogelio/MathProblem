package MathProblem;

public class Math {

    public static String mathOperations(Integer num1, Integer num2, Integer num3) {
        if (num1+num2==num3) {
            return num1 + " + " + num2 + " = " + num3;
        }
        if (num1-num2==num3) {
            return num1 + " - " + num2 + " = " + num3;
        }
        if (num1*num2==num3) {
            return num1 + " * " + num2 + " = " + num3;
        }
        if (num2 != 0 && num1 / num2 ==num3) {
            return num1 + " / " + num2 + " = " + num3;
        }
        return "None";
    }

    public static void main(String[] args) {
        Integer num1 = 20;
        Integer num2 = 5;
        Integer num3 = 100;

        System.out.println(mathOperations(num1,num2,num3));
    }

}
