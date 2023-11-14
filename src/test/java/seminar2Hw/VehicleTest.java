package seminar2Hw;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup() {
        car = new Car("Rolls-royce","Phantom",2023);
        motorcycle = new Motorcycle("Ducati","Diavel 1260S",2023);
    }

    @Test
    void carIsVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void carHasFourWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void motorcycleHasTwoWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    void carSpeedTest() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void motorcycleSpeedTest() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void carParkingTest() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void motorcycleParkingTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

}