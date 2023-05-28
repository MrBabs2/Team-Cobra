package p015cm.aptoide.p016pt.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.editorial.EditorialLoadSource;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/pt/view/EditorialConfiguration;", "", "loadSource", "Lcm/aptoide/pt/editorial/EditorialLoadSource;", "(Lcm/aptoide/pt/editorial/EditorialLoadSource;)V", "getLoadSource", "()Lcm/aptoide/pt/editorial/EditorialLoadSource;", "setLoadSource", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.view.EditorialConfiguration */
/* compiled from: EditorialConfiguration.kt */
public final class EditorialConfiguration {
    private EditorialLoadSource loadSource;

    public EditorialConfiguration(EditorialLoadSource editorialLoadSource) {
        this.loadSource = editorialLoadSource;
    }

    public static /* synthetic */ EditorialConfiguration copy$default(EditorialConfiguration editorialConfiguration, EditorialLoadSource editorialLoadSource, int i, Object obj) {
        if ((i & 1) != 0) {
            editorialLoadSource = editorialConfiguration.loadSource;
        }
        return editorialConfiguration.copy(editorialLoadSource);
    }

    public final EditorialLoadSource component1() {
        return this.loadSource;
    }

    public final EditorialConfiguration copy(EditorialLoadSource editorialLoadSource) {
        return new EditorialConfiguration(editorialLoadSource);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EditorialConfiguration) && C10202j.m34176a((Object) this.loadSource, (Object) ((EditorialConfiguration) obj).loadSource);
        }
        return true;
    }

    public final EditorialLoadSource getLoadSource() {
        return this.loadSource;
    }

    public int hashCode() {
        EditorialLoadSource editorialLoadSource = this.loadSource;
        if (editorialLoadSource != null) {
            return editorialLoadSource.hashCode();
        }
        return 0;
    }

    public final void setLoadSource(EditorialLoadSource editorialLoadSource) {
        this.loadSource = editorialLoadSource;
    }

    public String toString() {
        return "EditorialConfiguration(loadSource=" + this.loadSource + ")";
    }
}
