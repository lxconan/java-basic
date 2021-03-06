package com.twc.javaBasic;

import com.twc.javaBasic.metadata.DifficultyLevel;
import com.twc.javaBasic.metadata.KnowledgePoint;
import com.twc.javaBasic.metadata.TestMetadata;
import com.twc.javaBasic.util.Match;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegexTest {
    // TODO: If you find this part difficult. please check the following documentation:
    //  https://docs.oracle.com/javase/tutorial/essential/regex/index.html

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_match_literals() {
        final String regex = "foo";
        final String text = "I contains foo.";

        List<Match> matches = findMatch(text, regex);

        assertEquals(1, matches.size());

        Match match = matches.get(0);

        assertEquals("foo", match.getMatchedString());
        assertEquals(11, match.getStartIndex());
        assertEquals(14, match.getEndIndex());
    }

    private static List<Match> findMatch(String text, String regex) {
        // TODO:
        //  Please implement the method to find all matches in the `text` against specified
        //  regular expression.
        // <--start-
        return null;
        // --end-->
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_match_character_classes() {
        // TODO:
        //  Please create an expression which extract something that begins with 'b' and
        //  ends with 't'. The interval should contains one or more lowercase English
        //  characters.
        // <-start--
        final String regex = "";
        // --end-->

        final String text = "the bat is the best";

        List<Match> matches = findMatch(text, regex);

        assertEquals(2, matches.size());
        assertEquals("bat", matches.get(0).getMatchedString());
        assertEquals("best", matches.get(1).getMatchedString());
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_match_predefined_classes_and_groups() {
        // TODO:
        //  Please create an expression which extract something that begins with a
        //  word character, following with a white space character. Repeating 3 times.
        // <-start--
        final String regex = "";
        // --end-->

        final String text = "a b c d e 2 ";

        List<Match> matches = findMatch(text, regex);

        assertEquals(2, matches.size());
        assertEquals("a b c ", matches.get(0).getMatchedString());
        assertEquals("d e 2 ", matches.get(1).getMatchedString());
    }

    @Test
    @TestMetadata(value = DifficultyLevel.EASY, kp = KnowledgePoint.SINGLE_KNOWLEDGE_POINT)
    void should_match_boundary() {
        // TODO:
        //  Please create an expression which extract English words "dog".
        // <-start--
        final String regex = "";
        // --end-->

        final String text = "The quick browndog jumps over a lazy dog.";

        List<Match> matches = findMatch(text, regex);

        assertEquals(1, matches.size());
        Match match = matches.get(0);
        assertEquals("dog", match.getMatchedString());
        assertEquals(37, match.getStartIndex());
    }
}
