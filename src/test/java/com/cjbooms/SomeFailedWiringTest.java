package com.cjbooms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/some-failing-context.xml")
public class SomeFailedWiringTest {

    @Test
    public void someWiringTest() {
        // Do nothing
    }
}
