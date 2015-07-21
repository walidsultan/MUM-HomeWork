package lesson5.lecture.factorymethods2.rulesets;

import java.awt.Component;

import lesson5.lecture.factorymethods2.RuleException;
import lesson5.lecture.factorymethods2.RuleSet;
import lesson5.lecture.factorymethods2.windows.AddressWindow;

public class AddressRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		AddressWindow addr = (AddressWindow)ob;
		//comment 
		throw new RuleException("An address rule has been violated!");
		
	}

}
