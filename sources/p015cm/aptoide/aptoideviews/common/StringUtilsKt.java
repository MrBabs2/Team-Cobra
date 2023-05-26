package p015cm.aptoide.aptoideviews.common;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import java.util.Arrays;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a,\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000b"}, mo16641d2 = {"getImageGetter", "Landroid/text/Html$ImageGetter;", "resources", "Landroid/content/res/Resources;", "formatWithHtmlImage", "", "", "drawableId", "", "width", "height", "aptoide-views_prodRelease"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.common.StringUtilsKt */
/* compiled from: StringUtils.kt */
public final class StringUtilsKt {
    public static final CharSequence formatWithHtmlImage(String str, int i, int i2, int i3, Resources resources) {
        C10202j.m34178b(str, "$this$formatWithHtmlImage");
        C10202j.m34178b(resources, "resources");
        String format = String.format(str, Arrays.copyOf(new Object[]{"<img width='" + i2 + "px' height='" + i3 + "px' src='" + i + "'/>"}, 1));
        C10202j.m34174a((Object) format, "java.lang.String.format(this, *args)");
        Spanned fromHtml = Html.fromHtml(format, getImageGetter(resources), (Html.TagHandler) null);
        C10202j.m34174a((Object) fromHtml, "Html.fromHtml(this.forma…eGetter(resources), null)");
        return fromHtml;
    }

    private static final Html.ImageGetter getImageGetter(Resources resources) {
        return new StringUtilsKt$getImageGetter$1(resources);
    }
}
