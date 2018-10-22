package pl.coderslab.advanced.dao.simple.exercise.pl.coderslab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExerciseDao extends AbstractExercise {

    private static final String LOAD_ALL_QUERY = "SELECT * FROM exercises";
    private static final String LOAD_BY_ID_QUERY = "SELECT * FROM exercises WHERE id=?;";
    private static final String CREATE_QUERY = "INSERT INTO exercises(title, description) VALUES(?,?)";
    private static final String UPDATE_QUERY = "UPDATE exercises SET title = ?, description = ? WHERE id = ?";
    private static final String DELETE_QUERY = "DELETE FROM exercises WHERE id=?;";

    @Override
    protected PreparedStatement saveNewStatement(Connection con, ExerciseModel exerciseModel) throws SQLException {
        String[] genereatedColumns = { "id" };
        PreparedStatement ps = con.prepareStatement(CREATE_QUERY, genereatedColumns);
        ps.setString(1, ((Exercise) exerciseModel).getTitle());
        ps.setString(2, ((Exercise) exerciseModel).getDescription());
        return ps;

    }

    @Override
    protected PreparedStatement updateExistingStatement(Connection con, ExerciseModel exerciseModel) throws SQLException {
        PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
        ps.setString(1, ((Exercise) exerciseModel).getTitle());
        ps.setString(2, ((Exercise) exerciseModel).getDescription());
        ps.setLong(3, exerciseModel.getId());
        return ps;
    }

    @Override
    protected PreparedStatement deleteStatement(Connection con, ExerciseModel exerciseModel) throws SQLException {
        PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
        ps.setLong(1, exerciseModel.getId());
        return ps;

    }

    @Override
    protected Exercise newFromResultSet(ResultSet rs) throws SQLException {
        return new Exercise(rs.getInt("id"), rs.getString("title"), rs.getString("description"));
    }

    @Override
    protected String getLoadAllQuery() {
        return LOAD_ALL_QUERY;
    }

    @Override
    protected String getLoadByIdQuery() {
        return LOAD_BY_ID_QUERY;
    }
}
