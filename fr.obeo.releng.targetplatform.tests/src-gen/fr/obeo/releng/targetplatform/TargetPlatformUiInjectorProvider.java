/*
* generated by Xtext
*/
package fr.obeo.releng.targetplatform;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TargetPlatformUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return fr.obeo.releng.targetplatform.ui.internal.TargetPlatformActivator.getInstance().getInjector("fr.obeo.releng.targetplatform.TargetPlatform");
	}
	
}
