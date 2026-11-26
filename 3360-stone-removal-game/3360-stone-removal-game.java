class Solution {
    public boolean canAliceWin(int n) {

        boolean aliceTurn = true;

        for (int i = 10; i > 0; i--) {

            if (n < i) {
                return !aliceTurn;
            }

            n = n - i;
            aliceTurn = !aliceTurn;
        }

        return false;
    }
}