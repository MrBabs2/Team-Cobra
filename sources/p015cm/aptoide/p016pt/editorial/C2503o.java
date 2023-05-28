package p015cm.aptoide.p016pt.editorial;

import p015cm.aptoide.p016pt.reactions.data.ReactionType;
import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsPopup;

/* renamed from: cm.aptoide.pt.editorial.o */
/* compiled from: lambda */
public final /* synthetic */ class C2503o implements ReactionsPopup.OnReactionClickListener {

    /* renamed from: a */
    private final /* synthetic */ EditorialFragment f5302a;

    /* renamed from: b */
    private final /* synthetic */ String f5303b;

    /* renamed from: c */
    private final /* synthetic */ String f5304c;

    /* renamed from: d */
    private final /* synthetic */ ReactionsPopup f5305d;

    public /* synthetic */ C2503o(EditorialFragment editorialFragment, String str, String str2, ReactionsPopup reactionsPopup) {
        this.f5302a = editorialFragment;
        this.f5303b = str;
        this.f5304c = str2;
        this.f5305d = reactionsPopup;
    }

    public final void onReactionItemClick(ReactionType reactionType) {
        this.f5302a.mo11049a(this.f5303b, this.f5304c, this.f5305d, reactionType);
    }
}
