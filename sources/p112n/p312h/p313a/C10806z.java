package p112n.p312h.p313a;

import com.liulishuo.filedownloader.message.C8887b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import java.util.List;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.p318f0.C10767d;

/* renamed from: n.h.a.z */
/* compiled from: MessageSnapshotGate */
public class C10806z implements C8887b.C8889b {
    /* renamed from: a */
    private boolean m36678a(List<C10722a.C10724b> list, MessageSnapshot messageSnapshot) {
        if (list.size() > 1 && messageSnapshot.mo32695n() == -3) {
            for (C10722a.C10724b u : list) {
                if (u.mo36428u().mo36474c(messageSnapshot)) {
                    return true;
                }
            }
        }
        for (C10722a.C10724b u2 : list) {
            if (u2.mo36428u().mo36476d(messageSnapshot)) {
                return true;
            }
        }
        if (-4 == messageSnapshot.mo32695n()) {
            for (C10722a.C10724b u3 : list) {
                if (u3.mo36428u().mo36469a(messageSnapshot)) {
                    return true;
                }
            }
        }
        if (list.size() == 1) {
            return list.get(0).mo36428u().mo36472b(messageSnapshot);
        }
        return false;
    }

    /* renamed from: a */
    public void mo32715a(MessageSnapshot messageSnapshot) {
        synchronized (Integer.toString(messageSnapshot.mo32709e()).intern()) {
            List<C10722a.C10724b> d = C10773h.m36524b().mo36521d(messageSnapshot.mo32709e());
            if (d.size() > 0) {
                C10722a r = d.get(0).mo36425r();
                if (C10767d.f28826a) {
                    C10767d.m36490a(this, "~~~callback %s old[%s] new[%s] %d", Integer.valueOf(messageSnapshot.mo32709e()), Byte.valueOf(r.getStatus()), Byte.valueOf(messageSnapshot.mo32695n()), Integer.valueOf(d.size()));
                }
                if (!m36678a(d, messageSnapshot)) {
                    String str = "The event isn't consumed, id:" + messageSnapshot.mo32709e() + " status:" + messageSnapshot.mo32695n() + " task-count:" + d.size();
                    for (C10722a.C10724b r2 : d) {
                        str = str + " | " + r2.mo36425r().getStatus();
                    }
                    C10767d.m36493c(this, str, new Object[0]);
                }
            } else {
                C10767d.m36493c(this, "Receive the event %d, but there isn't any running task in the upper layer", Byte.valueOf(messageSnapshot.mo32695n()));
            }
        }
    }
}
