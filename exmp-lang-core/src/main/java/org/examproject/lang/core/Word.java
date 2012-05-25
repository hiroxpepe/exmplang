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

import java.util.ArrayList;
import java.util.List;

import org.examproject.lang.verb.value.Tense;

/**
 * @author hiroxpepe
 */
public class Word {
    
    ///////////////////////////////////////////////////////////////////////////
    // fields
    
    private final List<Morpheme> morphemeList;
    
    ///////////////////////////////////////////////////////////////////////////
    // constructor
    
    public Word(String value) {
        morphemeList = new ArrayList<Morpheme>();
        Morpheme morpheme = new Morpheme(value);
        morphemeList.add(morpheme);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // public methods
    
    public String toAdjective() {
        return "happy";
    }
    
    public String toNoun() {
        return "happiness";
    }
    
    public String toVerb() {
        return "???";
    }
    
    public String getValue() {
        // TODO: temporary...
        String text = morphemeList.get(0).getValue();        
        return text;
    }
    
    public String getValue(Tense tense) {
        // TODO: temporary...
        String text = morphemeList.get(0).getValue();
        // TODO: add to make tense value logic..
        if (tense == tense.Past) {
            return text + "ed";
        }
        if (tense == tense.Future) {
            return "will " + text;
        }
        return text;
    }
    
}