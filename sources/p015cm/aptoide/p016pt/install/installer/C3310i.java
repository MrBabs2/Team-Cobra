package p015cm.aptoide.p016pt.install.installer;

import android.content.Intent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.install.installer.i */
/* compiled from: lambda */
public final /* synthetic */ class C3310i implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ String f6251f;

    public /* synthetic */ C3310i(String str) {
        this.f6251f = str;
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((Intent) obj).getData().toString().contains(this.f6251f));
    }
}
