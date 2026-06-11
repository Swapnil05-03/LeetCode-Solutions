class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        for(int j = 0; j <= arr.length; j++){
            if(j == arr.length || arr[j] == ' '){
                int left = i;
                int right = j-1;
                while(left < right){
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
                i = j+1;
            }
        }
        return new String(arr);
    }
}