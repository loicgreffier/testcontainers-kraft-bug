package io.loicgreffier.testcontainers.kraft;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@Slf4j
@Testcontainers
@SpringBootTest(webEnvironment = DEFINED_PORT)
public class SecondKraftChildIntegrationTest extends KraftIntegrationTest {
    @Test
    void testB() {
        log.info("testB");
    }
}
