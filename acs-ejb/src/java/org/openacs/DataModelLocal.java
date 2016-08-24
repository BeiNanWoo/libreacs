/*
 * 
 * Copyright 2007-2012 Audrius Valunas
 * 
 * This file is part of LibreACS.

 * LibreACS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * LibreACS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with LibreACS.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
package org.openacs;

import javax.ejb.EJBLocalObject;

public interface DataModelLocal extends EJBLocalObject {

    java.lang.String getName();

    String getType();

    void setType(String type);

    long getMin();

    void setMin(long min);

    long getMax();

    void setMax(long max);

    int getLength();

    void setLength(int length);

    byte[] getDescription();

    void setDescription(byte[] description);

    String getVersion();

    void setVersion(String version);

    String getDefaultvalue();

    void setDefaultvalue(String defaut);

    boolean getWritable();

    void setWritable(boolean writable);

    String getTrname();

    void setTrname(String trname);
}
