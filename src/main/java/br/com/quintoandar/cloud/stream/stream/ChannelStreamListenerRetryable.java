package br.com.quintoandar.cloud.stream.stream;

public interface ChannelStreamListenerRetryable<T> extends ChannelStreamListener<T> {
    void retryExpo(T var1);

    void retryLinear(T var1);
}
