package com.example.swplanetapi.services;

import static com.example.swplanetapi.common.PlanetConstants.PLANET;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.example.swplanetapi.entities.Planet;
import com.example.swplanetapi.repositories.PlanetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

//@SpringBootTest(classes = PlanetService.class)
@ExtendWith(MockitoExtension.class)
public class PlanetServiceTest {
    @InjectMocks
    private PlanetService planetService;
    @Mock
    private PlanetRepository planetRepository;

    @Test
    public void createPlanet_WithValidData_ReturnsPlanet(){
        //Arrange
        when(planetRepository.save(PLANET)).thenReturn(PLANET);
        //Act
        Planet sut = planetService.create(PLANET);
        //Assert
        assertThat(sut).isEqualTo(PLANET);
    }
}
