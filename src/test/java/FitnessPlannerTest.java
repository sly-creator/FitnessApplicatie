import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FitnessPlannerTest {

    private FitnessPlanner fitnessPlanner;
    private User user;
    private Workout workout1;
    private Workout workout2;

    @BeforeEach
    public void setUp() {
        fitnessPlanner = new FitnessPlanner();
        user = new User("testUser", "password123");
        user.setFitnessGoal("medium");

        workout1 = new Workout("Push Ups", "Do 3 sets of 15 push ups", 15, "medium");
        workout2 = new Workout("Running", "Run for 30 minutes", 30, "high");

        fitnessPlanner.addUser(user);
        fitnessPlanner.addWorkout(workout1);
        fitnessPlanner.addWorkout(workout2);
    }

    @Test
    public void testGetPersonalizedWorkouts() {
        List personalizedWorkouts = fitnessPlanner.getPersonalizedWorkouts(user);
        assertEquals(1, personalizedWorkouts.size());
        Workout retrievedWorkout = (Workout) personalizedWorkouts.get(0);
        assertEquals("Push Ups", retrievedWorkout.getName());
    }
}
