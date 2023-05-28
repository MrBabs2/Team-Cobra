package p015cm.aptoide.p016pt.home.apps.list.models;

import com.airbnb.epoxy.C5591f0;
import com.airbnb.epoxy.C5596h0;
import com.airbnb.epoxy.C5598i0;
import com.airbnb.epoxy.C5600j0;
import com.airbnb.epoxy.C5631s;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.list.models.DownloadCardModel;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.apps.list.models.DownloadCardModelBuilder */
public interface DownloadCardModelBuilder {
    DownloadCardModelBuilder application(DownloadApp downloadApp);

    DownloadCardModelBuilder eventSubject(C12871b<AppClick> bVar);

    /* renamed from: id */
    DownloadCardModelBuilder mo11998id(long j);

    /* renamed from: id */
    DownloadCardModelBuilder mo11999id(long j, long j2);

    /* renamed from: id */
    DownloadCardModelBuilder mo12000id(CharSequence charSequence);

    /* renamed from: id */
    DownloadCardModelBuilder mo12001id(CharSequence charSequence, long j);

    /* renamed from: id */
    DownloadCardModelBuilder mo12002id(CharSequence charSequence, CharSequence... charSequenceArr);

    /* renamed from: id */
    DownloadCardModelBuilder mo12003id(Number... numberArr);

    DownloadCardModelBuilder layout(int i);

    DownloadCardModelBuilder onBind(C5591f0<DownloadCardModel_, DownloadCardModel.CardHolder> f0Var);

    DownloadCardModelBuilder onUnbind(C5596h0<DownloadCardModel_, DownloadCardModel.CardHolder> h0Var);

    DownloadCardModelBuilder onVisibilityChanged(C5598i0<DownloadCardModel_, DownloadCardModel.CardHolder> i0Var);

    DownloadCardModelBuilder onVisibilityStateChanged(C5600j0<DownloadCardModel_, DownloadCardModel.CardHolder> j0Var);

    DownloadCardModelBuilder spanSizeOverride(C5631s.C5634c cVar);
}
