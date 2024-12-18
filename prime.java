class Prime {
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    //78
//56
    //45
    //57
    public static void main(String[] args) {
        System.out.println(isPrime(11)); // Output: true
        System.out.println(isPrime(15)); // Output: false
    }
}
