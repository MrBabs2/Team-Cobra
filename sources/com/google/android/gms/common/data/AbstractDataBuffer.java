package com.google.android.gms.common.data;

import java.util.Iterator;

public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {

    /* renamed from: f */
    protected final DataHolder f14024f;

    /* renamed from: a */
    public void mo24917a() {
        DataHolder dataHolder = this.f14024f;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    public abstract T get(int i);

    public int getCount() {
        DataHolder dataHolder = this.f14024f;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.getCount();
    }

    public Iterator<T> iterator() {
        return new DataBufferIterator(this);
    }
}
