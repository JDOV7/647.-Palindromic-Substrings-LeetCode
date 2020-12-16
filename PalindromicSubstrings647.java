package leetcode;

public class PalindromicSubstrings647 {

    public void PalindromicSubstrings647() {
        String s = "abab";
        int iContPalindromic = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    if (verifyPalindromic(s.substring(i, j + 1))) {
                        iContPalindromic++;
                    }
                }
            }
        }
        System.out.println(iContPalindromic + s.length());

    }

    public boolean verifyPalindromic(String sValue) {
        StringBuffer sPalindromic = new StringBuffer(sValue);
        if (sValue.length() != 1 && sPalindromic.reverse().toString().equals(sValue)) {
            return true;
        }
        return false;
    }
}
