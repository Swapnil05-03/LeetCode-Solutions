class Solution {
    public int minBitFlips(int s, int g) {
        int ans = (s ^ g);
        int count = 0;
        for(int i = 0 ; i< 31; i++){
            if((ans>>i) % 2 != 0) count++;
        }
        return count;
    }
}