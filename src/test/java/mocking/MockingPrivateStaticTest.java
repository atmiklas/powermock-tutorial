package mocking;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.*;

/**
 * Created by amik on 10/2/17.
 */
public class MockingPrivateStaticTest {

    @Test
    public void testSettingPrivateStatic() {

        //
        MyMockedClass mock = Mockito.mock(MyMockedClass.class);

        //
        Whitebox.setInternalState(MockingPrivateStatic.class, "privateStaticField", mock);

        Assert.assertEquals(mock, MockingPrivateStatic.getPrivateStaticField());
    }
}