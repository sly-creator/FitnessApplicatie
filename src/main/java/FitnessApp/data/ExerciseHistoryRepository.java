package FitnessApp.data;

import FitnessApp.domain.Exercise;
import FitnessApp.domain.ExerciseHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseHistoryRepository extends JpaRepository<ExerciseHistory,Long> {
    ExerciseHistory findByExerciseId(Long exerciseId);
    ExerciseHistory findByExercise(Exercise exercise);
}
