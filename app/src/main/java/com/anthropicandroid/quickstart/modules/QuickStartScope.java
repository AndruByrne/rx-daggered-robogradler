package com.anthropicandroid.quickstart.modules;

/*
 * Created by Andrew Brin on 6/21/2016.
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface QuickStartScope { }
