package p015cm.aptoide.p016pt.updates.view.excluded;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.updates.view.excluded.ExcludedUpdateDisplayable */
public class ExcludedUpdateDisplayable extends DisplayablePojo<RoomUpdate> {
    private boolean selected;

    public ExcludedUpdateDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    public int getViewLayout() {
        return C1086R.layout.row_excluded_update;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public ExcludedUpdateDisplayable(RoomUpdate roomUpdate) {
        super(roomUpdate);
    }
}
