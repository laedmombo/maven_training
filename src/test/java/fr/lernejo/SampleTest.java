package fr.lernejo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static  org.assertj.core.api.Assertions.assertThat;
class SampleTest {
    protected Sample sample;
    @BeforeAll
    public void Setup(){
        sample= new Sample();
    }
    @AfterAll
    public void tearDown() {
    }
   //private final Sample sample = new Sample();
    @ParameterizedTest
    @CsvSource({
        "3,7,10",
        "0,3,3",
        "4,5,9",
    })
    void testOperationAdd(int a, int b, int expectedResult){
        int result = sample.op(Sample.Operation.ADD,a,b);
        assertThat(result).isEqualTo(expectedResult);
    }
}
