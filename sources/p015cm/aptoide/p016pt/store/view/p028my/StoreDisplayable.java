package p015cm.aptoide.p016pt.store.view.p028my;

import android.content.Context;
import java.util.Calendar;
import java.util.TimeZone;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.store.view.my.StoreDisplayable */
public class StoreDisplayable extends Displayable {
    private int firstStatsLabel;
    private long firstStatsNumber;
    private boolean isLongTime;
    private String message;
    private int secondStatsLabel;
    private long secondStatsNumber;
    private boolean statsClickable;
    private Store store;
    private StoreContext storeContext;
    private int textColor;

    public StoreDisplayable() {
    }

    private String getStoreDescription() {
        return this.message;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public int getExploreButtonText() {
        return this.isLongTime ? C1086R.string.create_store_displayable_explore_long_term_button : C1086R.string.create_store_displayable_explore_button;
    }

    /* access modifiers changed from: package-private */
    public int getFirstStatsLabel() {
        return this.firstStatsLabel;
    }

    /* access modifiers changed from: package-private */
    public long getFirstStatsNumber() {
        return this.firstStatsNumber;
    }

    /* access modifiers changed from: package-private */
    public int getSecondStatsLabel() {
        return this.secondStatsLabel;
    }

    /* access modifiers changed from: package-private */
    public long getSecondStatsNumber() {
        return this.secondStatsNumber;
    }

    public Store getStore() {
        return this.store;
    }

    public StoreContext getStoreContext() {
        return this.storeContext;
    }

    public String getSuggestionMessage(Context context) {
        if (this.isLongTime) {
            return getStoreDescription();
        }
        return context.getString(C1086R.string.create_store_displayable_explore_message);
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getViewLayout() {
        return C1086R.layout.store_displayable_layout;
    }

    public boolean isStatsClickable() {
        return this.statsClickable;
    }

    public StoreDisplayable(Store store2, StoreContext storeContext2, long j, long j2, int i, int i2, boolean z, String str, int i3) {
        this.store = store2;
        this.storeContext = storeContext2;
        this.firstStatsNumber = j;
        this.secondStatsNumber = j2;
        this.firstStatsLabel = i;
        this.secondStatsLabel = i2;
        this.statsClickable = z;
        this.message = str;
        this.textColor = i3;
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.add(5, -7);
        this.isLongTime = store2.getAdded().before(instance.getTime());
    }
}
