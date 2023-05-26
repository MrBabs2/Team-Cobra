package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.d */
/* compiled from: FragmentContainer */
public abstract class C0458d {
    /* renamed from: a */
    public abstract View mo2661a(int i);

    @Deprecated
    /* renamed from: a */
    public Fragment mo2760a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: a */
    public abstract boolean mo2662a();
}
