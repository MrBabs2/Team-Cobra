package p015cm.aptoide.p016pt.home.apps.list.models;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5631s;
import p015cm.aptoide.p016pt.home.apps.list.models.InstalledCardModel;
import p015cm.aptoide.p016pt.home.apps.model.InstalledApp;

/* renamed from: cm.aptoide.pt.home.apps.list.models.InstalledCardModelBuilder */
public interface InstalledCardModelBuilder {
    InstalledCardModelBuilder application(InstalledApp installedApp);

    /* renamed from: id */
    InstalledCardModelBuilder mo12024id(long j);

    /* renamed from: id */
    InstalledCardModelBuilder mo12025id(long j, long j2);

    /* renamed from: id */
    InstalledCardModelBuilder mo12026id(CharSequence charSequence);

    /* renamed from: id */
    InstalledCardModelBuilder mo12027id(CharSequence charSequence, long j);

    /* renamed from: id */
    InstalledCardModelBuilder mo12028id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    InstalledCardModelBuilder mo12029id(Number... numberArr);

    InstalledCardModelBuilder layout(int i);

    InstalledCardModelBuilder onBind(C5591f0<InstalledCardModel_, InstalledCardModel.CardHolder> f0Var);

    InstalledCardModelBuilder onUnbind(C5596h0<InstalledCardModel_, InstalledCardModel.CardHolder> h0Var);

    InstalledCardModelBuilder onVisibilityChanged(C5598i0<InstalledCardModel_, InstalledCardModel.CardHolder> i0Var);

    InstalledCardModelBuilder onVisibilityStateChanged(C5600j0<InstalledCardModel_, InstalledCardModel.CardHolder> j0Var);

    InstalledCardModelBuilder spanSizeOverride(C5631s.C5634c cVar);
}
