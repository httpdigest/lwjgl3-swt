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

public class CHOOSECOLOR {
	public int lStructSize;
	/** @field cast=(HWND) */
	public int /*long*/ hwndOwner;
	/** @field cast=(HANDLE) */
	public int /*long*/ hInstance;
	public int rgbResult;
	/** @field cast=(COLORREF *) */
	public int /*long*/ lpCustColors;
	public int Flags;
	public int /*long*/ lCustData;
	/** @field cast=(LPCCHOOKPROC) */
	public int /*long*/ lpfnHook;
	/** @field cast=(LPCTSTR) */
	public int /*long*/ lpTemplateName;
	public static final int sizeof = OS.CHOOSECOLOR_sizeof ();
}
