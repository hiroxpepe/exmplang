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
public class Phrase {
        
    ///////////////////////////////////////////////////////////////////////////
    // fields
    
    private final List<Word> wordList;
    
    ///////////////////////////////////////////////////////////////////////////
    // constructor
    
    public Phrase() {
        wordList = new ArrayList<Word>();
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // public methods
    
    public String getValue(Tense tense) {
        return wordList.get(0).getValue(tense);
    }
    
    public String getValue() {
        return wordList.get(0).getValue();
    }
    
    public void setValue(String value) {
        Word word = new Word(value);
        wordList.add(word);
    }
    
}