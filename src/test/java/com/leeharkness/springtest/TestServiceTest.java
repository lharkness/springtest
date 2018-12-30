package com.leeharkness.springtest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

public class TestServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private DataAccessLayer mockDataAccessLayer;

    @InjectMocks
    private TestService target;

    private static final int SMALL_WORK_UNIT = 1;
    private static final int WORK_UNIT_THRESHOLD = TestService.THRESHOLD;
    private static final int LARGE_WORK_UNIT = TestService.THRESHOLD + 1;

    @Before
    public void setup() {
        when(mockDataAccessLayer.getLargeMessage()).thenReturn(DataAccessLayer.LARGE_MESSAGE);
        when(mockDataAccessLayer.getSmallMessage()).thenReturn(DataAccessLayer.SMALL_MESSAGE);
    }

    @Test
    public void testThatSmallWorkUnitGetsSmallMessage() {
        String result = target.doWork(SMALL_WORK_UNIT);

        assertThat(result, is(DataAccessLayer.SMALL_MESSAGE));
    }

    @Test
    public void testThatLargeWorkUnitGetsLargeMessage() {
        String result = target.doWork(LARGE_WORK_UNIT);

        assertThat(result, is(DataAccessLayer.LARGE_MESSAGE));
    }

    @Test
    public void testThatThresholdWorkUnitGetsLargeMessage() {
        String result = target.doWork(WORK_UNIT_THRESHOLD);

        assertThat(result, is(DataAccessLayer.LARGE_MESSAGE));
    }

}
