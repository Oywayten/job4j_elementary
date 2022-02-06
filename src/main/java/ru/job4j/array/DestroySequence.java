package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        for (int i = 0; i < seq.length; i++) {
            if (0 <= i && i <= 4) {
                seq[i] = '0';
            } else if (seq.length - 6 < i && i <= seq.length - 1) {
                seq[i] = '1';
            }
        }
        return seq;
    }
}
