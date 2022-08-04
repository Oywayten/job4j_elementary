package ru.job4j.array;

public class JavaNameValidator {
    private static final int SPECIAL_BEGIN = 36;
    private static final int SPECIAL_END = 95;
    private static final int UPPER_BEGIN = 65;
    private static final int UPPER_END = 90;
    private static final int LOWER_BEGIN = 97;
    private static final int LOWER_END = 122;
    private static final int FIRST_CHAR = 0;
    private static final int START_INT = 1;

    public static boolean isNameValid(String name) {

        boolean isValid = !name.isEmpty() && isLowerLatinLetter(name.codePointAt(FIRST_CHAR));
        if (isValid) {
            for (int i = START_INT; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!(isLowerLatinLetter(code)
                        || isUpperLatinLetter(code)
                        || isSpecialSymbol(code)
                        || Character.isDigit(name.charAt(i)))) {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == SPECIAL_BEGIN || code == SPECIAL_END;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= UPPER_BEGIN && code <= UPPER_END;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= LOWER_BEGIN && code <= LOWER_END;
    }
}