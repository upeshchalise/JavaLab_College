class sumOfN{
    int sum(int n) {
        int sum =0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
    
    sumOfN obj = new sumOfN();
    int result = obj.sum(3);
    System.out.println(result);
    }
}
