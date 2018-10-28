package com.makers.airport_challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
class AirportTest {

    Airport airport;

    @Mock
    private Plane planeMock;

    @BeforeEach
    void init(){
        //this line works because the Plane class is now in the same package as AirportTest class.
        MockitoAnnotations.initMocks(this);
        airport = new Airport();
    }
    @Test
    void AirportToCreateAInstanceOf()
    {
        assertThat(airport, instanceOf(Airport.class));
    }
    @Test
    void AirportToInstructAPlaneToLand()
    {
        String expected = "Plane has landed";
        when(planeMock.getStatus()).thenReturn(expected);
        assertEquals(expected, airport.landPlane(planeMock));
    }
}