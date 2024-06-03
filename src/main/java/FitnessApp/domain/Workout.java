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


    public Workout(long id, String name, String description, String image, WorkoutType workoutType) {
        this.id = id;
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


}
