package p015cm.aptoide.p016pt.home.apps.list.models;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5631s;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.list.models.UpdateCardModel;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.apps.list.models.UpdateCardModelBuilder */
public interface UpdateCardModelBuilder {
    UpdateCardModelBuilder application(UpdateApp updateApp);

    UpdateCardModelBuilder eventSubject(C12871b<AppClick> bVar);

    /* renamed from: id */
    UpdateCardModelBuilder mo12096id(long j);

    /* renamed from: id */
    UpdateCardModelBuilder mo12097id(long j, long j2);

    /* renamed from: id */
    UpdateCardModelBuilder mo12098id(CharSequence charSequence);

    /* renamed from: id */
    UpdateCardModelBuilder mo12099id(CharSequence charSequence, long j);

    /* renamed from: id */
    UpdateCardModelBuilder mo12100id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    UpdateCardModelBuilder mo12101id(Number... numberArr);

    UpdateCardModelBuilder layout(int i);

    UpdateCardModelBuilder onBind(C5591f0<UpdateCardModel_, UpdateCardModel.CardHolder> f0Var);

    UpdateCardModelBuilder onUnbind(C5596h0<UpdateCardModel_, UpdateCardModel.CardHolder> h0Var);

    UpdateCardModelBuilder onVisibilityChanged(C5598i0<UpdateCardModel_, UpdateCardModel.CardHolder> i0Var);

    UpdateCardModelBuilder onVisibilityStateChanged(C5600j0<UpdateCardModel_, UpdateCardModel.CardHolder> j0Var);

    UpdateCardModelBuilder spanSizeOverride(C5631s.C5634c cVar);

    UpdateCardModelBuilder themeManager(ThemeManager themeManager);
}
