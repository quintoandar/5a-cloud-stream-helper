package br.com.quintoandar.cloudstream.streamlisteners;

public interface ChannelStreamListener<T> {
    /**
     * The first destination of a message. If this consumer fails to consume the message, it will be sent to retry expo
     * topic.
     * @param message the message that will be consumed
     */
    void consume(T message);
}
