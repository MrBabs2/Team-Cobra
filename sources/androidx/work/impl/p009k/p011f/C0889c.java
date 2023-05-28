package androidx.work.impl.p009k.p011f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.C0834i;
import androidx.work.impl.utils.p014k.C0956a;

/* renamed from: androidx.work.impl.k.f.c */
/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class C0889c<T> extends C0891d<T> {

    /* renamed from: h */
    private static final String f3167h = C0834i.m3721a("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g */
    private final BroadcastReceiver f3168g = new C0890a();

    /* renamed from: androidx.work.impl.k.f.c$a */
    /* compiled from: BroadcastReceiverConstraintTracker */
    class C0890a extends BroadcastReceiver {
        C0890a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C0889c.this.mo4849a(context, intent);
            }
        }
    }

    public C0889c(Context context, C0956a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public abstract void mo4849a(Context context, Intent intent);

    /* renamed from: b */
    public void mo4851b() {
        C0834i.m3720a().mo4726a(f3167h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f3172b.registerReceiver(this.f3168g, mo4850d());
    }

    /* renamed from: c */
    public void mo4852c() {
        C0834i.m3720a().mo4726a(f3167h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f3172b.unregisterReceiver(this.f3168g);
    }

    /* renamed from: d */
    public abstract IntentFilter mo4850d();
}
