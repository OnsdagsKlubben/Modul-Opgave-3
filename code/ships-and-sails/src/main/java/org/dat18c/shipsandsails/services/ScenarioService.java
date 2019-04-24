package org.dat18c.shipsandsails.services;

import java.util.List;

import org.dat18c.shipsandsails.models.Scenario;
import org.dat18c.shipsandsails.repositories.ScenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ScenarioService
 */
@Service
public class ScenarioService 
{
    @Autowired
    private ScenarioRepository scenarioRepository;

    public List<Scenario> fetchAllScenarios()
    {
        return scenarioRepository.fetchAllScenarios();
    }
}