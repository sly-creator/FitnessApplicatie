package FitnessApp.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class WorkoutSession {
    @Id
    @GeneratedValue
    public long id;
    private Date startDate;
    private Date endDate;
    @OneToOne(cascade = CascadeType.ALL)
    private Workout workout;

    public WorkoutSession(long id, Date startDate, Date endDate, Workout workout) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workout = workout;
    }

    public WorkoutSession(){

    }

    public boolean equals(WorkoutSession workoutSession){
        return this.id == workoutSession.id;
    }
}
