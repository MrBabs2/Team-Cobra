package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p050l.p075h.p083k.C5008h;

/* renamed from: androidx.appcompat.widget.r */
/* compiled from: AppCompatTextClassifierHelper */
final class C0279r {

    /* renamed from: a */
    private TextView f1181a;

    /* renamed from: b */
    private TextClassifier f1182b;

    C0279r(TextView textView) {
        C5008h.m8899a(textView);
        this.f1181a = textView;
    }

    /* renamed from: a */
    public void mo1732a(TextClassifier textClassifier) {
        this.f1182b = textClassifier;
    }

    /* renamed from: a */
    public TextClassifier mo1731a() {
        TextClassifier textClassifier = this.f1182b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1181a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
