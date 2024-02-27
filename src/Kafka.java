public class Kafka {
    /**
     * Topics -> Partitions -> Offset(Message Id)
     * Kafka Topics are immutable -> Once data is written to partition, we cannot delete or change it
     * Data is kept only for a limited time, default is 1 week
     * Order is guaranteed only within a partition because data are kept in a sequence in partition
     * Data is assigned randomly to a partition unless a key is specified
     * We can have as many partitions in a topic as many as we want
     *
     * If we dont provide key while sending messages to Kafka, Default assignment of messages to partition is Round Robin
     * If we provide a key, then all messages for that key will got to the same partition
     *
     * 2 consumers from the same consumer group cannot read data from the same partition, only 1 can.
     * we can set a distinct consumer group with group.id parameter
     *
     * Consumer Offsets - Kafka stores the offset at which a consumer group has been reading
     * The offsets committed are in a Kafka topic name __consumer_offsets
     *
     * Brokers - Brokers are servers which basically receive and send data
     * Each broker is identified with its id, and each broker contains certain topic partitions
     * Each broker have metadata information about entire kafka cluster and other kafka brokers
     *
     * At any time, only 1 broker can be a leader for a given partition
     * Producers can only send data to the broker that is leader of a partition
     * Consumers will read data from the broker that is leader of a partition
     *
     * Zookeeper manages Kafka Brokers
     * Zookeeper helps in leader election of brokers
     * Zookeeper sends notifications to Kafka in case of changes (topic creation, deletion, broker dies, broker alive, etc)
     */
}
