/* 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.examproject.lang.core;

import org.examproject.lang.verb.value.Tense;

/**
 * @author hiroxpepe
 */
public class Clause {
    
    ///////////////////////////////////////////////////////////////////////////
    // fields
    
    private final Phrase phrase;

    ///////////////////////////////////////////////////////////////////////////
    // constructor
    
    public Clause(String value) {
        phrase = new Phrase();
        phrase.setValue(value);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // public methods
    
    public String getValue(Tense tense) {
        if (this instanceof Verb) {
            return phrase.getValue(tense);
        }
        return phrase.getValue();
    }
     
}