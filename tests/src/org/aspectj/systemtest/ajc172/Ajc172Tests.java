/*******************************************************************************
 * Copyright (c) 2012 Contributors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andy Clement - initial API and implementation
 *******************************************************************************/
package org.aspectj.systemtest.ajc172;

import java.io.File;

import junit.framework.Test;

import org.aspectj.testing.XMLBasedAjcTestCase;

/**
 * @author Andy Clement
 */ 
public class Ajc172Tests extends org.aspectj.testing.XMLBasedAjcTestCase {
	
	public void testInconsistentClassFile_pr389750() {
		runTest("inconsistent class file");
	}
	
	public void testInconsistentClassFile_pr389750_2() {
		runTest("inconsistent class file 2");
	}

	public void testInconsistentClassFile_pr389750_3() {
		runTest("inconsistent class file 3");
	}

	public void testInconsistentClassFile_pr389750_4() {
		runTest("inconsistent class file 4");
	}

	// ---

	public static Test suite() {
		return XMLBasedAjcTestCase.loadSuite(Ajc172Tests.class);
	}

	@Override
	protected File getSpecFile() {
		return new File("../tests/src/org/aspectj/systemtest/ajc172/ajc172.xml");
	}

}