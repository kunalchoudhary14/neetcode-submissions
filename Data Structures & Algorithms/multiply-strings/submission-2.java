class Solution {
    public String multiply(String num1, String num2) {
        java.math.BigInteger n1= new java.math.BigInteger(num1);
        java.math.BigInteger n2= new java.math.BigInteger(num2);
        // long n1=Long.parseLong(num1);
        // long n2=Long.parseLong(num2);
        java.math.BigInteger res = n1.multiply(n2);

        return res.toString();

        
    }
}
