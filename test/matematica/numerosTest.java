// Ph skateRock
package matematica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class numerosTest {
    
    private numeros n;
    
    public numerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = new numeros ();
    }
    
    @After
    public void tearDown() {
    }

   
    @Test // testa se a aplicaçao e numero par
    public void testNumeroPar() {
    assertEquals(true,n.numeroPar(6));
    }

   
    @Test // testa a area do quadrado
    public void testAreaQuadrado() {
      assertEquals(100,n.areaQuadrado(10));
    }

    
    @Test // testa se o numero e divisivel
    public void testNumeroDivisivel() {
     assertTrue(n.numeroDivisivel(4,2));
    }
    
}
