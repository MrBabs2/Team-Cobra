package com.trello.rxlifecycle.p034h.p035a;

import android.os.Bundle;
import androidx.appcompat.app.C0076d;
import com.trello.rxlifecycle.C4749b;
import com.trello.rxlifecycle.C4750c;
import com.trello.rxlifecycle.p209g.C9007a;
import com.trello.rxlifecycle.p209g.C9009c;
import p123rx.C5368e;
import p123rx.p127s.C5380a;

/* renamed from: com.trello.rxlifecycle.h.a.a */
/* compiled from: RxAppCompatActivity */
public abstract class C4751a extends C0076d {
    private final C5380a<C9007a> lifecycleSubject = C5380a.m10348p();

    public final <T> C4749b<T> bindToLifecycle() {
        return C9009c.m29570a(this.lifecycleSubject);
    }

    public final C5368e<C9007a> lifecycle() {
        return this.lifecycleSubject.mo18632a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.lifecycleSubject.onNext(C9007a.CREATE);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.lifecycleSubject.onNext(C9007a.DESTROY);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.lifecycleSubject.onNext(C9007a.PAUSE);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.lifecycleSubject.onNext(C9007a.RESUME);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.lifecycleSubject.onNext(C9007a.START);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.lifecycleSubject.onNext(C9007a.STOP);
        super.onStop();
    }

    public final <T> C4749b<T> bindUntilEvent(C9007a aVar) {
        return C4750c.m7795a(this.lifecycleSubject, aVar);
    }
}
