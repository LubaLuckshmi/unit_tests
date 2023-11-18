package seminar4.database;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DataProcessorTest {
    @Test
    void testDB(){
        Database database = mock(Database.class);
        when(database.query(anyString())).thenReturn(Arrays.asList("testA", "testB", "testC"));

        DataProcessor dataProcessor = new DataProcessor(database);
       assertThat(dataProcessor.processData("SELECT * FROM users WHERE username LIKE '%test'").size()).isEqualTo(3);
    }

}