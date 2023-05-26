package p015cm.aptoide.p016pt.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.p126m.C5377a;
import p123rx.p128t.C12889e;

/* renamed from: cm.aptoide.pt.utils.BroadcastRegisterOnSubscribe */
public class BroadcastRegisterOnSubscribe implements C5368e.C5370a<Intent> {
    private final String broadcastPermission;
    /* access modifiers changed from: private */
    public final Context context;
    private final IntentFilter intentFilter;
    private final Handler schedulerHandler;

    public BroadcastRegisterOnSubscribe(Context context2, IntentFilter intentFilter2, String str, Handler handler) {
        this.context = context2;
        this.intentFilter = intentFilter2;
        this.broadcastPermission = str;
        this.schedulerHandler = handler;
    }

    public void call(final C12475j<? super Intent> jVar) {
        final C44471 r0 = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                if (!jVar.isUnsubscribed()) {
                    jVar.onNext(intent);
                }
            }
        };
        jVar.add(C12889e.m41501a(new C5377a() {
            public void call() {
                BroadcastRegisterOnSubscribe.this.context.unregisterReceiver(r0);
            }
        }));
        this.context.registerReceiver(r0, this.intentFilter, this.broadcastPermission, this.schedulerHandler);
    }
}
