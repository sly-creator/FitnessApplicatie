import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String fitnessGoal;
    private String preferences;
    private List<WorkoutHistory> workoutHistories;
    private List<Exercise> exercises;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.workoutHistories = new ArrayList<>();
        this.exercises = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFitnessGoal() {
        return fitnessGoal;
    }

    public void setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public List<WorkoutHistory> getWorkoutHistories() {
        return workoutHistories;
    }

    public void addWorkoutHistory(WorkoutHistory workoutHistory) {
        this.workoutHistories.add(workoutHistory);
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
    }

    public String myAccount() {
        return "Username: " + username + "\nFitness Goal: " + fitnessGoal + "\nPreferences: " + preferences;
    }
}
