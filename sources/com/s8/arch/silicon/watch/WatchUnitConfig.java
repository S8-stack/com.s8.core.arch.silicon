package com.s8.arch.silicon.watch;

import com.s8.io.xml.annotations.XML_SetAttribute;
import com.s8.io.xml.annotations.XML_Type;


@XML_Type(name = "T2UnitConfig")	
public class WatchUnitConfig {

	/**
	 * 
	 */
	public int nThreads = 4;

	
	private boolean isVerbose = false;
	
	@XML_SetAttribute(name = "n-threads")
	public void setNbThreads(int nThreads) {
		this.nThreads = nThreads;
	}
	
	@XML_SetAttribute(name = "isVerbose")
	public void setVerbosity(boolean isVerbose) {
		this.isVerbose = isVerbose;
	}

	public WatchUnitConfig() {
		super();
	}

	public WatchSiUnit build() {
		return new WatchSiUnit(nThreads, isVerbose);
	}


	/**
	 * 
	 * @return
	 */
	public static WatchUnitConfig createDefault() {
		WatchUnitConfig config = new WatchUnitConfig();
		config.nThreads = 64;
		return config;
	}
}
