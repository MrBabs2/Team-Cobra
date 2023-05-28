package p050l.p087i.p088a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: l.i.a.b */
/* compiled from: CursorFilter */
class C5093b extends Filter {

    /* renamed from: a */
    C5094a f8964a;

    /* renamed from: l.i.a.b$a */
    /* compiled from: CursorFilter */
    interface C5094a {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    C5093b(C5094a aVar) {
        this.f8964a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f8964a.convertToString((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor runQueryOnBackgroundThread = this.f8964a.runQueryOnBackgroundThread(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (runQueryOnBackgroundThread != null) {
            filterResults.count = runQueryOnBackgroundThread.getCount();
            filterResults.values = runQueryOnBackgroundThread;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursor = this.f8964a.getCursor();
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            this.f8964a.changeCursor((Cursor) obj);
        }
    }
}
