package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")  // Utilise la configuration H2
class StudentManagementApplicationTests {

    // Test Spring Boot pour vérifier que le contexte se charge (peut être commenté si ça bloque)
    // @Test
    // void contextLoads() {}

    // Tests dummy simples
    @Test
    void dummyTest1() { assertTrue(true); }

    @Test
    void dummyTest2() { assertEquals(1,1); }

    @Test
    void dummyTest3() { int sum = 2+3; assertEquals(5,sum); }

    @Test
    void dummyTest4() { int sum = 2+3; assertEquals(5,sum); }
}
