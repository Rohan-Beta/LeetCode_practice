// 496. Next Greater Element I

//   Example 1:

// Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
// Output: [-1,3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
// - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
// - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
// Example 2:

// Input: nums1 = [2,4], nums2 = [1,2,3,4]
// Output: [3,-1]
// Explanation: The next greater element for each value of nums1 is as follows:
// - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
// - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

// solution

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(Integer num : nums2) {
            while(!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop() , num);
            }
            stack.push(num);
        }
        for(int i = 0; i < nums1.length; i += 1) {
            nums1[i] = map.getOrDefault(nums1[i] , -1);
        }
        return nums1;
    }
}
