public class ExerciseHistory {
    private String exerciseName;
    private int duration; // in minutes
    private String feedback;

    public ExerciseHistory(String exerciseName, int duration, String feedback) {
        this.exerciseName = exerciseName;
        this.duration = duration;
        this.feedback = feedback;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
