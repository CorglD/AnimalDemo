import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal testAnimal;

    @BeforeEach
    void setUp() {
        testAnimal = new Animal("test", 69, "testcat", "testloud");
    }

    @Test
    void giveAnimalLoud() {

        Assertions.assertEquals("testloud",testAnimal.getAnimalLoud() );

    }

    @Test
    void getNameAndAge() {
        Assertions.assertEquals("Name: " + "test" + "Alter: " + 69, testAnimal.getNameAndAge());
    }

    @Test
    void ageCategory() {
        Assertions.assertEquals("old animal", testAnimal.ageCategory());
    }
}