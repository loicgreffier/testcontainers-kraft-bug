package io.loicgreffier.testcontainers.kraft;

import org.testcontainers.containers.KafkaContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.utility.DockerImageName;

abstract class KraftIntegrationTest {
    @Container
    static KafkaContainer broker = new KafkaContainer(DockerImageName
            .parse("confluentinc/cp-kafka:7.6.1"))
            .withKraft();
}
