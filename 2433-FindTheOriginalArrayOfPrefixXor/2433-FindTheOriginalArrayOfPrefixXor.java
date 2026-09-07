// Last updated: 9/7/2026, 1:44:30 PM
class Solution {
    public int[] findArray(int[] pref) {
        int n=pref.length;
        int[] arr=new int[n];
        arr[0]=pref[0];
        for(int i=1;i<n;i++){
            arr[i]=pref[i]^pref[i-1];
        }
        return arr;
    }
}

// class Solution {
//     public int[] findArray(int[] pref) {
//         int n = pref.length;
//         int[] arr = new int[n];
//         arr[0] = pref[0];
//         for (int i = 1; i < n; i++) {
//             arr[i] = pref[i] ^ pref[i - 1];
//         }

//         return arr;
//     }
// }