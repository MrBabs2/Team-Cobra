package p015cm.aptoide.aptoideviews.common;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.Log;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "source", "", "getDrawable"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.common.StringUtilsKt$getImageGetter$1 */
/* compiled from: StringUtils.kt */
final class StringUtilsKt$getImageGetter$1 implements Html.ImageGetter {
    final /* synthetic */ Resources $resources;

    StringUtilsKt$getImageGetter$1(Resources resources) {
        this.$resources = resources;
    }

    public final Drawable getDrawable(String str) {
        C10202j.m34178b(str, "source");
        Drawable drawable = null;
        try {
            drawable = this.$resources.getDrawable(Integer.parseInt(str));
            C10202j.m34174a((Object) drawable, "drawable");
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            return drawable;
        } catch (Resources.NotFoundException e) {
            Log.e("FormatWithHtmlImage", "Image not found. Check the ID.", e);
            return drawable;
        } catch (NumberFormatException e2) {
            Log.e("FormatWithHtmlImage", "Source string not a valid resource ID.", e2);
            return drawable;
        }
    }
}
