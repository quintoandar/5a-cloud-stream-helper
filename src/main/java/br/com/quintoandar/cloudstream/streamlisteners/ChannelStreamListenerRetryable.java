package br.com.quintoandar.cloudstream.streamlisteners;

public interface ChannelStreamListenerRetryable<T> extends ChannelStreamListener<T> {

    /**
     * Consumer that will handle the failed message and will retry exponentially to process the message
     * using the policies specified for the current channel input in the .properties file.
     * @param message the message that will be consumed
     */
    void retryExpo(T message);

    /**
     * Consumer that will handle the failed message and will retry using linear time to process the message.
     * It will be called after retryExpo finished all attempts.
     * @param message the message that will be consumed
     */
    void retryLinear(T message);
}
