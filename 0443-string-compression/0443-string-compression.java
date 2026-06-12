class Solution {
    public int compress(char[] chars) {
        int i = 0 , j = 0;
        while(i < chars.length){
            char ch = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == ch){
                count++;
                i++;
            }
            chars[j++] = ch;
            if(count > 1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[j++] = c;
                }
            }
        }
        return j;
    }
}