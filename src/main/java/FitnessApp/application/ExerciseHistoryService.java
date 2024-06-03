package FitnessApp.application;
import FitnessApp.data.ExerciseHistoryRepository;
import FitnessApp.domain.Exercise;
import FitnessApp.domain.ExerciseHistory;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExerciseHistoryService {
    private final ExerciseHistoryRepository exerciseHistoryRepository;

    public ExerciseHistoryService(ExerciseHistoryRepository exerciseHistoryRepository) {
        this.exerciseHistoryRepository = exerciseHistoryRepository;
    }

    public void addExerciseHistory(int sets, int weight, Exercise exercise) {
        ExerciseHistory newExerciseHistory = new ExerciseHistory(sets, weight, exercise);
        exerciseHistoryRepository.save(newExerciseHistory);
    }

    public void deleteExerciseHistory(Long exerciseHistoryId) {
        exerciseHistoryRepository.deleteById(exerciseHistoryId);
    }

    public void updateExerciseHistory(Long exerciseHistoryId, int sets, int weight, Exercise exercise) {
        ExerciseHistory exerciseHistory = exerciseHistoryRepository.findById(exerciseHistoryId).orElseThrow(IllegalArgumentException::new);
        exerciseHistory.setSets(sets);
        exerciseHistory.setWeight(weight);
        exerciseHistory.setExercise(exercise);
        exerciseHistoryRepository.save(exerciseHistory);
    }
}