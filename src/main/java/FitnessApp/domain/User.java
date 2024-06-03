package FitnessApp.domain;


import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class User {
    @Id
    @GeneratedValue
    public long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Workout> workouts = new ArrayList<Workout>();
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<WorkoutSession> workoutSessions = new ArrayList<WorkoutSession>();
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<ExerciseHistory> exerciseHistories = new ArrayList<ExerciseHistory>();


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User() {

    }

    public void addWorkOut(Workout workout) {
        workouts.add(workout);
    }

    public void addWorkOutSession(WorkoutSession workoutSession) {
        workoutSessions.add(workoutSession);
    }

    public void addExerciseHistory(ExerciseHistory exerciseHistory) {
        exerciseHistories.add(exerciseHistory);
    }

    public void removeWorkOut(Workout workout) {
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
