pending: 3

### 1. Two Sum (two pointer):

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] + nums[j] == target) {
                   return new int[]{i, j};
               }
           }
       }
       return new int[]{-1, -1};
    }
}
```

### 217. Contains Duplicate:

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique =new HashSet<>();
        for(int num:nums){
            if(unique.contains(num)){
                return true;
            }
            unique.add(num);
        }
        return false;
    }
}
```

### 219. Contains Duplicate II: pending

```java
import java.util.HashSet;

class Solution {
  public boolean containsNearByDuplicate(int[] nums, int k) {
    HashSet<Integer> window = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (!window.add(nums[i])) {
        return true;
      }

      if (window.size() > k) {
        window.remove(nums[i-k]);
      }
    }
    return false;
  }
}
```

### 283. Move Zeros (two pointers): pending

```java
class Solution {
    public void moveZeroes(int[] nums) {

        int left = 0;

        for(int right = 0; right < nums.length; right++) {

            if(nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
    }
}
```

### 628. Maximum Product of Three numbers:

```java
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;

        int first_max = nums[n], second_max = nums[n-1], third_max = nums[n-2];
        int first_min = nums[0], second_min = nums[1];

        int product = Math.max(first_max * second_max * third_max, first_min * second_min * first_max);

        return product;
    }
}
```

### 3536. Maximum Product of Two Digits: pending

```java
class Solution {
    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;

        while(n > 0) {
            int digit = n % 10;
            n /= 10;

            if(digit > max1) {
                max2 = max1;
                max1 = digit;

            } else if(digit > max2) {
                max2 = digit;
            }
        }
        return max1 * max2;
    }
}
```

### 1979. Find Greatest Common Divisor of Array:

```java
class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        return gcd(min, max);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

### 3658. GCD of Odd and Even Sums:

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 1; i <= n; i++) {
            oddSum += (2 * i - 1);
            evenSum += (2 * i);
        }

        return gcd(oddSum, evenSum);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

### 268. Missing Number:

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        int expectedSum = n * (n+1) / 2;

        for(int num: nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
```

### 485. Max Consecutive Ones:

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max_count = 0;
        int curr_count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                curr_count++;

            } else {
                max_count = Math.max(max_count, curr_count);
                curr_count = 0;
            }
        }

    return Math.max(curr_count, max_count);

    }
}
```

### 136. Single Number (bitwise xor):

```java
class Solution {
    public int singleNumber(int[] nums) {
        
        int ans = 0;

        for(int num : nums){
            ans ^= num;
        }

        return ans;
    }
}
```