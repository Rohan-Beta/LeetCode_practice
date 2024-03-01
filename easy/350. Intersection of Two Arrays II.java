// 350. Intersection of Two Arrays II

//   Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9]
// Explanation: [9,4] is also accepted.

// solution

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        List<Integer> list = new ArrayList<>();

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {

                list.add(nums1[i]);
                i += 1;
                j += 1;
            }
            else if(nums1[i] < nums2[j]) {
                i += 1;
            }
            else {
                j += 1;
            }
        }
        int ans[] = new int[list.size()];
        int k = 0;

        for(int num : list) {
            ans[k++] = num;
        }
        return ans;
    }
}
