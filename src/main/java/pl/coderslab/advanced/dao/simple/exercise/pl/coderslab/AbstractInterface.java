package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

import java.util.List;

public interface AbstractInterface {

    public List<ExerciseModel> loadAll();
    public ExerciseModel loadById(Integer id);
    public void save(ExerciseModel object);
    public void delete(ExerciseModel object);

}
