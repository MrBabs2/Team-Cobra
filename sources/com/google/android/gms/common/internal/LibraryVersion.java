package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
public class LibraryVersion {
    static {
        new GmsLogger("LibraryVersion", "");
        new LibraryVersion();
    }

    @VisibleForTesting
    protected LibraryVersion() {
        new ConcurrentHashMap();
    }
}
