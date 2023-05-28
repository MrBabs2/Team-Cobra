package p015cm.aptoide.aptoideviews.downloadprogressview;

import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextSwitcher;
import android.widget.TextView;
import kotlin.C10483v;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.aptoideviews.C1033R;
import p015cm.aptoide.aptoideviews.common.AnimatedImageView;
import p015cm.aptoide.aptoideviews.downloadprogressview.DownloadEventListener;
import p015cm.aptoide.aptoideviews.downloadprogressview.Event;
import p015cm.aptoide.aptoideviews.downloadprogressview.State;
import p112n.p319i.C10807a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001*\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\n¢\u0006\u0002\b\u0006"}, mo16641d2 = {"<anonymous>", "", "Lcom/tinder/StateMachine$GraphBuilder;", "Lcm/aptoide/aptoideviews/downloadprogressview/State;", "Lcm/aptoide/aptoideviews/downloadprogressview/Event;", "", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.downloadprogressview.DownloadProgressView$stateMachine$1 */
/* compiled from: DownloadProgressView.kt */
final class DownloadProgressView$stateMachine$1 extends C10203k implements C9113l<C10807a.C10812c<State, Event, Object>, C10483v> {
    final /* synthetic */ DownloadProgressView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DownloadProgressView$stateMachine$1(DownloadProgressView downloadProgressView) {
        super(1);
        this.this$0 = downloadProgressView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10807a.C10812c<State, Event, Object>) (C10807a.C10812c) obj);
        return C10483v.f28357a;
    }

    public final void invoke(C10807a.C10812c<State, Event, Object> cVar) {
        C10202j.m34178b(cVar, "$receiver");
        cVar.mo36600a(State.Queue.INSTANCE);
        cVar.mo36601a(C10807a.C10816d.f28890c.mo36608a(State.Queue.class), new C9113l<C10807a.C10812c<State, Event, Object>.C0000a<State.Queue>, C10483v>(this) {
            final /* synthetic */ DownloadProgressView$stateMachine$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10807a.C10812c<State, Event, Object>.C0000a<State.Queue>) (C10807a.C10812c.C10813a) obj);
                return C10483v.f28357a;
            }

            public final void invoke(final C10807a.C10812c<State, Event, Object>.C0000a<State.Queue> aVar) {
                C10202j.m34178b(aVar, "$receiver");
                aVar.mo36606a(new C9117p<State.Queue, Event, C10483v>(this) {
                    final /* synthetic */ C10381 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((State.Queue) obj, (Event) obj2);
                        return C10483v.f28357a;
                    }

                    public final void invoke(State.Queue queue, Event event) {
                        C10202j.m34178b(queue, "$receiver");
                        C10202j.m34178b(event, "it");
                        Log.d("DownloadProgressView", "State.Queue");
                        this.this$0.this$0.this$0.resetProgress();
                        ProgressBar progressBar = (ProgressBar) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.progressBar);
                        C10202j.m34174a((Object) progressBar, "progressBar");
                        progressBar.setIndeterminate(true);
                        ImageView imageView = (ImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.cancelButton);
                        C10202j.m34174a((Object) imageView, "cancelButton");
                        imageView.setVisibility(4);
                        AnimatedImageView animatedImageView = (AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton);
                        C10202j.m34174a((Object) animatedImageView, "resumePauseButton");
                        animatedImageView.setVisibility(8);
                        TextView textView = (TextView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadProgressNumber);
                        C10202j.m34174a((Object) textView, "downloadProgressNumber");
                        textView.setVisibility(8);
                        ((TextSwitcher) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadState)).setText(this.this$0.this$0.this$0.downloadingText);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.DownloadStart.class), (C9117p<? super State.Queue, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Queue, Event.DownloadStart, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10381 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Queue queue, Event.DownloadStart downloadStart) {
                        C10202j.m34178b(queue, "$receiver");
                        C10202j.m34178b(downloadStart, "it");
                        this.this$0.this$0.this$0.debouncer.reset();
                        return C10807a.C10812c.C10813a.m36701a(aVar, queue, State.InProgress.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.PauseStart.class), (C9117p<? super State.Queue, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Queue, Event.PauseStart, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10381 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Queue queue, Event.PauseStart pauseStart) {
                        C10202j.m34178b(queue, "$receiver");
                        C10202j.m34178b(pauseStart, "it");
                        this.this$0.this$0.this$0.debouncer.reset();
                        return C10807a.C10812c.C10813a.m36701a(aVar, queue, State.InitialPaused.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.Reset.class), (C9117p<? super State.Queue, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Queue, Event.Reset, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Queue queue, Event.Reset reset) {
                        C10202j.m34178b(queue, "$receiver");
                        C10202j.m34178b(reset, "it");
                        return C10807a.C10812c.C10813a.m36700a(aVar, queue, (Object) null, 1, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.CancelClick.class), (C9117p<? super State.Queue, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Queue, Event.CancelClick, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10381 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Queue queue, Event.CancelClick cancelClick) {
                        C10202j.m34178b(queue, "$receiver");
                        C10202j.m34178b(cancelClick, "it");
                        DownloadEventListener access$getEventListener$p = this.this$0.this$0.this$0.eventListener;
                        if (access$getEventListener$p != null) {
                            access$getEventListener$p.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.CANCEL, this.this$0.this$0.this$0.payload));
                        }
                        return C10807a.C10812c.C10813a.m36701a(aVar, queue, State.Canceled.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.InstallStart.class), (C9117p<? super State.Queue, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Queue, Event.InstallStart, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Queue queue, Event.InstallStart installStart) {
                        C10202j.m34178b(queue, "$receiver");
                        C10202j.m34178b(installStart, "it");
                        return C10807a.C10812c.C10813a.m36701a(aVar, queue, State.Installing.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
            }
        });
        cVar.mo36601a(C10807a.C10816d.f28890c.mo36608a(State.Canceled.class), new C9113l<C10807a.C10812c<State, Event, Object>.C0000a<State.Canceled>, C10483v>(this) {
            final /* synthetic */ DownloadProgressView$stateMachine$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10807a.C10812c<State, Event, Object>.C0000a<State.Canceled>) (C10807a.C10812c.C10813a) obj);
                return C10483v.f28357a;
            }

            public final void invoke(final C10807a.C10812c<State, Event, Object>.C0000a<State.Canceled> aVar) {
                C10202j.m34178b(aVar, "$receiver");
                aVar.mo36606a(new C9117p<State.Canceled, Event, C10483v>(this) {
                    final /* synthetic */ C10452 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((State.Canceled) obj, (Event) obj2);
                        return C10483v.f28357a;
                    }

                    public final void invoke(State.Canceled canceled, Event event) {
                        C10202j.m34178b(canceled, "$receiver");
                        C10202j.m34178b(event, "it");
                        Log.d("DownloadProgressView", "State.Canceled");
                        this.this$0.this$0.this$0.resetProgress();
                        ProgressBar progressBar = (ProgressBar) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.progressBar);
                        C10202j.m34174a((Object) progressBar, "progressBar");
                        progressBar.setIndeterminate(true);
                        if (this.this$0.this$0.this$0.isPausable) {
                            ImageView imageView = (ImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.cancelButton);
                            C10202j.m34174a((Object) imageView, "cancelButton");
                            imageView.setVisibility(0);
                            AnimatedImageView animatedImageView = (AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton);
                            C10202j.m34174a((Object) animatedImageView, "resumePauseButton");
                            animatedImageView.setVisibility(8);
                        } else {
                            ImageView imageView2 = (ImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.cancelButton);
                            C10202j.m34174a((Object) imageView2, "cancelButton");
                            imageView2.setVisibility(0);
                            AnimatedImageView animatedImageView2 = (AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton);
                            C10202j.m34174a((Object) animatedImageView2, "resumePauseButton");
                            animatedImageView2.setVisibility(8);
                        }
                        TextView textView = (TextView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadProgressNumber);
                        C10202j.m34174a((Object) textView, "downloadProgressNumber");
                        textView.setVisibility(8);
                        ((TextSwitcher) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadState)).setText(this.this$0.this$0.this$0.downloadingText);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.Reset.class), (C9117p<? super State.Canceled, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Canceled, Event.Reset, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Canceled canceled, Event.Reset reset) {
                        C10202j.m34178b(canceled, "$receiver");
                        C10202j.m34178b(reset, "it");
                        return C10807a.C10812c.C10813a.m36701a(aVar, canceled, State.Queue.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.DownloadStart.class), (C9117p<? super State.Canceled, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Canceled, Event.DownloadStart, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10452 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Canceled canceled, Event.DownloadStart downloadStart) {
                        C10202j.m34178b(canceled, "$receiver");
                        C10202j.m34178b(downloadStart, "it");
                        this.this$0.this$0.this$0.debouncer.reset();
                        return C10807a.C10812c.C10813a.m36701a(aVar, canceled, State.InProgress.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.PauseStart.class), (C9117p<? super State.Canceled, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Canceled, Event.PauseStart, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10452 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Canceled canceled, Event.PauseStart pauseStart) {
                        C10202j.m34178b(canceled, "$receiver");
                        C10202j.m34178b(pauseStart, "it");
                        this.this$0.this$0.this$0.debouncer.reset();
                        return C10807a.C10812c.C10813a.m36701a(aVar, canceled, State.InitialPaused.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
            }
        });
        cVar.mo36601a(C10807a.C10816d.f28890c.mo36608a(State.InProgress.class), new C9113l<C10807a.C10812c<State, Event, Object>.C0000a<State.InProgress>, C10483v>(this) {
            final /* synthetic */ DownloadProgressView$stateMachine$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10807a.C10812c<State, Event, Object>.C0000a<State.InProgress>) (C10807a.C10812c.C10813a) obj);
                return C10483v.f28357a;
            }

            public final void invoke(final C10807a.C10812c<State, Event, Object>.C0000a<State.InProgress> aVar) {
                C10202j.m34178b(aVar, "$receiver");
                aVar.mo36606a(new C9117p<State.InProgress, Event, C10483v>(this) {
                    final /* synthetic */ C10503 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((State.InProgress) obj, (Event) obj2);
                        return C10483v.f28357a;
                    }

                    public final void invoke(State.InProgress inProgress, Event event) {
                        C10202j.m34178b(inProgress, "$receiver");
                        C10202j.m34178b(event, "it");
                        Log.d("DownloadProgressView", "State.InProgress");
                        DownloadProgressView downloadProgressView = this.this$0.this$0.this$0;
                        downloadProgressView.setProgress(downloadProgressView.currentProgress);
                        ProgressBar progressBar = (ProgressBar) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.progressBar);
                        C10202j.m34174a((Object) progressBar, "progressBar");
                        progressBar.setIndeterminate(false);
                        if (this.this$0.this$0.this$0.isPausable) {
                            ImageView imageView = (ImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.cancelButton);
                            C10202j.m34174a((Object) imageView, "cancelButton");
                            imageView.setVisibility(8);
                            AnimatedImageView animatedImageView = (AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton);
                            C10202j.m34174a((Object) animatedImageView, "resumePauseButton");
                            animatedImageView.setVisibility(0);
                        } else {
                            ImageView imageView2 = (ImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.cancelButton);
                            C10202j.m34174a((Object) imageView2, "cancelButton");
                            imageView2.setVisibility(0);
                            AnimatedImageView animatedImageView2 = (AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton);
                            C10202j.m34174a((Object) animatedImageView2, "resumePauseButton");
                            animatedImageView2.setVisibility(8);
                        }
                        ((AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton)).play();
                        TextView textView = (TextView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadProgressNumber);
                        C10202j.m34174a((Object) textView, "downloadProgressNumber");
                        textView.setVisibility(0);
                        ((TextSwitcher) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadState)).setText(this.this$0.this$0.this$0.downloadingText);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.PauseClick.class), (C9117p<? super State.InProgress, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.InProgress, Event.PauseClick, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10503 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.InProgress inProgress, Event.PauseClick pauseClick) {
                        C10202j.m34178b(inProgress, "$receiver");
                        C10202j.m34178b(pauseClick, "it");
                        DownloadEventListener access$getEventListener$p = this.this$0.this$0.this$0.eventListener;
                        if (access$getEventListener$p != null) {
                            access$getEventListener$p.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.PAUSE, this.this$0.this$0.this$0.payload));
                        }
                        return C10807a.C10812c.C10813a.m36701a(aVar, inProgress, State.Paused.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.PauseStart.class), (C9117p<? super State.InProgress, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.InProgress, Event.PauseStart, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.InProgress inProgress, Event.PauseStart pauseStart) {
                        C10202j.m34178b(inProgress, "$receiver");
                        C10202j.m34178b(pauseStart, "it");
                        return C10807a.C10812c.C10813a.m36701a(aVar, inProgress, State.Paused.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.InstallStart.class), (C9117p<? super State.InProgress, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.InProgress, Event.InstallStart, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.InProgress inProgress, Event.InstallStart installStart) {
                        C10202j.m34178b(inProgress, "$receiver");
                        C10202j.m34178b(installStart, "it");
                        return C10807a.C10812c.C10813a.m36701a(aVar, inProgress, State.Installing.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.Reset.class), (C9117p<? super State.InProgress, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.InProgress, Event.Reset, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.InProgress inProgress, Event.Reset reset) {
                        C10202j.m34178b(inProgress, "$receiver");
                        C10202j.m34178b(reset, "it");
                        return C10807a.C10812c.C10813a.m36701a(aVar, inProgress, State.Queue.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.CancelClick.class), (C9117p<? super State.InProgress, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.InProgress, Event.CancelClick, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10503 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.InProgress inProgress, Event.CancelClick cancelClick) {
                        C10202j.m34178b(inProgress, "$receiver");
                        C10202j.m34178b(cancelClick, "it");
                        DownloadEventListener access$getEventListener$p = this.this$0.this$0.this$0.eventListener;
                        if (access$getEventListener$p != null) {
                            access$getEventListener$p.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.CANCEL, this.this$0.this$0.this$0.payload));
                        }
                        return C10807a.C10812c.C10813a.m36701a(aVar, inProgress, State.Canceled.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
            }
        });
        cVar.mo36601a(C10807a.C10816d.f28890c.mo36608a(State.Paused.class), new C9113l<C10807a.C10812c<State, Event, Object>.C0000a<State.Paused>, C10483v>(this) {
            final /* synthetic */ DownloadProgressView$stateMachine$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10807a.C10812c<State, Event, Object>.C0000a<State.Paused>) (C10807a.C10812c.C10813a) obj);
                return C10483v.f28357a;
            }

            public final void invoke(final C10807a.C10812c<State, Event, Object>.C0000a<State.Paused> aVar) {
                C10202j.m34178b(aVar, "$receiver");
                aVar.mo36606a(new C9117p<State.Paused, Event, C10483v>(this) {
                    final /* synthetic */ C10574 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((State.Paused) obj, (Event) obj2);
                        return C10483v.f28357a;
                    }

                    public final void invoke(State.Paused paused, Event event) {
                        C10202j.m34178b(paused, "$receiver");
                        C10202j.m34178b(event, "it");
                        Log.d("DownloadProgressView", "State.Paused");
                        ProgressBar progressBar = (ProgressBar) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.progressBar);
                        C10202j.m34174a((Object) progressBar, "progressBar");
                        progressBar.setIndeterminate(false);
                        ImageView imageView = (ImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.cancelButton);
                        C10202j.m34174a((Object) imageView, "cancelButton");
                        imageView.setVisibility(0);
                        AnimatedImageView animatedImageView = (AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton);
                        C10202j.m34174a((Object) animatedImageView, "resumePauseButton");
                        animatedImageView.setVisibility(0);
                        ((AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton)).playReverse();
                        TextView textView = (TextView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadProgressNumber);
                        C10202j.m34174a((Object) textView, "downloadProgressNumber");
                        textView.setVisibility(0);
                        ((TextSwitcher) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadState)).setText(this.this$0.this$0.this$0.pausedText);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.ResumeClick.class), (C9117p<? super State.Paused, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Paused, Event.ResumeClick, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10574 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Paused paused, Event.ResumeClick resumeClick) {
                        C10202j.m34178b(paused, "$receiver");
                        C10202j.m34178b(resumeClick, "it");
                        DownloadEventListener access$getEventListener$p = this.this$0.this$0.this$0.eventListener;
                        if (access$getEventListener$p != null) {
                            access$getEventListener$p.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.RESUME, this.this$0.this$0.this$0.payload));
                        }
                        return C10807a.C10812c.C10813a.m36701a(aVar, paused, State.InProgress.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.CancelClick.class), (C9117p<? super State.Paused, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Paused, Event.CancelClick, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10574 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Paused paused, Event.CancelClick cancelClick) {
                        C10202j.m34178b(paused, "$receiver");
                        C10202j.m34178b(cancelClick, "it");
                        DownloadEventListener access$getEventListener$p = this.this$0.this$0.this$0.eventListener;
                        if (access$getEventListener$p != null) {
                            access$getEventListener$p.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.CANCEL, this.this$0.this$0.this$0.payload));
                        }
                        return C10807a.C10812c.C10813a.m36701a(aVar, paused, State.Canceled.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.Reset.class), (C9117p<? super State.Paused, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Paused, Event.Reset, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Paused paused, Event.Reset reset) {
                        C10202j.m34178b(paused, "$receiver");
                        C10202j.m34178b(reset, "it");
                        return C10807a.C10812c.C10813a.m36701a(aVar, paused, State.Queue.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
            }
        });
        cVar.mo36601a(C10807a.C10816d.f28890c.mo36608a(State.InitialPaused.class), new C9113l<C10807a.C10812c<State, Event, Object>.C0000a<State.InitialPaused>, C10483v>(this) {
            final /* synthetic */ DownloadProgressView$stateMachine$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10807a.C10812c<State, Event, Object>.C0000a<State.InitialPaused>) (C10807a.C10812c.C10813a) obj);
                return C10483v.f28357a;
            }

            public final void invoke(final C10807a.C10812c<State, Event, Object>.C0000a<State.InitialPaused> aVar) {
                C10202j.m34178b(aVar, "$receiver");
                aVar.mo36606a(new C9117p<State.InitialPaused, Event, C10483v>(this) {
                    final /* synthetic */ C10625 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((State.InitialPaused) obj, (Event) obj2);
                        return C10483v.f28357a;
                    }

                    public final void invoke(State.InitialPaused initialPaused, Event event) {
                        C10202j.m34178b(initialPaused, "$receiver");
                        C10202j.m34178b(event, "it");
                        Log.d("DownloadProgressView", "State.InitialPaused");
                        ProgressBar progressBar = (ProgressBar) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.progressBar);
                        C10202j.m34174a((Object) progressBar, "progressBar");
                        progressBar.setIndeterminate(false);
                        ImageView imageView = (ImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.cancelButton);
                        C10202j.m34174a((Object) imageView, "cancelButton");
                        imageView.setVisibility(0);
                        AnimatedImageView animatedImageView = (AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton);
                        C10202j.m34174a((Object) animatedImageView, "resumePauseButton");
                        animatedImageView.setVisibility(0);
                        ((AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton)).setReverseAsDefault();
                        TextView textView = (TextView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadProgressNumber);
                        C10202j.m34174a((Object) textView, "downloadProgressNumber");
                        textView.setVisibility(0);
                        DownloadProgressView downloadProgressView = this.this$0.this$0.this$0;
                        downloadProgressView.setProgress(downloadProgressView.currentProgress);
                        ((TextSwitcher) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadState)).setText(this.this$0.this$0.this$0.pausedText);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.ResumeClick.class), (C9117p<? super State.InitialPaused, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.InitialPaused, Event.ResumeClick, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10625 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.InitialPaused initialPaused, Event.ResumeClick resumeClick) {
                        C10202j.m34178b(initialPaused, "$receiver");
                        C10202j.m34178b(resumeClick, "it");
                        DownloadEventListener access$getEventListener$p = this.this$0.this$0.this$0.eventListener;
                        if (access$getEventListener$p != null) {
                            access$getEventListener$p.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.RESUME, this.this$0.this$0.this$0.payload));
                        }
                        return C10807a.C10812c.C10813a.m36701a(aVar, initialPaused, State.InProgress.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.CancelClick.class), (C9117p<? super State.InitialPaused, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.InitialPaused, Event.CancelClick, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>(this) {
                    final /* synthetic */ C10625 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.InitialPaused initialPaused, Event.CancelClick cancelClick) {
                        C10202j.m34178b(initialPaused, "$receiver");
                        C10202j.m34178b(cancelClick, "it");
                        DownloadEventListener access$getEventListener$p = this.this$0.this$0.this$0.eventListener;
                        if (access$getEventListener$p != null) {
                            access$getEventListener$p.onActionClick(new DownloadEventListener.Action(DownloadEventListener.Action.Type.CANCEL, this.this$0.this$0.this$0.payload));
                        }
                        return C10807a.C10812c.C10813a.m36701a(aVar, initialPaused, State.Canceled.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.Reset.class), (C9117p<? super State.InitialPaused, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.InitialPaused, Event.Reset, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.InitialPaused initialPaused, Event.Reset reset) {
                        C10202j.m34178b(initialPaused, "$receiver");
                        C10202j.m34178b(reset, "it");
                        return C10807a.C10812c.C10813a.m36701a(aVar, initialPaused, State.Queue.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
            }
        });
        cVar.mo36601a(C10807a.C10816d.f28890c.mo36608a(State.Installing.class), new C9113l<C10807a.C10812c<State, Event, Object>.C0000a<State.Installing>, C10483v>(this) {
            final /* synthetic */ DownloadProgressView$stateMachine$1 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((C10807a.C10812c<State, Event, Object>.C0000a<State.Installing>) (C10807a.C10812c.C10813a) obj);
                return C10483v.f28357a;
            }

            public final void invoke(final C10807a.C10812c<State, Event, Object>.C0000a<State.Installing> aVar) {
                C10202j.m34178b(aVar, "$receiver");
                aVar.mo36606a(new C9117p<State.Installing, Event, C10483v>(this) {
                    final /* synthetic */ C10676 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((State.Installing) obj, (Event) obj2);
                        return C10483v.f28357a;
                    }

                    public final void invoke(State.Installing installing, Event event) {
                        C10202j.m34178b(installing, "$receiver");
                        C10202j.m34178b(event, "it");
                        Log.d("DownloadProgressView", "State.Installing");
                        ProgressBar progressBar = (ProgressBar) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.progressBar);
                        C10202j.m34174a((Object) progressBar, "progressBar");
                        progressBar.setIndeterminate(true);
                        ImageView imageView = (ImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.cancelButton);
                        C10202j.m34174a((Object) imageView, "cancelButton");
                        imageView.setVisibility(4);
                        AnimatedImageView animatedImageView = (AnimatedImageView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.resumePauseButton);
                        C10202j.m34174a((Object) animatedImageView, "resumePauseButton");
                        animatedImageView.setVisibility(8);
                        TextView textView = (TextView) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadProgressNumber);
                        C10202j.m34174a((Object) textView, "downloadProgressNumber");
                        textView.setVisibility(8);
                        ((TextSwitcher) this.this$0.this$0.this$0._$_findCachedViewById(C1033R.C1035id.downloadState)).setText(this.this$0.this$0.this$0.installingText);
                    }
                });
                aVar.mo36605a((C10807a.C10816d<EVENT, ? extends E>) C10807a.C10816d.f28890c.mo36608a(Event.Reset.class), (C9117p<? super State.Installing, ? super E, ? extends C10807a.C10809b.C10810a.C10811a<? extends STATE, ? extends SIDE_EFFECT>>) new C9117p<State.Installing, Event.Reset, C10807a.C10809b.C10810a.C10811a<? extends State, ? extends Object>>() {
                    public final C10807a.C10809b.C10810a.C10811a<State, Object> invoke(State.Installing installing, Event.Reset reset) {
                        C10202j.m34178b(installing, "$receiver");
                        C10202j.m34178b(reset, "it");
                        return C10807a.C10812c.C10813a.m36701a(aVar, installing, State.Queue.INSTANCE, (Object) null, 2, (Object) null);
                    }
                });
            }
        });
    }
}
