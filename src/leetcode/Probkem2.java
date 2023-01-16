package leetcode;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Probkem2 {

    public String restoreString(String s, int[] indices) {

        /*char[] array = s.toCharArray();
        String s2 = s;
        for(int i =0 ; i < indices.length; i++){
            array[indices[i]] = s.charAt(i);
            s2 = String.valueOf(array);
        }
        return s2;*/

        StringBuffer stringBuffer = new StringBuffer(s);

        for(int i =0; i < s.length(); i++){
            stringBuffer.setCharAt(indices[i], s.charAt(i));
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        String s2 = new Probkem2().restoreString(s, indices);
        System.out.println(s2);
    }
}
