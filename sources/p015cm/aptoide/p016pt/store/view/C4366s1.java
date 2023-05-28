package p015cm.aptoide.p016pt.store.view;

import java.util.List;
import p015cm.aptoide.p016pt.view.fragment.DisplayableManager;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.s1 */
/* compiled from: lambda */
public final /* synthetic */ class C4366s1 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ DisplayableManager f7491f;

    public /* synthetic */ C4366s1(DisplayableManager displayableManager) {
        this.f7491f = displayableManager;
    }

    public final void call(Object obj) {
        this.f7491f.clearDisplayables().addDisplayables((List) obj, true);
    }
}
