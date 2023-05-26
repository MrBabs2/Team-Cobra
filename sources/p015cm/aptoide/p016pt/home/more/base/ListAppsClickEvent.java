package p015cm.aptoide.p016pt.home.more.base;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.view.app.Application;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "T", "Lcm/aptoide/pt/view/app/Application;", "", "application", "appPosition", "", "(Lcm/aptoide/pt/view/app/Application;I)V", "getAppPosition", "()I", "getApplication", "()Lcm/aptoide/pt/view/app/Application;", "Lcm/aptoide/pt/view/app/Application;", "component1", "component2", "copy", "(Lcm/aptoide/pt/view/app/Application;I)Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "equals", "", "other", "hashCode", "toString", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.base.ListAppsClickEvent */
/* compiled from: ListAppsClickEvent.kt */
public final class ListAppsClickEvent<T extends Application> {
    private final int appPosition;
    private final T application;

    public ListAppsClickEvent(T t, int i) {
        C10202j.m34178b(t, "application");
        this.application = t;
        this.appPosition = i;
    }

    public static /* synthetic */ ListAppsClickEvent copy$default(ListAppsClickEvent listAppsClickEvent, T t, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            t = listAppsClickEvent.application;
        }
        if ((i2 & 2) != 0) {
            i = listAppsClickEvent.appPosition;
        }
        return listAppsClickEvent.copy(t, i);
    }

    public final T component1() {
        return this.application;
    }

    public final int component2() {
        return this.appPosition;
    }

    public final ListAppsClickEvent<T> copy(T t, int i) {
        C10202j.m34178b(t, "application");
        return new ListAppsClickEvent<>(t, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListAppsClickEvent)) {
            return false;
        }
        ListAppsClickEvent listAppsClickEvent = (ListAppsClickEvent) obj;
        return C10202j.m34176a((Object) this.application, (Object) listAppsClickEvent.application) && this.appPosition == listAppsClickEvent.appPosition;
    }

    public final int getAppPosition() {
        return this.appPosition;
    }

    public final T getApplication() {
        return this.application;
    }

    public int hashCode() {
        T t = this.application;
        return ((t != null ? t.hashCode() : 0) * 31) + this.appPosition;
    }

    public String toString() {
        return "ListAppsClickEvent(application=" + this.application + ", appPosition=" + this.appPosition + ")";
    }
}
