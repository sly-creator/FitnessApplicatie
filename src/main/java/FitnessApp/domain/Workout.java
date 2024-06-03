package FitnessApp.domain;

import FitnessApp.domain.enums.WorkoutType;

import java.util.ArrayList;

public class Workout {
    public long id;
    private final String name;
    private final String description;
    private final String image;
    private final ArrayList<Exercise> exercises = new ArrayList<Exercise>();
    private final WorkoutType workoutType;


    public Workout(long id, String name, String description, String image, WorkoutType workoutType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.workoutType = workoutType;
    }

    public void addExercise(Exercise exercise){
        exercises.add(exercise);
    }

    public void removeExercise(Exercise exercise){
        exercises.remove(exercise);
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public boolean containsExercise(Exercise exercise){
        return exercises.contains(exercise);
    }
    public boolean equals(Workout workout){
        return this.id == workout.id;
    }


}
