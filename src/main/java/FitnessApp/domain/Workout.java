package FitnessApp.domain;

import FitnessApp.domain.enums.WorkoutType;
import jakarta.persistence.*;

import java.util.ArrayList;
@Entity
public class Workout {
    @Id
    @GeneratedValue
    public long id;
    private String name;
    private String description;
    private String image;
    @OneToMany(cascade = CascadeType.ALL)
    private ArrayList<Exercise> exercises = new ArrayList<Exercise>();
    private WorkoutType workoutType;


    public Workout( String name, String description, String image, WorkoutType workoutType) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.workoutType = workoutType;
    }

    public Workout(){

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


    public void setName(String name) {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }

    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }
}
