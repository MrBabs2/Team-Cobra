package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0394a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p050l.p051a.C4790a;
import p050l.p051a.C4795f;
import p050l.p087i.p088a.C5095c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.k0 */
/* compiled from: SuggestionsAdapter */
class C0265k0 extends C5095c implements View.OnClickListener {

    /* renamed from: i */
    private final SearchView f1124i;

    /* renamed from: j */
    private final SearchableInfo f1125j;

    /* renamed from: k */
    private final Context f1126k;

    /* renamed from: l */
    private final WeakHashMap<String, Drawable.ConstantState> f1127l;

    /* renamed from: m */
    private final int f1128m;

    /* renamed from: n */
    private boolean f1129n = false;

    /* renamed from: o */
    private int f1130o = 1;

    /* renamed from: p */
    private ColorStateList f1131p;

    /* renamed from: q */
    private int f1132q = -1;

    /* renamed from: r */
    private int f1133r = -1;

    /* renamed from: s */
    private int f1134s = -1;

    /* renamed from: t */
    private int f1135t = -1;

    /* renamed from: u */
    private int f1136u = -1;

    /* renamed from: v */
    private int f1137v = -1;

    /* renamed from: androidx.appcompat.widget.k0$a */
    /* compiled from: SuggestionsAdapter */
    private static final class C0266a {

        /* renamed from: a */
        public final TextView f1138a;

        /* renamed from: b */
        public final TextView f1139b;

        /* renamed from: c */
        public final ImageView f1140c;

        /* renamed from: d */
        public final ImageView f1141d;

        /* renamed from: e */
        public final ImageView f1142e;

        public C0266a(View view) {
            this.f1138a = (TextView) view.findViewById(16908308);
            this.f1139b = (TextView) view.findViewById(16908309);
            this.f1140c = (ImageView) view.findViewById(16908295);
            this.f1141d = (ImageView) view.findViewById(16908296);
            this.f1142e = (ImageView) view.findViewById(C4795f.edit_query);
        }
    }

