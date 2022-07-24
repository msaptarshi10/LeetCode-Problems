class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer>result = new ArrayList<Integer>();
        for(int i = 0;i < nums.length;i++)
            result.add(nums[i] * nums[i]);
        Collections.sort(result);
        int res[] = new int[result.size()];
        for(int i = 0;i < result.size();i++){
            res[i] = result.get(i);
        }
        return res;
    }
}