package lesson5.lecture.factorymethods2;

import java.awt.Component;

public interface RuleSet {
	public void applyRules(Component ob) throws RuleException;
}