    public C0265k0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1124i = searchView;
        this.f1125j = searchableInfo;
        this.f1128m = searchView.getSuggestionCommitIconResId();
        this.f1126k = context;
        this.f1127l = weakHashMap;
    }

    /* renamed from: b */
    private Drawable m1230b(Cursor cursor) {
        int i = this.f1136u;
        if (i == -1) {
            return null;
        }
        return m1232b(cursor.getString(i));
    }

    /* renamed from: c */
    private void m1233c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: a */
    public void mo1666a(int i) {
        this.f1130o = i;
    }

    public void bindView(View view, Context context, Cursor cursor) {
        CharSequence charSequence;
        C0266a aVar = (C0266a) view.getTag();
        int i = this.f1137v;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1138a != null) {
            m1227a(aVar.f1138a, (CharSequence) m1224a(cursor, this.f1132q));
        }
        if (aVar.f1139b != null) {
            String a = m1224a(cursor, this.f1134s);
            if (a != null) {
                charSequence = m1223a((CharSequence) a);
            } else {
                charSequence = m1224a(cursor, this.f1133r);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f1138a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1138a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1138a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1138a.setMaxLines(1);
                }
            }
            m1227a(aVar.f1139b, charSequence);
        }
        ImageView imageView = aVar.f1140c;
        if (imageView != null) {
            m1226a(imageView, m1221a(cursor), 4);
        }
        ImageView imageView2 = aVar.f1141d;
        if (imageView2 != null) {
            m1226a(imageView2, m1230b(cursor), 8);
        }
        int i3 = this.f1130o;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1142e.setVisibility(0);
            aVar.f1142e.setTag(aVar.f1138a.getText());
            aVar.f1142e.setOnClickListener(this);
            return;
        }
        aVar.f1142e.setVisibility(8);
    }

    public void changeCursor(Cursor cursor) {
        if (this.f1129n) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.f1132q = cursor.getColumnIndex("suggest_text_1");
                this.f1133r = cursor.getColumnIndex("suggest_text_2");
                this.f1134s = cursor.getColumnIndex("suggest_text_2_url");
                this.f1135t = cursor.getColumnIndex("suggest_icon_1");
                this.f1136u = cursor.getColumnIndex("suggest_icon_2");
                this.f1137v = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public CharSequence convertToString(Cursor cursor) {
        String a;
        String a2;
        if (cursor == null) {
            return null;
        }
        String a3 = m1225a(cursor, "suggest_intent_query");
        if (a3 != null) {
            return a3;
        }
        if (this.f1125j.shouldRewriteQueryFromData() && (a2 = m1225a(cursor, "suggest_intent_data")) != null) {
            return a2;
        }
        if (!this.f1125j.shouldRewriteQueryFromText() || (a = m1225a(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return a;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newDropDownView = newDropDownView(this.mContext, this.mCursor, viewGroup);
            if (newDropDownView != null) {
                ((C0266a) newDropDownView.getTag()).f1138a.setText(e.toString());
            }
            return newDropDownView;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newView = newView(this.mContext, this.mCursor, viewGroup);
            if (newView != null) {
                ((C0266a) newView.getTag()).f1138a.setText(e.toString());
            }
            return newView;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new C0266a(newView));
        ((ImageView) newView.findViewById(C4795f.edit_query)).setImageResource(this.f1128m);
        return newView;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1233c(getCursor());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1233c(getCursor());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1124i.mo1160a((CharSequence) tag);
        }
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1124i.getVisibility() == 0 && this.f1124i.getWindowVisibility() == 0) {
            try {
                Cursor a = mo1664a(this.f1125j, charSequence2, 50);
                if (a != null) {
                    a.getCount();
                    return a;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: a */
    private CharSequence m1223a(CharSequence charSequence) {
        if (this.f1131p == null) {
            TypedValue typedValue = new TypedValue();
            this.mContext.getTheme().resolveAttribute(C4790a.textColorSearchUrl, typedValue, true);
            this.f1131p = this.mContext.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1131p, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: b */
    private Drawable m1232b(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1126k.getPackageName() + "/" + parseInt;
            Drawable a = m1222a(str2);
            if (a != null) {
                return a;
            }
            Drawable c = C0394a.m1917c(this.f1126k, parseInt);
            m1228a(str2, c);
            return c;
        } catch (NumberFormatException unused) {
            Drawable a2 = m1222a(str);
            if (a2 != null) {
                return a2;
            }
            Drawable b = m1231b(Uri.parse(str));
            m1228a(str, b);
            return b;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: a */
    private void m1227a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    private Drawable m1221a(Cursor cursor) {
        int i = this.f1135t;
        if (i == -1) {
            return null;
        }
        Drawable b = m1232b(cursor.getString(i));
        if (b != null) {
            return b;
        }
        return m1219a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1231b(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo1665a((android.net.Uri) r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f1126k     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0265k0.m1231b(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private void m1226a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: a */
    private Drawable m1222a(String str) {
        Drawable.ConstantState constantState = this.f1127l.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: a */
    private void m1228a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1127l.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: a */
    private Drawable m1219a() {
        Drawable b = m1229b(this.f1125j.getSearchActivity());
        if (b != null) {
            return b;
        }
        return this.mContext.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: a */
    private Drawable m1220a(ComponentName componentName) {
        PackageManager packageManager = this.mContext.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: b */
    private Drawable m1229b(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1127l.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1127l.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1126k.getResources());
        }
        Drawable a = m1220a(componentName);
        if (a != null) {
            constantState = a.getConstantState();
        }
        this.f1127l.put(flattenToShortString, constantState);
        return a;
    }

    /* renamed from: a */
    public static String m1225a(Cursor cursor, String str) {
        return m1224a(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: a */
    private static String m1224a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Drawable mo1665a(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.mContext.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Cursor mo1664a(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.mContext.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }
}
