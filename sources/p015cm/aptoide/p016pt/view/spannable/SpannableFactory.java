package p015cm.aptoide.p016pt.view.spannable;

import android.content.Context;
import android.text.ParcelableSpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;

/* renamed from: cm.aptoide.pt.view.spannable.SpannableFactory */
public class SpannableFactory {
    private Spannable createSpan(String str, ParcelableSpan parcelableSpan, String[] strArr) {
        SpannableString spannableString = new SpannableString(str);
        for (String str2 : strArr) {
            int indexOf = str.indexOf(str2);
            if (indexOf >= 0 && indexOf < str.length() && str2.length() <= str.length()) {
                spannableString.setSpan(parcelableSpan, indexOf, str2.length() + indexOf, 33);
            }
        }
        return spannableString;
    }

    public Spannable createColorSpan(String str, int i, String... strArr) {
        return createSpan(str, (ParcelableSpan) new ForegroundColorSpan(i), strArr);
    }

    public Spannable createMultiSpan(String str, ParcelableSpan[] parcelableSpanArr, String... strArr) {
        SpannableString spannableString = new SpannableString(str);
        for (ParcelableSpan parcelableSpan : parcelableSpanArr) {
            for (String str2 : strArr) {
                int indexOf = str.indexOf(str2);
                if (indexOf >= 0 && indexOf < str.length() && str2.length() <= str.length()) {
                    spannableString.setSpan(parcelableSpan, indexOf, str2.length() + indexOf, 33);
                }
            }
        }
        return spannableString;
    }

    public Spannable createStyleSpan(String str, int i, String... strArr) {
        return createSpan(str, (ParcelableSpan) new StyleSpan(i), strArr);
    }

    public Spannable createTextAppearanceSpan(Context context, int i, String str, String... strArr) {
        return createSpan(str, (ParcelableSpan) new TextAppearanceSpan(context, i), strArr);
    }

    public Spannable createSpan(String str, ParcelableSpan[] parcelableSpanArr, String... strArr) {
        SpannableString spannableString = new SpannableString(str);
        if (!(parcelableSpanArr == null || strArr == null || parcelableSpanArr.length > strArr.length)) {
            for (int i = 0; i < parcelableSpanArr.length; i++) {
                String str2 = strArr[i];
                int indexOf = str.indexOf(str2);
                if (indexOf >= 0 && indexOf < str.length() && str2.length() <= str.length()) {
                    spannableString.setSpan(parcelableSpanArr[i], indexOf, str2.length() + indexOf, 33);
                }
            }
        }
        return spannableString;
    }
}
