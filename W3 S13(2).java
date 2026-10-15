class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int prefix=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=1;i<=nums.length;i++){
            if(nums[i-1]%2==1)
                prefix+=1;
            else
                prefix+=0;
            int reqPrefix=prefix-k;
            if(map.containsKey(reqPrefix)){
                count+=map.get(reqPrefix);
            }
            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
