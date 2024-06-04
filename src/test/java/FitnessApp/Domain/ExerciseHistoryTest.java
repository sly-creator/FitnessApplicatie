package FitnessApp.Domain;

import FitnessApp.domain.Exercise;
import FitnessApp.domain.ExerciseHistory;
import FitnessApp.domain.enums.ExerciseType;
import FitnessApp.domain.enums.MuscleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExerciseHistoryTest {
    private ExerciseHistory exerciseHistory;

    @BeforeEach
    void setUp() {
        Exercise exercise = new Exercise("Test", "Test description", "Test image", 3, 10, MuscleType.Back, ExerciseType.Machine);
        exerciseHistory = new ExerciseHistory(3, 50, exercise);
    }

    @Test
    void testGetSets() {
        assertEquals(3, exerciseHistory.getSets());
    }

    @Test
    void testSetSets() {
        exerciseHistory.setSets(5);
        assertEquals(5, exerciseHistory.getSets());
    }

    @Test
    void testGetWeight() {
        assertEquals(50, exerciseHistory.getWeight());
    }

    @Test
    void testSetWeight() {
        exerciseHistory.setWeight(60);
        assertEquals(60, exerciseHistory.getWeight());
    }

    @Test
    void testSetExercise() {
        Exercise newExercise = new Exercise("New Test", "New Test description", "New Test image", 5, 15, MuscleType.Triceps, ExerciseType.FreeWeight);
        exerciseHistory.setExercise(newExercise);
        assertEquals(newExercise, exerciseHistory.getExercise());
    }
}
