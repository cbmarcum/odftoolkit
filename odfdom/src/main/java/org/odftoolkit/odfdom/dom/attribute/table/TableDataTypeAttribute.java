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
package org.odftoolkit.odfdom.dom.attribute.table;

import org.odftoolkit.odfdom.OdfFileDom;
import org.odftoolkit.odfdom.OdfName;
import org.odftoolkit.odfdom.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfNamespaceNames;
import org.odftoolkit.odfdom.OdfAttribute;
import org.odftoolkit.odfdom.OdfElement;
import org.odftoolkit.odfdom.dom.element.table.TableFilterConditionElement;
import org.odftoolkit.odfdom.dom.element.table.TableSortByElement;
import org.odftoolkit.odfdom.dom.element.table.TableSortGroupsElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute table:data-type}.
 *
 */
public class TableDataTypeAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.newName( OdfNamespaceNames.TABLE, "data-type" );
	public static final String DEFAULT_VALUE_AUTOMATIC = Value.AUTOMATIC.toString();
	public static final String DEFAULT_VALUE_TEXT = Value.TEXT.toString();

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute table:data-type}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public TableDataTypeAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute table:data-type}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}
	
	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * The value set of {@odf.attribute table:data-type}.
	 */
	public enum Value {
	 
	 AUTOMATIC( "automatic" ), NUMBER( "number" ), TEXT( "text" );
              
		private String mValue;

		Value( String value )
		{
			mValue = value;
		}
	 	
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static Value enumValueOf( String value )
	    {
	        for( Value aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	 
	/**
	 * @param attrValue The <code>Enum</code> value of the attribute.
	 */
	public void setEnumValue(Value attrValue) {
		setValue(attrValue.toString());
	}
    
	/**
	 * @return Returns the <code>Enum</code> value of the attribute
	 */
	public Value getEnumValue(){
		return Value.enumValueOf(this.getValue());
	}
    
	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 * @throws IllegalArgumentException If the provided attribute value is invalid
	 */
	@Override
	public void setValue(String attrValue) {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof TableFilterConditionElement ){
					super.setValue(TableFilterConditionElement.TableDataTypeAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof TableSortByElement ){
					//2DO: need validate value against string;enum
					super.setValue(attrValue);
				}else if( parentElement instanceof TableSortGroupsElement ){
					//2DO: need validate value against string;enum
					super.setValue(attrValue);
				}			
			} catch (NullPointerException e) {
				// TODO: validation handling/logging
				throw new IllegalArgumentException(e);
			}
			  catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw (e);
			}
		}else{
			//2DO:what should do when the owner element is null?
			super.setValue(attrValue);
		}
	}
    
	/**
	 * @return Returns the <code>String</code> value of the attribute
	 */
	@Override
	public String getValue(){
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof TableFilterConditionElement ){
					return super.getValue();
				}else if( parentElement instanceof TableSortByElement ){
					//2DO: need validate value against string;enum
					return super.getValue();
				}else if( parentElement instanceof TableSortGroupsElement ){
					//2DO: need validate value against string;enum
					return super.getValue();
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw new NumberFormatException("the value of table:data-type is not valid");
			}
		}else{
			//2DO:what should do when the owner element is null?
			return super.getValue();
		}
		return null;
	}
	/**
	 * Returns the default value of {@odf.attribute table:data-type} dependent of its element name
	 * 
	 * @return the default value as <code>String</code>, 
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		String defaultValue = null;
		if (parentElement != null) {
			if( parentElement instanceof TableFilterConditionElement ){
				defaultValue = DEFAULT_VALUE_TEXT;
			}else if( parentElement instanceof TableSortByElement ){
				defaultValue = DEFAULT_VALUE_AUTOMATIC;
			}else if( parentElement instanceof TableSortGroupsElement ){
				defaultValue = DEFAULT_VALUE_AUTOMATIC;
			}			
		}
		return defaultValue;
	}

	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if {@odf.attribute table:data-type} has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return getOwnerElement() == null ? false : true;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}