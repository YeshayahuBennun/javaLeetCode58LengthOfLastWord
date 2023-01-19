import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String case1 = "Hello World";
        String case2 = "   fly me   to   the moon  ";
        String case3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(case1));

    }

    public static int lengthOfLastWord(String s) {
        if(s.length()==1)return 1;
        char[] charString = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (charString[i] != ' ') {
                sb.append(charString[i]);
                if (i == s.length() - 1) {
                    stringList.add(sb.toString());
                }

            } else {
                stringList.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        String result= "";
        for (int i = stringList.size()-1; i >-1 ; i--) {
            if(!stringList.get(i).equals("")){
                result = stringList.get(i);
                break;
            }
        }
        return result.length();
    }
}


