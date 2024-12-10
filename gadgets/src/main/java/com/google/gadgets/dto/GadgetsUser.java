package com.google.gadgets.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class GadgetsUser {
	
	@Autowired
	@Qualifier("intel")
	private LaptopBrand laptop;
	
	
	@Autowired
	@Qualifier("sumsung")
	private MobileBrands mobile;
	
	@Autowired
	@Qualifier("googleAndroidOs")
	private OpratingSystem operating;

}
