package p015cm.aptoide.aptoideviews.filters;

import android.widget.Button;
import androidx.core.content.C0394a;
import com.airbnb.epoxy.C5635t;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p218e0.C9132c;
import p015cm.aptoide.aptoideviews.C1033R;
import p112n.p272c.p273a.p274a.p275a.p276a.C10557a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0014R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/ClearFiltersModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/aptoideviews/filters/ClearFiltersModel$CardHolder;", "()V", "eventListener", "Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "getEventListener", "()Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "setEventListener", "(Lcm/aptoide/aptoideviews/filters/FilterEventListener;)V", "textColorStateList", "", "getTextColorStateList", "()Ljava/lang/Integer;", "setTextColorStateList", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bind", "", "holder", "getDefaultLayout", "CardHolder", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.ClearFiltersModel */
/* compiled from: ClearFiltersModel.kt */
public abstract class ClearFiltersModel extends C5635t<CardHolder> {
    private FilterEventListener eventListener;
    private Integer textColorStateList;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/ClearFiltersModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "clearButton", "Landroid/widget/Button;", "getClearButton", "()Landroid/widget/Button;", "clearButton$delegate", "Lkotlin/properties/ReadOnlyProperty;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.filters.ClearFiltersModel$CardHolder */
    /* compiled from: ClearFiltersModel.kt */
    public static final class CardHolder extends C10557a {
        static final /* synthetic */ C9168l[] $$delegatedProperties = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(CardHolder.class), "clearButton", "getClearButton()Landroid/widget/Button;"))};
        private final C9132c clearButton$delegate = bind(C1033R.C1035id.clear_button);

        public final Button getClearButton() {
            return (Button) this.clearButton$delegate.mo33478a(this, $$delegatedProperties[0]);
        }
    }

    /* access modifiers changed from: protected */
    public int getDefaultLayout() {
        return C1033R.layout.clear_filters_item;
    }

    public final FilterEventListener getEventListener() {
        return this.eventListener;
    }

    public final Integer getTextColorStateList() {
        return this.textColorStateList;
    }

    public final void setEventListener(FilterEventListener filterEventListener) {
        this.eventListener = filterEventListener;
    }

    public final void setTextColorStateList(Integer num) {
        this.textColorStateList = num;
    }

    public void bind(CardHolder cardHolder) {
        C10202j.m34178b(cardHolder, "holder");
        super.bind(cardHolder);
        cardHolder.getClearButton().setOnClickListener(new ClearFiltersModel$bind$1(this));
        Integer num = this.textColorStateList;
        if (num != null) {
            cardHolder.getClearButton().setTextColor(C0394a.m1914b(cardHolder.getItemView().getContext(), num.intValue()));
        }
    }
}
