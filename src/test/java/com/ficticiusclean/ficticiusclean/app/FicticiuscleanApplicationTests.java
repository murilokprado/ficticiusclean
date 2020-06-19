package com.ficticiusclean.ficticiusclean.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FicticiuscleanApplication.class)
public class FicticiuscleanApplicationTests {

    @Test
    public void shouldRunApplication() {
        assertThat(true).isTrue();
    }
}
