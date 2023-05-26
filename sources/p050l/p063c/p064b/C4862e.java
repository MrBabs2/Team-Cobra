package p050l.p063c.p064b;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p037k.p040b.p041a.C4777a;
import p037k.p040b.p041a.C4779b;

/* renamed from: l.c.b.e */
/* compiled from: CustomTabsSession */
public final class C4862e {

    /* renamed from: a */
    private final C4779b f8333a;

    /* renamed from: b */
    private final C4777a f8334b;

    /* renamed from: c */
    private final ComponentName f8335c;

    C4862e(C4779b bVar, C4777a aVar, ComponentName componentName) {
        this.f8333a = bVar;
        this.f8334b = aVar;
        this.f8335c = componentName;
    }

    /* renamed from: a */
    public boolean mo16899a(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f8333a.mo16618a(this.f8334b, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ComponentName mo16900b() {
        return this.f8335c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public IBinder mo16898a() {
        return this.f8334b.asBinder();
    }
}
