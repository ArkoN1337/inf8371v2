package moa.classifiers.functions;

import org.junit.Assert;
import org.junit.Test;

public class NewClassTest {

    private NewClass newClass = new NewClass();
    @Test
    public void testGetNameClass() {
        Assert.assertEquals("NewClass", newClass.getClassName());
    }
}
