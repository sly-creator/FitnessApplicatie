package FitnessApp.Domain;

import FitnessApp.domain.Exercise;
import FitnessApp.domain.enums.ExerciseType;
import FitnessApp.domain.enums.MuscleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {
    private Exercise exercise;

    @BeforeEach
    void setUp() {
        exercise = new Exercise("Test", "Test description", "Test image", 3, 10, MuscleType.Biceps, ExerciseType.Machine);
    }

    @Test
    void testGetName() {
        assertEquals("Test", exercise.getName());
    }

    @Test
    void testSetName() {
        exercise.setName("New Test");
        assertEquals("New Test", exercise.getName());
    }

    @Test
    void testGetDescription() {
        assertEquals("Test description", exercise.getDescription());
    }

    @Test
    void testSetDescription() {
        exercise.setDescription("New Test description");
        assertEquals("New Test description", exercise.getDescription());
    }

    @Test
    void testGetImage() {
        assertEquals("Test image", exercise.getImage());
    }

    @Test
    void testSetImage() {
        exercise.setImage("Tests image");
        assertEquals("Tests image", exercise.getImage());
    }

    @Test
    void testGetSets() {
        assertEquals(3, exercise.getSets());
    }

    @Test
    void testSetSets() {
        exercise.setSets(5);
        assertEquals(5, exercise.getSets());
    }

    @Test
    void testGetReps() {
        assertEquals(10, exercise.getReps());
    }

    @Test
    void testSetReps() {
        exercise.setReps(15);
        assertEquals(15, exercise.getReps());
    }

    @Test
    void testGetMuscleType() {
        assertEquals(MuscleType.Biceps, exercise.getMuscleType());
    }

    @Test
    void testSetMuscleType() {
        exercise.setMuscleType(MuscleType.Legs);
        assertEquals(MuscleType.Legs, exercise.getMuscleType());
    }

    @Test
    void testGetExerciseType() {
        assertEquals(ExerciseType.Machine, exercise.getExerciseType());
    }

    @Test
    void testSetExerciseType() {
        exercise.setExerciseType(ExerciseType.Machine);
        assertEquals(ExerciseType.Machine, exercise.getExerciseType());
    }

    @Test
    void testEquals() {
        Exercise exercise2 = new Exercise("Test", "Test description", "Test image", 3, 10, MuscleType.Chest, ExerciseType.FreeWeight);
        assertTrue(exercise.equals(exercise2));
    }
}