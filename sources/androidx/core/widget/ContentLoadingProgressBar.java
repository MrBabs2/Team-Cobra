package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: f */
    long f1823f;

    /* renamed from: g */
    boolean f1824g;

    /* renamed from: h */
    boolean f1825h;

    /* renamed from: i */
    boolean f1826i;

    /* renamed from: j */
    private final Runnable f1827j;

    /* renamed from: k */
    private final Runnable f1828k;

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$a */
    class C0421a implements Runnable {
        C0421a() {
        }

        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f1824g = false;
            contentLoadingProgressBar.f1823f = -1;
            contentLoadingProgressBar.setVisibility(8);
        }
    }

    /* renamed from: androidx.core.widget.ContentLoadingProgressBar$b */
    class C0422b implements Runnable {
        C0422b() {
        }

        public void run() {
            ContentLoadingProgressBar contentLoadingProgressBar = ContentLoadingProgressBar.this;
            contentLoadingProgressBar.f1825h = false;
            if (!contentLoadingProgressBar.f1826i) {
                contentLoadingProgressBar.f1823f = System.currentTimeMillis();
                ContentLoadingProgressBar.this.setVisibility(0);
            }
        }
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m2043a() {
        removeCallbacks(this.f1827j);
        removeCallbacks(this.f1828k);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m2043a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m2043a();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1826i = false;
        this.f1827j = new C0421a();
        this.f1828k = new C0422b();
    }
}
