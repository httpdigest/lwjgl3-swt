/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal.win32;

public class DEVMODEA extends DEVMODE {
	public byte[] dmDeviceName = new byte[OS.CCHDEVICENAME];
	public byte[] dmFormName = new byte[OS.CCHFORMNAME];
	public static final int sizeof = OS.DEVMODEA_sizeof ();
}
