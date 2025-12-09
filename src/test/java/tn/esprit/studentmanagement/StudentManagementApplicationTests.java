package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")  // Utilise le profil H2 en mémoire pour les tests
class StudentManagementApplicationTests {

    // Test standard pour vérifier que Spring Boot démarre
    @Test
    void contextLoads() {
        // Aucun code nécessaire, le test passe si ApplicationContext se charge correctement
    }

    // Tests "dummy" indépendants du contexte Spring
    @Test
    void dummyTest1() {
        assertTrue(true);
    }

    @Test
    void dummyTest2() {
        assertEquals(1, 1);
    }

    @Test
    void dummyTest3() {
        int sum = 2 + 3;
        assertEquals(5, sum);
    }

    @Test
    void dummyTest4() {
        int sum = 2 + 3;
        assertEquals(5, sum);
    }
}
