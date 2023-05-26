package p050l.p051a.p057n;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: l.a.n.a */
/* compiled from: AllCapsTransformationMethod */
public class C4819a implements TransformationMethod {

    /* renamed from: f */
    private Locale f8211f;

    public C4819a(Context context) {
        this.f8211f = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f8211f);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
