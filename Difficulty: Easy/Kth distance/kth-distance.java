// User function Template for Java
import java.util.HashMap;
class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashMap<Integer, Integer> lastSeen = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (lastSeen.containsKey(arr[i])) {
                if (i - lastSeen.get(arr[i]) <= k) {
                    return true;
                }
            }
            lastSeen.put(arr[i], i); // update last index
        }
        
        return false;
    }
}
