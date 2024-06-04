package FitnessApp.Domain;


import FitnessApp.domain.Exercise;
import FitnessApp.domain.Workout;
import FitnessApp.domain.enums.ExerciseType;
import FitnessApp.domain.enums.MuscleType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WorkoutTest {
    private Workout workout;

    @BeforeEach
    void setUp() {
        workout = new Workout("TestWorkout","Test description");
        Exercise exercise = new Exercise("Test", "Test description", "Test image", 3, 10, MuscleType.Biceps, ExerciseType.Machine);
        workout.addExercise(exercise);
    }

    @Test
    void testGetName() {
        assertEquals("TestWorkout", workout.getName());
    }

    @Test
    void testSetName() {
        workout.setName("TestWorkout");
        assertEquals("TestWorkout", workout.getName());
    }

    @Test
    void testGetDescription() {
        assertEquals("Test description", workout.getDescription());
    }

    @Test
    void testSetDescription() {
        workout.setDescription("New Test description");
        assertEquals("New Test description", workout.getDescription());
    }

    @Test
    void testAddExercise() {
        Exercise newExercise = new Exercise("New Test", "New Test description", "New Test image", 5, 15, MuscleType.Triceps, ExerciseType.FreeWeight);
        workout.addExercise(newExercise);
        assertTrue(workout.getExercises().contains(newExercise));
    }

    @Test
    void testRemoveExercise() {
        Exercise exercise = new Exercise("Test", "Test description", "Test image", 3, 10, MuscleType.Biceps, ExerciseType.Machine);
        workout.removeExercise(exercise);
        assertFalse(workout.getExercises().contains(exercise));
    }
}
