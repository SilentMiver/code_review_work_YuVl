public class Calculator {
    public int add(int a, int b){
        return (a + b);
    }

    public int diff(int a, int b){
        return (a - b);
    }

    public int div(int a, int b){
        if (b != 0) {
            return (a / b);
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public int times(int a, int b){
        return (a * b);
    }

    public int solver(int a, int b, int c){
        return sum(times(b, c), a);
    }
}

