package p015cm.aptoide.p016pt.utils;

import java.util.Comparator;
import p015cm.aptoide.p016pt.permissions.ApkPermission;

/* renamed from: cm.aptoide.pt.utils.b */
/* compiled from: lambda */
public final /* synthetic */ class C4454b implements Comparator {

    /* renamed from: f */
    public static final /* synthetic */ C4454b f7670f = new C4454b();

    private /* synthetic */ C4454b() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((ApkPermission) obj).getName().compareTo(((ApkPermission) obj2).getName());
    }
}
