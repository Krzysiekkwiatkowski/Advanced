package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ExerciseDao exerciseDao = new ExerciseDao();
        Exercise exercise = new Exercise("Tytuł 1", "Opis 1");
        exerciseDao.save(exercise);

        List<ExerciseModel> exercises = exerciseDao.loadAll();
        for (ExerciseModel exerciseModel : exercises) {
            Exercise loadedExercise = (Exercise) exerciseModel;
            System.out.println(loadedExercise.getTitle() + " " + loadedExercise.getDescription());
        }
        exercise.setTitle("Tytuł 2");
        exercise.setDescription("Opis 2");
        exerciseDao.save(exercise);

        Exercise firstElement = (Exercise) exerciseDao.loadById(1);
        if(firstElement != null){
            exerciseDao.delete(firstElement);
        }
    }
}
