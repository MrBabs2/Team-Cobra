package p015cm.aptoide.p016pt.search;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p050l.p087i.p088a.C5090a;

/* renamed from: cm.aptoide.pt.search.SuggestionCursorAdapter */
public class SuggestionCursorAdapter extends C5090a {
    private static final String[] COLUMN_NAMES = {"_id", "suggest_text_1"};
    private static final int ITEM_LAYOUT = 2131493188;
    private final List<String> suggestions;

    public SuggestionCursorAdapter(Context context, List<String> list) {
        super(context, (Cursor) null, false);
        this.suggestions = new LinkedList();
        if (list != null && !list.isEmpty()) {
            setData(list);
        }
    }

    private MatrixCursor getCursorFor(List<String> list) {
        MatrixCursor matrixCursor = new MatrixCursor(COLUMN_NAMES, list.size());
        int i = 0;
        for (String add : list) {
            int i2 = i + 1;
            matrixCursor.newRow().add(Integer.toString(i)).add(add);
            i = i2;
        }
        return matrixCursor;
    }

    private String getSuggestionAtCurrentPosition(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex("suggest_text_1"));
    }

    public void bindView(View view, Context context, Cursor cursor) {
        ((TextView) view.findViewById(C1086R.C1088id.dropdown_text)).setText(getSuggestionAtCurrentPosition(cursor));
    }

    public CharSequence getSuggestionAt(int i) {
        Cursor cursor = getCursor();
        if (cursor.moveToPosition(i)) {
            return getSuggestionAtCurrentPosition(cursor);
        }
        throw new UnsupportedOperationException("Unable to find query at position " + i);
    }

    public List<String> getSuggestions() {
        return this.suggestions;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return LayoutInflater.from(context).inflate(C1086R.layout.simple_dropdown_item, viewGroup, false);
    }

    public void setData(List<String> list) {
        this.suggestions.clear();
        this.suggestions.addAll(list);
        changeCursor(getCursorFor(this.suggestions));
    }

    public SuggestionCursorAdapter(Context context) {
        this(context, Collections.emptyList());
    }
}
