package FitnessApp.domain;

import FitnessApp.domain.enums.ExerciseType;
import FitnessApp.domain.enums.MuscleType;

public class Exercise {
    public long id;
    private final String name;
    private final String description;
    private final String image;
    private final int sets;
    private final int reps;
    private final MuscleType muscleType;
    private final ExerciseType exerciseType;

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

    public boolean equals(Exercise exercise){
        return this.id == exercise.id;
    }




}
