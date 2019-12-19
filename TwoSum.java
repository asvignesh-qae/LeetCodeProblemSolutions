package leetCodePblms;

public class TwoSum {

	int[] arrsum = new int[2];
    int i, j;
    public int[] twoSum(int[] nums, int target) {
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                //index = nums[i]+nums[j]==target?i:j;
                if(nums[i]+nums[j]==target){
                    arrsum[0] = i;
                    arrsum[1] = j;
                    break;
                }
            }
        }
        return arrsum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,9,11};
		int[] indices = new TwoSum().twoSum(nums, 9);
		System.out.println(indices[0]);
		System.out.println(indices[1]);
	}

}
