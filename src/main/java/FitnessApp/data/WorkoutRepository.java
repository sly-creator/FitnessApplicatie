package FitnessApp.data;

import FitnessApp.domain.Workout;
import FitnessApp.domain.enums.WorkoutType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout,Long> {
    Workout findByName(String Name);
    Workout findByWorkoutType(WorkoutType workoutType);
}
