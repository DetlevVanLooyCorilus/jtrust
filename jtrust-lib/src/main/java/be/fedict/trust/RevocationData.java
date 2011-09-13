/*
 * Java Trust Project.
 * Copyright (C) 2009-2011 FedICT.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version
 * 3.0 as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, see 
 * http://www.gnu.org/licenses/.
 */

package be.fedict.trust;

import java.util.LinkedList;
import java.util.List;

/**
 * Contains the used OCSP and CRL revocation data.
 * 
 * @author wvdhaute
 */
public class RevocationData {

	private final List<byte[]> ocspRevocationData;

	private final List<byte[]> crlRevocationData;

	/**
	 * Main constructor.
	 */
	public RevocationData() {

		this.ocspRevocationData = new LinkedList<byte[]>();
		this.crlRevocationData = new LinkedList<byte[]>();
	}

	/**
	 * Gives back a list of OCSP revocation data.
	 * 
	 * @return a list of OCSP revocation data.
	 */
	public List<byte[]> getOcspRevocationData() {

		return this.ocspRevocationData;
	}

	/**
	 * Gives back a list of CRL revocation data.
	 * 
	 * @return a list of CRL revocation data.
	 */
	public List<byte[]> getCrlRevocationData() {

		return this.crlRevocationData;
	}
}
