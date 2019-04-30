package br.com.quintoandar.cloudstream.streamlisteners;

public interface ChannelStreamListener<T> {
    void consume(T var1);

    void dlq(T var1);
}
