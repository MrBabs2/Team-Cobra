package p015cm.aptoide.p016pt.home.bundles.editorial;

import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsPopup;
import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsView;

/* renamed from: cm.aptoide.pt.home.bundles.editorial.d */
/* compiled from: lambda */
public final /* synthetic */ class C2900d implements ReactionsPopup.OnDismissListener {

    /* renamed from: a */
    private final /* synthetic */ EditorialBundleViewHolder f5777a;

    /* renamed from: b */
    private final /* synthetic */ String f5778b;

    /* renamed from: c */
    private final /* synthetic */ String f5779c;

    /* renamed from: d */
    private final /* synthetic */ int f5780d;

    /* renamed from: e */
    private final /* synthetic */ ReactionsPopup f5781e;

    public /* synthetic */ C2900d(EditorialBundleViewHolder editorialBundleViewHolder, String str, String str2, int i, ReactionsPopup reactionsPopup) {
        this.f5777a = editorialBundleViewHolder;
        this.f5778b = str;
        this.f5779c = str2;
        this.f5780d = i;
        this.f5781e = reactionsPopup;
    }

    public final void onDismiss(ReactionsView reactionsView) {
        this.f5777a.mo12362a(this.f5778b, this.f5779c, this.f5780d, this.f5781e, reactionsView);
    }
}
