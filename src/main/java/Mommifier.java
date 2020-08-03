import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mommifier {

    static String MOMMY = "mommy";
    static String VOWEL = "[aeiou]";

    public static boolean determineVowelPercent(List<String> strList) {

        int numOfVowel = (int) strList.stream().filter(s -> s.matches(VOWEL)).count();
        float accoutForVowel = (float) numOfVowel/strList.size();
        return accoutForVowel>0.3f;
    }

    public static String insertMommy(String str) {
        List<String> strList = Arrays.asList(str.split(""));
        if(!determineVowelPercent(strList)){
            return str;
        }
        List<String> finalStrList = new ArrayList<>(strList);
        for (int i =0; i < finalStrList.size()-1; i++) {
            if (finalStrList.get(i).matches(VOWEL) && finalStrList.get(i+1).matches(VOWEL)) {
                finalStrList.add(i+1,MOMMY);
            }
        }
        return String.join("",finalStrList);
    }
}
