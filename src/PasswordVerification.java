public class PasswordVerification {


    public boolean hasGoodLenght(String password) {
        if (password.length() >= 12) {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNoWhiteSpaces(String password) {
        for (int i = 0; i <= password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isWhitespace(c)) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public boolean hasNoRepetitions(String password) {
        for (int i = 0; i < (password.length() - 1); i++) {
            char c1 = password.charAt(i);
            char c2 = password.charAt(i + 1);
            if (c1 == c2) {
                return true;
            }

        }
        return false;
    }

    public boolean hasNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSpecialCharacter(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isDigit(c) && !Character.isLetter(c) && !Character.isWhitespace(c)) {
                return true;
            }
        }
        return false;
    }

}
