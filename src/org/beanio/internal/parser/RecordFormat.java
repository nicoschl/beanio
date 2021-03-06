/*
 * Copyright 2011-2012 Kevin Seim
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.beanio.internal.parser;

/**
 * A <code>RecordFormat</code> provides format specific processing for a {@link Record} parser.
 * 
 * <p>Implementations of this interface must be thread-safe.
 * 
 * @author Kevin Seim
 * @since 2.0
 */
public interface RecordFormat {

    /**
     * Returns whether the record meets configured matching criteria
     * during unmarshalling.
     * @param context the {@link UnmarshallingContext}
     * @return true if the record meets all matching criteria, false otherwise
     * @since 2.0.3
     */
    public boolean matches(UnmarshallingContext context);
    
    /**
     * Validates a record during unmarshalling.
     * @param context the {@link UnmarshallingContext} to validate
     */
    public void validate(UnmarshallingContext context);
    
}
