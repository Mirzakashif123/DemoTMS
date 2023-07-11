package LokeshSauce;

import blazeDemoPom.RedBusPom;
import php.genericUtility.RedBaseClass;

public class RedBusDriver extends RedBaseClass{
public void book() {
	RedBusPom red=new RedBusPom(driver);
	
	red.getFrom().sendKeys("Mysuru");
	red.getto().sendKeys("Bengaluru");
	red.getSearch().click();
	
	
}
}
