import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkoutHistory {
    private Date date;
    private int totalDuration; // in minutes
    private List<ExerciseHistory> exercises;

    public WorkoutHistory(Date date) {
        this.date = date;
        this.exercises = new ArrayList<>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public List<ExerciseHistory> getExercises() {
        return exercises;
    }

    public void addExerciseHistory(ExerciseHistory exerciseHistory) {
        this.exercises.add(exerciseHistory);
    }
}
