public int minCoins(int total, int[] coins) {

    int T[] = new int[total + 1];
    int R[] = new int[total + 1];


    for (int i = 0; i <= total; i++){
        T[i] = Integer.MAX_VALUE
        R[i] = - 1;
    }

    for (int k = 0; k < coins.length; k++) {
        for (int i = 0; i <= total; i++) {
            if (coins[k] <= i) {
                if (T[i - coins[k]] + 1 < T[i]) {
                    T[i] = T[i - coins[k]] + 1
                    R[i] = coins[k];
                }
            }

        }



    }



}