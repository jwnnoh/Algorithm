class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(walletSmallerThanBill(bill, wallet)) {
            answer++;
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
                continue;
            }
             bill[1] /= 2;
        }
        return answer;
    }
    
    private boolean walletSmallerThanBill(int[] bill, int[] wallet) {
        int smallBill = 0;
        int bigBill = 0;
        int smallWallet = 0;
        int bigWallet = 0;
        
        if (bill[0] < bill[1]) {
            smallBill = bill[0];
            bigBill = bill[1];
        } else {
            smallBill = bill[1];
            bigBill = bill[0];
        }
        
        if (wallet[0] < wallet[1]) {
            smallWallet = wallet[0];
            bigWallet = wallet[1];
        } else {
            smallWallet = wallet[1];
            bigWallet = wallet[0];
        }
        
        if (smallBill > smallWallet || bigBill > bigWallet) {
            return true;
        }
        return false;
    }
}