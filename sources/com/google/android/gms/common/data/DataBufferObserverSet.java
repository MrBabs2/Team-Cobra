package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBufferObserver;
import java.util.HashSet;

public final class DataBufferObserverSet implements DataBufferObserver, DataBufferObserver.Observable {
    public DataBufferObserverSet() {
        new HashSet();
    }
}
