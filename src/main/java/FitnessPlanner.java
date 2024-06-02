import java.util.ArrayList;
import java.util.List;

public class FitnessPlanner {
    private List users;
    private List workouts;

    public FitnessPlanner() {
        users = new ArrayList();
        workouts = new ArrayList();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public List getPersonalizedWorkouts(User user) {
        List personalizedWorkouts = new ArrayList();
        for (int i = 0; i < workouts.size(); i++) {
            Workout workout = (Workout) workouts.get(i);
            if (workout.getIntensity().equalsIgnoreCase(user.getFitnessGoal())) {
                personalizedWorkouts.add(workout);
            }
        }
        return personalizedWorkouts;
    }
}
