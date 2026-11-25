class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            set2.add(nums2[j]);
        }

        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int n:set1){
            if(!set2.contains(n)){
                list1.add(n);
            }
        }
        for(int m:set2){
            if(!set1.contains(m)){
                list2.add(m);
            }
        }
        List<List<Integer>> answer=new ArrayList<>();
        answer.add(list1);
        answer.add(list2);
        return answer;
    }
}