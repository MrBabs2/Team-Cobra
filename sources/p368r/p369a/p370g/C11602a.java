package p368r.p369a.p370g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;

/* renamed from: r.a.g.a */
/* compiled from: DNSCache */
public class C11602a extends ConcurrentHashMap<String, List<C11603b>> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C11602a(C11602a aVar) {
        this(aVar != null ? aVar.size() : 1024);
        if (aVar != null) {
            putAll(aVar);
        }
    }

    /* renamed from: b */
    private Collection<? extends C11603b> m37954b(String str) {
        return (Collection) get(str != null ? str.toLowerCase() : null);
    }

    /* renamed from: a */
    public Collection<C11603b> mo37872a() {
        ArrayList arrayList = new ArrayList();
        for (List list : values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public boolean mo37879c(C11603b bVar) {
        List list;
        if (bVar == null || (list = (List) get(bVar.mo37883a())) == null) {
            return false;
        }
        synchronized (list) {
            list.remove(bVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Object clone() throws CloneNotSupportedException {
        return new C11602a(this);
    }

    public synchronized String toString() {
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer(2000);
        stringBuffer.append("\t---- cache ----");
        Enumeration keys = keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("\n\t\t");
            stringBuffer.append("\n\t\tname '");
            stringBuffer.append(str);
            stringBuffer.append("' ");
            List<C11603b> list = (List) get(str);
            if (list == null || list.isEmpty()) {
                stringBuffer.append(" no entries");
            } else {
                synchronized (list) {
                    for (C11603b bVar : list) {
                        stringBuffer.append("\n\t\t\t");
                        stringBuffer.append(bVar.toString());
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public C11603b mo37878b(C11603b bVar) {
        Collection<? extends C11603b> b;
        C11603b bVar2 = null;
        if (!(bVar == null || (b = m37954b(bVar.mo37883a())) == null)) {
            synchronized (b) {
                Iterator<? extends C11603b> it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11603b bVar3 = (C11603b) it.next();
                    if (bVar3.mo37890b(bVar)) {
                        bVar2 = bVar3;
                        break;
                    }
                }
            }
        }
        return bVar2;
    }

    public C11602a(int i) {
        super(i);
    }

    /* renamed from: a */
    public Collection<? extends C11603b> mo37873a(String str) {
        ArrayList arrayList;
        Collection<? extends C11603b> b = m37954b(str);
        if (b == null) {
            return Collections.emptyList();
        }
        synchronized (b) {
            arrayList = new ArrayList(b);
        }
        return arrayList;
    }

    /* renamed from: b */
    public Collection<? extends C11603b> mo37877b(String str, C11670e eVar, C11669d dVar) {
        ArrayList arrayList;
        Collection<? extends C11603b> b = m37954b(str);
        if (b == null) {
            return Collections.emptyList();
        }
        synchronized (b) {
            arrayList = new ArrayList(b);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C11603b bVar = (C11603b) it.next();
                if (!bVar.mo37888a(eVar) || !bVar.mo37887a(dVar)) {
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C11603b mo37874a(String str, C11670e eVar, C11669d dVar) {
        Collection<? extends C11603b> b = m37954b(str);
        C11603b bVar = null;
        if (b != null) {
            synchronized (b) {
                Iterator<? extends C11603b> it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C11603b bVar2 = (C11603b) it.next();
                    if (bVar2.mo37888a(eVar) && bVar2.mo37887a(dVar)) {
                        bVar = bVar2;
                        break;
                    }
                }
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public boolean mo37875a(C11603b bVar) {
        if (bVar == null) {
            return false;
        }
        List list = (List) get(bVar.mo37883a());
        if (list == null) {
            putIfAbsent(bVar.mo37883a(), new ArrayList());
            list = (List) get(bVar.mo37883a());
        }
        synchronized (list) {
            list.add(bVar);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo37876a(C11603b bVar, C11603b bVar2) {
        if (bVar == null || bVar2 == null || !bVar.mo37883a().equals(bVar2.mo37883a())) {
            return false;
        }
        List list = (List) get(bVar.mo37883a());
        if (list == null) {
            putIfAbsent(bVar.mo37883a(), new ArrayList());
            list = (List) get(bVar.mo37883a());
        }
        synchronized (list) {
            list.remove(bVar2);
            list.add(bVar);
        }
        return true;
    }
}
