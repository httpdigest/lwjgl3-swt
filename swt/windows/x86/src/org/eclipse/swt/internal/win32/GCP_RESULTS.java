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

public class GCP_RESULTS {
	public int lStructSize;
	/** @field cast=(LPTSTR) */
	public int /*long*/ lpOutString;
	/** @field cast=(UINT  *) */
	public int /*long*/ lpOrder;
	/** @field cast=(int  *) */
	public int /*long*/ lpDx;
	/** @field cast=(int  *) */
	public int /*long*/ lpCaretPos;
	/** @field cast=(LPSTR) */
	public int /*long*/ lpClass;
	/** @field cast=(LPWSTR) */
	public int /*long*/ lpGlyphs;
	public int nGlyphs;
	public int nMaxFit;
	public static final int sizeof = OS.GCP_RESULTS_sizeof ();
}

