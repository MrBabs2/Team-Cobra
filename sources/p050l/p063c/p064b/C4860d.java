package p050l.p063c.p064b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p037k.p040b.p041a.C4779b;

/* renamed from: l.c.b.d */
/* compiled from: CustomTabsServiceConnection */
public abstract class C4860d implements ServiceConnection {

    /* renamed from: l.c.b.d$a */
    /* compiled from: CustomTabsServiceConnection */
    class C4861a extends C4850b {
        C4861a(C4860d dVar, C4779b bVar, ComponentName componentName) {
            super(bVar, componentName);
        }
    }

    /* renamed from: a */
    public abstract void mo16881a(ComponentName componentName, C4850b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo16881a(componentName, new C4861a(this, C4779b.C4780a.m7892a(iBinder), componentName));
    }
}
