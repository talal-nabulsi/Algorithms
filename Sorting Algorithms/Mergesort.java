void Mergesort(int[] A) {

    n = A.length;

    if (n < 2) {
        return;
    }

    mid = n/2;

    left = new int[mid];
    right = new int[n - mid];

    for (int i = 0; i < mid; i++) {
        left[i] = A[i];
    }

    for (int i = mid; i < n; i++) {
        right[i - mid] = A[i];
    }

    Mergesort(left);
    Mergesort(right);
    Merge(left, right, A)


    }

}



void merge(int[] L,  int[] R, int[] A) {


    nL = L.length
    nR = R.length
    int i = j = k = 0;

    while (i < nL && j < nR) {

        if (L[i] < R[j]) {
            A[k] = L[i];
            i++;
            k++;
        }

        if (R[j] < L[i]) {
            A[k] = R[j];
            j++;
            k++;
        }

    }

    while (i < nL) {
        A[k] = L[i];
        i++;
        k++;


    }

    while (j < nR) {
        A[k] = R[j];
        j++;
        k++;


    }

}