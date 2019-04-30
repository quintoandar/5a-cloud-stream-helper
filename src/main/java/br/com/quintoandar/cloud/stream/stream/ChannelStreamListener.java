package br.com.quintoandar.cloud.stream.stream;

public interface ChannelStreamListener<T> {
    void consume(T var1);

    void dlq(T var1);
}
