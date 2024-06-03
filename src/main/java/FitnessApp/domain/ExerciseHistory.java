package FitnessApp.domain;

import jakarta.persistence.*;

@Entity
public class ExerciseHistory {
    @Id
    @GeneratedValue
    public long id;
    private int sets;
    private int weight;
    @OneToOne(cascade = CascadeType.ALL)
    private Exercise exercise;

    public ExerciseHistory(long id, int sets, int weight, Exercise exercise) {
        this.id = id;
        this.sets = sets;
        this.weight = weight;
        this.exercise = exercise;
    }

    public ExerciseHistory(){

    }

}
