package com.summercoding.benchmark.ioc.framework.salta;

import javax.inject.Inject;

import com.summercoding.benchmark.ioc.pojo.Sample;

/**
 * @author: Rafal Leszko
 */
public class Base {
	private Sample sample;

	@Inject
	public Base(Sample sample) {
		this.sample = sample;
	}

	public Sample getSample() {
		return sample;
	}
}
