/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfElement;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:named-expressions}.
 *
 */
public class TableNamedExpressionsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfNamespaceNames.TABLE, "named-expressions" );


	/**
	 * Create the instance of <code>TableNamedExpressionsElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableNamedExpressionsElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:named-expressions}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element table:named-range}.
	 *
     * @param tableCellRangeAddressAttributeValue  the <code>String</code> value of <code>TableCellRangeAddressAttribute</code>, see {@odf.attribute  table:cell-range-address} at specification
	 * @param tableNameAttributeValue  the <code>String</code> value of <code>TableNameAttribute</code>, see {@odf.attribute  table:name} at specification
	 * @return   return  the element {@odf.element table:named-range}
	 * DifferentQName 
	 */
    
	public TableNamedRangeElement newTableNamedRangeElement(String tableCellRangeAddressAttributeValue, String tableNameAttributeValue)
	{
		TableNamedRangeElement  tableNamedRange = ((OdfFileDom)this.ownerDocument).newOdfElement(TableNamedRangeElement.class);
		tableNamedRange.setTableCellRangeAddressAttribute( tableCellRangeAddressAttributeValue );
		tableNamedRange.setTableNameAttribute( tableNameAttributeValue );
		this.appendChild( tableNamedRange);
		return  tableNamedRange;      
	}
    
	/**
	 * Create child element {@odf.element table:named-expression}.
	 *
     * @param tableExpressionAttributeValue  the <code>String</code> value of <code>TableExpressionAttribute</code>, see {@odf.attribute  table:expression} at specification
	 * @param tableNameAttributeValue  the <code>String</code> value of <code>TableNameAttribute</code>, see {@odf.attribute  table:name} at specification
	 * @return   return  the element {@odf.element table:named-expression}
	 * DifferentQName 
	 */
    
	public TableNamedExpressionElement newTableNamedExpressionElement(String tableExpressionAttributeValue, String tableNameAttributeValue)
	{
		TableNamedExpressionElement  tableNamedExpression = ((OdfFileDom)this.ownerDocument).newOdfElement(TableNamedExpressionElement.class);
		tableNamedExpression.setTableExpressionAttribute( tableExpressionAttributeValue );
		tableNamedExpression.setTableNameAttribute( tableNameAttributeValue );
		this.appendChild( tableNamedExpression);
		return  tableNamedExpression;      
	}
    
}