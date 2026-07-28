pending: 2

### 11. Container with most water (two pointer): pending

```java
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;

        while(left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            maxarea = Math.max(maxarea, area);

            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }
}
```

### 15. 3Sum (two pointer):

```java
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if(sum > 0) {
                    right--;

                } else {
                    left++;

                }
            }
        }
        return result;
    }
}
```

### 18. 4Sum (two pointer):

```java
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < nums.length -2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = nums.length - 1;

                while(left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if(sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;

                    } else if(sum > target) {
                        right--;

                    } else {
                        left++;
                    }
                }
            }
        }
        return result;
    }
}
```

### 75. Sort Colors (two pointers): pending

```java
class Solution {
    public void sortColors(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high) {

            if(nums[mid] == 0) {
                nums[mid] = nums[low];
                nums[low] = 0;
                mid++;
                low++;

            } else if(nums[mid] == 1) {
                mid++;

            } else {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }
    }
}
```

### 167. Two Sum II - input Array Is Sorted (two pointer):

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int sum = numbers[left] + numbers[right];

            if(sum == target) {
                return new int[]{left + 1, right + 1};
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
```
