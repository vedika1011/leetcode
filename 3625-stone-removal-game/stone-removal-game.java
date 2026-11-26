class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        // n=35
        // Alice n=n-10=35-10=25 move 1
        // Bob n=n-9=25-9=16  move 2
        // Alice n=n-8=16-8=8 move 3
        // Bob n=n-7=8-7=1  move 4
        // alice doesnt have 6 stones to remove so she loses therefore return false
        // 1st move requires min stones=10
        // 2nd move requires min stones=10+9
        // 3rd move requires min stones=10+9+8
        // for m moves, min stones=10+9+..+(10-m+1)
        // if m%2!=0 return true (Alice wins)
        int min=10;
        int moves=0;
        while(n>=min){
            n=n-min;
            moves++;
            min--;
        }
        return moves%2!=0;
    }
}