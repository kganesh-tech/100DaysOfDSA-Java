class Solution {
  public List<String> findRepeatedDnaSequences (String s) {
    int k = 10;

    Set<String> seen = new HashSet<>();
    Set<String> result = new HashSet<>();

    for (int i = 0; i< s.length() - k; i++) {
      String sub = s.substring (i, i + k);

      if(seen.contains(sub)) {
        result.add(sub);
      } else {
        seen.add(sub);
      }
    }
    return new ArrayList<>(result);
  }
}
    
