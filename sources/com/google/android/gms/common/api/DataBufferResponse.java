package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

@KeepForSdk
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    /* renamed from: a */
    public void mo24917a() {
        ((AbstractDataBuffer) mo24970b()).mo24917a();
    }

    public T get(int i) {
        return ((AbstractDataBuffer) mo24970b()).get(i);
    }

    public int getCount() {
        return ((AbstractDataBuffer) mo24970b()).getCount();
    }

    public Iterator<T> iterator() {
        return ((AbstractDataBuffer) mo24970b()).iterator();
    }
}
