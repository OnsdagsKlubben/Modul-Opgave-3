package org.dat18c.shipsandsails.repositories;

import java.util.List;

import org.dat18c.shipsandsails.models.Scenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public final class ScenarioRepository
{
    @Autowired
    JdbcTemplate template;

    public List<Scenario> fetchAllScenarios()
    {
        String sql = "SELECT * FROM scenarios";

        RowMapper<Scenario> rowMapper = new BeanPropertyRowMapper<>(Scenario.class);

        return template.query(sql, rowMapper);
    }
}