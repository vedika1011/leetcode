class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int freq:map.values()){
            if(!set.add(freq)){
                return false;
            }
        }
        return true;
    }
}