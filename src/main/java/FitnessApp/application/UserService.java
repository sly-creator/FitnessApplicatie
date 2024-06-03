package FitnessApp.application;

import FitnessApp.data.UserRepository;
import FitnessApp.domain.ExerciseHistory;
import FitnessApp.domain.User;
import FitnessApp.domain.Workout;
import FitnessApp.domain.WorkoutSession;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name, String email, String password) {
        User user = new User(name, email, password);
        return userRepository.save(user);
    }

    public User findUserByName(String name) {
        return userRepository.findByName(name);
    }

    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void addWorkout(User user, Workout workout) {
        user.addWorkOut(workout);
        userRepository.save(user);
    }

    public void addWorkoutSession(User user, WorkoutSession workoutSession) {
        user.addWorkOutSession(workoutSession);
        userRepository.save(user);
    }

    public void addExerciseHistory(User user, ExerciseHistory exerciseHistory) {
        user.addExerciseHistory(exerciseHistory);
        userRepository.save(user);
    }

    public void removeWorkout(User user, Workout workout) {
        user.removeWorkOut(workout);
        userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

}
