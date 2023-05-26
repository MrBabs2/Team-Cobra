package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.NoSuchElementException;

@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {

    /* renamed from: h */
    private T f14048h;

    public T next() {
        if (hasNext()) {
            int i = this.f14031g + 1;
            this.f14031g = i;
            if (i == 0) {
                T t = this.f14030f.get(0);
                this.f14048h = t;
                if (!(t instanceof DataBufferRef)) {
                    String valueOf = String.valueOf(this.f14048h.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append("DataBuffer reference of type ");
                    sb.append(valueOf);
                    sb.append(" is not movable");
                    throw new IllegalStateException(sb.toString());
                }
            } else {
                ((DataBufferRef) this.f14048h).mo25224a(i);
            }
            return this.f14048h;
        }
        int i2 = this.f14031g;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Cannot advance the iterator beyond ");
        sb2.append(i2);
        throw new NoSuchElementException(sb2.toString());
    }
}
