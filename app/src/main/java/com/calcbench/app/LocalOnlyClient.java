package com.calcbench.app;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/** Keeps the bundled calculators in the app; opens any outside link in the browser. */
public class LocalOnlyClient extends WebViewClient {
    private final Activity activity;

    public LocalOnlyClient(Activity activity) { this.activity = activity; }

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Uri u = request.getUrl();
        if ("file".equals(u.getScheme())) return false;
        try { activity.startActivity(new Intent(Intent.ACTION_VIEW, u)); } catch (ActivityNotFoundException ignored) { }
        return true;
    }
}
