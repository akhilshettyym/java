pending: 1

### 11. Container with most water (two pointer):

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

### 2461. Maximum Sum of Distinct Subarrays With length K:

```java
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long max_sum = 0;
        long window_sum = 0;

        HashSet<Integer> set = new HashSet<>();

        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            while(set.contains(nums[right])) {
                set.remove(nums[left]);
                window_sum -= nums[left];
                left++;
            }

            set.add(nums[right]);
            window_sum += nums[right];

            if(right - left + 1 == k) {
                max_sum = Math.max(max_sum, window_sum);

                set.remove(nums[left]);
                window_sum -= nums[left];
                left++;
            }
        }

        return max_sum;
    }
}
```

---

### 1004. Max Consecutive Ones III (sliding window):

```java
class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zero_count = 0;

        for(int right = 0; right <= nums.length - 1; right++) {

            if(nums[right] == 0){
                zero_count++;
            }

            if(zero_count > k) {
                if(nums[left] == 0) {
                    zero_count--;
                }

                left++;
            }
        }
        return nums.length - left;
    }
}
```

---

### 713. Subarray Product Less Than K:

```java
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

    int left = 0;
    int count = 0;
    int product = 1;

    for(int right = 0; right < nums.length; right++) {
        if(k <= 1) return 0;

        product *= nums[right];

        while(product >= k) {
            product /= nums[left];
            left++;
        }

        count += right - left + 1;
    }
    return count;
    }
}
```

---

### 209. Minimum Size Subarray Sum (sliding window):

```java
class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int sum = 0;
        int left = 0;
        int min_length = Integer.MAX_VALUE;

        for(int right = 0; right <= nums.length - 1; right++) {

            sum += nums[right];

            while(sum >= target) {
                min_length = Math.min(min_length, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }
}
```

---
