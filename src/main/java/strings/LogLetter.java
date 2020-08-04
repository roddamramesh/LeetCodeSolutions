package strings;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by rameshroddam.
 * Date: 7/27/20
 * Time: 4:32 PM
 */
public class LogLetter {
    public static void main(String args[]){

        String[] logsOfStr= new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        logsOfStr = reorderLogFiles(logsOfStr);

        for (String s : logsOfStr) {
            System.out.println(s);
        }

    }

    public static String[] reorderLogFiles(String[] logs){

        Comparator<String> myComp= new Comparator<String>() {



            @Override
            public int compare(String o1, String o2) {
                int s1Index = o1.indexOf(' ');
                int s2Index = o2.indexOf(' ');
                char s1FChar = o1.charAt(s1Index+1);
                char s2FChar = o2.charAt(s2Index+1);
                if(s1FChar <= '9'){
                    if(s2FChar <= '9'){
                        return 0;
                    } else{
                        return 1;
                    }

                }
                if(s2FChar <= '9')
                    return -1;
                int preCompute= o1.substring(s1Index+1).compareTo(o2.substring(s2Index+1));
                if(preCompute==0){
                    return o1.substring(0,s1Index).compareTo(o1.substring(0,s2Index));
                }
                return preCompute;
            }
        };

        Arrays.sort(logs, myComp);
        return logs;

    }

}
