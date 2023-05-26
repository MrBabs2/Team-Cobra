package p015cm.aptoide.p016pt.editorial;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo16641d2 = {"Lcm/aptoide/pt/editorial/Slug;", "Lcm/aptoide/pt/editorial/EditorialLoadSource;", "slug", "", "(Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.editorial.Slug */
/* compiled from: EditorialLoadSource.kt */
public final class Slug extends EditorialLoadSource {
    private final String slug;

    public Slug(String str) {
        super((DefaultConstructorMarker) null);
        this.slug = str;
    }

    public static /* synthetic */ Slug copy$default(Slug slug2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slug2.slug;
        }
        return slug2.copy(str);
    }

    public final String component1() {
        return this.slug;
    }

    public final Slug copy(String str) {
        return new Slug(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Slug) && C10202j.m34176a((Object) this.slug, (Object) ((Slug) obj).slug);
        }
        return true;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        String str = this.slug;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Slug(slug=" + this.slug + ")";
    }
}
