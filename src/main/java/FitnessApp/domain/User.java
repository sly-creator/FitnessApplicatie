package FitnessApp.domain;

import java.util.ArrayList;

public class User {
    public long id;
    private String name;
    private String email;
    private String password;
    private ArrayList<Workout> workouts= new ArrayList<Workout>();
    private ArrayList<WorkoutSession> workoutSessions= new ArrayList<WorkoutSession>();
    private ArrayList<ExerciseHistory> exerciseHistories= new ArrayList<ExerciseHistory>();


    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public void addWorkOut(Workout workout){
        workouts.add(workout);
    }

    public void addWorkOutSession(WorkoutSession workoutSession){
        workoutSessions.add(workoutSession);
    }

    public void addExerciseHistory(ExerciseHistory exerciseHistory){
        exerciseHistories.add(exerciseHistory);
    }

    public void removeWorkOut(Workout workout){
        workouts.remove(workout);
    }

    public ArrayList<ExerciseHistory> getExerciseHistories() {
        return exerciseHistories;
    }

    public ArrayList<Workout> getWorkouts() {
        return workouts;
    }

    public ArrayList<WorkoutSession> getWorkoutSessions() {
        return workoutSessions;
    }
}
