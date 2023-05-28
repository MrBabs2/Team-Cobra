package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p001v4.app.C0001a;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.core.app.l */
/* compiled from: NotificationManagerCompat */
public final class C0381l {

    /* renamed from: c */
    private static final Object f1742c = new Object();

    /* renamed from: d */
    private static String f1743d;

    /* renamed from: e */
    private static Set<String> f1744e = new HashSet();

    /* renamed from: f */
    private static final Object f1745f = new Object();

    /* renamed from: g */
    private static C0384c f1746g;

    /* renamed from: a */
    private final Context f1747a;

    /* renamed from: b */
    private final NotificationManager f1748b;

    /* renamed from: androidx.core.app.l$a */
    /* compiled from: NotificationManagerCompat */
    private static class C0382a implements C0386d {

        /* renamed from: a */
        final String f1749a;

        /* renamed from: b */
        final int f1750b;

        /* renamed from: c */
        final String f1751c;

        /* renamed from: d */
        final Notification f1752d;

        C0382a(String str, int i, String str2, Notification notification) {
            this.f1749a = str;
            this.f1750b = i;
            this.f1751c = str2;
            this.f1752d = notification;
        }

        /* renamed from: a */
        public void mo2267a(C0001a aVar) throws RemoteException {
            aVar.mo1a(this.f1749a, this.f1750b, this.f1751c, this.f1752d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f1749a + ", id:" + this.f1750b + ", tag:" + this.f1751c + "]";
        }
    }

    /* renamed from: androidx.core.app.l$b */
    /* compiled from: NotificationManagerCompat */
    private static class C0383b {

        /* renamed from: a */
        final ComponentName f1753a;

        /* renamed from: b */
        final IBinder f1754b;

        C0383b(ComponentName componentName, IBinder iBinder) {
            this.f1753a = componentName;
            this.f1754b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.l$c */
    /* compiled from: NotificationManagerCompat */
    private static class C0384c implements Handler.Callback, ServiceConnection {

        /* renamed from: f */
        private final Context f1755f;

        /* renamed from: g */
        private final HandlerThread f1756g;

        /* renamed from: h */
        private final Handler f1757h;

        /* renamed from: i */
        private final Map<ComponentName, C0385a> f1758i = new HashMap();

        /* renamed from: j */
        private Set<String> f1759j = new HashSet();

        /* renamed from: androidx.core.app.l$c$a */
        /* compiled from: NotificationManagerCompat */
        private static class C0385a {

            /* renamed from: a */
            final ComponentName f1760a;

            /* renamed from: b */
            boolean f1761b = false;

            /* renamed from: c */
            C0001a f1762c;

            /* renamed from: d */
            ArrayDeque<C0386d> f1763d = new ArrayDeque<>();

            /* renamed from: e */
            int f1764e = 0;

            C0385a(ComponentName componentName) {
                this.f1760a = componentName;
            }
        }

        C0384c(Context context) {
            this.f1755f = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f1756g = handlerThread;
            handlerThread.start();
            this.f1757h = new Handler(this.f1756g.getLooper(), this);
        }

        /* renamed from: b */
        private void m1876b(C0386d dVar) {
            m1870a();
            for (C0385a next : this.f1758i.values()) {
                next.f1763d.add(dVar);
                m1877c(next);
            }
        }

        /* renamed from: c */
        private void m1877c(C0385a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1760a + ", " + aVar.f1763d.size() + " queued tasks");
            }
            if (!aVar.f1763d.isEmpty()) {
                if (!m1873a(aVar) || aVar.f1762c == null) {
                    m1878d(aVar);
                    return;
                }
                while (true) {
                    C0386d peek = aVar.f1763d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo2267a(aVar.f1762c);
                        aVar.f1763d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f1760a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1760a, e);
                    }
                }
                if (!aVar.f1763d.isEmpty()) {
                    m1878d(aVar);
                }
            }
        }

