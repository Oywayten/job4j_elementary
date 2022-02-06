package ru.job4j.array;

public class RightShift {
    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    private static void shift(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = nums[nums.length - 1 - 1 - i];
            nums[nums.length - 1 - 1 - i] = temp;
        }
    }
}
