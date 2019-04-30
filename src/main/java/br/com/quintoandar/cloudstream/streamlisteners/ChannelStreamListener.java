package br.com.quintoandar.cloudstream.streamlisteners;

public interface ChannelStreamListener<T> {
    void consume(T message);

    /**
     * The end destination of a message that have failed to be processed using the retry polices.
     * We will produce this message to a place where we can be informed that this happened.
     **/
    void dlq(T message);
}
