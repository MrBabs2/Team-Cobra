package p015cm.aptoide.p016pt.app;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005¨\u0006\u000e"}, mo16641d2 = {"Lcm/aptoide/pt/app/MigrationModel;", "", "isMigrated", "", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.MigrationModel */
/* compiled from: MigrationModel.kt */
public final class MigrationModel {
    private final boolean isMigrated;

    public MigrationModel() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    public MigrationModel(boolean z) {
        this.isMigrated = z;
    }

    public static /* synthetic */ MigrationModel copy$default(MigrationModel migrationModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = migrationModel.isMigrated;
        }
        return migrationModel.copy(z);
    }

    public final boolean component1() {
        return this.isMigrated;
    }

    public final MigrationModel copy(boolean z) {
        return new MigrationModel(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MigrationModel) && this.isMigrated == ((MigrationModel) obj).isMigrated;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.isMigrated;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final boolean isMigrated() {
        return this.isMigrated;
    }

    public String toString() {
        return "MigrationModel(isMigrated=" + this.isMigrated + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MigrationModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
