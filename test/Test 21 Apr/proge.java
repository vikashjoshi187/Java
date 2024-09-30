 class conversation {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int d[] = a;
        int sum = 0;
        for (int i = 0; i < 3; ++i)
            sum += (a[i] * d[i+1]) +(a[i+1] * d[i]) ;
        
        
        
            System.out.print("sum "+sum);
    }
}
