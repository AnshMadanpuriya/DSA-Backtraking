public class FindPermutations { // TC:0(n*n!)
    public static void findp(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcd"=>"ab"+"de"="abde"
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findp(newstr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findp(str, "");
    }
}
