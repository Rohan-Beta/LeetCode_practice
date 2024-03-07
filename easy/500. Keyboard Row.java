// 500. Keyboard Row

//   Example 1:

// Input: words = ["Hello","Alaska","Dad","Peace"]
// Output: ["Alaska","Dad"]
// Example 2:

// Input: words = ["omk"]
// Output: []
// Example 3:

// Input: words = ["adsdf","sfd"]
// Output: ["adsdf","sfd"]

// solution

class Solution {
    public String[] findWords(String[] words) {
        
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> list = new ArrayList<>();

        for(String word : words) {
            int rows[] = new int[3];

            for(char ch : word.toLowerCase().toCharArray()) {
                if(row1.indexOf(ch) != -1) {
                    rows[0] = 1;
                }
                else if(row2.indexOf(ch) != -1) {
                    rows[1] = 1;
                }
                else if(row3.indexOf(ch) != -1) {
                    rows[2] = 1;
                }
            }
            int sum = rows[0] + rows[1] + rows[2];

            if(sum == 1) {
                list.add(word);
            }
        }
        String ans[] = new String[list.size()];
        int i = 0;

        for(String word : list) {
            ans[i++] = word;
        }
        return ans;
    }
}
