package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.C7121e;
import java.util.HashMap;

@Deprecated
public final class CustomEventExtras implements C7121e {
    private final HashMap<String, Object> zzeob = new HashMap<>();

    public final Object getExtra(String str) {
        return this.zzeob.get(str);
    }

    public final void setExtra(String str, Object obj) {
        this.zzeob.put(str, obj);
    }
}
