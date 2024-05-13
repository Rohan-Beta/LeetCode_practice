// 49. Group Anagrams

//   Example 1:

// Input: strs = ["eat","tea","tan","ate","nat","bat"]
// Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// Example 2:

// Input: strs = [""]
// Output: [[""]]

// solution

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String , List<String>> map = new HashMap<>();

        for(String str : strs) {
            char ch[] = str.toCharArray();
            
            Arrays.sort(ch);
            String key = String.valueOf(ch);

            map.computeIfAbsent(key , k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
