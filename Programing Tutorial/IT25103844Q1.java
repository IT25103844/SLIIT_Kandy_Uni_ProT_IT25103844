public class IT25103844Q1 {
    public static void main(String[] args) {

        
        int miles;
        int yards;
        double kilometers;

        
        miles = 26;
        yards = 385;

        
        kilometers = (miles + yards / 1760.0) * 1.609;

        
        System.out.println("Marathon distance in kilometers: " + kilometers);
    }
}