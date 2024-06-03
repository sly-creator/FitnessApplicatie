package FitnessApp.data;

import FitnessApp.domain.Workout;
import FitnessApp.domain.WorkoutSession;
import org.hibernate.jdbc.Work;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface WorkoutSessionRepository extends JpaRepository<WorkoutSession,Long> {
    WorkoutSession findByStartDate(Date startdate);
    WorkoutSession findByWorkoutId(Long workoutId);
    WorkoutSession findByWorkout(Workout userId);
}
