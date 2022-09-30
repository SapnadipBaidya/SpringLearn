package org.learn.spring;

import java.awt.print.Printable;

import javax.management.loading.PrivateClassLoader;

public class TextEditor {
private SpellChecker spellChecker;

public SpellChecker getSpellChecker() {
	return spellChecker;
}

public void setSpellChecker(SpellChecker spellChecker) {
	System.out.println("inside setSpellChecker");
	this.spellChecker = spellChecker;
}

public void spellCheck() {
	spellChecker.checkSpelling();
}
}
