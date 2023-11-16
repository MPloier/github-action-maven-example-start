import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDeepThought {
    private static DeepThought deepThought;

    @BeforeAll
    public static void init(){
        deepThought = new DeepThought();
    }
    @Test
    public void testAnswerToAll(){
        assertEquals(42, deepThought.answer_to_the_ultimate_question_of_life_the_universe_and_everything());
    }


}
