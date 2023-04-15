package BinarySearch;

public class BinarySearch {

        public static int search(int[] nums, int target) {
            int head = 0;
            int tail = nums.length-1;
            
            
            
            while(head<=tail){
                int mid = (head + tail)/2;
              //  System.out.println(mid);
              //  if(nums[mid+1]== target )   return mid;
                if(nums[mid]<target)   head = mid + 1;
                else if (nums[mid]>target)  tail = mid - 1;
                else if (nums[mid]== target)    return  mid;
            }
            return -1;
        }

        public static void main(String[] args) {
            int arr[]= new int[]{5,12,53,232,645};
            int target =645;
            System.out.println(search(arr, target));
        }
}



