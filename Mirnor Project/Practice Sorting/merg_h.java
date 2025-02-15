public class merg_h{
    
    
    void printArray(int A[], int n)
{
    for (int i = 0; i < n; i++)
    {
System.out.println("\t"+A[i]);
    }
System.out.println();
}

void merge(int A[], int mid, int low, int high)
{
    int b[]=new int [100];
    int i, j, k;
    i = low;
    j = mid + 1;
    k = low;

    while (i <= mid && j <= high)
    {
        if (A[i] < A[j])
        {
            B[k] = A[i];
            i++;
            k++;
        }
        else
        {
            B[k] = A[j];
            j++;
            k++;
        }
    }
    while (i <= mid)
    {
        B[k] = A[i];
        k++;
        i++;
    }
    while (j <= high)
    {
        B[k] = A[j];
        k++;
        j++;
    }
    for (int i = low; i <= high; i++)
    {
        A[i] = B[i];
    }
    
}

void mergeSort(int A[], int low, int high){
    int mid; 
    if(low<high){
        mid = (low + high) /2;
        mergeSort(A, low, mid);
        mergeSort(A, mid+1, high);
        merge(A, mid, low, high);
    }
}


    public static void main(String[] args) {
        
        merg_h obj=new merg_h();
        int A[] = {9, 1, 4, 14, 4, 15, 6};
        int n = 7;
        obj.printArray(A, n);
        obj.mergeSort(A, 0, 6);
        obj.printArray(A, n);

    }



    }





