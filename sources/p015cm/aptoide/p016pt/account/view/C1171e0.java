package p015cm.aptoide.p016pt.account.view;

import java.util.List;
import p015cm.aptoide.p016pt.permission.PermissionProvider;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.account.view.e0 */
/* compiled from: lambda */
public final /* synthetic */ class C1171e0 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C1171e0 f3596f = new C1171e0();

    private /* synthetic */ C1171e0() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((PermissionProvider.Permission) ((List) obj).get(0)).isGranted());
    }
}
