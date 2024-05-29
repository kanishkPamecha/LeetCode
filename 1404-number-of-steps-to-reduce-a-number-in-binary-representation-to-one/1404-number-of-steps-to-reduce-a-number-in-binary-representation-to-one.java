// class Solution {
//     public int numSteps(String s) {
//         BigInteger x = new BigInteger(s,2);
//         int count =0;
//         while(x!=1){
//          if(x%2==0){count++; x=x/2;}
//          else{count++; x++;}
//         }
//         return count;
//     }
// }
class Solution {
    public int numSteps(String s) {
        StringBuilder kp = new StringBuilder(s);
        int steps = 0;

        while (kp.length() > 1) {
            if (kp.charAt(kp.length() - 1) == '0') {
                kp.deleteCharAt(kp.length() - 1);
            } else {
                addOne(kp);
            }
            steps++;
        }
        return steps;
    }

    public static void addOne(StringBuilder kp) {
        int carry = 1;
        for (int i = kp.length() - 1; i >= 0; i--) {
            if (kp.charAt(i) == '0') {
                kp.setCharAt(i, '1');
                carry = 0;
                break;
            } else {
                kp.setCharAt(i, '0');
            }
        }
        if (carry == 1) {
            kp.insert(0, '1');
        }
    }

    
}