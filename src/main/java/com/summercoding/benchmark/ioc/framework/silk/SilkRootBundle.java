package com.summercoding.benchmark.ioc.framework.silk;

import se.jbee.inject.bootstrap.BootstrapperBundle;

/**
 * @author: Rafal Leszko
 */
public class SilkRootBundle extends BootstrapperBundle {
    @Override
    protected void bootstrap() {
        install(SilkModule.class);
    }
}
