// 68. Text Justification

//   Example 1:

// Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
// Output:
// [
//    "This    is    an",
//    "example  of text",
//    "justification.  "
// ]
// Example 2:

// Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
// Output:
// [
//   "What   must   be",
//   "acknowledgment  ",
//   "shall be        "
// ]
// Explanation: Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
// Note that the second line is also left-justified because it contains only one word.

// solution

class Solution {
  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> ans = new ArrayList<>();
    List<StringBuilder> row = new ArrayList<>();
    int rowLetters = 0;

    for (final String word : words) {

      if (rowLetters + row.size() + word.length() > maxWidth) {
        final int spaces = maxWidth - rowLetters;
        if (row.size() == 1) {

          for (int i = 0; i < spaces; ++i)
            row.get(0).append(" ");
        } else {
          
          for (int i = 0; i < spaces; ++i)
            row.get(i % (row.size() - 1)).append(" ");
        }
        final String joinedRow =
            row.stream().map(StringBuilder::toString).collect(Collectors.joining(""));
        ans.add(joinedRow);
        row.clear();
        rowLetters = 0;
      }
      row.add(new StringBuilder(word));
      rowLetters += word.length();
    }

    final String lastRow =
        row.stream().map(StringBuilder::toString).collect(Collectors.joining(" "));
    StringBuilder sb = new StringBuilder(lastRow);
    final int spacesToBeAdded = maxWidth - sb.length();
    for (int i = 0; i < spacesToBeAdded; ++i)
      sb.append(" ");

    ans.add(sb.toString());
    return ans;
  }
}
