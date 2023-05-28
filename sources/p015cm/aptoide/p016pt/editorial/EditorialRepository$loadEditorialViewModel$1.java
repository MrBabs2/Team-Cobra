package p015cm.aptoide.p016pt.editorial;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p123rx.p126m.C5379n;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, mo16641d2 = {"<anonymous>", "Lcm/aptoide/pt/editorial/EditorialViewModel;", "editorialViewModel", "kotlin.jvm.PlatformType", "call"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.editorial.EditorialRepository$loadEditorialViewModel$1 */
/* compiled from: EditorialRepository.kt */
final class EditorialRepository$loadEditorialViewModel$1<T, R> implements C5379n<T, R> {
    final /* synthetic */ EditorialRepository this$0;

    EditorialRepository$loadEditorialViewModel$1(EditorialRepository editorialRepository) {
        this.this$0 = editorialRepository;
    }

    public final EditorialViewModel call(EditorialViewModel editorialViewModel) {
        EditorialRepository editorialRepository = this.this$0;
        C10202j.m34174a((Object) editorialViewModel, "editorialViewModel");
        return editorialRepository.saveResponse(editorialViewModel);
    }
}
