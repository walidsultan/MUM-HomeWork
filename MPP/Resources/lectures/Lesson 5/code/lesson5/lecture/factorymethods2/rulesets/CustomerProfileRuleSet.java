package lesson5.lecture.factorymethods2.rulesets;

import java.awt.Component;

import lesson5.lecture.factorymethods2.RuleException;
import lesson5.lecture.factorymethods2.RuleSet;
import lesson5.lecture.factorymethods2.windows.CustomerProfileWindow;

public class CustomerProfileRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		CustomerProfileWindow custProf = (CustomerProfileWindow)ob;
		//check data
		
	}

}
