/*******************************************************************************
 * Copyright (c) 2000, 2012 IBM Corporation and others.
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

public class NMTVITEMCHANGE extends NMHDR {
	public int uChanged;
	/** @field cast=(HTREEITEM) */
	public int /*long*/ hItem;
	public int uStateNew;
	public int uStateOld;
	public int /*long*/ lParam;
	public static int sizeof = OS.NMTVITEMCHANGE_sizeof ();
}
