/*
 * Java Trust Project.
 * Copyright (C) 2018 e-Contract.be BVBA.
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

package be.fedict.trust.test;

import org.joda.time.DateTime;

/**
 * Implementation of a clock that yields a fixed time.
 * 
 * @author Frank Cornelis
 *
 */
public class FixedClock implements Clock {

	private final DateTime now;

	/**
	 * Main constructor.
	 * 
	 * @param now
	 *            the fixed time for this clock.
	 */
	public FixedClock(DateTime now) {
		this.now = now;
	}

	@Override
	public DateTime getTime() {
		return this.now;
	}
}
