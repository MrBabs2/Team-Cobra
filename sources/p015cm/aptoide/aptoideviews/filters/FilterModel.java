package p015cm.aptoide.aptoideviews.filters;

import android.widget.CheckedTextView;
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

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0014R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\t¨\u0006\u001f"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/FilterModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lcm/aptoide/aptoideviews/filters/FilterModel$CardHolder;", "()V", "backgroundRes", "", "getBackgroundRes", "()Ljava/lang/Integer;", "setBackgroundRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "eventListener", "Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "getEventListener", "()Lcm/aptoide/aptoideviews/filters/FilterEventListener;", "setEventListener", "(Lcm/aptoide/aptoideviews/filters/FilterEventListener;)V", "filter", "Lcm/aptoide/aptoideviews/filters/Filter;", "getFilter", "()Lcm/aptoide/aptoideviews/filters/Filter;", "setFilter", "(Lcm/aptoide/aptoideviews/filters/Filter;)V", "textColorStateList", "getTextColorStateList", "setTextColorStateList", "bind", "", "holder", "getDefaultLayout", "CardHolder", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.filters.FilterModel */
/* compiled from: FilterModel.kt */
public abstract class FilterModel extends C5635t<CardHolder> {
    private Integer backgroundRes;
    private FilterEventListener eventListener;
    private Filter filter;
    private Integer textColorStateList;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/filters/FilterModel$CardHolder;", "Lcom/fa/epoxysample/bundles/models/base/BaseViewHolder;", "()V", "button", "Landroid/widget/CheckedTextView;", "getButton", "()Landroid/widget/CheckedTextView;", "button$delegate", "Lkotlin/properties/ReadOnlyProperty;", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.aptoideviews.filters.FilterModel$CardHolder */
    /* compiled from: FilterModel.kt */
    public static final class CardHolder extends C10557a {
        static final /* synthetic */ C9168l[] $$delegatedProperties = {C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(CardHolder.class), "button", "getButton()Landroid/widget/CheckedTextView;"))};
        private final C9132c button$delegate = bind(C1033R.C1035id.filter_button);

        public final CheckedTextView getButton() {
            return (CheckedTextView) this.button$delegate.mo33478a(this, $$delegatedProperties[0]);
        }
    }

    public final Integer getBackgroundRes() {
        return this.backgroundRes;
    }

    /* access modifiers changed from: protected */
    public int getDefaultLayout() {
        return C1033R.layout.filter_item;
    }

    public final FilterEventListener getEventListener() {
        return this.eventListener;
    }

    public final Filter getFilter() {
        return this.filter;
    }

    public final Integer getTextColorStateList() {
        return this.textColorStateList;
    }

    public final void setBackgroundRes(Integer num) {
        this.backgroundRes = num;
    }

    public final void setEventListener(FilterEventListener filterEventListener) {
        this.eventListener = filterEventListener;
    }

    public final void setFilter(Filter filter2) {
        this.filter = filter2;
    }

    public final void setTextColorStateList(Integer num) {
        this.textColorStateList = num;
    }

    public void bind(CardHolder cardHolder) {
        C10202j.m34178b(cardHolder, "holder");
        super.bind(cardHolder);
        Filter filter2 = this.filter;
        if (filter2 != null) {
            cardHolder.getButton().setText(filter2.getName());
            cardHolder.getButton().setChecked(filter2.getSelected());
            cardHolder.getButton().setOnClickListener(new FilterModel$bind$$inlined$let$lambda$1(filter2, this, cardHolder));
            Integer num = this.textColorStateList;
            if (num != null) {
                cardHolder.getButton().setTextColor(C0394a.m1914b(cardHolder.getItemView().getContext(), num.intValue()));
            }
            Integer num2 = this.backgroundRes;
            if (num2 != null) {
                cardHolder.getButton().setBackgroundResource(num2.intValue());
            }
        }
    }
}
