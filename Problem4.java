public class Problem4 {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // words array is used to store the strings separated by space and punctuation from the text
        String[] words = text.split("[\\s\\p{Punct}]+");

        // Bubble sort is used to sort the words
        /* compareTo method is used to check the alphabetical order
         * In which Capital letter ASCII value from 65-90 and small letters from 97-122
         * so words starting with capital letter are sorted first then the words starting with small letter*/
        for (int i = 1; i < words.length; i++){
            for (int j = 1; j < words.length - i; j++) {
                if (words[j-1].compareTo(words[j]) > 0) {
                    String temp = words[j - 1];
                    words[j - 1] = words[j];
                    words[j] = temp;
                }
            }
        }
        
        // Print the sorted words
        for (int i=0; i<words.length; i++) {
            System.out.println(words[i]);
        }
    }

}
