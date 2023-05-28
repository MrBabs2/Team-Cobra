package p015cm.aptoide.p016pt.view.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.C0074c;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;

/* renamed from: cm.aptoide.pt.view.dialog.DialogBadgeV7 */
public class DialogBadgeV7 extends BaseDialogFragment {
    protected String appName;
    protected Malware malware;
    protected String marketName;
    protected Malware.Rank rank;

    /* renamed from: cm.aptoide.pt.view.dialog.DialogBadgeV7$1 */
    static /* synthetic */ class C45991 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank;

        /* renamed from: $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Reason$Status */
        static final /* synthetic */ int[] f7830xa0d786a2;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.Malware$Reason$Status[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Reason.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7830xa0d786a2 = r0
                r1 = 1
                cm.aptoide.pt.dataprovider.model.v7.Malware$Reason$Status r2 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Reason.Status.passed     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f7830xa0d786a2     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Reason$Status r3 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Reason.Status.failed     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f7830xa0d786a2     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Reason$Status r4 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Reason.Status.blacklisted     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank[] r3 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank = r3
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r4 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.TRUSTED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank     // Catch:{ NoSuchFieldError -> 0x0043 }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r3 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.WARNING     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank     // Catch:{ NoSuchFieldError -> 0x004d }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.view.dialog.DialogBadgeV7.C45991.<clinit>():void");
        }
    }

    public static DialogBadgeV7 newInstance(String str, Malware malware2, String str2, Malware.Rank rank2) {
        DialogBadgeV7 dialogBadgeV7 = new DialogBadgeV7();
        dialogBadgeV7.malware = malware2;
        dialogBadgeV7.appName = str2;
        dialogBadgeV7.rank = rank2;
        dialogBadgeV7.marketName = str;
        return dialogBadgeV7;
    }

    /* renamed from: a */
    public /* synthetic */ void mo15543a(View view) {
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View inflate = LayoutInflater.from(getActivity()).inflate(C1086R.layout.layout_dialog_badge, (ViewGroup) null);
        C0074c.C0075a aVar = new C0074c.C0075a(new ContextThemeWrapper(getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId));
        aVar.mo229b(inflate);
        C0074c a = aVar.mo225a();
        inflate.findViewById(C1086R.C1088id.dialog_ok_button).setOnClickListener(new C4601a(this));
        Malware malware2 = this.malware;
        if (!(malware2 == null || malware2.getRank() == null)) {
            int i = C45991.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[this.malware.getRank().ordinal()];
            if (i == 1) {
                inflate.findViewById(C1086R.C1088id.trusted_header_layout).setVisibility(0);
            } else if (i == 2) {
                inflate.findViewById(C1086R.C1088id.warning_header_layout).setVisibility(0);
            } else if (i == 3) {
                inflate.findViewById(C1086R.C1088id.unknown_header_layout).setVisibility(0);
                inflate.findViewById(C1086R.C1088id.tr_unknown).setVisibility(0);
                return a;
            }
        }
        Malware malware3 = this.malware;
        if (!(malware3 == null || malware3.getReason() == null)) {
            if (!(this.malware.getReason().getScanned() == null || this.malware.getReason().getScanned().getStatus() == null || ((!Malware.Reason.Status.passed.equals(this.malware.getReason().getScanned().getStatus()) && !Malware.Reason.Status.warn.equals(this.malware.getReason().getScanned().getStatus())) || this.malware.getReason().getScanned().getAvInfo() == null))) {
                inflate.findViewById(C1086R.C1088id.tr_scanned).setVisibility(0);
                ((TextView) inflate.findViewById(C1086R.C1088id.message_virus_no)).setText(getString(C1086R.string.appviewbadge_message_virus_no));
            }
            if (this.malware.getReason().getThirdpartyValidated() != null && Malware.GOOGLE_PLAY.equalsIgnoreCase(this.malware.getReason().getThirdpartyValidated().getStore())) {
                inflate.findViewById(C1086R.C1088id.tr_third_party).setVisibility(0);
            }
            if (!(this.malware.getReason().getSignatureValidated() == null || this.malware.getReason().getSignatureValidated().getStatus() == null)) {
                int i2 = C45991.f7830xa0d786a2[this.malware.getReason().getSignatureValidated().getStatus().ordinal()];
                if (i2 == 1) {
                    inflate.findViewById(C1086R.C1088id.tr_signature).setVisibility(0);
                    ((TextView) inflate.findViewById(C1086R.C1088id.tv_reason_signature_validation)).setText(getString(C1086R.string.appviewbadge_message_signature_matches));
                } else if (i2 == 2) {
                    inflate.findViewById(C1086R.C1088id.tr_signature).setVisibility(0);
                    inflate.findViewById(C1086R.C1088id.iv_signature).setVisibility(4);
                    ((TextView) inflate.findViewById(C1086R.C1088id.tv_reason_signature_validation)).setText(getString(C1086R.string.appviewbadge_message_signature_different));
                }
            }
            if (!(this.malware.getReason().getManual() == null || this.malware.getReason().getManual().getStatus() == null || !Malware.Reason.Status.passed.equals(this.malware.getReason().getManual().getStatus()))) {
                inflate.findViewById(C1086R.C1088id.tr_manual).setVisibility(0);
                ((TextView) inflate.findViewById(C1086R.C1088id.message_virus_no_manual)).setText(getString(C1086R.string.appviewbadge_message_virus_no));
            }
        }
        return a;
    }
}
