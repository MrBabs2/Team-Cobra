package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.C0753j;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.file.CacheHelper;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;

@zzard
public final class zzacu {

    /* renamed from: A */
    public static final zzacj<Long> f17773A = zzacj.m18960a(1, "gads:video:surface_update_min_spacing_ms", 1000);

    /* renamed from: A0 */
    public static final zzacj<Boolean> f17774A0 = zzacj.m18961a(1, "gads:rewarded:adapter_initialization_enabled", (Boolean) false);

    /* renamed from: A1 */
    public static final zzacj<Long> f17775A1 = zzacj.m18960a(0, "gads:js_flags:update_interval", TimeUnit.HOURS.toMillis(12));

    /* renamed from: A2 */
    public static final zzacj<String> f17776A2 = zzacj.m18962a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");

    /* renamed from: B */
    public static final zzacj<Boolean> f17777B = zzacj.m18961a(1, "gads:video:spinner:enabled", (Boolean) false);

    /* renamed from: B0 */
    public static final zzacj<Boolean> f17778B0 = zzacj.m18961a(1, "gads:rewarded:ad_metadata_enabled", (Boolean) false);

    /* renamed from: B1 */
    public static final zzacj<Boolean> f17779B1 = zzacj.m18961a(0, "gads:js_flags:mf", (Boolean) false);

    /* renamed from: B2 */
    public static final zzacj<Boolean> f17780B2 = zzacj.m18961a(1, "gads:nonagon:banner:check_dp_size", (Boolean) true);

    /* renamed from: C */
    public static final zzacj<Integer> f17781C = zzacj.m18959a(1, "gads:video:spinner:scale", 4);

    /* renamed from: C0 */
    public static final zzacj<Boolean> f17782C0 = zzacj.m18961a(1, "gads:rewarded:ssv_custom_data_enabled", (Boolean) true);

    /* renamed from: C1 */
    public static final zzacj<String> f17783C1 = zzacj.m18962a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");

    /* renamed from: C2 */
    public static final zzacj<Boolean> f17784C2 = zzacj.m18961a(1, "gads:nonagon:rewarded:load_multiple_ads", (Boolean) true);

    /* renamed from: D */
    public static final zzacj<Long> f17785D = zzacj.m18960a(1, "gads:video:spinner:jank_threshold_ms", 50);

