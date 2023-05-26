package p015cm.aptoide.p016pt.search.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.search.model.Suggestion;
import p015cm.aptoide.p016pt.search.suggestions.SearchQueryEvent;
import p015cm.aptoide.p016pt.search.view.item.SuggestionViewHolder;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.search.view.SearchSuggestionsAdapter */
public class SearchSuggestionsAdapter extends RecyclerView.C0633g<SuggestionViewHolder> {
    private List<Suggestion> suggestions;
    private C12871b<SearchQueryEvent> suggestionsPublishSubject;

    public SearchSuggestionsAdapter(List<Suggestion> list, C12871b<SearchQueryEvent> bVar) {
        this.suggestions = list;
        this.suggestionsPublishSubject = bVar;
    }

    public void addSuggestions(List<Suggestion> list) {
        this.suggestions = list;
        notifyDataSetChanged();
    }

    public void addSuggestionsFromString(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String suggestion : list) {
            arrayList.add(new Suggestion(suggestion, (String) null));
        }
        this.suggestions = arrayList;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.suggestions.size();
    }

    public List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public void onBindViewHolder(SuggestionViewHolder suggestionViewHolder, int i) {
        suggestionViewHolder.setSuggestion(this.suggestions.get(i), i);
    }

    public SuggestionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SuggestionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.search_suggestion_item, viewGroup, false), this.suggestionsPublishSubject);
    }
}
