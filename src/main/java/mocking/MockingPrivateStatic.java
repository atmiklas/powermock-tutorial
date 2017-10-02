package mocking;

/**
 * Created by amik on 10/2/17.
 */
public class MockingPrivateStatic {

    private static final MyMockedClass privateStaticField = null;

    public static MyMockedClass getPrivateStaticField() {
        return privateStaticField;
    }
}
