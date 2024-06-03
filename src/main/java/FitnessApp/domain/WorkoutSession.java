package FitnessApp.domain;

import java.util.Date;

public class WorkoutSession {
    public long id;
    private Date startDate;
    private Date endDate;
    private Workout workout;

    public WorkoutSession(long id, Date startDate, Date endDate, Workout workout) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workout = workout;
    }

    public boolean equals(WorkoutSession workoutSession){
        return this.id == workoutSession.id;
    }
}
