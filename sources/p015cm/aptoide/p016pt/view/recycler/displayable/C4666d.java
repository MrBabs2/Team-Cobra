package p015cm.aptoide.p016pt.view.recycler.displayable;

import java.util.Comparator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.d */
/* compiled from: lambda */
public final /* synthetic */ class C4666d implements Comparator {

    /* renamed from: f */
    public static final /* synthetic */ C4666d f7938f = new C4666d();

    private /* synthetic */ C4666d() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((Store) obj).getName().compareTo(((Store) obj2).getName());
    }
}
