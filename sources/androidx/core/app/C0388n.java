package androidx.core.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.n */
/* compiled from: SharedElementCallback */
public abstract class C0388n {

    /* renamed from: androidx.core.app.n$a */
    /* compiled from: SharedElementCallback */
    public interface C0389a {
    }

    /* renamed from: a */
    public abstract Parcelable mo2274a(View view, Matrix matrix, RectF rectF);

    /* renamed from: a */
    public abstract View mo2275a(Context context, Parcelable parcelable);

    /* renamed from: a */
    public abstract void mo2276a(List<View> list);

    /* renamed from: a */
    public abstract void mo2277a(List<String> list, List<View> list2, C0389a aVar);

    /* renamed from: a */
    public abstract void mo2278a(List<String> list, List<View> list2, List<View> list3);

    /* renamed from: a */
    public abstract void mo2279a(List<String> list, Map<String, View> map);

    /* renamed from: b */
    public abstract void mo2280b(List<String> list, List<View> list2, List<View> list3);
}
