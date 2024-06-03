package FitnessApp.domain;

public class ExerciseHistory {
    public long id;
    private final int sets;
    private final int weight;
    private final Exercise exercise;

    public ExerciseHistory(long id, int sets, int weight, Exercise exercise) {
        this.id = id;
        this.sets = sets;
        this.weight = weight;
        this.exercise = exercise;
    }

}
