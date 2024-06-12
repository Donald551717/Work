import java.util.Arrays;
public class Main {
  public static void main(String[] args) {
    int numbers[] = {1, 2, 1, 3, 5, 1};
    int key = 1;
    int output[] = removeElement(numbers, key);
    System.out.println(Arrays.toString(output));
  }
  public static int[] removeElement(int[] nums, int key) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != key) {
        count++;
      }
    }
    int[] output = new int[count];
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != key) {
        output[index] = nums[i];
        index++;
      }
    }
    return output;
  }


}