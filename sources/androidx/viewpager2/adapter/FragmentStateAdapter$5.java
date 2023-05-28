package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.C0514f;
import androidx.lifecycle.C0519h;
import androidx.lifecycle.C0521j;

class FragmentStateAdapter$5 implements C0519h {

    /* renamed from: a */
    final /* synthetic */ Handler f2919a;

    /* renamed from: b */
    final /* synthetic */ Runnable f2920b;

    /* renamed from: a */
    public void mo136a(C0521j jVar, C0514f.C0515a aVar) {
        if (aVar == C0514f.C0515a.ON_DESTROY) {
            this.f2919a.removeCallbacks(this.f2920b);
            jVar.getLifecycle().mo3040b(this);
        }
    }
}
