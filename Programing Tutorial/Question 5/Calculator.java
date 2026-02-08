class Calculator {

    
    int add(int a, int b) {
        return a + b;
    }

    
    int multiply(int a, int b) {
        return a * b;
    }

    
    int square(int a) {
        return a * a;
    }
}

class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

       
        int sum1 = cal.add(cal.add(3, 4), 57);
        int result1 = cal.square(sum1);

        
        int sum2a = cal.add(4, 7);
        int sum2b = cal.add(8, 3);
        int result2 = cal.add(cal.square(sum2a), cal.square(sum2b));

        
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}