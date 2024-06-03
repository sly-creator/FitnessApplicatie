package FitnessApp.application;
import FitnessApp.data.WorkoutRepository;
import FitnessApp.domain.Workout;
import FitnessApp.domain.enums.WorkoutType;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class WorkoutService {
    private final WorkoutRepository workoutRepository;

    public WorkoutService(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    public void addWorkout(String name, String description, String image, WorkoutType workoutType) {
        Workout newWorkout = new Workout(name, description, image, workoutType);
        workoutRepository.save(newWorkout);
    }

    public void deleteWorkout(Long workoutId) {
        workoutRepository.deleteById(workoutId);
    }

    public void findWorkoutByName(String name) {
        workoutRepository.findByName(name);
    }

    public void updateWorkout(Long workoutId, String name, String description, String image, WorkoutType workoutType) {
        Workout workout = workoutRepository.findById(workoutId).orElseThrow(IllegalArgumentException::new);
        workout.setName(name);
        workout.setDescription(description);
        workout.setImage(image);
        workout.setWorkoutType(workoutType);
        workoutRepository.save(workout);
    }

    public void findWorkoutByWorkoutType(WorkoutType workoutType) {
        workoutRepository.findByWorkoutType(workoutType);
    }

}
