package FitnessApp.data;

import FitnessApp.domain.Exercise;
import FitnessApp.domain.enums.ExerciseType;
import FitnessApp.domain.enums.MuscleType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise,Long> {
    Exercise findByName(String name);
    Exercise findByMuscleType(MuscleType muscleType);
    Exercise findByExerciseType(ExerciseType exerciseType);
}
