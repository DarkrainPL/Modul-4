public class PalindromChecker {


    public boolean areYouPalindrome(String stringTestowany) {
        stringTestowany = stringTestowany.toLowerCase();

        if (stringTestowany.length() % 2 == 0) {
            for (int i = 0; i < (stringTestowany.length() / 2); i++) {

                char c1 = stringTestowany.charAt(i);
                char c2 = stringTestowany.charAt((stringTestowany.length() - 1) - i);

                if (c1 != c2) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < (stringTestowany.length() / 2); i++) {

                char c1 = stringTestowany.charAt(i);
                char c2 = stringTestowany.charAt((stringTestowany.length() - 1) - i);

                if (c1 != c2) {
                    return false;
                }
            }

        }
        return true;
    }
}
