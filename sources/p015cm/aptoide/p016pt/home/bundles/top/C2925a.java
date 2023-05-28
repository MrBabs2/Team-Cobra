package p015cm.aptoide.p016pt.home.bundles.top;

import android.view.View;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.view.app.Application;

/* renamed from: cm.aptoide.pt.home.bundles.top.a */
/* compiled from: lambda */
public final /* synthetic */ class C2925a implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ TopAppViewHolder f5841f;

    /* renamed from: g */
    private final /* synthetic */ Application f5842g;

    /* renamed from: h */
    private final /* synthetic */ HomeBundle f5843h;

    /* renamed from: i */
    private final /* synthetic */ int f5844i;

    public /* synthetic */ C2925a(TopAppViewHolder topAppViewHolder, Application application, HomeBundle homeBundle, int i) {
        this.f5841f = topAppViewHolder;
        this.f5842g = application;
        this.f5843h = homeBundle;
        this.f5844i = i;
    }

    public final void onClick(View view) {
        this.f5841f.mo12406a(this.f5842g, this.f5843h, this.f5844i, view);
    }
}
