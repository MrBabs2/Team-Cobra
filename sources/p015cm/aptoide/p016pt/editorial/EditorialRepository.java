package p015cm.aptoide.p016pt.editorial;

import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import p123rx.Single;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/editorial/EditorialRepository;", "", "editorialService", "Lcm/aptoide/pt/editorial/EditorialService;", "(Lcm/aptoide/pt/editorial/EditorialService;)V", "cachedEditorialViewModel", "Lcm/aptoide/pt/editorial/EditorialViewModel;", "loadEditorialViewModel", "Lrx/Single;", "editorialLoadSource", "Lcm/aptoide/pt/editorial/EditorialLoadSource;", "saveResponse", "editorialViewModel", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.editorial.EditorialRepository */
/* compiled from: EditorialRepository.kt */
public final class EditorialRepository {
    private EditorialViewModel cachedEditorialViewModel;
    private final EditorialService editorialService;

    public EditorialRepository(EditorialService editorialService2) {
        C10202j.m34178b(editorialService2, "editorialService");
        this.editorialService = editorialService2;
    }

    /* access modifiers changed from: private */
    public final EditorialViewModel saveResponse(EditorialViewModel editorialViewModel) {
        if (!editorialViewModel.hasError() && !editorialViewModel.isLoading()) {
            this.cachedEditorialViewModel = editorialViewModel;
        }
        return editorialViewModel;
    }

    public final Single<EditorialViewModel> loadEditorialViewModel(EditorialLoadSource editorialLoadSource) {
        Single<R> single;
        C10202j.m34178b(editorialLoadSource, "editorialLoadSource");
        EditorialViewModel editorialViewModel = this.cachedEditorialViewModel;
        if (editorialViewModel != null) {
            Single<EditorialViewModel> a = Single.m10119a(editorialViewModel);
            C10202j.m34174a((Object) a, "Single.just(cachedEditorialViewModel)");
            return a;
        }
        if (editorialLoadSource instanceof CardId) {
            single = this.editorialService.loadEditorialViewModel(((CardId) editorialLoadSource).getCardId()).mo18569d(new EditorialRepository$loadEditorialViewModel$1(this));
        } else if (editorialLoadSource instanceof Slug) {
            single = this.editorialService.loadEditorialViewModelWithSlug(((Slug) editorialLoadSource).getSlug()).mo18569d(new EditorialRepository$loadEditorialViewModel$2(this));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C10202j.m34174a((Object) single, "when (editorialLoadSourc…wModel)\n        }\n      }");
        return single;
    }
}
