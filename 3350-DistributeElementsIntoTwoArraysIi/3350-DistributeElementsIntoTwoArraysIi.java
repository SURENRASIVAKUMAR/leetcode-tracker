// Last updated: 7/9/2026, 9:47:32 AM

class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
                List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
                List<Integer> sortedList1=new ArrayList<>();
        List<Integer> sortedList2=new ArrayList<>();
                list1.add(nums[0]);
        list2.add(nums[1]);
                sortedList1.add(nums[0]);
        sortedList2.add(nums[1]);
        
        for(int i=2;i<n;i++){
            int greaterCount1=greaterCount(sortedList1,nums[i]);
            int greaterCount2=greaterCount(sortedList2,nums[i]);
                        if(greaterCount1 > greaterCount2)
                insert(sortedList1,nums[i],list1);
            else if(greaterCount1 < greaterCount2)
                insert(sortedList2,nums[i],list2);
            else if(list1.size() < list2.size())
                insert(sortedList1,nums[i],list1);
            else if(list2.size() < list1.size())
                insert(sortedList2,nums[i],list2);
            else
                insert(sortedList1,nums[i],list1);
            
        }
        
        // concatenate lists to list1
        list1.addAll(list2);
        
        //convert list to array
        int[] ans=new int[n];
        for(int i=0;i<n;i++) ans[i]=list1.get(i);
        return ans;
    }
    
    
    public void insert(List<Integer> sortedList, int element, List<Integer> list) {
        // insert at last index of a normal list
        list.add(element);
        
        // insert element in a sorted list    
        int index = Collections.binarySearch(sortedList, element);
        if (index < 0) {
            index = -index - 1;
        }
        sortedList.add(index, element);
    }
    
    
    // function to find count of greater elements than val
    public int greaterCount(List<Integer> list,int val){
        int n=list.size();
        int l = 0;
        int r = n - 1;
        int leftGreater = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (list.get(m) > val) {
                leftGreater = m;
                r = m - 1;
            }
            else l = m + 1;
        }
        return n - leftGreater;
    }
    
}