package FitnessApp.application;

import FitnessApp.data.ExerciseRepository;
import FitnessApp.domain.Exercise;
import FitnessApp.domain.enums.ExerciseType;
import FitnessApp.domain.enums.MuscleType;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExerciseService {
    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public void addExercise(String name, String description, String image, int sets, int reps, MuscleType muscleType, ExerciseType exerciseType) {
        Exercise newExercise = new Exercise(name, description, image, sets, reps, muscleType, exerciseType);
        exerciseRepository.save(newExercise);
    }


    public void deleteExercise(Long exerciseId) {
        exerciseRepository.deleteById(exerciseId);
    }

    public void updateExercise(Long exerciseId, String name, String description, String image, int sets, int reps, MuscleType muscleType, ExerciseType exerciseType) {
        Exercise exercise = exerciseRepository.findById(exerciseId).orElseThrow(IllegalArgumentException::new);
        exercise.setName(name);
        exercise.setDescription(description);
        exercise.setImage(image);
        exercise.setSets(sets);
        exercise.setReps(reps);
        exercise.setMuscleType(muscleType);
        exercise.setExerciseType(exerciseType);
        exerciseRepository.save(exercise);
    }

    public Exercise findExerciseByName(String name) {
        return exerciseRepository.findByName(name);
    }

public Exercise findExerciseByMuscleType(MuscleType muscleType) {
        return exerciseRepository.findByMuscleType(muscleType);
    }


}
