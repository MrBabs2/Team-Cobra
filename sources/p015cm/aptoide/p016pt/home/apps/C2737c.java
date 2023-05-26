package p015cm.aptoide.p016pt.home.apps;

import java.util.Comparator;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;

/* renamed from: cm.aptoide.pt.home.apps.c */
/* compiled from: lambda */
public final /* synthetic */ class C2737c implements Comparator {

    /* renamed from: f */
    public static final /* synthetic */ C2737c f5570f = new C2737c();

    private /* synthetic */ C2737c() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((DownloadApp) obj).getName().compareToIgnoreCase(((DownloadApp) obj2).getName());
    }
}
