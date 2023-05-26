package p015cm.aptoide.p016pt.bonus;

import kotlin.C4789l;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo16641d2 = {"Lcm/aptoide/pt/bonus/BonusAppcModel;", "", "hasBonusAppc", "", "bonusPercentage", "", "(ZI)V", "getBonusPercentage", "()I", "getHasBonusAppc", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "appcoins"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.bonus.BonusAppcModel */
/* compiled from: BonusAppcModel.kt */
public final class BonusAppcModel {
    private final int bonusPercentage;
    private final boolean hasBonusAppc;

    public BonusAppcModel(boolean z, int i) {
        this.hasBonusAppc = z;
        this.bonusPercentage = i;
    }

    public static /* synthetic */ BonusAppcModel copy$default(BonusAppcModel bonusAppcModel, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = bonusAppcModel.hasBonusAppc;
        }
        if ((i2 & 2) != 0) {
            i = bonusAppcModel.bonusPercentage;
        }
        return bonusAppcModel.copy(z, i);
    }

    public final boolean component1() {
        return this.hasBonusAppc;
    }

    public final int component2() {
        return this.bonusPercentage;
    }

    public final BonusAppcModel copy(boolean z, int i) {
        return new BonusAppcModel(z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusAppcModel)) {
            return false;
        }
        BonusAppcModel bonusAppcModel = (BonusAppcModel) obj;
        return this.hasBonusAppc == bonusAppcModel.hasBonusAppc && this.bonusPercentage == bonusAppcModel.bonusPercentage;
    }

    public final int getBonusPercentage() {
        return this.bonusPercentage;
    }

    public final boolean getHasBonusAppc() {
        return this.hasBonusAppc;
    }

    public int hashCode() {
        boolean z = this.hasBonusAppc;
        if (z) {
            z = true;
        }
        return ((z ? 1 : 0) * true) + this.bonusPercentage;
    }

    public String toString() {
        return "BonusAppcModel(hasBonusAppc=" + this.hasBonusAppc + ", bonusPercentage=" + this.bonusPercentage + ")";
    }
}
