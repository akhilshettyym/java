### 42. Trapping Rain Water:

```java
class Solution {
    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int water = 0;
        int left_max = height[left], right_max = height[right];

        while(left < right) {

            if(left_max < right_max) {
                left++;
                left_max = Math.max(left_max, height[left]);
                water += left_max - height[left];

            } else {
                right--;
                right_max = Math.max(right_max, height[right]);
                water += right_max - height[right];
            }
        }
        return water;
    }
}
```

---

### 992. Subarrays with K Different Integers (sliding window):

```java
class Solution {
    public int subarrayWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k-1);
    }

    private int atmost(int[] nums, int k) {
        int left = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while(map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if(map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
```

---

### 239. Sliding Window Maximum (sliding window):

```java
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] result = int[nums.length - k + 1];

        Deque<Integer> deque = new LinkedList<>();

        for(int right = 0; right < nums.length; right++) {

            while(!deque.isEmpty() && deque.peekFirst() <= right - k) {
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[right]) {
                deque.pollLast();
            }

            deque.addLast(right);

            if(right >= k - 1) {
                result[right - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}