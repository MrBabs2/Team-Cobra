package p015cm.aptoide.p016pt.abtesting;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cm.aptoide.pt.abtesting.ABTestRequestBody */
public class ABTestRequestBody {
    private List<Data> events;

    /* renamed from: cm.aptoide.pt.abtesting.ABTestRequestBody$Data */
    public static class Data {
        private String name;

        Data(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public ABTestRequestBody(String str) {
        ArrayList arrayList = new ArrayList();
        this.events = arrayList;
        arrayList.add(new Data(str));
    }

    public List<Data> getEvents() {
        return this.events;
    }
}
