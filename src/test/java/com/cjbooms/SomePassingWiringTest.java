package com.cjbooms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/some-passing-context.xml")
public class SomePassingWiringTest {

    @Test
    public void someWiringTest() {
        // Do nothing
    }
}
