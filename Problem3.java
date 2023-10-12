public class Problem3 {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";
        int spaces = 0;
        int vowels = 0;
        int letters = 0;

        // code for counting vowels, consonants, and spaces
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i); 

            if (ch == ' ') {
                spaces+=1;
            } else if (ch >= 'a' && ch <= 'z') {
                letters+=1;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels+=1;
                }
            }  else if (ch >= 'A' && ch <= 'Z') {
                letters+=1;
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels+=1;
                }
            }
        }

        // print the number of vowels, consonants, and vowels
        System.out.println("The text contained vowels: " + vowels + "\n"
                + "consonants: " + (letters - vowels) + "\n" + "spaces: " + spaces);
    }
}
