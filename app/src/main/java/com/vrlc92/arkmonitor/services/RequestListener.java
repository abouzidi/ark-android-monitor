package com.vrlc92.arkmonitor.services;

public interface RequestListener<T> {
    void onFailure(Exception e);
    void onResponse(T object);
}
