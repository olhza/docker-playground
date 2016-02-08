/* Copyright 2016 Olivier Haremza
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.oharemza.timeteller;

import org.junit.Before;
import org.junit.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneOffset;

import static org.junit.Assert.assertEquals;


public class TimeTellerControllerTest {

    private Clock clock;
    private TimeTellerController controller;

    @Before
    public void setUp() {
        clock = Clock.fixed(Instant.EPOCH, ZoneOffset.UTC);
        controller = new TimeTellerController(clock);
    }

    @Test
    public void testTell() {
        String now = controller.tell();

        assertEquals("1970-01-01T00:00:00Z", now);
    }

}
