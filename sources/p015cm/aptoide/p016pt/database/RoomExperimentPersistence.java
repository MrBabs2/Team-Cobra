package p015cm.aptoide.p016pt.database;

import p015cm.aptoide.p016pt.abtesting.Experiment;
import p015cm.aptoide.p016pt.abtesting.ExperimentModel;
import p015cm.aptoide.p016pt.abtesting.ExperimentPersistence;
import p015cm.aptoide.p016pt.database.room.ExperimentDAO;
import p015cm.aptoide.p016pt.database.room.RoomExperiment;
import p120q.p326a.C10838a0;
import p120q.p326a.C10839b;
import p120q.p326a.C10846c;
import p120q.p326a.C11447e;
import p120q.p326a.C11450f;
import p120q.p326a.C11496w;
import p120q.p326a.p349h0.C11461a;
import p123rx.C5328b;
import p123rx.Single;
import p123rx.p126m.C5378b;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomExperimentPersistence */
public class RoomExperimentPersistence implements ExperimentPersistence {
    private final ExperimentDAO experimentDAO;
    private final RoomExperimentMapper mapper;

    public RoomExperimentPersistence(ExperimentDAO experimentDAO2, RoomExperimentMapper roomExperimentMapper) {
        this.experimentDAO = experimentDAO2;
        this.mapper = roomExperimentMapper;
    }

    /* renamed from: a */
    public /* synthetic */ void mo8027a(String str, Experiment experiment, C10846c cVar) throws Exception {
        this.experimentDAO.save(this.mapper.map(str, experiment));
        cVar.onComplete();
    }

    public Single<ExperimentModel> get(String str) {
        return C10832d.m36727a(this.experimentDAO.get(str).mo37611b(C11461a.m37548b()).mo37607a(new C2165z(this))).mo18571f(C2163y.f4798f).mo18558a((C5378b<Throwable>) C2081p1.f4773f);
    }

    public C5328b save(String str, Experiment experiment) {
        return C10832d.m36728a((C11450f) C10839b.m36737a((C11447e) new C2035a0(this, str, experiment)).mo36639a(C11461a.m37548b()));
    }

    /* renamed from: a */
    public /* synthetic */ C10838a0 mo8026a(RoomExperiment roomExperiment) throws Exception {
        return C11496w.m37603a(new ExperimentModel(this.mapper.map(roomExperiment), false));
    }

    /* renamed from: a */
    static /* synthetic */ ExperimentModel m5179a(Throwable th) {
        return new ExperimentModel(new Experiment(), true);
    }
}
