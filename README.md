# Calcbench for Android

118 calculators across 13 subjects in a small offline Android app (Android 8.0+).

## Install
Open the latest release on your phone, download **Calcbench.apk**, and open it. Android will ask you to allow installs from your browser or Files app the first time.

## Signing
Releases are signed with one permanent key so each new APK installs over the previous one.
The key lives only in the repository's Actions secrets:

| Secret | Value |
|---|---|
| `KEYSTORE_BASE64` | the `.p12` keystore, base64-encoded |
| `KEYSTORE_PASSWORD` | keystore password (also the key password) |
| `KEY_ALIAS` | `calcbench` |

Keep a backup of the keystore and password somewhere safe. If they are lost, future builds cannot update an installed copy; you would have to uninstall and reinstall.
Without the secrets, the workflow still builds but publishes no release.

## Build
Every push to `main` builds the APK with GitHub Actions and attaches it to a new release.
To build locally, open this folder in Android Studio, or run `gradle assembleRelease`.

The calculators live in `app/src/main/assets/index.html`.