    /* renamed from: D0 */
    public static final zzacj<Long> f17786D0 = zzacj.m18960a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);

    /* renamed from: D1 */
    public static final zzacj<String> f17787D1 = zzacj.m18962a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");

    /* renamed from: D2 */
    public static final zzacj<Boolean> f17788D2 = zzacj.m18961a(1, "gads:nonagon:return_no_fill_error_code", (Boolean) false);

    /* renamed from: E */
    public static final zzacj<Boolean> f17789E = zzacj.m18961a(1, "gads:video:aggressive_media_codec_release", (Boolean) false);

    /* renamed from: E0 */
    public static final zzacj<Long> f17790E0 = zzacj.m18960a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));

    /* renamed from: E1 */
    public static final zzacj<Integer> f17791E1 = zzacj.m18959a(1, "gads:native_video_load_timeout", 10);

    /* renamed from: E2 */
    public static final zzacj<Boolean> f17792E2 = zzacj.m18961a(1, "gads:nonagon:continue_on_no_fill", (Boolean) false);

    /* renamed from: F */
    public static final zzacj<Boolean> f17793F = zzacj.m18961a(1, "gads:memory_bundle:debug_info", (Boolean) false);

    /* renamed from: F0 */
    public static final zzacj<Boolean> f17794F0 = zzacj.m18961a(1, "gads:adid_values_in_adrequest:enabled", (Boolean) false);

    /* renamed from: F1 */
    public static final zzacj<Boolean> f17795F1 = zzacj.m18961a(1, "gads:enable_native_media_aspect_ratio", (Boolean) true);

    /* renamed from: F2 */
    public static final zzacj<Boolean> f17796F2 = zzacj.m18961a(1, "gads:nonagon:separate_timeout:enabled", (Boolean) true);

    /* renamed from: G */
    public static final zzacj<String> f17797G = zzacj.m18962a(1, "gads:video:codec_query_mime_types", "");

    /* renamed from: G0 */
    public static final zzacj<Long> f17798G0 = zzacj.m18960a(1, "gads:adid_values_in_adrequest:timeout", 2000);

    /* renamed from: G1 */
    public static final zzacj<String> f17799G1 = zzacj.m18962a(1, "gads:ad_choices_content_description", "Ad Choices Icon");

    /* renamed from: G2 */
    public static final zzacj<Integer> f17800G2 = zzacj.m18959a(1, "gads:nonagon:request_timeout:seconds", 60);

    /* renamed from: H */
    public static final zzacj<Integer> f17801H = zzacj.m18959a(1, "gads:video:codec_query_minimum_version", 16);

    /* renamed from: H0 */
    public static final zzacj<Boolean> f17802H0 = zzacj.m18961a(1, "gads:disable_adid_values_in_ms", (Boolean) false);

    /* renamed from: H1 */
    public static final zzacj<Boolean> f17803H1 = zzacj.m18961a(1, "gads:enable_singleton_broadcast_receiver", (Boolean) false);

    /* renamed from: H2 */
    public static final zzacj<Boolean> f17804H2 = zzacj.m18961a(0, "gads:nonagon:limit_ad_request_connection", (Boolean) true);

    /* renamed from: I */
    public static final zzacj<String> f17805I = zzacj.m18962a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_banner.js");

    /* renamed from: I0 */
    public static final zzacj<Long> f17806I0 = zzacj.m18960a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);

    /* renamed from: I1 */
    public static final zzacj<Boolean> f17807I1 = zzacj.m18961a(1, "gads:native:media_view_match_parent:enabled", (Boolean) false);

    /* renamed from: I2 */
    public static final zzacj<Boolean> f17808I2 = zzacj.m18961a(1, "gads:nonagon:javascript_ad_request:enabled", (Boolean) false);

    /* renamed from: J */
    public static final zzacj<String> f17809J = zzacj.m18962a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_expanded_banner.js");

    /* renamed from: J0 */
    public static final zzacj<Boolean> f17810J0 = zzacj.m18961a(1, "gads:custom_close_blocking:enabled", (Boolean) false);

    /* renamed from: J1 */
    public static final zzacj<Boolean> f17811J1 = zzacj.m18961a(1, "gads:native:count_impression_for_assets", (Boolean) false);

    /* renamed from: J2 */
    public static final zzacj<Boolean> f17812J2 = zzacj.m18961a(1, "gads:nonagon:banner_recursive_renderer", (Boolean) false);

    /* renamed from: K */
    public static final zzacj<String> f17813K = zzacj.m18962a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/mraid/v2/mraid_app_interstitial.js");

    /* renamed from: K0 */
    public static final zzacj<Boolean> f17814K0 = zzacj.m18961a(1, "gads:disabling_closable_area:enabled", (Boolean) false);

    /* renamed from: K1 */
    public static final zzacj<Boolean> f17815K1 = zzacj.m18961a(1, "gads:fluid_ad:use_wrap_content_height", (Boolean) false);

    /* renamed from: K2 */
    public static final zzacj<Boolean> f17816K2 = zzacj.m18961a(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", (Boolean) true);

    /* renamed from: L */
    public static final zzacj<String> f17817L = zzacj.m18962a(1, "gad:mraid:version", "2.0");

    /* renamed from: L0 */
    public static final zzacj<Boolean> f17818L0 = zzacj.m18961a(1, "gads:use_system_ui_for_fullscreen:enabled", (Boolean) false);

    /* renamed from: L1 */
    public static final zzacj<Long> f17819L1 = zzacj.m18960a(1, "gads:auto_location_timeout", 2000);

    /* renamed from: L2 */
    public static final zzacj<Boolean> f17820L2 = zzacj.m18961a(1, "gads:signals:ad_id_info:enabled", (Boolean) false);

    /* renamed from: M */
    public static final zzacj<Boolean> f17821M = zzacj.m18961a(1, "gads:mraid:unload", (Boolean) false);

    /* renamed from: M0 */
    public static final zzacj<Boolean> f17822M0 = zzacj.m18961a(1, "gads:ad_overlay:collect_cutout_info:enabled", (Boolean) false);

    /* renamed from: M1 */
    public static final zzacj<Boolean> f17823M1 = zzacj.m18961a(1, "gads:fetch_app_settings_using_cld:enabled", (Boolean) false);

    /* renamed from: M2 */
    public static final zzacj<Boolean> f17824M2 = zzacj.m18961a(1, "gads:signals:app_index:enabled", (Boolean) false);

    /* renamed from: N */
    public static final zzacj<Boolean> f17825N = zzacj.m18961a(0, "gads:enabled_sdk_csi", (Boolean) false);

    /* renamed from: N0 */
    public static final zzacj<Boolean> f17826N0 = zzacj.m18961a(1, "gads:delay_banner_renderer:enabled", (Boolean) true);

    /* renamed from: N1 */
    public static final zzacj<Boolean> f17827N1 = zzacj.m18961a(1, "gads:use_manifest_appid_cld:enabled", (Boolean) false);

    /* renamed from: N2 */
    public static final zzacj<Boolean> f17828N2 = zzacj.m18961a(1, "gads:signals:cache:enabled", (Boolean) false);

    /* renamed from: O */
    public static final zzacj<String> f17829O = zzacj.m18962a(0, "gads:sdk_csi_server", "https://csi.gstatic.com/csi");

    /* renamed from: O0 */
    public static final zzacj<Boolean> f17830O0 = zzacj.m18961a(0, "gads:debug_logging_feature:enable", (Boolean) false);

    /* renamed from: O1 */
    public static final zzacj<Long> f17831O1 = zzacj.m18960a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);

    /* renamed from: O2 */
    public static final zzacj<Boolean> f17832O2 = zzacj.m18961a(1, "gads:signals:doritos:enabled", (Boolean) false);

    /* renamed from: P */
    public static final zzacj<Boolean> f17833P = zzacj.m18961a(0, "gads:sdk_csi_write_to_file", (Boolean) false);

    /* renamed from: P0 */
    public static final zzacj<Boolean> f17834P0 = zzacj.m18961a(0, "gads:debug_logging_feature:intercept_web_view", (Boolean) false);

    /* renamed from: P1 */
    public static final zzacj<Long> f17835P1 = zzacj.m18960a(1, "gads:parental_controls:timeout", 2000);

    /* renamed from: P2 */
    public static final zzacj<Boolean> f17836P2 = zzacj.m18961a(1, "gads:signals:doritos:v1:enabled", (Boolean) false);

    /* renamed from: Q */
    public static final zzacj<Boolean> f17837Q = zzacj.m18961a(0, "gads:enable_content_fetching", (Boolean) true);

    /* renamed from: Q0 */
    private static final zzacj<Integer> f17838Q0 = zzacj.m18959a(1, "gads:heap_wastage:bytes", 0);

    /* renamed from: Q1 */
    public static final zzacj<Boolean> f17839Q1 = zzacj.m18961a(0, "gads:safe_browsing:debug", (Boolean) false);

    /* renamed from: Q2 */
    public static final zzacj<Boolean> f17840Q2 = zzacj.m18961a(1, "gads:signals:location:enabled", (Boolean) false);

    /* renamed from: R */
    public static final zzacj<Integer> f17841R = zzacj.m18959a(0, "gads:content_length_weight", 1);

    /* renamed from: R0 */
    public static final zzacj<String> f17842R0 = zzacj.m18962a(1, "gads:spherical_video:vertex_shader", "");

    /* renamed from: R1 */
    public static final zzacj<Boolean> f17843R1 = zzacj.m18961a(1, "gads:cache:bind_on_foreground", (Boolean) false);

    /* renamed from: R2 */
    public static final zzacj<Boolean> f17844R2 = zzacj.m18961a(1, "gads:signals:parental_control:enabled", (Boolean) false);

    /* renamed from: S */
    public static final zzacj<Integer> f17845S = zzacj.m18959a(0, "gads:content_age_weight", 1);

    /* renamed from: S0 */
    public static final zzacj<String> f17846S0 = zzacj.m18962a(1, "gads:spherical_video:fragment_shader", "");

    /* renamed from: S1 */
    public static final zzacj<Boolean> f17847S1 = zzacj.m18961a(1, "gads:cache:bind_on_init", (Boolean) false);

    /* renamed from: S2 */
    public static final zzacj<Boolean> f17848S2 = zzacj.m18961a(1, "gads:signals:video_decoder:enabled", (Boolean) false);

    /* renamed from: T */
    public static final zzacj<Integer> f17849T = zzacj.m18959a(0, "gads:min_content_len", 11);

    /* renamed from: T0 */
    public static final zzacj<Boolean> f17850T0 = zzacj.m18961a(0, "gads:log:verbose_enabled", (Boolean) false);

    /* renamed from: T1 */
    public static final zzacj<Boolean> f17851T1 = zzacj.m18961a(1, "gads:cache:bind_on_request", (Boolean) false);

    /* renamed from: T2 */
    public static final zzacj<Boolean> f17852T2 = zzacj.m18961a(1, "gads:signals:signals_on_service:enabled", (Boolean) false);

    /* renamed from: U */
    public static final zzacj<Integer> f17853U = zzacj.m18959a(0, "gads:fingerprint_number", 10);

    /* renamed from: U0 */
    public static final zzacj<Boolean> f17854U0 = zzacj.m18961a(1, "gads:include_local_global_rectangles", (Boolean) false);

    /* renamed from: U1 */
    public static final zzacj<Long> f17855U1 = zzacj.m18960a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));

    /* renamed from: U2 */
    public static final zzacj<Long> f17856U2 = zzacj.m18960a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);

    /* renamed from: V */
    public static final zzacj<Integer> f17857V = zzacj.m18959a(0, "gads:sleep_sec", 10);

    /* renamed from: V0 */
    public static final zzacj<Long> f17858V0 = zzacj.m18960a(1, "gads:position_watcher:throttle_ms", 200);

    /* renamed from: V1 */
    public static final zzacj<Boolean> f17859V1 = zzacj.m18961a(1, "gads:cache:use_cache_data_source", (Boolean) false);

    /* renamed from: V2 */
    public static final zzacj<String> f17860V2 = zzacj.m18962a(0, "gads:public_beta:traffic_multiplier", "1.0");

    /* renamed from: W */
    public static final zzacj<Integer> f17861W = zzacj.m18959a(1, "gads:content_vertical_fingerprint_number", 100);

    /* renamed from: W0 */
    public static final zzacj<Long> f17862W0 = zzacj.m18960a(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);

    /* renamed from: W1 */
    public static final zzacj<Boolean> f17863W1 = zzacj.m18961a(1, "gads:cache:connection_per_read", (Boolean) false);

    /* renamed from: W2 */
    public static final zzacj<Integer> f17864W2 = zzacj.m18959a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);

    /* renamed from: X */
    public static final zzacj<Integer> f17865X = zzacj.m18959a(1, "gads:content_vertical_fingerprint_bits", 23);

    /* renamed from: X0 */
    public static final zzacj<Boolean> f17866X0 = zzacj.m18961a(1, "gads:position_watcher:enable_scroll_aware_ads", (Boolean) false);

    /* renamed from: X1 */
    public static final zzacj<Long> f17867X1 = zzacj.m18960a(1, "gads:cache:connection_timeout", 5000);

    /* renamed from: X2 */
    public static final zzacj<Integer> f17868X2 = zzacj.m18959a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", (int) C0753j.MAX_BIND_PARAMETER_CNT);

    /* renamed from: Y */
    public static final zzacj<Integer> f17869Y = zzacj.m18959a(1, "gads:content_vertical_fingerprint_ngram", 3);

    /* renamed from: Y0 */
    public static final zzacj<Boolean> f17870Y0 = zzacj.m18961a(1, "gads:position_watcher:send_scroll_data", (Boolean) false);

    /* renamed from: Y1 */
    public static final zzacj<Long> f17871Y1 = zzacj.m18960a(1, "gads:cache:read_only_connection_timeout", 5000);

    /* renamed from: Y2 */
    public static final zzacj<Integer> f17872Y2 = zzacj.m18959a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 26);

    /* renamed from: Z */
    public static final zzacj<String> f17873Z = zzacj.m18962a(1, "gads:content_fetch_view_tag_id", "googlebot");

    /* renamed from: Z0 */
    public static final zzacj<Long> f17874Z0 = zzacj.m18960a(0, "gads:device_info_caching_expiry_ms:expiry", (long) LocalNotificationSyncManager.FIVE_MINUTES);

    /* renamed from: Z1 */
    public static final zzacj<Boolean> f17875Z1 = zzacj.m18961a(1, "gads:http_assets_cache:enabled", (Boolean) false);

    /* renamed from: Z2 */
    public static final zzacj<Integer> f17876Z2 = zzacj.m18959a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 27);

    /* renamed from: a */
    public static final zzacj<String> f17877a = zzacj.m18962a(0, "gads:sdk_core_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html");

    /* renamed from: a0 */
    public static final zzacj<String> f17878a0 = zzacj.m18962a(1, "gads:content_fetch_exclude_view_tag", "none");

    /* renamed from: a1 */
    public static final zzacj<Boolean> f17879a1 = zzacj.m18961a(0, "gads:webview:error_reporting_enabled", (Boolean) false);

    /* renamed from: a2 */
    public static final zzacj<String> f17880a2 = zzacj.m18962a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");

    /* renamed from: a3 */
    public static final zzacj<Boolean> f17881a3 = zzacj.m18961a(1, "gads:consent:shared_preference_reading:enabled", (Boolean) true);

    /* renamed from: b */
    public static final zzacj<String> f17882b = zzacj.m18962a(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: b0 */
    public static final zzacj<Boolean> f17883b0 = zzacj.m18961a(1, "gads:content_fetch_disable_get_title_from_webview", (Boolean) false);

    /* renamed from: b1 */
    public static final zzacj<Long> f17884b1 = zzacj.m18960a(1, "gads:rtb_signal_timeout_ms", 1000);

    /* renamed from: b2 */
    public static final zzacj<Integer> f17885b2 = zzacj.m18959a(1, "gads:http_assets_cache:time_out", 100);

    /* renamed from: b3 */
    public static final zzacj<Boolean> f17886b3 = zzacj.m18961a(1, "gads:consent:iab_consent_info:enabled", (Boolean) true);

    /* renamed from: c */
    public static final zzacj<String> f17887c = zzacj.m18962a(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");

    /* renamed from: c0 */
    public static final zzacj<Boolean> f17888c0 = zzacj.m18961a(1, "gads:content_fetch_enable_new_content_score", (Boolean) false);

    /* renamed from: c1 */
    public static final zzacj<Boolean> f17889c1 = zzacj.m18961a(2, "rtb_enabled", (Boolean) false);

    /* renamed from: c2 */
    public static final zzacj<Boolean> f17890c2 = zzacj.m18961a(1, "gads:chrome_custom_tabs_browser:enabled", (Boolean) false);

    /* renamed from: c3 */
    public static final zzacj<Boolean> f17891c3 = zzacj.m18961a(1, "gads:nativeads:image:sample:enabled", (Boolean) true);

    /* renamed from: d */
    public static final zzacj<Boolean> f17892d = zzacj.m18961a(0, "gads:request_builder:refresh_if_destroyed:enable", (Boolean) true);

    /* renamed from: d0 */
    public static final zzacj<Boolean> f17893d0 = zzacj.m18961a(1, "gads:content_fetch_enable_serve_once", (Boolean) false);

    /* renamed from: d1 */
    public static final zzacj<Boolean> f17894d1 = zzacj.m18961a(1, "gads:rtb_cld:enabled", (Boolean) false);

    /* renamed from: d2 */
    public static final zzacj<Boolean> f17895d2 = zzacj.m18961a(1, "gads:chrome_custom_tabs:disabled", (Boolean) false);

    /* renamed from: d3 */
    public static final zzacj<Integer> f17896d3 = zzacj.m18959a(1, "gads:nativeads:image:sample:pixels", (int) CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);

    /* renamed from: e */
    public static final zzacj<Boolean> f17897e = zzacj.m18961a(0, "gads:sdk_crash_report_enabled", (Boolean) false);

    /* renamed from: e0 */
    public static final zzacj<Boolean> f17898e0 = zzacj.m18961a(0, "gads:ad_key_enabled", (Boolean) false);

    /* renamed from: e1 */
    public static final zzacj<Long> f17899e1 = zzacj.m18960a(0, "gads:rendering:timeout_ms", 60000);

    /* renamed from: e2 */
    public static final zzacj<Long> f17900e2 = zzacj.m18960a(1, "gads:debug_hold_gesture:time_millis", 2000);

    /* renamed from: e3 */
    public static final zzacj<Boolean> f17901e3 = zzacj.m18961a(1, "gads:nativeads:overlay_webview:onclick", (Boolean) false);

    /* renamed from: f */
    public static final zzacj<Boolean> f17902f = zzacj.m18961a(0, "gads:report_dynamite_crash_in_background_thread", (Boolean) false);

    /* renamed from: f0 */
    public static final zzacj<Boolean> f17903f0 = zzacj.m18961a(1, "gads:sai:enabled", (Boolean) true);

    /* renamed from: f1 */
    public static final zzacj<Boolean> f17904f1 = zzacj.m18961a(1, "gads:adapter_initialization:enabled", (Boolean) false);

    /* renamed from: f2 */
    public static final zzacj<String> f17905f2 = zzacj.m18962a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");

    /* renamed from: f3 */
    public static final zzacj<Integer> f17906f3 = zzacj.m18959a(0, "gads:dynamite_load:fail:sample_rate", 10000);

    /* renamed from: g */
    public static final zzacj<Boolean> f17907g = zzacj.m18961a(0, "gads:sdk_crash_report_full_stacktrace", (Boolean) false);

    /* renamed from: g0 */
    public static final zzacj<String> f17908g0 = zzacj.m18962a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");

    /* renamed from: g1 */
    public static final zzacj<Long> f17909g1 = zzacj.m18960a(1, "gads:adapter_initialization:timeout", 30);

    /* renamed from: g2 */
    public static final zzacj<String> f17910g2 = zzacj.m18962a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");

    /* renamed from: g3 */
    public static final zzacj<Boolean> f17911g3 = zzacj.m18961a(1, "gads:offline_signaling:enabled", (Boolean) false);

    /* renamed from: h */
    public static final zzacj<String> f17912h = zzacj.m18962a(0, "gads:sdk_crash_report_class_prefix", "com.google.");

    /* renamed from: h0 */
    public static final zzacj<String> f17913h0 = zzacj.m18962a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*/adview.*");

    /* renamed from: h1 */
    public static final zzacj<Long> f17914h1 = zzacj.m18960a(1, "gads:adapter_initialization:cld_timeout", 10);

    /* renamed from: h2 */
    public static final zzacj<String> f17915h2 = zzacj.m18962a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");

    /* renamed from: h3 */
    public static final zzacj<Integer> f17916h3 = zzacj.m18959a(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: i */
    public static final zzacj<Float> f17917i = zzacj.m18958a(1, "gads:trapped_exception_sample_rate", 0.01f);

    /* renamed from: i0 */
    public static final zzacj<Boolean> f17918i0 = zzacj.m18961a(1, "gads:sai:using_macro:enabled", (Boolean) false);

    /* renamed from: i1 */
    public static final zzacj<Boolean> f17919i1 = zzacj.m18961a(0, "gads:adshield:enable_adshield_instrumentation", (Boolean) false);

    /* renamed from: i2 */
    public static final zzacj<String> f17920i2 = zzacj.m18962a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");

    /* renamed from: i3 */
    public static final zzacj<Boolean> f17921i3 = zzacj.m18961a(0, "gads:uri_query_to_map_rewrite:enabled", (Boolean) false);

    /* renamed from: j */
    public static final zzacj<String> f17922j = zzacj.m18962a(1, "gads:video_exo_player:version", "3");

    /* renamed from: j0 */
    public static final zzacj<String> f17923j0 = zzacj.m18962a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");

    /* renamed from: j1 */
    public static final zzacj<Boolean> f17924j1 = zzacj.m18961a(1, "gads:gestures:errorlogging:enabled", (Boolean) false);

    /* renamed from: j2 */
    public static final zzacj<Integer> f17925j2 = zzacj.m18959a(1, "gads:drx_debug:timeout_ms", 5000);

    /* renamed from: j3 */
    public static final zzacj<Boolean> f17926j3 = zzacj.m18961a(1, "gads:nativeads:template_signal:enabled", (Boolean) true);

    /* renamed from: k */
    public static final zzacj<Integer> f17927k = zzacj.m18959a(1, "gads:video_exo_player:connect_timeout", 8000);

    /* renamed from: k0 */
    public static final zzacj<Long> f17928k0 = zzacj.m18960a(1, "gads:sai:timeout_ms", -1);

    /* renamed from: k1 */
    public static final zzacj<Long> f17929k1 = zzacj.m18960a(1, "gads:gestures:task_timeout", 2000);

    /* renamed from: k2 */
    public static final zzacj<Integer> f17930k2 = zzacj.m18959a(1, "gad:pixel_dp_comparision_multiplier", 1);

    /* renamed from: k3 */
    public static final zzacj<Boolean> f17931k3 = zzacj.m18961a(1, "gads:nativeads:media_content_aspect_ratio:enabled", (Boolean) true);

    /* renamed from: l */
    public static final zzacj<Integer> f17932l = zzacj.m18959a(1, "gads:video_exo_player:read_timeout", 8000);

    /* renamed from: l0 */
    public static final zzacj<Integer> f17933l0 = zzacj.m18959a(1, "gads:sai:scion_thread_pool_size", 5);

    /* renamed from: l1 */
    public static final zzacj<Boolean> f17934l1 = zzacj.m18961a(1, "gads:gestures:asig:enabled", (Boolean) false);

    /* renamed from: l2 */
    public static final zzacj<Boolean> f17935l2 = zzacj.m18961a(1, "gad:interstitial_for_multi_window", (Boolean) false);

    /* renamed from: l3 */
    private static byte[] f17936l3;

    /* renamed from: m */
    public static final zzacj<Integer> f17937m = zzacj.m18959a(1, "gads:video_exo_player:loading_check_interval", (int) CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES);

    /* renamed from: m0 */
    public static final zzacj<Boolean> f17938m0 = zzacj.m18961a(1, "gads:sai:app_measurement_enabled2", (Boolean) false);

    /* renamed from: m1 */
    public static final zzacj<Boolean> f17939m1 = zzacj.m18961a(1, "gads:gestures:ans:enabled", (Boolean) false);

    /* renamed from: m2 */
    public static final zzacj<Boolean> f17940m2 = zzacj.m18961a(1, "gad:interstitial_ad_stay_active_in_multi_window", (Boolean) false);

    /* renamed from: n */
    public static final zzacj<Integer> f17941n = zzacj.m18959a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);

    /* renamed from: n0 */
    public static final zzacj<Boolean> f17942n0 = zzacj.m18961a(2, "app_measurement_enabled", (Boolean) false);

    /* renamed from: n1 */
    public static final zzacj<Boolean> f17943n1 = zzacj.m18961a(1, "gads:gestures:tos:enabled", (Boolean) false);

    /* renamed from: n2 */
    public static final zzacj<Boolean> f17944n2 = zzacj.m18961a(1, "gad:interstitial_multi_window_method", (Boolean) false);

    /* renamed from: o */
    public static final zzacj<Integer> f17945o = zzacj.m18959a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);

    /* renamed from: o0 */
    public static final zzacj<Boolean> f17946o0 = zzacj.m18961a(1, "gads:sai:force_through_reflection", (Boolean) true);

    /* renamed from: o1 */
    public static final zzacj<Boolean> f17947o1 = zzacj.m18961a(1, "gads:gestures:brt:enabled", (Boolean) true);

    /* renamed from: o2 */
    public static final zzacj<Integer> f17948o2 = zzacj.m18959a(1, "gad:interstitial:close_button_padding_dip", 0);

    /* renamed from: p */
    public static final zzacj<Integer> f17949p = zzacj.m18959a(1, "gads:video_exo_player_socket_receive_buffer_size", 0);

    /* renamed from: p0 */
    public static final zzacj<Boolean> f17950p0 = zzacj.m18961a(1, "gads:sai:gmscore_availability_check_disabled", (Boolean) false);

    /* renamed from: p1 */
    public static final zzacj<Boolean> f17951p1 = zzacj.m18961a(1, "gads:signal:app_permissions:disabled", (Boolean) false);

    /* renamed from: p2 */
    public static final zzacj<Boolean> f17952p2 = zzacj.m18961a(1, "gads:clearcut_logging:enabled", (Boolean) false);

    /* renamed from: q */
    public static final zzacj<Integer> f17953q = zzacj.m18959a(1, "gads:video_stream_cache:limit_count", 5);

    /* renamed from: q0 */
    public static final zzacj<Boolean> f17954q0 = zzacj.m18961a(1, "gads:sai:logging_disabled_for_drx", (Boolean) false);

    /* renamed from: q1 */
    public static final zzacj<Boolean> f17955q1 = zzacj.m18961a(1, "gads:gestures:inthex:enabled", (Boolean) false);

    /* renamed from: q2 */
    public static final zzacj<Boolean> f17956q2 = zzacj.m18961a(1, "gads:clearcut_logging:write_to_file", (Boolean) false);

    /* renamed from: r */
    public static final zzacj<Integer> f17957r = zzacj.m18959a(1, "gads:video_stream_cache:limit_space", 8388608);

    /* renamed from: r0 */
    public static final zzacj<Boolean> f17958r0 = zzacj.m18961a(1, "gads:interstitial:app_must_be_foreground:enabled", (Boolean) false);

    /* renamed from: r1 */
    public static final zzacj<Boolean> f17959r1 = zzacj.m18961a(1, "gads:gestures:hpk:enabled", (Boolean) true);

    /* renamed from: r2 */
    public static final zzacj<Boolean> f17960r2 = zzacj.m18961a(1, "gad:publisher_testing:force_local_request:enabled", (Boolean) true);

    /* renamed from: s */
    public static final zzacj<Integer> f17961s = zzacj.m18959a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);

    /* renamed from: s0 */
    public static final zzacj<Boolean> f17962s0 = zzacj.m18961a(1, "gads:interstitial:foreground_report:enabled", (Boolean) false);

    /* renamed from: s1 */
    public static final zzacj<String> f17963s1 = zzacj.m18962a(1, "gads:gestures:pk", "");

    /* renamed from: s2 */
    public static final zzacj<String> f17964s2 = zzacj.m18962a(1, "gad:publisher_testing:force_local_request:enabled_list", "");

    /* renamed from: t */
    public static final zzacj<Long> f17965t = zzacj.m18960a(1, "gads:video_stream_cache:limit_time_sec", 300);

    /* renamed from: t0 */
    public static final zzacj<Boolean> f17966t0 = zzacj.m18961a(0, "gads:corewebview:adwebview_factory:enable", (Boolean) false);

    /* renamed from: t1 */
    public static final zzacj<Boolean> f17967t1 = zzacj.m18961a(1, "gads:gestures:bs:enabled", (Boolean) true);

    /* renamed from: t2 */
    public static final zzacj<String> f17968t2 = zzacj.m18962a(1, "gad:publisher_testing:force_local_request:disabled_list", "");

    /* renamed from: u */
    public static final zzacj<Long> f17969u = zzacj.m18960a(1, "gads:video_stream_cache:notify_interval_millis", 125);

    /* renamed from: u0 */
    public static final zzacj<Boolean> f17970u0 = zzacj.m18961a(0, "gads:corewebview:javascript_engine", (Boolean) false);

    /* renamed from: u1 */
    public static final zzacj<Boolean> f17971u1 = zzacj.m18961a(1, "gads:gestures:check_initialization_thread:enabled", (Boolean) false);

    /* renamed from: u2 */
    public static final zzacj<Boolean> f17972u2 = zzacj.m18961a(0, "gad:force_dynamite_loading_enabled", (Boolean) false);

    /* renamed from: v */
    public static final zzacj<Integer> f17973v = zzacj.m18959a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);

    /* renamed from: v0 */
    public static final zzacj<Boolean> f17974v0 = zzacj.m18961a(1, "gad:webview:inject_scripts", (Boolean) false);

    /* renamed from: v1 */
    public static final zzacj<Boolean> f17975v1 = zzacj.m18961a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", (Boolean) true);

    /* renamed from: v2 */
    public static final zzacj<Integer> f17976v2 = zzacj.m18959a(1, "gad:http_redirect_max_count:times", 8);

    /* renamed from: w */
    public static final zzacj<Boolean> f17977w = zzacj.m18961a(0, "gads:video:metric_reporting_enabled", (Boolean) false);

    /* renamed from: w0 */
    public static final zzacj<Boolean> f17978w0 = zzacj.m18961a(0, "gads:webview:permission:disabled", (Boolean) false);

    /* renamed from: w1 */
    public static final zzacj<Boolean> f17979w1 = zzacj.m18961a(1, "gads:gestures:pds:enabled", (Boolean) false);

    /* renamed from: w2 */
    public static final zzacj<Boolean> f17980w2 = zzacj.m18961a(1, "gads:omid:enabled", (Boolean) false);

    /* renamed from: x */
    public static final zzacj<String> f17981x = zzacj.m18962a(1, "gads:video:metric_frame_hash_times", "");

    /* renamed from: x0 */
    public static final zzacj<Boolean> f17982x0 = zzacj.m18961a(1, "gads:webview:error_web_response:enabled", (Boolean) false);

    /* renamed from: x1 */
    public static final zzacj<Boolean> f17983x1 = zzacj.m18961a(1, "gads:gestures:ns:enabled", (Boolean) false);

    /* renamed from: x2 */
    public static final zzacj<Integer> f17984x2 = zzacj.m18959a(1, "gads:omid:destroy_webview_delay", 1000);

    /* renamed from: y */
    public static final zzacj<Long> f17985y = zzacj.m18960a(1, "gads:video:metric_frame_hash_time_leniency", 500);

    /* renamed from: y0 */
    public static final zzacj<Boolean> f17986y0 = zzacj.m18961a(1, "gads:webviewgone:kill_process:enabled", (Boolean) false);

    /* renamed from: y1 */
    public static final zzacj<Boolean> f17987y1 = zzacj.m18961a(1, "gads:gestures:vdd:enabled", (Boolean) false);

    /* renamed from: y2 */
    public static final zzacj<Boolean> f17988y2 = zzacj.m18961a(0, "gads:nonagon:red_button", (Boolean) false);

    /* renamed from: z */
    public static final zzacj<Boolean> f17989z = zzacj.m18961a(1, "gads:video:force_watermark", (Boolean) false);

    /* renamed from: z0 */
    public static final zzacj<Boolean> f17990z0 = zzacj.m18961a(1, "gads:webviewgone:new_onshow:enabled", (Boolean) false);

    /* renamed from: z1 */
    public static final zzacj<String> f17991z1 = zzacj.m18962a(1, "gads:sdk_core_constants:caps", "");

    /* renamed from: z2 */
    public static final zzacj<Boolean> f17992z2 = zzacj.m18961a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", (Boolean) false);

    static {
        zzacj.m18957a(0, "gads:sdk_core_experiment_id");
        zzacj.m18962a(0, "gads:sdk_core_js_location", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.js");
        zzacj.m18961a(0, "gads:request_builder:singleton_webview", (Boolean) false);
        zzacj.m18957a(0, "gads:request_builder:singleton_webview_experiment_id");
        zzacj.m18957a(0, "gads:request_builder:refresh_if_destroyed:experiment_id");
        zzacj.m18961a(0, "gads:sdk_use_dynamic_module", (Boolean) true);
        zzacj.m18957a(0, "gads:sdk_use_dynamic_module_experiment_id");
        zzacj.m18957a(0, "gads:block_autoclicks_experiment_id");
        zzacj.m18957a(0, "gads:spam_app_context:experiment_id");
        zzacj.m18959a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
        zzacj.m18957a(0, "gads:video_stream_cache:experiment_id");
        zzacj.m18958a(0, "gads:ad_id_app_context:ping_ratio", 0.0f);
        zzacj.m18957a(0, "gads:ad_id_use_shared_preference:experiment_id");
        zzacj.m18961a(0, "gads:ad_id_use_shared_preference:enabled", (Boolean) false);
        zzacj.m18958a(0, "gads:ad_id_use_shared_preference:ping_ratio", 0.0f);
        zzacj.m18961a(0, "gads:ad_id_use_persistent_service:enabled", (Boolean) false);
        zzacj.m18961a(0, "gads:ad_id:use_ipc:enabled", (Boolean) false);
        zzacj.m18961a(0, "gads:app_index:without_content_info_present:enabled", (Boolean) true);
        zzacj.m18960a(0, "gads:app_index:timeout_ms", 1000);
        zzacj.m18957a(0, "gads:app_index:experiment_id");
        zzacj.m18959a(0, "gads:webview_cache_version", 0);
        zzacj.m18957a(0, "gads:corewebview:experiment_id");
        zzacj.m18961a(1, "gads:rsku:webviewgone:kill_process:enabled", (Boolean) false);
        zzacj.m18961a(1, "gads:rsku:webviewgone:new_onshow:enabled", (Boolean) true);
        zzacj.m18963b(0, "gads:pan:experiment_id");
        zzacj.m18961a(1, "gads:new_rewarded_ad:enabled", (Boolean) true);
        zzacj.m18960a(1, "gads:rewarded:adapter_timeout_ms", 20000);
        zzacj.m18961a(0, "gads:ad_serving:enabled", (Boolean) true);
        zzacj.m18961a(1, "gads:impression_optimization_enabled", (Boolean) false);
        zzacj.m18962a(1, "gads:banner_ad_pool:schema", "customTargeting");
        zzacj.m18959a(1, "gads:banner_ad_pool:max_queues", 3);
        zzacj.m18959a(1, "gads:banner_ad_pool:max_pools", 3);
        zzacj.m18961a(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);
        zzacj.m18961a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", (Boolean) false);
        zzacj.m18962a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
        zzacj.m18962a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
        zzacj.m18959a(1, "gads:interstitial_ad_pool:max_pools", 3);
        zzacj.m18959a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
        zzacj.m18959a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
        zzacj.m18962a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
        zzacj.m18959a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
        zzacj.m18959a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
        zzacj.m18960a(1, "gads:interstitial_ad_pool:discard_thresholds", 0);
        zzacj.m18960a(1, "gads:interstitial_ad_pool:miss_thresholds", 0);
        zzacj.m18958a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
        zzacj.m18958a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
        zzacj.m18961a(1, "gads:gen204_signals:enabled", (Boolean) false);
        zzacj.m18961a(0, "gads:adid_reporting:enabled", (Boolean) false);
        zzacj.m18961a(0, "gads:ad_settings_page_reporting:enabled", (Boolean) false);
        zzacj.m18961a(0, "gads:adid_info_gmscore_upgrade_reporting:enabled", (Boolean) false);
        zzacj.m18960a(0, "gads:resolve_future:default_timeout_ms", 30000);
        zzacj.m18960a(0, "gads:ad_loader:timeout_ms", 60000);
        zzacj.m18961a(0, "gads:adid_notification:first_party_check:enabled", (Boolean) true);
        zzacj.m18961a(0, "gads:adid_track_reset_count:enabled", (Boolean) true);
        zzacj.m18957a(1, "gads:sdk_core_constants:experiment_id");
        zzacj.m18961a(1, "gads:js_flags:disable_phenotype", (Boolean) false);
        zzacj.m18961a(0, "gads:custom_render:ping_on_ad_rendered", (Boolean) false);
        zzacj.m18962a(0, "gads:native:engine_js_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/native_ads.js");
        zzacj.m18962a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
        zzacj.m18959a(1, "gads:omid:native_webview_load_timeout", 2000);
        zzacj.m18961a(1, "gads:enable_store_active_view_state", (Boolean) false);
        zzacj.m18961a(1, "gads:instream_ad:enabled", (Boolean) true);
        zzacj.m18961a(1, "gads:auto_location_for_coarse_permission", (Boolean) false);
        zzacj.m18963b(1, "gads:auto_location_for_coarse_permission:experiment_id");
        zzacj.m18963b(1, "gads:auto_location_timeout:experiment_id");
        zzacj.m18960a(1, "gads:auto_location_interval", -1);
        zzacj.m18963b(1, "gads:auto_location_interval:experiment_id");
        zzacj.m18961a(0, "gads:auto_location_interval:without_thread", (Boolean) true);
        zzacj.m18957a(1, "gads:fetch_app_settings_using_cld:enabled:experiment_id");
        zzacj.m18957a(0, "gads:afs:csa:experiment_id");
        zzacj.m18962a(0, "gads:afs:csa_webview_gmsg_ad_failed", "gmsg://noAdLoaded");
        zzacj.m18962a(0, "gads:afs:csa_webview_gmsg_script_load_failed", "gmsg://scriptLoadFailed");
        zzacj.m18962a(0, "gads:afs:csa_webview_gmsg_ad_loaded", "gmsg://adResized");
        zzacj.m18962a(0, "gads:afs:csa_webview_static_file_path", "/afs/ads/i/webview.html");
        zzacj.m18962a(0, "gads:afs:csa_webview_custom_domain_param_key", "csa_customDomain");
        zzacj.m18960a(0, "gads:afs:csa_webview_adshield_timeout_ms", 1000);
        zzacj.m18962a(0, "gads:safe_browsing:api_key", "AIzaSyDRKQ9d6kfsoZT2lUnZcZnBYvH69HExNPE");
        zzacj.m18960a(0, "gads:safe_browsing:safety_net:delay_ms", 2000);
        zzacj.m18959a(1, "gads:cache:ad_request_timeout_millis", 250);
        zzacj.m18959a(1, "gads:cache:max_concurrent_downloads", 10);
        zzacj.m18960a(1, "gads:cache:javascript_timeout_millis", 5000);
        zzacj.m18961a(0, "gad:force_local_ad_request_service:enabled", (Boolean) false);
        zzacj.m18957a(0, "gad:dynamite_module:experiment_id");
        zzacj.m18961a(1, "gads:nonagon:banner:enabled", (Boolean) false);
        zzacj.m18962a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");
        zzacj.m18961a(1, "gads:nonagon:interstitial:enabled", (Boolean) false);
        zzacj.m18962a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
        zzacj.m18961a(1, "gads:nonagon:rewardedvideo:enabled", (Boolean) false);
        zzacj.m18961a(1, "gads:nonagon:nativead:enabled", (Boolean) false);
        zzacj.m18962a(1, "gads:nonagon:nativead:app_name", "(?!)");
        zzacj.m18961a(1, "gads:nonagon:return_last_error_code", (Boolean) false);
        zzacj.m18961a(1, "gads:nonagon:open_not_loaded_interstitial", (Boolean) true);
        zzacj.m18961a(1, "gads:nonagon:service:enabled", (Boolean) true);
        zzacj.m18961a(1, "gads:signals:doritos:v2:immediate:enabled", (Boolean) false);
        zzacj.m18961a(1, "gads:signals:network_prediction:enabled", (Boolean) false);
        zzacj.m18961a(0, "gads:rewarded_sku:enabled", (Boolean) true);
        zzacj.m18961a(0, "gads:rewarded_sku:override_test:enabled", (Boolean) false);
        zzacj.m18961a(0, "gads:service:webview:enable_directory_suffix", (Boolean) true);
    }

    /* renamed from: a */
    public static void m18983a(Context context) {
        zzazl.m20448a(context, new C7936s(context));
        int intValue = ((Integer) zzyt.m25670e().mo27163a(f17838Q0)).intValue();
        if (intValue > 0 && f17936l3 == null) {
            f17936l3 = new byte[intValue];
        }
    }

    /* renamed from: b */
    public static List<String> m18985b() {
        return zzyt.m25669d().mo27160b();
    }

    /* renamed from: a */
    public static void m18984a(Context context, int i, JSONObject jSONObject) {
        zzyt.m25668c();
        SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        zzyt.m25669d().mo27158a(edit, 1, jSONObject);
        zzyt.m25668c();
        edit.commit();
    }

    /* renamed from: a */
    public static List<String> m18982a() {
        return zzyt.m25669d().mo27157a();
    }
}
