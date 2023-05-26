package p015cm.aptoide.p016pt.search.view.item;

import android.view.View;
import p015cm.aptoide.p016pt.search.model.Suggestion;

/* renamed from: cm.aptoide.pt.search.view.item.a */
/* compiled from: lambda */
public final /* synthetic */ class C4091a implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ SuggestionViewHolder f7171f;

    /* renamed from: g */
    private final /* synthetic */ Suggestion f7172g;

    /* renamed from: h */
    private final /* synthetic */ int f7173h;

    public /* synthetic */ C4091a(SuggestionViewHolder suggestionViewHolder, Suggestion suggestion, int i) {
        this.f7171f = suggestionViewHolder;
        this.f7172g = suggestion;
        this.f7173h = i;
    }

    public final void onClick(View view) {
        this.f7171f.mo14531a(this.f7172g, this.f7173h, view);
    }
}
