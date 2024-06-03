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

    public WorkoutSession( Date startDate, Date endDate, Workout workout) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.workout = workout;
    }

    public WorkoutSession(){
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public boolean equals(WorkoutSession workoutSession){
        return this.id == workoutSession.id;
    }
}
