/*
 *  JOrtho
 *
 *  Copyright (C) 2005-2007 by i-net software
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License as 
 *  published by the Free Software Foundation; either version 2 of the
 *  License, or (at your option) any later version. 
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 *  USA.
 *  
 *  Created on 10.12.2007
 */
package com.inet.jortho;

import java.util.Locale;

/**
 * This class add the feature of a user dictionary. The application must be save it self if a user add a new word to the
 * list.
 * 
 * @author Volker Berlin
 */
public interface UserDictionaryProvider {

    /**
     * Get the list of user words for this locale. The implementation can decide if there is one user dictionary for all
     * available languages or only one. This method is called if the language is changed and the dictionary is loaded
     * and before the langauge change event is fire.
     * 
     * @param locale
     *            The locale of the selected language.
     * @return A list of words delimited with line breaks. It can be null.
     */
    String getUserWords( Locale locale );

    /**
     * Add a new word to the current user dictionary. The implmentor must be save it in its own backend.
     * 
     * @param word
     *            the new word.
     */
    void addWord( String word );

}