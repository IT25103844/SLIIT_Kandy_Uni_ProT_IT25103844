class IT25103844Q4 {
    public static void main(String[] args) {

        
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println(); 

        
        for (int row = 1; row <= 5; row++) {

            
            for (int space = 5 - row; space > 0; space--) {
                System.out.print("  ");
            }

            
            for (int star = 1; star <= row; star++) {
                System.out.print("*   ");
            }

            System.out.println();
        }
    }
}