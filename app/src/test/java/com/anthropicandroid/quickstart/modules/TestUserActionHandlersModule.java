package com.anthropicandroid.quickstart.modules;

import com.anthropicandroid.quickstart.activity.UserActionHandlers;

/*
 * Created by Andrew Brin on 6/21/2016.
 */
public class TestUserActionHandlersModule extends UserActionHandlersModule{

    private UserActionHandlers userActionHandlers;

    TestUserActionHandlersModule(UserActionHandlers userActionHandlers){
        this.userActionHandlers = userActionHandlers;
    }

    @Override
    UserActionHandlers getUserActionHandlers() {
        return userActionHandlers;
    }
}
