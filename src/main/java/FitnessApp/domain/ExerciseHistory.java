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

    public ExerciseHistory( int sets, int weight, Exercise exercise) {
        this.sets = sets;
        this.weight = weight;
        this.exercise = exercise;
    }

    public ExerciseHistory(){
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }
}
