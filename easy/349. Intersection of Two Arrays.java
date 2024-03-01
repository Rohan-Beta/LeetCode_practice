// 349. Intersection of Two Arrays

//   Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.

// solution

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();

        for(int num : nums1) {
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();

        for(int num : nums2) {
            if(set1.contains(num)) {
                set2.add(num);
            }
        }
        int ans[] = new int[set2.size()];
        int i = 0;

        for(int num : set2) {
            ans[i++] = num;
        }
        return ans;
    }
}
