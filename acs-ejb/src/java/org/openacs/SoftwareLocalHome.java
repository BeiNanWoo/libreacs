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

import java.util.Collection;
import javax.ejb.CreateException;
import javax.ejb.EJBLocalHome;
import javax.ejb.FinderException;

/**
 * This is the local-home interface for Software enterprise bean.
 */
public interface SoftwareLocalHome extends EJBLocalHome {

    SoftwareLocal findByPrimaryKey(SoftwarePK key) throws FinderException;

    public SoftwareLocal create(Integer hwid, String version, String minversion, String url) throws CreateException;

    /**
     * 
     */
    Collection<SoftwareLocal> findByHardware(Integer hardware) throws FinderException;

    /**
     * 
     */
    Collection findByVersion(String version) throws FinderException;

    Collection findAll() throws javax.ejb.FinderException;
}
