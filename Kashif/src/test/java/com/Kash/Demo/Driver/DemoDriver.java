package com.Kash.Demo.Driver;

import org.testng.annotations.Test;

import com.Kash.DemoWebPage.genericutility.DemoBaseClass;

import demoPom.Demo_Web_Shop;

public class DemoDriver extends DemoBaseClass {
@Test
public void register() {
	Demo_Web_Shop hp =new Demo_Web_Shop(driver);
	hp.getRegister().click();
}
}
