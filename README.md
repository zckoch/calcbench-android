# Calcbench for Android

118 calculators across 13 subjects in a small offline Android app (Android 8.0+).

## Install
Open the latest release on your phone, download **Calcbench.apk**, and open it. Android will ask you to allow installs from your browser or Files app the first time.

## Build
Every push to `main` builds the APK with GitHub Actions and attaches it to a new release.
To build locally, open this folder in Android Studio, or run `gradle assembleRelease`.

The calculators live in `app/src/main/assets/index.html`.
