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
package org.openacs.message;

import org.openacs.Message;
import javax.xml.soap.*;

public class GetRPCMethods extends Message {

    /** Creates a new instance of GetRPCMethods */
    public GetRPCMethods() {
        name = "GetRPCMethods";
    }

    public GetRPCMethods(String _id) {
        name = "GetRPCMethods";
        id = _id;
    }

    protected void createBody(SOAPBodyElement body, SOAPFactory spf) throws SOAPException {
    }

    protected void parseBody(SOAPBodyElement body, SOAPFactory f) throws SOAPException {
    }
}
