package FitnessApp.domain;

import FitnessApp.domain.enums.ExerciseType;
import FitnessApp.domain.enums.MuscleType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.ValueGenerationType;

@Entity
public class Exercise {
    @Id
    @GeneratedValue
    public long id;
    private  String name;
    private  String description;
    private  String image;
    private  int sets;
    private  int reps;
    private  MuscleType muscleType;
    private  ExerciseType exerciseType;

    public Exercise(String name, String description, String image, int sets, int reps, MuscleType muscleType, ExerciseType exerciseType) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.sets = sets;
        this.reps = reps;
        this.muscleType = muscleType;
        this.exerciseType = exerciseType;
    }

    public Exercise(){

    }

    public boolean equals(Exercise exercise){
        return this.id == exercise.id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public MuscleType getMuscleType() {
        return muscleType;
    }

    public void setMuscleType(MuscleType muscleType) {
        this.muscleType = muscleType;
    }

    public ExerciseType getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(ExerciseType exerciseType) {
        this.exerciseType = exerciseType;
    }
}
