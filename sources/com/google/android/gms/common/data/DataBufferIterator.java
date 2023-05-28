package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: f */
    protected final DataBuffer<T> f14030f;

    /* renamed from: g */
    protected int f14031g = -1;

    public DataBufferIterator(DataBuffer<T> dataBuffer) {
        Preconditions.m16037a(dataBuffer);
        this.f14030f = dataBuffer;
    }

    public boolean hasNext() {
        return this.f14031g < this.f14030f.getCount() - 1;
    }

    public T next() {
        if (hasNext()) {
            DataBuffer<T> dataBuffer = this.f14030f;
            int i = this.f14031g + 1;
            this.f14031g = i;
            return dataBuffer.get(i);
        }
        int i2 = this.f14031g;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
