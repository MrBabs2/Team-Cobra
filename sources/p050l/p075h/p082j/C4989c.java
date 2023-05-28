package p050l.p075h.p082j;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p050l.p075h.p083k.C5003c;

/* renamed from: l.h.j.c */
/* compiled from: PrecomputedTextCompat */
public class C4989c implements Spannable {

    /* renamed from: f */
    private final Spannable f8838f;

    /* renamed from: g */
    private final C4990a f8839g;

    /* renamed from: h */
    private final PrecomputedText f8840h;

    /* renamed from: l.h.j.c$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C4990a {

        /* renamed from: a */
        private final TextPaint f8841a;

        /* renamed from: b */
        private final TextDirectionHeuristic f8842b;

        /* renamed from: c */
        private final int f8843c;

        /* renamed from: d */
        private final int f8844d;

        /* renamed from: l.h.j.c$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C4991a {

            /* renamed from: a */
            private final TextPaint f8845a;

            /* renamed from: b */
            private TextDirectionHeuristic f8846b;

            /* renamed from: c */
            private int f8847c;

            /* renamed from: d */
            private int f8848d;

            public C4991a(TextPaint textPaint) {
                this.f8845a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f8847c = 1;
                    this.f8848d = 1;
                } else {
                    this.f8848d = 0;
                    this.f8847c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.f8846b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f8846b = null;
                }
            }

            /* renamed from: a */
            public C4991a mo17443a(int i) {
                this.f8847c = i;
                return this;
            }

            /* renamed from: b */
            public C4991a mo17446b(int i) {
                this.f8848d = i;
                return this;
            }

            /* renamed from: a */
            public C4991a mo17444a(TextDirectionHeuristic textDirectionHeuristic) {
                this.f8846b = textDirectionHeuristic;
                return this;
            }

            /* renamed from: a */
            public C4990a mo17445a() {
                return new C4990a(this.f8845a, this.f8846b, this.f8847c, this.f8848d);
            }
        }

        @SuppressLint({"NewApi"})
        C4990a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f8841a = textPaint;
            this.f8842b = textDirectionHeuristic;
            this.f8843c = i;
            this.f8844d = i2;
        }

        /* renamed from: a */
        public int mo17435a() {
            return this.f8843c;
        }

        /* renamed from: b */
        public int mo17437b() {
            return this.f8844d;
        }

        /* renamed from: c */
        public TextDirectionHeuristic mo17438c() {
            return this.f8842b;
        }

        /* renamed from: d */
        public TextPaint mo17439d() {
            return this.f8841a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C4990a)) {
                return false;
            }
            C4990a aVar = (C4990a) obj;
            if (!mo17436a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f8842b == aVar.mo17438c();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C5003c.m8888a(Float.valueOf(this.f8841a.getTextSize()), Float.valueOf(this.f8841a.getTextScaleX()), Float.valueOf(this.f8841a.getTextSkewX()), Float.valueOf(this.f8841a.getLetterSpacing()), Integer.valueOf(this.f8841a.getFlags()), this.f8841a.getTextLocales(), this.f8841a.getTypeface(), Boolean.valueOf(this.f8841a.isElegantTextHeight()), this.f8842b, Integer.valueOf(this.f8843c), Integer.valueOf(this.f8844d));
            } else if (i >= 21) {
                return C5003c.m8888a(Float.valueOf(this.f8841a.getTextSize()), Float.valueOf(this.f8841a.getTextScaleX()), Float.valueOf(this.f8841a.getTextSkewX()), Float.valueOf(this.f8841a.getLetterSpacing()), Integer.valueOf(this.f8841a.getFlags()), this.f8841a.getTextLocale(), this.f8841a.getTypeface(), Boolean.valueOf(this.f8841a.isElegantTextHeight()), this.f8842b, Integer.valueOf(this.f8843c), Integer.valueOf(this.f8844d));
            } else if (i >= 18) {
                return C5003c.m8888a(Float.valueOf(this.f8841a.getTextSize()), Float.valueOf(this.f8841a.getTextScaleX()), Float.valueOf(this.f8841a.getTextSkewX()), Integer.valueOf(this.f8841a.getFlags()), this.f8841a.getTextLocale(), this.f8841a.getTypeface(), this.f8842b, Integer.valueOf(this.f8843c), Integer.valueOf(this.f8844d));
            } else if (i >= 17) {
                return C5003c.m8888a(Float.valueOf(this.f8841a.getTextSize()), Float.valueOf(this.f8841a.getTextScaleX()), Float.valueOf(this.f8841a.getTextSkewX()), Integer.valueOf(this.f8841a.getFlags()), this.f8841a.getTextLocale(), this.f8841a.getTypeface(), this.f8842b, Integer.valueOf(this.f8843c), Integer.valueOf(this.f8844d));
            } else {
                return C5003c.m8888a(Float.valueOf(this.f8841a.getTextSize()), Float.valueOf(this.f8841a.getTextScaleX()), Float.valueOf(this.f8841a.getTextSkewX()), Integer.valueOf(this.f8841a.getFlags()), this.f8841a.getTypeface(), this.f8842b, Integer.valueOf(this.f8843c), Integer.valueOf(this.f8844d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f8841a.getTextSize());
            sb.append(", textScaleX=" + this.f8841a.getTextScaleX());
            sb.append(", textSkewX=" + this.f8841a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(", letterSpacing=" + this.f8841a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f8841a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                sb.append(", textLocale=" + this.f8841a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f8841a.getTextLocale());
            }
            sb.append(", typeface=" + this.f8841a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(", variationSettings=" + this.f8841a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f8842b);
            sb.append(", breakStrategy=" + this.f8843c);
            sb.append(", hyphenationFrequency=" + this.f8844d);
            sb.append("}");
            return sb.toString();
        }

        /* renamed from: a */
        public boolean mo17436a(C4990a aVar) {
            if ((Build.VERSION.SDK_INT >= 23 && (this.f8843c != aVar.mo17435a() || this.f8844d != aVar.mo17437b())) || this.f8841a.getTextSize() != aVar.mo17439d().getTextSize() || this.f8841a.getTextScaleX() != aVar.mo17439d().getTextScaleX() || this.f8841a.getTextSkewX() != aVar.mo17439d().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f8841a.getLetterSpacing() != aVar.mo17439d().getLetterSpacing() || !TextUtils.equals(this.f8841a.getFontFeatureSettings(), aVar.mo17439d().getFontFeatureSettings()))) || this.f8841a.getFlags() != aVar.mo17439d().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f8841a.getTextLocales().equals(aVar.mo17439d().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f8841a.getTextLocale().equals(aVar.mo17439d().getTextLocale())) {
                return false;
            }
            if (this.f8841a.getTypeface() == null) {
                if (aVar.mo17439d().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f8841a.getTypeface().equals(aVar.mo17439d().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public C4990a(PrecomputedText.Params params) {
            this.f8841a = params.getTextPaint();
            this.f8842b = params.getTextDirection();
            this.f8843c = params.getBreakStrategy();
            this.f8844d = params.getHyphenationFrequency();
            int i = Build.VERSION.SDK_INT;
        }
    }

    /* renamed from: a */
    public C4990a mo17422a() {
        return this.f8839g;
    }

    /* renamed from: b */
    public PrecomputedText mo17423b() {
        Spannable spannable = this.f8838f;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f8838f.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f8838f.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f8838f.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f8838f.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f8840h.getSpans(i, i2, cls);
        }
        return this.f8838f.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f8838f.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f8838f.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f8840h.removeSpan(obj);
        } else {
            this.f8838f.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f8840h.setSpan(obj, i, i2, i3);
        } else {
            this.f8838f.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f8838f.subSequence(i, i2);
    }

    public String toString() {
        return this.f8838f.toString();
    }
}
