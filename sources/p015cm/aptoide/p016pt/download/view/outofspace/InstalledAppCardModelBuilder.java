package p015cm.aptoide.p016pt.download.view.outofspace;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5631s;
import p015cm.aptoide.p016pt.download.view.outofspace.InstalledAppCardModel;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.download.view.outofspace.InstalledAppCardModelBuilder */
public interface InstalledAppCardModelBuilder {
    InstalledAppCardModelBuilder application(InstalledApp installedApp);

    InstalledAppCardModelBuilder eventSubject(C12871b<String> bVar);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo10783id(long j);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo10784id(long j, long j2);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo10785id(CharSequence charSequence);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo10786id(CharSequence charSequence, long j);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo10787id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    InstalledAppCardModelBuilder mo10788id(Number... numberArr);

    InstalledAppCardModelBuilder layout(int i);

    InstalledAppCardModelBuilder onBind(C5591f0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> f0Var);

    InstalledAppCardModelBuilder onUnbind(C5596h0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> h0Var);

    InstalledAppCardModelBuilder onVisibilityChanged(C5598i0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> i0Var);

    InstalledAppCardModelBuilder onVisibilityStateChanged(C5600j0<InstalledAppCardModel_, InstalledAppCardModel.CardHolder> j0Var);

    InstalledAppCardModelBuilder spanSizeOverride(C5631s.C5634c cVar);
}
