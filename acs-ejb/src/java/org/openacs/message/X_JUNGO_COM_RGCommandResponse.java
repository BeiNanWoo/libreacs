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

import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFactory;
import org.openacs.Message;

public class X_JUNGO_COM_RGCommandResponse extends Message {

    public X_JUNGO_COM_RGCommandResponse() {
        name = "X_JUNGO_COM_RGCommandResponse";
    }

    @Override
    protected void createBody(SOAPBodyElement body, SOAPFactory spf) throws SOAPException {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    protected void parseBody(SOAPBodyElement body, SOAPFactory spf) throws SOAPException {
        Status = getRequestElement(spf, body, "Status");
        Result = getRequestElement(spf, body, "Result");
    }

    public String getStatus() {
        return this.Status;
    }

    public String getResult() {
        return Result;
    }
    private String Result = "";
    private String Status = "";
}
