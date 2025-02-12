// Copyright 2019 The Chromium Authors
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chromoting;

/**
 * The Activity for showing the privacy policy.
 */
public class PrivacyPolicyActivity extends WebViewActivity {
    private static final String POLICY_URL = "https://privacy.kiwibrowser.org";

    public PrivacyPolicyActivity() {
        super(R.string.privacy_policy, POLICY_URL);
    }
}
