/*-
 * See the file LICENSE for redistribution information.
 *
 * Copyright (c) 2000,2008 Oracle.  All rights reserved.
 *
 * $Id: Hasher.java,v 12.7 2008/01/17 05:04:53 mjc Exp $
 */
package com.sleepycat.db;

/**
An application-specified, database hash function.
*/
public interface Hasher {
    /**
    An application-specified, database-specific hash function.
    <p>
    The hash function must handle any key values used by the application
    (possibly including zero-length keys).
    <p>
    @param db
    The enclosing database handle.
    @param data
    The byte string to be hashed.
    @param len
    The length of the byte string in bytes.
    <p>    @return
    The hash value of the byte string.
    */
    int hash(Database db, byte[] data, int len);
}
