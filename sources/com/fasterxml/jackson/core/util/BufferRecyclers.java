package com.fasterxml.jackson.core.util;

import java.lang.ref.SoftReference;

public class BufferRecyclers {
    private static final ThreadLocalBufferManager _bufferRecyclerTracker = ("true".equals(System.getProperty("com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers")) ? ThreadLocalBufferManager.instance() : null);
    protected static final ThreadLocal<SoftReference<BufferRecycler>> _recyclerRef = new ThreadLocal<>();

    public static BufferRecycler getBufferRecycler() {
        BufferRecycler bufferRecycler;
        SoftReference<BufferRecycler> softReference;
        SoftReference softReference2 = _recyclerRef.get();
        if (softReference2 == null) {
            bufferRecycler = null;
        } else {
            bufferRecycler = (BufferRecycler) softReference2.get();
        }
        if (bufferRecycler == null) {
            bufferRecycler = new BufferRecycler();
            ThreadLocalBufferManager threadLocalBufferManager = _bufferRecyclerTracker;
            if (threadLocalBufferManager != null) {
                softReference = threadLocalBufferManager.wrapAndTrack(bufferRecycler);
            } else {
                softReference = new SoftReference<>(bufferRecycler);
            }
            _recyclerRef.set(softReference);
        }
        return bufferRecycler;
    }
}
