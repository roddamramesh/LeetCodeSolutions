package slidingWindow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rameshroddam.
 * Date: 8/4/20
 * Time: 8:28 AM
 */
public class LongSubStringWithOutRepeating {

    public static void main(String args[]) {

        String longSubStr = "abcabcbb";

        LongSubStringWithOutRepeating lsswor = new LongSubStringWithOutRepeating();

        lsswor.lengthOfLongestSubstring(longSubStr);

    }

    public int lengthOfLongestSubstring(String s) {

        int windowStart = 0;
        int maxLength = 0;

        Map<Character, Integer> hm = new HashMap<>();

        /**
         *  add the elements into hashmap with index. If element already contains then find the element index
         *  do Max of windowstart index and the the character repeted character Repeated index+1.
         *
         */

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            if (hm.containsKey(s.charAt(windowEnd))) {
                windowStart = Math.max(windowStart, hm.get(s.charAt(windowEnd)) + 1);
            }

            hm.put(s.charAt(windowEnd), windowEnd);
            if (maxLength < windowEnd - windowStart + 1) {
                maxLength = windowEnd - windowStart + 1;

            }
        }
        return maxLength;
    }
}
