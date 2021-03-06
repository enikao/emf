/**
 * Copyright (c) 2009 Bestsolution.at and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   Tom Schindl<tom.schindl@bestsolution.at> - Initial API and implementation
 */
package org.eclipse.emf.example.databinding.project.ui.rcp.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.IParameterValues;


/**
 * Possible parameter values
 */
public class PersonParamValues implements IParameterValues
{

  public Map< ? , ? > getParameterValues()
  {
    Map<String, String> map = new HashMap<String, String>();
    map.put("New", "new");
    map.put("Edit", "edit");
    return map;
  }

}
