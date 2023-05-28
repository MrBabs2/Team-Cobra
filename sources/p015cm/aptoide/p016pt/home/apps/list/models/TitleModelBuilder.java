package p015cm.aptoide.p016pt.home.apps.list.models;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5631s;
import p015cm.aptoide.p016pt.home.apps.list.models.TitleModel;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.apps.list.models.TitleModelBuilder */
public interface TitleModelBuilder {
    TitleModelBuilder eventSubject(C12871b<Void> bVar);

    /* renamed from: id */
    TitleModelBuilder mo12053id(long j);

    /* renamed from: id */
    TitleModelBuilder mo12054id(long j, long j2);

    /* renamed from: id */
    TitleModelBuilder mo12055id(CharSequence charSequence);

    /* renamed from: id */
    TitleModelBuilder mo12056id(CharSequence charSequence, long j);

    /* renamed from: id */
    TitleModelBuilder mo12057id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    TitleModelBuilder mo12058id(Number... numberArr);

    TitleModelBuilder layout(int i);

    TitleModelBuilder onBind(C5591f0<TitleModel_, TitleModel.Holder> f0Var);

    TitleModelBuilder onUnbind(C5596h0<TitleModel_, TitleModel.Holder> h0Var);

    TitleModelBuilder onVisibilityChanged(C5598i0<TitleModel_, TitleModel.Holder> i0Var);

    TitleModelBuilder onVisibilityStateChanged(C5600j0<TitleModel_, TitleModel.Holder> j0Var);

    TitleModelBuilder shouldShowButton(boolean z);

    TitleModelBuilder spanSizeOverride(C5631s.C5634c cVar);

    TitleModelBuilder title(Integer num);
}
