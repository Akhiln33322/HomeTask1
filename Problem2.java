public class Problem2 {
    public static void main(String[] args) {
        int nValues = 50;
        loop:
        for (int i = 2; i <= nValues; i++) {
            // finding square root
        	int squareRoot = (int) Math.sqrt(i); 
            for (int j = 2; j <= squareRoot; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }            
            System.out.println(i);
        }
    }
}