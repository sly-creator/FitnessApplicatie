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

    public Exercise(long id, String name, String description, String image, int sets, int reps, MuscleType muscleType, ExerciseType exerciseType) {
        this.id = id;
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




}
