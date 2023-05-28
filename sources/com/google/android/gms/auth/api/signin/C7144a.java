package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: com.google.android.gms.auth.api.signin.a */
final /* synthetic */ class C7144a implements Comparator {

    /* renamed from: f */
    static final Comparator f13572f = new C7144a();

    private C7144a() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).mo24975d().compareTo(((Scope) obj2).mo24975d());
    }
}
