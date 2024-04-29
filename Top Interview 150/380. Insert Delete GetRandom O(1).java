// 380. Insert Delete GetRandom O(1)

//   Example 1:

// Input
// ["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
// [[], [1], [2], [2], [], [1], [2], []]
// Output
// [null, true, false, true, 2, true, false, 2]

// Explanation
// RandomizedSet randomizedSet = new RandomizedSet();
// randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
// randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
// randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
// randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
// randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
// randomizedSet.insert(2); // 2 was already in the set, so return false.
// randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.

// solution

class RandomizedSet {

    Map<Integer , Integer> valToIndex = new HashMap<>();
    List<Integer> vals = new ArrayList<>();
    Random rand = new Random();

    public int last(List<Integer> vals) {
        return vals.get(vals.size() - 1);
    }

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {

        if(valToIndex.containsKey(val)) {
            return false;
        }
        valToIndex.put(val , vals.size());
        vals.add(val);

        return true;
    }
    
    public boolean remove(int val) {

        if(!valToIndex.containsKey(val)) {
            return false;
        }
        int index = valToIndex.get(val);

        valToIndex.put(last(vals) , index);
        valToIndex.remove(val);

        vals.set(index , last(vals));
        vals.remove(vals.size() - 1);

        return true;
    }
    
    public int getRandom() {
        int index = rand.nextInt(vals.size());

        return vals.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
