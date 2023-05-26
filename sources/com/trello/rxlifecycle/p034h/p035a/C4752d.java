package com.trello.rxlifecycle.p034h.p035a;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.trello.rxlifecycle.C4749b;
import com.trello.rxlifecycle.C4750c;
import com.trello.rxlifecycle.p209g.C9008b;
import com.trello.rxlifecycle.p209g.C9009c;
import p123rx.C5368e;
import p123rx.p127s.C5380a;

/* renamed from: com.trello.rxlifecycle.h.a.d */
/* compiled from: RxFragment */
public abstract class C4752d extends Fragment {
    private final C5380a<C9008b> lifecycleSubject = C5380a.m10348p();

    public final <T> C4749b<T> bindToLifecycle() {
        return C9009c.m29571b(this.lifecycleSubject);
    }

    public final C5368e<C9008b> lifecycle() {
        return this.lifecycleSubject.mo18632a();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.lifecycleSubject.onNext(C9008b.ATTACH);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.lifecycleSubject.onNext(C9008b.CREATE);
    }

    public void onDestroy() {
        this.lifecycleSubject.onNext(C9008b.DESTROY);
        super.onDestroy();
    }

    public void onDestroyView() {
        this.lifecycleSubject.onNext(C9008b.DESTROY_VIEW);
        super.onDestroyView();
    }

    public void onDetach() {
        this.lifecycleSubject.onNext(C9008b.DETACH);
        super.onDetach();
    }

    public void onPause() {
        this.lifecycleSubject.onNext(C9008b.PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.lifecycleSubject.onNext(C9008b.RESUME);
    }

    public void onStart() {
        super.onStart();
        this.lifecycleSubject.onNext(C9008b.START);
    }

    public void onStop() {
        this.lifecycleSubject.onNext(C9008b.STOP);
        super.onStop();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.lifecycleSubject.onNext(C9008b.CREATE_VIEW);
    }

    public final <T> C4749b<T> bindUntilEvent(C9008b bVar) {
        return C4750c.m7795a(this.lifecycleSubject, bVar);
    }
}
