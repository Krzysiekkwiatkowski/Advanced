package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

import pl.coderslab.advanced.dao.simple.exercise.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractExercise implements AbstractInterface {

    protected abstract Exercise newFromResultSet(ResultSet rs) throws SQLException;

    protected abstract String getLoadAllQuery();

    protected abstract String getLoadByIdQuery();

    protected abstract PreparedStatement saveNewStatement(Connection con, ExerciseModel exerciseModel) throws SQLException;

    protected abstract PreparedStatement updateExistingStatement(Connection con, ExerciseModel exerciseModel) throws SQLException;

    protected abstract PreparedStatement deleteStatement(Connection con, ExerciseModel exerciseModel) throws SQLException;

    public List<ExerciseModel> loadAll() {
        List<ExerciseModel> list = new ArrayList<>();
        try (Connection con = DbUtil.getConnection()) {
            try (ResultSet rs = con.prepareStatement(getLoadAllQuery()).executeQuery()) {
                while (rs.next()) {
                    list.add(newFromResultSet(rs));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ExerciseModel loadById(Integer id) {
        try (Connection con = DbUtil.getConnection()) {
            try (PreparedStatement ps = con.prepareStatement(getLoadByIdQuery())) {
                ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    return newFromResultSet(rs);
                }
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void save(ExerciseModel exerciseModel) {
        try (Connection con = DbUtil.getConnection()) {
            if (exerciseModel.getId() == null) {
                saveNewToDb(con, exerciseModel);
            } else {
                updateExistingInDb(con, exerciseModel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void saveNewToDb(Connection con, ExerciseModel exerciseModel) throws SQLException {
        try (PreparedStatement ps = saveNewStatement(con, exerciseModel)) {
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                exerciseModel.setId(rs.getInt(1));
            }
            rs.close();
        }
    }

    private void updateExistingInDb(Connection con, ExerciseModel exerciseModel) throws SQLException {
        try (PreparedStatement ps = updateExistingStatement(con, exerciseModel)) {
            ps.executeUpdate();
        }
    }

    public void delete(ExerciseModel exerciseModel) {
        try (Connection con = DbUtil.getConnection()) {
            if (exerciseModel.getId() != 0) {
                try (PreparedStatement ps = deleteStatement(con, exerciseModel)) {
                    ps.executeUpdate();
                }
                exerciseModel.setId(0);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
