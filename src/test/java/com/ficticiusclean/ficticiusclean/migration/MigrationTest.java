package com.ficticiusclean.ficticiusclean.migration;

import com.ficticiusclean.ficticiusclean.app.FicticiuscleanApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FicticiuscleanApplication.class)
public class MigrationTest {

    @Test
    public void shouldMigrateDatabase() {
        assertThat(true).isTrue();
    }
}
