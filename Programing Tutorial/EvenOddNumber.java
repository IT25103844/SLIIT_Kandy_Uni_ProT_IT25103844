class EvenOddNumber {

    
    boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true;   
        } else {
            return false;  
        }
    }
}

class Demo {
    public static void main(String[] args) {

        EvenOddNumber obj = new EvenOddNumber();

        int number = 7;

        if (obj.findEvenOrOdd(number)) {
            System.out.println(number + " is an Even number");
        } else {
            System.out.println(number + " is an Odd number");
        }
    }
}