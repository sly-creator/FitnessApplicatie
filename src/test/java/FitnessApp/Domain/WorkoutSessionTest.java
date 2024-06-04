package FitnessApp.Domain;

import FitnessApp.domain.Workout;
import FitnessApp.domain.WorkoutSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutSessionTest {
    private WorkoutSession workoutSession;

    @BeforeEach
    void setUp() {
        Workout workout = new Workout("TestWorkout", "Test description");
        Date startDate = new Date();
        Date endDate = new Date();
        workoutSession = new WorkoutSession(startDate, endDate, workout);
    }

    @Test
    void testGetStartDate() {
        Date startDate = new Date();
        assertEquals(startDate.getTime(), workoutSession.getStartDate().getTime(), 1000);
    }

    @Test
    void testSetStartDate() {
        Date newStartDate = new Date();
        workoutSession.setStartDate(newStartDate);
        assertEquals(newStartDate.getTime(), workoutSession.getStartDate().getTime(), 1000);
    }

    @Test
    void testGetEndDate() {
        Date endDate = new Date();
        assertEquals(endDate.getTime(), workoutSession.getEndDate().getTime(), 1000);
    }

    @Test
    void testSetEndDate() {
        Date newEndDate = new Date();
        workoutSession.setEndDate(newEndDate);
        assertEquals(newEndDate.getTime(), workoutSession.getEndDate().getTime(), 1000);
    }

    @Test
    void testSetWorkout() {
        Workout newWorkout = new Workout("NewTestWorkout", "New Test description");
        workoutSession.setWorkout(newWorkout);
        assertEquals(newWorkout, workoutSession.getWorkout());
    }
}