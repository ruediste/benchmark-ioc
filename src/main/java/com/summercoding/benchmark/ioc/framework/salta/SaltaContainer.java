package com.summercoding.benchmark.ioc.framework.salta;

import com.github.ruediste.salta.AbstractModule;
import com.github.ruediste.salta.Salta;
import com.github.ruediste.salta.jsr330.JSR330Module;
import com.github.ruediste.salta.standard.Injector;
import com.summercoding.benchmark.ioc.framework.Framework;
import com.summercoding.benchmark.ioc.pojo.Sample;
import com.summercoding.benchmark.ioc.pojo.SampleImpl;

/**
 * @author: Rafal Leszko
 */
public class SaltaContainer implements Framework {

    private final Injector injector;

    public SaltaContainer() {
        injector =Salta.createInjector(new AbstractModule() {
			
			@Override
			protected void configure() {
				bind(Sample.class).to(SampleImpl.class);
			}
		}, new JSR330Module());
    }

    @Override
    public void testGetBean() {
        Base base = injector.getInstance(Base.class);
        base.getSample().foo();
    }
}
