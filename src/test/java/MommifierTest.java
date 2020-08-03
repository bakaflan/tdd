import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MommifierTest {

    @Test
    void should_determine_string_when_vowels_account_for_0percent_100percent(){
        Assertions.assertTrue(Mommifier.determineVowelPercent(Arrays.asList("ffffffaaaa".split(""))));
        Assertions.assertFalse(Mommifier.determineVowelPercent(Arrays.asList("ffffffffaaa".split(""))));
        Assertions.assertTrue(Mommifier.determineVowelPercent(Arrays.asList("aei".split(""))));
        Assertions.assertFalse(Mommifier.determineVowelPercent(Arrays.asList("fgh".split(""))));
    }

    @Test
    void should_insert_mommy_to_vowel_when_vowels_over_30percent(){
        Assertions.assertEquals("ffffffamommyamommyamommya",Mommifier.insertMommy("ffffffaaaa"));
    }

    @Test
    void should_not_insert_mommy_to_vowel_when_vowels_over_30percent_without_continuous_set(){
        Assertions.assertEquals("hello",Mommifier.insertMommy("hello"));
    }


}
