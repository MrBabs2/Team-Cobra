package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0735e;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {

    /* renamed from: f */
    int f2725f = 0;

    /* renamed from: g */
    final HashMap<Integer, String> f2726g = new HashMap<>();

    /* renamed from: h */
    final RemoteCallbackList<C0732d> f2727h = new C0727a();

    /* renamed from: i */
    private final C0735e.C0736a f2728i = new C0728b();

    /* renamed from: androidx.room.MultiInstanceInvalidationService$a */
    class C0727a extends RemoteCallbackList<C0732d> {
        C0727a() {
        }

        /* renamed from: a */
        public void onCallbackDied(C0732d dVar, Object obj) {
            MultiInstanceInvalidationService.this.f2726g.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f2728i;
    }

    /* renamed from: androidx.room.MultiInstanceInvalidationService$b */
    class C0728b extends C0735e.C0736a {
        C0728b() {
        }

        /* renamed from: a */
        public int mo4323a(C0732d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f2727h) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.f2725f + 1;
                multiInstanceInvalidationService.f2725f = i;
                if (MultiInstanceInvalidationService.this.f2727h.register(dVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.f2726g.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f2725f--;
                return 0;
            }
        }

        /* renamed from: b */
        public void mo4325b(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f2727h) {
                String str = MultiInstanceInvalidationService.this.f2726g.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f2727h.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f2727h.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f2726g.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f2727h.getBroadcastItem(i2).mo4343a(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f2727h.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f2727h.finishBroadcast();
            }
        }

        /* renamed from: a */
        public void mo4324a(C0732d dVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.f2727h) {
                MultiInstanceInvalidationService.this.f2727h.unregister(dVar);
                MultiInstanceInvalidationService.this.f2726g.remove(Integer.valueOf(i));
            }
        }
    }
}