        /* renamed from: d */
        private void m1878d(C0385a aVar) {
            if (!this.f1757h.hasMessages(3, aVar.f1760a)) {
                int i = aVar.f1764e + 1;
                aVar.f1764e = i;
                if (i > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1763d.size() + " tasks to " + aVar.f1760a + " after " + aVar.f1764e + " retries");
                    aVar.f1763d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
                }
                this.f1757h.sendMessageDelayed(this.f1757h.obtainMessage(3, aVar.f1760a), (long) i2);
            }
        }

        /* renamed from: a */
        public void mo2269a(C0386d dVar) {
            this.f1757h.obtainMessage(0, dVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m1876b((C0386d) message.obj);
                return true;
            } else if (i == 1) {
                C0383b bVar = (C0383b) message.obj;
                m1872a(bVar.f1753a, bVar.f1754b);
                return true;
            } else if (i == 2) {
                m1874b((ComponentName) message.obj);
                return true;
            } else if (i != 3) {
                return false;
            } else {
                m1871a((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1757h.obtainMessage(1, new C0383b(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1757h.obtainMessage(2, componentName).sendToTarget();
        }

        /* renamed from: a */
        private void m1872a(ComponentName componentName, IBinder iBinder) {
            C0385a aVar = this.f1758i.get(componentName);
            if (aVar != null) {
                aVar.f1762c = C0001a.C0002a.m3a(iBinder);
                aVar.f1764e = 0;
                m1877c(aVar);
            }
        }

        /* renamed from: b */
        private void m1874b(ComponentName componentName) {
            C0385a aVar = this.f1758i.get(componentName);
            if (aVar != null) {
                m1875b(aVar);
            }
        }

        /* renamed from: a */
        private void m1871a(ComponentName componentName) {
            C0385a aVar = this.f1758i.get(componentName);
            if (aVar != null) {
                m1877c(aVar);
            }
        }

        /* renamed from: b */
        private void m1875b(C0385a aVar) {
            if (aVar.f1761b) {
                this.f1755f.unbindService(this);
                aVar.f1761b = false;
            }
            aVar.f1762c = null;
        }

        /* renamed from: a */
        private void m1870a() {
            Set<String> b = C0381l.m1866b(this.f1755f);
            if (!b.equals(this.f1759j)) {
                this.f1759j = b;
                List<ResolveInfo> queryIntentServices = this.f1755f.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (b.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f1758i.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f1758i.put(componentName2, new C0385a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0385a>> it = this.f1758i.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        m1875b((C0385a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private boolean m1873a(C0385a aVar) {
            if (aVar.f1761b) {
                return true;
            }
            boolean bindService = this.f1755f.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1760a), this, 33);
            aVar.f1761b = bindService;
            if (bindService) {
                aVar.f1764e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1760a);
                this.f1755f.unbindService(this);
            }
            return aVar.f1761b;
        }
    }

    /* renamed from: androidx.core.app.l$d */
    /* compiled from: NotificationManagerCompat */
    private interface C0386d {
        /* renamed from: a */
        void mo2267a(C0001a aVar) throws RemoteException;
    }

    private C0381l(Context context) {
        this.f1747a = context;
        this.f1748b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public static C0381l m1863a(Context context) {
        return new C0381l(context);
    }

    /* renamed from: b */
    public static Set<String> m1866b(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1742c) {
            if (string != null) {
                if (!string.equals(f1743d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f1744e = hashSet;
                    f1743d = string;
                }
            }
            set = f1744e;
        }
        return set;
    }

    /* renamed from: a */
    public void mo2265a(int i, Notification notification) {
        mo2266a((String) null, i, notification);
    }

    /* renamed from: a */
    public void mo2266a(String str, int i, Notification notification) {
        if (m1865a(notification)) {
            m1864a((C0386d) new C0382a(this.f1747a.getPackageName(), i, str, notification));
            this.f1748b.cancel(str, i);
            return;
        }
        this.f1748b.notify(str, i, notification);
    }

    /* renamed from: a */
    private static boolean m1865a(Notification notification) {
        Bundle a = C0373i.m1807a(notification);
        return a != null && a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    private void m1864a(C0386d dVar) {
        synchronized (f1745f) {
            if (f1746g == null) {
                f1746g = new C0384c(this.f1747a.getApplicationContext());
            }
            f1746g.mo2269a(dVar);
        }
    }
}
