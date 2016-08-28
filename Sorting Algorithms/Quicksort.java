Quicksort(int[] A, int start, int end) {

    if (start >= end) {return;}
    
    int pIndex = Partition(A, start, end);
    Quicksort(A, start, pIndex -1);
    Quicksort(A, pIndex + 1, end);
    

}

//same thing

Quicksort(int[] A, int start, int end) {

    if (start < end) {
        int pIndex = Partition(A, start, end);
        Quicksort(A, start, pIndex -1);
        Quicksort(A, pIndex + 1, end);
    }

}


int Partition(int[] A, int start, int end) {

    pivot = A[end];
    pIndex = start;

    for (i = start; i < end; i++) {

        if (A[i] <= pivot) {
            swap(A[i], A[pIndex])
            pIndex++;
        }
    }

    swap(A[pIndex], A[end]);
    return pIndex;






}