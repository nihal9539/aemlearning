package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.support.Author;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.osgi.resource.Resource;

import javax.inject.Inject;

@Model(adaptables = Resource.class, adapters = Model.class)
public class AuthTwo implements Author {

    @Inject
    @Default(values = "Def")
    String text;

    @Inject
    String text2;

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getText2() {
        return text2;
    }
}
