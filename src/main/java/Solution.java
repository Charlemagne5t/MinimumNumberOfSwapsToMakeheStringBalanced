class Solution {
    public int minSwaps(String s) {
        int n = s.length();

        int i = 0;
        int j = n - 1;

        int c = 0;
        int o = 0;
        int res = 0;
        char[] arr = s.toCharArray();
        while(i < j) {
            while(o >= 0 && i < j) {
                char ch = arr[i];
                if(ch == ']') {
                    o--;
                }else {
                    o++;
                }
                i++;
                if(o < 0) {
                    i--;
                }
            }
            while(c >= 0 && i < j) {
                char ch = arr[j];
                if(ch == '[') {
                    c--;
                }else {
                    c++;
                }
                j--;
                if(c < 0){
                    j++;
                }

            }
            if(o == -1 && c == -1) {
                res++;
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                o++;
                c++;
            }
        }
        return res;
    }
}