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

import org.examproject.lang.value.Pattern;
import org.examproject.lang.verb.value.Tense;

/**
 * @author hiroxpepe
 */
public class Sentence {
    
    ///////////////////////////////////////////////////////////////////////////
    // fields
    
    private Subject subject;
    
    private Verb verb;
    
    private Object object;
    
    private Complement complement;
    
    private Pattern structure;
    
    ///////////////////////////////////////////////////////////////////////////
    // public methods
    
    public String getText(Tense tense) {
        return this.subject.getValue(tense) + " " +
               this.verb.getValue(tense) + " " +
               this.object.getValue(tense) + " " + 
               this.complement.getValue(tense) + ".";
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // accessor methods

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Verb getVerb() {
        return verb;
    }

    public void setVerb(Verb verb) {
        this.verb = verb;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Complement getComplement() {
        return complement;
    }

    public void setComplement(Complement complement) {
        this.complement = complement;
    }
    
}