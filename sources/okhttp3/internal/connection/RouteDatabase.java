package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.Route;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "()V", "failedRoutes", "", "Lokhttp3/Route;", "connected", "", "route", "failed", "failedRoute", "shouldPostpone", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: RouteDatabase.kt */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        C10202j.m34178b(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        C10202j.m34178b(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        C10202j.m34178b(route, "route");
        return this.failedRoutes.contains(route);
    }
}
