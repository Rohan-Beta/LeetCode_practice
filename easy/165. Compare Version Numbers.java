// 165. Compare Version Numbers

//   Example 1:

// Input: version1 = "1.01", version2 = "1.001"
// Output: 0
// Explanation: Ignoring leading zeroes, both "01" and "001" represent the same integer "1".
// Example 2:

// Input: version1 = "1.0", version2 = "1.0.0"
// Output: 0
// Explanation: version1 does not specify revision 2, which means it is treated as "0".

// solution

class Solution {
    public int compareVersion(String version1, String version2) {

        String level1[] = version1.split("\\.");
        String level2[] = version2.split("\\.");

        int length = Math.max(version1.length() , version2.length());

        for(int i = 0; i < length; i += 1) {

            Integer v1 = i < level1.length ? Integer.parseInt(level1[i]) : 0;
            Integer v2 = i < level2.length ? Integer.parseInt(level2[i]) : 0;

            int compare = v1.compareTo(v2);

            if(compare != 0) {
                return compare;
            }
        }
        return 0;
    }
}
