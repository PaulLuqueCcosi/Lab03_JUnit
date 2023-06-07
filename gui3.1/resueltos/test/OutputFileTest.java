package test;

import java.io.File;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;

public class OutputFileTest {
    private File output;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Antes de todo");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("Despues de todo");
    }

    @Before
    public void createOutputFile() {
        output = new File("output.txt");
        System.out.println("Entra a before, antes de los casos de prueba");
    }

    @After
    public void deleteOutputFile() {
        output.delete();
        System.out.println("Sale de after, despues de los casos");
    }

    @Test
    public void testFile1() {
        System.out.println("test1");
        Assert.assertNotNull(output);
    }

    @Test
    public void testFile2() {
        System.out.println("test2");
        Assert.assertEquals(0, output.length());
    }
}
