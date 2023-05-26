package p015cm.aptoide.p016pt.search.view.item;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.search.model.Suggestion;
import p015cm.aptoide.p016pt.search.suggestions.SearchQueryEvent;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.search.view.item.SuggestionViewHolder */
public class SuggestionViewHolder extends RecyclerView.C0629c0 {
    private ImageView suggestionIcon;
    private TextView suggestionName;
    private C12871b<SearchQueryEvent> suggestionPublishSubject;

    public SuggestionViewHolder(View view, C12871b<SearchQueryEvent> bVar) {
        super(view);
        this.suggestionPublishSubject = bVar;
        this.suggestionName = (TextView) view.findViewById(C1086R.C1088id.search_suggestion_app_name);
        this.suggestionIcon = (ImageView) view.findViewById(C1086R.C1088id.search_suggestion_app_icon);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14531a(Suggestion suggestion, int i, View view) {
        this.suggestionPublishSubject.onNext(new SearchQueryEvent(suggestion.getName(), i, true, true));
    }

    public void setSuggestion(Suggestion suggestion, int i) {
        this.suggestionName.setText(suggestion.getName().trim());
        if (suggestion.getIcon() != null) {
            this.suggestionIcon.setImageResource(C1086R.C1087drawable.ic_suggestions_trending);
        } else {
            this.suggestionIcon.setImageResource(C1086R.C1087drawable.ic_stat_aptoide_notification);
        }
        this.itemView.setOnClickListener(new C4091a(this, suggestion, i));
    }
}
