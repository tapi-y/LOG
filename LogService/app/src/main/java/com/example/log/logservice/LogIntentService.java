package com.example.log.logservice;

import android.app.IntentService;
import android.content.Intent;


public class LogIntentService extends IntentService {
    public static final String ACTION_FOO = "com.example.log.logservice.action.FOO";
    public static final String ACTION_BAZ = "com.example.log.logservice.action.BAZ";

    public static final String EXTRA_PARAM1 = "com.example.log.logservice.extra.PARAM1";
    public static final String EXTRA_PARAM2 = "com.example.log.logservice.extra.PARAM2";

    public LogIntentService() {
        super("LogIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_FOO.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionFoo(param1, param2);
            } else if (ACTION_BAZ.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionBaz(param1, param2);
            }
        }
    }

    private void handleActionFoo(String param1, String param2) {
        // TODO: Handle action Foo
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
