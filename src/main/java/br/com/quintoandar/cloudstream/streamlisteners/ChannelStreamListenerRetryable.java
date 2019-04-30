package br.com.quintoandar.cloudstream.streamlisteners;

public interface ChannelStreamListenerRetryable<T> extends ChannelStreamListener<T> {
    void retryExpo(T var1);

    void retryLinear(T var1);
}
