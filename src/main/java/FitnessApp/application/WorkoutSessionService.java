package FitnessApp.application;

import FitnessApp.data.WorkoutSessionRepository;
import FitnessApp.domain.Workout;
import FitnessApp.domain.WorkoutSession;
import FitnessApp.domain.enums.WorkoutType;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Transactional
public class WorkoutSessionService {
    private final WorkoutSessionRepository workoutSessionRepository;

    public WorkoutSessionService(WorkoutSessionRepository workoutSessionRepository) {
        this.workoutSessionRepository = workoutSessionRepository;
    }

    public void addWorkoutSessionDate (Date startDate, Date endDate, Workout workout) {
        WorkoutSession newWorkoutSession = new WorkoutSession(startDate, endDate, workout);
        workoutSessionRepository.save(newWorkoutSession);
    }

    public void deleteWorkoutSession(Long workoutSessionId) {
        workoutSessionRepository.deleteById(workoutSessionId);
    }

    public void updateWorkoutSession(Long workoutSessionId, Date startDate, Date endDate, Workout workout) {
        WorkoutSession workoutSession = workoutSessionRepository.findById(workoutSessionId).orElseThrow(IllegalArgumentException::new);
        workoutSession.setStartDate(startDate);
        workoutSession.setEndDate(endDate);
        workoutSession.setWorkout(workout);
        workoutSessionRepository.save(workoutSession);
    }

    public void findbyworkout(Workout workout) {
        workoutSessionRepository.findByWorkout(workout);
    }

}
