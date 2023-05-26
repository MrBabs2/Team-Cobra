package p015cm.aptoide.p016pt.editorialList;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, mo16641d2 = {"Lcm/aptoide/pt/editorialList/EditorialListModel;", "", "editorialCardListModel", "Lcm/aptoide/pt/editorialList/EditorialCardListModel;", "bonusAppcModel", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "(Lcm/aptoide/pt/editorialList/EditorialCardListModel;Lcm/aptoide/pt/bonus/BonusAppcModel;)V", "getBonusAppcModel", "()Lcm/aptoide/pt/bonus/BonusAppcModel;", "getEditorialCardListModel", "()Lcm/aptoide/pt/editorialList/EditorialCardListModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.editorialList.EditorialListModel */
/* compiled from: EditorialListModel.kt */
public final class EditorialListModel {
    private final BonusAppcModel bonusAppcModel;
    private final EditorialCardListModel editorialCardListModel;

    public EditorialListModel(EditorialCardListModel editorialCardListModel2, BonusAppcModel bonusAppcModel2) {
        C10202j.m34178b(editorialCardListModel2, "editorialCardListModel");
        C10202j.m34178b(bonusAppcModel2, "bonusAppcModel");
        this.editorialCardListModel = editorialCardListModel2;
        this.bonusAppcModel = bonusAppcModel2;
    }

    public static /* synthetic */ EditorialListModel copy$default(EditorialListModel editorialListModel, EditorialCardListModel editorialCardListModel2, BonusAppcModel bonusAppcModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            editorialCardListModel2 = editorialListModel.editorialCardListModel;
        }
        if ((i & 2) != 0) {
            bonusAppcModel2 = editorialListModel.bonusAppcModel;
        }
        return editorialListModel.copy(editorialCardListModel2, bonusAppcModel2);
    }

    public final EditorialCardListModel component1() {
        return this.editorialCardListModel;
    }

    public final BonusAppcModel component2() {
        return this.bonusAppcModel;
    }

    public final EditorialListModel copy(EditorialCardListModel editorialCardListModel2, BonusAppcModel bonusAppcModel2) {
        C10202j.m34178b(editorialCardListModel2, "editorialCardListModel");
        C10202j.m34178b(bonusAppcModel2, "bonusAppcModel");
        return new EditorialListModel(editorialCardListModel2, bonusAppcModel2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditorialListModel)) {
            return false;
        }
        EditorialListModel editorialListModel = (EditorialListModel) obj;
        return C10202j.m34176a((Object) this.editorialCardListModel, (Object) editorialListModel.editorialCardListModel) && C10202j.m34176a((Object) this.bonusAppcModel, (Object) editorialListModel.bonusAppcModel);
    }

    public final BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }

    public final EditorialCardListModel getEditorialCardListModel() {
        return this.editorialCardListModel;
    }

    public int hashCode() {
        EditorialCardListModel editorialCardListModel2 = this.editorialCardListModel;
        int i = 0;
        int hashCode = (editorialCardListModel2 != null ? editorialCardListModel2.hashCode() : 0) * 31;
        BonusAppcModel bonusAppcModel2 = this.bonusAppcModel;
        if (bonusAppcModel2 != null) {
            i = bonusAppcModel2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "EditorialListModel(editorialCardListModel=" + this.editorialCardListModel + ", bonusAppcModel=" + this.bonusAppcModel + ")";
    }
}
