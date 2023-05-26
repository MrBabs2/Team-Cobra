package p015cm.aptoide.p016pt.home.bundles.editorial;

import p015cm.aptoide.p016pt.reactions.data.ReactionType;
import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsPopup;

/* renamed from: cm.aptoide.pt.home.bundles.editorial.a */
/* compiled from: lambda */
public final /* synthetic */ class C2897a implements ReactionsPopup.OnReactionClickListener {

    /* renamed from: a */
    private final /* synthetic */ EditorialBundleViewHolder f5762a;

    /* renamed from: b */
    private final /* synthetic */ String f5763b;

    /* renamed from: c */
    private final /* synthetic */ String f5764c;

    /* renamed from: d */
    private final /* synthetic */ int f5765d;

    /* renamed from: e */
    private final /* synthetic */ ReactionsPopup f5766e;

    public /* synthetic */ C2897a(EditorialBundleViewHolder editorialBundleViewHolder, String str, String str2, int i, ReactionsPopup reactionsPopup) {
        this.f5762a = editorialBundleViewHolder;
        this.f5763b = str;
        this.f5764c = str2;
        this.f5765d = i;
        this.f5766e = reactionsPopup;
    }

    public final void onReactionItemClick(ReactionType reactionType) {
        this.f5762a.mo12361a(this.f5763b, this.f5764c, this.f5765d, this.f5766e, reactionType);
    }
}
