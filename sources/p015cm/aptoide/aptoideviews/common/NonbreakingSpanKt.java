package p015cm.aptoide.aptoideviews.common;

import android.text.SpannableStringBuilder;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\b¨\u0006\u0006"}, mo16641d2 = {"nonBreakingSpan", "Landroid/text/SpannableStringBuilder;", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "aptoide-views_prodRelease"}, mo16642k = 2, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.common.NonbreakingSpanKt */
/* compiled from: NonbreakingSpan.kt */
public final class NonbreakingSpanKt {
    public static final SpannableStringBuilder nonBreakingSpan(SpannableStringBuilder spannableStringBuilder, C9113l<? super SpannableStringBuilder, C10483v> lVar) {
        C10202j.m34178b(spannableStringBuilder, "$this$nonBreakingSpan");
        C10202j.m34178b(lVar, "builderAction");
        NonbreakingSpan nonbreakingSpan = new NonbreakingSpan();
        int length = spannableStringBuilder.length();
        lVar.invoke(spannableStringBuilder);
        spannableStringBuilder.setSpan(nonbreakingSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
