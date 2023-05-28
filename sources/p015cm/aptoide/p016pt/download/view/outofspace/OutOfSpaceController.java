package p015cm.aptoide.p016pt.download.view.outofspace;

import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/OutOfSpaceController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "()V", "uninstallEvent", "Lrx/subjects/PublishSubject;", "", "getUninstallEvent", "()Lrx/subjects/PublishSubject;", "buildModels", "", "installedApps", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.OutOfSpaceController */
/* compiled from: OutOfSpaceController.kt */
public final class OutOfSpaceController extends TypedEpoxyController<List<? extends InstalledApp>> {
    private final C12871b<String> uninstallEvent;

    public OutOfSpaceController() {
        C12871b<String> p = C12871b.m41468p();
        C10202j.m34174a((Object) p, "PublishSubject.create()");
        this.uninstallEvent = p;
    }

    public final C12871b<String> getUninstallEvent() {
        return this.uninstallEvent;
    }

    /* access modifiers changed from: protected */
    public void buildModels(List<InstalledApp> list) {
        C10202j.m34178b(list, "installedApps");
        for (InstalledApp next : list) {
            new InstalledAppCardModel_().m5410id((CharSequence) "installed", new CharSequence[]{next.getIdentifier()}).eventSubject((C12871b) this.uninstallEvent).application(next).addTo(this);
        }
    }
}
