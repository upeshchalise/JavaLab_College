class Compare {
    public static void main(String[] args) {
        
        String str1 = "abcd";
        String str2 = "cdef";
        String str3 = "abcd";
        
        // compare str1 and str2
        boolean result = str1.equals(str2);
        System.out.println(result);
        
        // compare str1 and str3
        result = str1.equals(str3);
        System.out.println(result); 
    }
}