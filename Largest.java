public class Largest {
  public static void main(String[] args) {
    int numbers[] = {7, 2, 5, 1, 4};
    int largest = findlargest(numbers);
    System.out.println(largest);
  }
   public static int findlargest(int[] nums) { 
      int max = nums[0]; 
      for (int i = 1; i < nums.length; i++) { 
        if (nums[i] > max) {
          max = nums[i]; 
        }
      }
      return max;
    }
  }
