/**
 * Copyright (c) 2016 Eclipse contributors and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.emf.test.ecore.xcore;


import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.ecore.xcore.XcoreInjectorProvider;
import org.eclipse.emf.ecore.xcore.XcoreRuntimeModule;
import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup;

import com.google.inject.Injector;


public class XcoreStandaloneInjectorProvider extends XcoreInjectorProvider
{
  @Override
  public Injector getInjector()
  {
    if (CommonPlugin.IS_ECLIPSE_RUNNING)
    {
      System.setProperty("org.eclipse.emf.ecore.plugin.EcorePlugin.doNotLoadResourcesPlugin", "true");
      System.setProperty("org.eclipse.emf.examples.generator.validator", "false");

      if (injector == null)
      {
        this.injector = internalCreateInjector();
      }
      return injector;
    }
    else
    {
      return super.getInjector();
    }
  }

  @Override
  protected Injector internalCreateInjector()
  {
    return super.internalCreateInjector();
  }

  @Override
  protected XcoreRuntimeModule createRuntimeModule()
  {
    return new XcoreStandaloneSetup.XcoreStandaloneRuntimeModule()
      {
      };
  }

  @Override
  public void restoreRegistry()
  {
    if (!CommonPlugin.IS_ECLIPSE_RUNNING)
    {
      super.restoreRegistry();
    }
  }

  @Override
  public void setupRegistry()
  {
    if (!CommonPlugin.IS_ECLIPSE_RUNNING)
    {
      super.setupRegistry();
    }
  }
}
