package p015cm.aptoide.p016pt.reactions.p027ui;

import android.view.View;
import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsView;

/* renamed from: cm.aptoide.pt.reactions.ui.a */
/* compiled from: lambda */
public final /* synthetic */ class C3954a implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ Reaction f7043f;

    /* renamed from: g */
    private final /* synthetic */ ReactionsView.Callback f7044g;

    public /* synthetic */ C3954a(Reaction reaction, ReactionsView.Callback callback) {
        this.f7043f = reaction;
        this.f7044g = callback;
    }

    public final void onClick(View view) {
        this.f7043f.mo13952a(this.f7044g, view);
    }
}
