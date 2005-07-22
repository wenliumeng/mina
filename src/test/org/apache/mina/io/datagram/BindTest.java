/*
 *   @(#) $Id$
 *
 *   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.mina.io.datagram;

import org.apache.mina.io.AbstractBindTest;

/**
 * Tests {@link DatagramAcceptor} resource leakage.
 * 
 * @author Trustin Lee (trustin@apache.org)
 * @version $Rev$, $Date$ 
 */
public class BindTest extends AbstractBindTest
{

    public BindTest()
    {
        super( new DatagramAcceptor() );
    }

}
