package cn.guide.huiwenchuan;

/**
 * ClassName: exchange
 * Description: 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * date: 2020/8/22 14:33
 *
 * @author Luo
 * @since JDK 1.8
 */
public class exchange {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ints = exchange1(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    //先计算出奇数的个数，设立一个辅助数组，奇数从数组头部开始添加, 即oddBegin
    //偶数从奇数结束之后的位置添加，即oddCount
    public static int[] exchange1(int[] nums) {
        //数组个数为0或1，直接返回
        if (nums.length == 0 || nums.length == 1){
            return nums;
        }
        //统计奇数个数
        int oddCount = 0;
        //奇数从这里开始放
        int oddBegin = 0;
        //设立辅助数组
        int[] newArray = new int[nums.length];

        //奇数的个数
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]&1) == 1){
                oddCount++;
            }
        }

        //排列
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i]&1) == 1){
                newArray[oddBegin++] = nums[i];
            }else {
                newArray[oddCount++] = nums[i];
            }
        }

        return newArray;

    }
}
