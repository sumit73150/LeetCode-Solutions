class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i >=0 ){
            //remove all the trailing space 
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            //check value of i 
            if(i < 0){
                break;
            }

            int j = i ;
            //find the start index of the word
             while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }
            //jiase hi j space index prt aaya to ruk jega 
            ans.append(s.substring(j+1, i+1));
            //remove faltu k space where j is starting and add a space in ans 
             while(j >= 0 && s.charAt(j) == ' '){
                j--;
            }


            // j<0 iska mltb first word k upar tha main -> no space needed 
            //j>=0 space needed 
            if(j >= 0){
                ans.append(' ');
            }
            //place i at last index of the remaining string 
            i = j;


        }
        return ans.toString();
    }
}