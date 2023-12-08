package smqa.group17.smts.tests.blackbox;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import smqa.group17.smts.model.User;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

	public static boolean debug = true;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = smqa.group17.smts.controller.DashboardController.generateRandom6CharacterID();
// flaky:         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "582780" + "'", str0, "582780");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("582780", "hi!", "", (int) 'a', (double) '#', (double) (-1.0f), 0.0d);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("582780");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lk1tNlo39haBld4kgdz2bQ==" + "'", str1, "lk1tNlo39haBld4kgdz2bQ==");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) 100.0f, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-99.0d) + "'", double2 == (-99.0d));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Registration Successfull");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
        smqa.group17.smts.model.User user1 = new User();
// flaky:         org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.Class<?> wildcardClass2 = order0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        smqa.group17.smts.controller.LoginController loginController0 = new smqa.group17.smts.controller.LoginController();
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        smqa.group17.smts.controller.DatabaseController databaseController0 = new smqa.group17.smts.controller.DatabaseController();
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setPnl(10.0d);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        smqa.group17.smts.controller.DecryptionController decryptionController0 = new smqa.group17.smts.controller.DecryptionController();
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.sql.Connection connection0 = smqa.group17.smts.controller.DatabaseController.getConnection();
        org.junit.Assert.assertNotNull(connection0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setUserName("Registration Successfull");
        order0.setNumberOfShares((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        order0.setCurrentPrice((double) 31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
// flaky:         org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        order0.setNumberOfShares(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 100.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 50.0d + "'", double2 == 50.0d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setUserName("hi!");
        order0.setUserName("0.0 has been added to funds of hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        smqa.group17.smts.controller.EncryptionController encryptionController0 = new smqa.group17.smts.controller.EncryptionController();
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 10, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) 31, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-103.2258064516129d) + "'", double2 == (-103.2258064516129d));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 10.0f, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.0d + "'", double2 == 31.0d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
// flaky:         org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) (byte) 10, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (byte) -1, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.5d + "'", double2 == 49.5d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        java.lang.String str2 = user0.getUserName();
        double double3 = user0.getFunds();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        int int8 = order0.getOrderID();
        order0.setPnl((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        java.lang.String str4 = stock0.getName();
        stock0.setName("Registration Successfull");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(0.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-40.38461538461539d) + "'", double2 == (-40.38461538461539d));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-100.0d), (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-24.0d) + "'", double2 == (-24.0d));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        double double6 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        smqa.group17.smts.controller.DashboardController dashboardController0 = new smqa.group17.smts.controller.DashboardController();
        java.lang.Class<?> wildcardClass1 = dashboardController0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        java.lang.String str3 = order0.getStockSymbol();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        java.lang.String str4 = stock0.getName();
        java.lang.String str5 = stock0.getName();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4pZrH4vsAwcGHvo486Rrww==" + "'", str1, "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        java.lang.String str6 = order0.getStockSymbol();
        double double7 = order0.getCurrentPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setUserName("1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        java.lang.Class<?> wildcardClass7 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        order0.setStockSymbol("Stock Prices changed");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t" + "'", str1, "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        java.lang.String str4 = stock0.getSymbol();
        double double5 = stock0.getPrice();
        double double6 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "You do not own any hi! shares." + "'", str4, "You do not own any hi! shares.");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 0, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.5d) + "'", double2 == (-0.5d));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Registration Successfull" + "'", str1, "Registration Successfull");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-103.2258064516129d), 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-25.61290322580645d) + "'", double2 == (-25.61290322580645d));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        double double6 = order0.getPnl();
        int int7 = order0.getOrderID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Stock Prices changed");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(31.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.903225806451612d + "'", double2 == 12.903225806451612d);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("You do not own any  shares.");
        int int11 = order0.getOrderID();
        int int12 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        java.lang.String str5 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
// flaky:         org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        double double4 = stock0.getPrice();
        double double5 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        java.lang.Class<?> wildcardClass6 = stock0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setOrderID(100);
        java.lang.Class<?> wildcardClass7 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setName("You do not have enough Fund balance to withdraw GBP 97.0");
        stock0.setName("4pZrH4vsAwcGHvo486Rrww==");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-25.61290322580645d), (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-490.4282115869018d) + "'", double2 == (-490.4282115869018d));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        int int6 = order0.getNumberOfShares();
        double double7 = order0.getPnl();
        java.lang.Class<?> wildcardClass8 = order0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setUserName("");
        order0.setPnl(49.5d);
        order0.setBuyPrice((-100.0d));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 0L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        double double7 = order0.getCurrentPrice();
        order0.setOrderID(1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (-1), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 49.5d + "'", double2 == 49.5d);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        order0.setBuyPrice((double) (byte) 10);
        order0.setUserName("52.0 has been added to funds of hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (byte) 10, (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53.5d + "'", double2 == 53.5d);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        stock0.setPrice((double) 10.0f);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("1.0 has been added to funds of You do not own any  shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
        java.lang.String str3 = null; // flaky: user1.getUserName();
        java.lang.String str4 = null; // flaky: user1.getUserName();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + " added to wishlist of user 582780" + "'", str3, " added to wishlist of user 582780");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + " added to wishlist of user 582780" + "'", str4, " added to wishlist of user 582780");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("lk1tNlo39haBld4kgdz2bQ==", "Funds Withdrawn");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn" + "'", str2, "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("4pZrH4vsAwcGHvo486Rrww==", "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("Stock Prices changed");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("Funds Withdrawn", 1.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0 has been added to funds of Funds Withdrawn" + "'", str2, "1.0 has been added to funds of Funds Withdrawn");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("4pZrH4vsAwcGHvo486Rrww==");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", (double) (-1.0f));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        java.lang.String str2 = null; // flaky: user1.getPassword();
// flaky:         user1.setInvested((double) 1L);
        int int5 = 0; // flaky: user1.getUserId();
        double double6 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("", "0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0", (int) (byte) 1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares." + "'", str3, "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-103.2258064516129d), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-51.61290322580645d) + "'", double2 == (-51.61290322580645d));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setName("You do not have enough Fund balance to withdraw GBP 97.0");
        stock0.setName("hi!");
        stock0.setPrice((-25.61290322580645d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setCurrentPrice((double) (-1L));
        java.lang.String str11 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("You do not own any 52.0 has been added to funds of hi! shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("lk1tNlo39haBld4kgdz2bQ==", "");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.LoginController.register("52.0 has been added to funds of hi!", "You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("100.0 has been added to funds of ");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("You do not own any 52.0 has been added to funds of hi! shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        java.lang.Class<?> wildcardClass9 = stock0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        int int9 = order0.getNumberOfShares();
        double double10 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any  shares.", "You do not own any  shares.", "You do not own any You do not own any Funds Withdrawn shares. shares.", (int) (short) 10, 1.0d, (double) (byte) 10, (double) 10.0f);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("1.0 has been added to funds of Funds Withdrawn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!", "4pZrH4vsAwcGHvo486Rrww==");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.LoginController.register("", "You do not own any  shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 1);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setPnl((double) ' ');
        java.lang.Class<?> wildcardClass11 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("T72xtn4m6zgYCz1QwNF31A==", (-103.2258064516129d));
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==" + "'", str2, "-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any 1.0 has been added to funds of hi! shares.", "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=", (int) 'a', (-40.38461538461539d), 50.0d, 10.0d);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(49.5d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-102.020202020202d) + "'", double2 == (-102.020202020202d));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("1.0 has been added to funds of You do not own any  shares.", "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.withdrawFunds("4pZrH4vsAwcGHvo486Rrww==", (double) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not have enough Fund balance to withdraw GBP 52.0" + "'", str2, "You do not have enough Fund balance to withdraw GBP 52.0");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 1);
        double double8 = order0.getCurrentPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("582780");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("You do not own any hi! shares.", "Registration Successfull");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn", (double) 100.0f, 0.0d, (-100.0d), (double) 1.0f);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("0.0 has been added to funds of hi!", "T72xtn4m6zgYCz1QwNF31A==", "You do not have enough Fund balance to withdraw GBP 97.0", (int) ' ', 53.5d, 100.0d, (double) 10.0f);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any Funds Withdrawn shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd" + "'", str1, "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setStockSymbol("You do not own any hi! shares.");
        order0.setNumberOfShares((int) (short) 10);
        int int7 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         user1.setCurrentAmount((double) 0.0f);
// flaky:         user1.setUserName("You do not own any hi! shares.");
// flaky:         user1.setProfit((double) 0L);
// flaky:         user1.setInvested((double) 0L);
        java.lang.String str15 = null; // flaky: user1.getUserName();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "You do not own any hi! shares." + "'", str15, "You do not own any hi! shares.");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("You do not have enough Fund balance to withdraw GBP 52.0");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any 1.0 has been added to funds of hi! shares.", "You do not own any 0.0 has been added to funds of hi! shares.", (int) (short) -1, (double) 0L, (-25.61290322580645d), (-51.61290322580645d));
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.LoginController.register("1.0 has been added to funds of You do not own any  shares.", "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        int int6 = order0.getNumberOfShares();
        order0.setBuyPrice((-490.4282115869018d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "You do not own any hi! shares.");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("You do not own any You do not own any Funds Withdrawn shares. shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        java.lang.String str6 = order0.getStockSymbol();
        int int7 = order0.getNumberOfShares();
        order0.setOrderID((int) '#');
        order0.setNumberOfShares((int) (byte) 1);
        order0.setPnl((double) 0.0f);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        int int6 = order0.getNumberOfShares();
        order0.setNumberOfShares(10);
        int int9 = order0.getOrderID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
// flaky:         user1.setProfit((double) (short) 0);
// flaky:         user1.setInvested((-51.61290322580645d));
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) 10.0f, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-51.61290322580645d), (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.193548387096776d + "'", double2 == 24.193548387096776d);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t", " added to wishlist of user 582780 added to wishlist of user Registration Successfull", 1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares." + "'", str3, "You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", 31, 0.0d, (-102.020202020202d), 0.0d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("4pZrH4vsAwcGHvo486Rrww==", "100.0 has been added to funds of ", (int) (byte) 10, (double) (short) 10, (double) (-1L), 0.0d);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not own any hi! shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) 10L);
        double double4 = 0.0; // flaky: user1.getInvested();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.LoginController.register("", "1.0 has been added to funds of You do not own any  shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        java.lang.String str6 = order0.getStockSymbol();
        order0.setCurrentPrice((double) 0.0f);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 100);
        java.lang.String str4 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", "1.0 has been added to funds of Funds Withdrawn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        java.lang.String str2 = user0.getUserName();
        user0.setCurrentAmount((double) (-1L));
        double double5 = user0.getInvested();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
        double double5 = 0.0; // flaky: user1.getFunds();
        double double6 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("You do not have enough Fund balance to withdraw GBP 52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("100.0 has been added to funds of ", "0.0 has been added to funds of hi!", 0, (double) 100, (double) (short) 1, 10.0d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("1.0 has been added to funds of hi!", "0.0 has been added to funds of hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl((double) (byte) 1);
        java.lang.String str6 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("52.0 has been added to funds of hi!", "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setUserName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=", "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setPassword("");
// flaky:         user1.setCurrentAmount((double) 10.0f);
// flaky:         user1.setCurrentAmount((double) '4');
        java.lang.String str14 = null; // flaky: user1.getPassword();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("", "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", " added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("You do not own any 0.0 has been added to funds of hi! shares.", "Registration Successfull");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("You do not own any 1.0 has been added to funds of hi! shares.", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares." + "'", str2, "You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn", "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", "You do not own any  shares.", (int) (byte) 10, 5.5d, 53.5d, (-103.2258064516129d));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.withdrawFunds("4pZrH4vsAwcGHvo486Rrww==", (double) 31);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not have enough Fund balance to withdraw GBP 31.0" + "'", str2, "You do not have enough Fund balance to withdraw GBP 31.0");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setUserName("");
        double double7 = order0.getCurrentPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("T72xtn4m6zgYCz1QwNF31A==", (-490.4282115869018d));
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==" + "'", str2, "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        java.lang.String str2 = null; // flaky: user1.getPassword();
        int int3 = 0; // flaky: user1.getUserId();
        double double4 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setCurrentAmount((double) 100);
        double double7 = 0.0; // flaky: user1.getProfit();
        double double8 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        int int2 = user0.getUserId();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (byte) 1);
        order0.setPnl((double) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("You do not own any 1.0 has been added to funds of hi! shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setInvested((double) (-1L));
        double double3 = user0.getProfit();
        user0.setFunds((double) ' ');
        double double6 = user0.getInvested();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         user1.setPassword("You do not have enough Fund balance to withdraw GBP 97.0");
        int int9 = 0; // flaky: user1.getUserId();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("0.0 has been added to funds of hi!", "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        stock0.setName("4pZrH4vsAwcGHvo486Rrww==");
        stock0.setPrice((double) 100.0f);
        stock0.setSymbol("4pZrH4vsAwcGHvo486Rrww==");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setUserName("");
        int int7 = order0.getNumberOfShares();
        double double8 = order0.getBuyPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=" + "'", str1, "YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
        double double8 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setInvested(1.0d);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0", "1.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=", "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=", (int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares." + "'", str3, "You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", "You do not own any hi! shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares." + "'", str2, "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", (-40.38461538461539d), (double) 'a', (double) 100, (double) (short) 1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser(" added to wishlist of user 582780 added to wishlist of user Registration Successfull", 49.5d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
// flaky:         user1.setInvested((double) 'a');
// flaky:         user1.setUserId((int) '4');
        double double9 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setFunds((double) (-1));
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        double double7 = order0.getCurrentPrice();
        order0.setPnl(52.0d);
        java.lang.String str10 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        java.lang.String str2 = null; // flaky: user1.getPassword();
        int int3 = 0; // flaky: user1.getUserId();
        java.lang.Class<?> wildcardClass4 = null; // flaky: user1.getClass();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getUserName();
        double double2 = order0.getCurrentPrice();
        order0.setBuyPrice((-99.0d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("You do not own any You do not own any Funds Withdrawn shares. shares.", (double) 10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("You do not own any 1.0 has been added to funds of hi! shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        double double5 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested((double) (short) 10);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=", (int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares." + "'", str3, "You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setCurrentAmount((-0.5d));
// flaky:         user1.setPassword("Stock Prices changed");
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
        java.lang.String str3 = null; // flaky: user1.getUserName();
// flaky:         user1.setUserName("100.0 has been added to funds of ");
        java.lang.String str6 = null; // flaky: user1.getUserName();
// flaky:         user1.setPassword("T72xtn4m6zgYCz1QwNF31A==");
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + " added to wishlist of user 582780" + "'", str3, " added to wishlist of user 582780");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0 has been added to funds of " + "'", str6, "100.0 has been added to funds of ");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares(0);
        order0.setBuyPrice((double) 10.0f);
        order0.setBuyPrice((double) 10L);
        java.lang.String str15 = order0.getStockSymbol();
        order0.setUserName("0.0 has been added to funds of hi!");
        order0.setUserName(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setBuyPrice((-40.38461538461539d));
        order0.setOrderID((int) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("", "0.0 has been added to funds of hi!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares(0);
        java.lang.String str11 = order0.getStockSymbol();
        int int12 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("You do not own any You do not own any Funds Withdrawn shares. shares.", (double) (byte) 1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. shares." + "'", str2, "1.0 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. shares.");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        int int5 = order0.getNumberOfShares();
        java.lang.String str6 = order0.getUserName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setFunds(50.0d);
        double double10 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setCurrentAmount((-40.38461538461539d));
        double double13 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-40.38461538461539d) + "'", double13 == (-40.38461538461539d));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("52.0 has been added to funds of hi!", "YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setSymbol("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        java.lang.String str2 = null; // flaky: user1.getPassword();
        java.lang.String str3 = null; // flaky: user1.getPassword();
// flaky:         user1.setInvested((double) 'a');
        double double6 = 0.0; // flaky: user1.getInvested();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str3, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=", "You do not own any hi! shares.", (int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any hi! shares. shares." + "'", str3, "You do not own any You do not own any hi! shares. shares.");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("", "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn", "Stock Prices changed");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed" + "'", str2, "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        double double6 = order0.getPnl();
        int int7 = order0.getNumberOfShares();
        double double8 = order0.getPnl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("100.0 has been added to funds of ");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("1.0 has been added to funds of hi!", 12.903225806451612d, (-51.61290322580645d), (double) (-1.0f), (-40.38461538461539d));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        java.lang.String str2 = user0.getUserName();
        user0.setUserId((int) (byte) 100);
        user0.setProfit((double) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        int int5 = order0.getNumberOfShares();
        order0.setBuyPrice((double) 100);
        java.lang.String str8 = order0.getUserName();
        order0.setStockSymbol("You do not have enough Fund balance to withdraw GBP 31.0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("You do not own any You do not own any hi! shares. shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("1.0 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("You do not have enough Fund balance to withdraw GBP 31.0", "You do not have enough Fund balance to withdraw GBP 31.0", 0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares." + "'", str3, "You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("Stock Prices changed", "You do not have enough Fund balance to withdraw GBP 31.0", 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares." + "'", str3, "You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed", "You do not have enough Fund balance to withdraw GBP 52.0");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed added to wishlist of user You do not have enough Fund balance to withdraw GBP 52.0" + "'", str2, "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed added to wishlist of user You do not have enough Fund balance to withdraw GBP 52.0");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("1.0 has been added to funds of You do not own any  shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADxHIG67X3pRlQueyStfggrELZrOF8CXQPg+DDern7z7H2h0Kmj2GAyXDYB8ZxL0YOqnZ6qwQx84IcJ6GKKpqg==" + "'", str1, "ADxHIG67X3pRlQueyStfggrELZrOF8CXQPg+DDern7z7H2h0Kmj2GAyXDYB8ZxL0YOqnZ6qwQx84IcJ6GKKpqg==");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("582780", 0.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.LoginController.register("4pZrH4vsAwcGHvo486Rrww==", "lk1tNlo39haBld4kgdz2bQ==");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.", "lk1tNlo39haBld4kgdz2bQ==", (-1), (double) (short) 100, (double) 10L, Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("You do not own any You do not own any Funds Withdrawn shares. shares.", "You do not have enough Fund balance to withdraw GBP 52.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setInvested((double) 0L);
// flaky:         user1.setCurrentAmount((double) 1L);
// flaky:         user1.setFunds((double) 31);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("You do not own any Funds Withdrawn shares.", "You do not own any 52.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails(" added to wishlist of user 582780 added to wishlist of user Registration Successfull", "You do not own any  shares.");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=", (int) '#', (double) '4', 100.0d, (double) 10L);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any 0.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
        double double5 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setUserId(97);
        double double8 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!", "You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares." + "'", str2, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getProfit();
// flaky:         user1.setUserName("Funds Withdrawn");
// flaky:         user1.setUserId((int) (byte) 10);
// flaky:         user1.setCurrentAmount((-0.5d));
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("You do not have enough Fund balance to withdraw GBP 52.0");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not own any  shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ=" + "'", str1, "ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ=");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
        double double5 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setFunds((-100.0d));
        double double8 = 0.0; // flaky: user1.getProfit();
        java.lang.String str9 = null; // flaky: user1.getPassword();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str9, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
// flaky:         user1.setProfit((double) (short) 0);
        double double7 = 0.0; // flaky: user1.getInvested();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("You do not own any Funds Withdrawn shares.", "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("You do not own any Funds Withdrawn shares.");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setUserName("Registration Successfull");
        double double6 = order0.getBuyPrice();
        int int7 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed added to wishlist of user You do not have enough Fund balance to withdraw GBP 52.0");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("You do not own any hi! shares.", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("1.0 has been added to funds of Funds Withdrawn", (double) 10L, (double) (byte) 0, (-0.5d), (double) 100.0f);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        double double4 = stock0.getPrice();
        stock0.setPrice((double) 100);
        java.lang.String str7 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("Funds Withdrawn");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("1.0 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!", "You do not own any 52.0 has been added to funds of hi! shares.", 31);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares." + "'", str3, "You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares.");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", 100.0d, (double) 'a', (double) (byte) 1, (double) (byte) 100);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not own any You do not own any Funds Withdrawn shares. shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.", (int) (byte) 1, 52.0d, (double) 0, (double) 1L);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("52.0 has been added to funds of hi!", 97.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.0 has been added to funds of 52.0 has been added to funds of hi!" + "'", str2, "97.0 has been added to funds of 52.0 has been added to funds of hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setBuyPrice((-40.38461538461539d));
        order0.setOrderID(1);
        java.lang.String str9 = order0.getUserName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setFunds(50.0d);
        double double10 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setPassword("100.0 has been added to funds of ");
        java.lang.Class<?> wildcardClass13 = null; // flaky: user1.getClass();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        java.lang.Class<?> wildcardClass6 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("0.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setCurrentAmount((-0.5d));
        double double11 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setCurrentAmount((double) 100);
// flaky:         user1.setFunds((-102.020202020202d));
        int int16 = 0; // flaky: user1.getUserId();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        int int6 = order0.getNumberOfShares();
        java.lang.String str7 = order0.getStockSymbol();
        java.lang.String str8 = order0.getStockSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setName("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        double double8 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 'a', (-40.38461538461539d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 28.307692307692307d + "'", double2 == 28.307692307692307d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("4pZrH4vsAwcGHvo486Rrww==", "You do not own any 52.0 has been added to funds of hi! shares.", (-1), (double) (byte) 100, (double) 10, (-51.61290322580645d));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        stock0.setPrice((double) 31);
        stock0.setName("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "1.0 has been added to funds of hi!");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=", (double) (short) 0);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) -1, 50.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.5d + "'", double2 == 24.5d);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         user1.setCurrentAmount((double) 0.0f);
// flaky:         user1.setUserName("You do not own any hi! shares.");
        int int11 = 0; // flaky: user1.getUserId();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        java.lang.String str2 = null; // flaky: user1.getPassword();
        int int3 = 0; // flaky: user1.getUserId();
        double double4 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setCurrentAmount((double) 100);
// flaky:         user1.setUserId((int) (short) 1);
        java.lang.String str9 = null; // flaky: user1.getUserName();
// flaky:         user1.setProfit((double) (short) 0);
        double double12 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + " added to wishlist of user 582780" + "'", str9, " added to wishlist of user 582780");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        java.lang.String str2 = null; // flaky: user1.getPassword();
// flaky:         user1.setInvested((double) 1L);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
// flaky:         user1.setProfit((double) (short) 1);
        int int10 = 0; // flaky: user1.getUserId();
// flaky:         user1.setFunds((-100.0d));
        int int13 = 0; // flaky: user1.getUserId();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("ADxHIG67X3pRlQueyStfggrELZrOF8CXQPg+DDern7z7H2h0Kmj2GAyXDYB8ZxL0YOqnZ6qwQx84IcJ6GKKpqg==", "You do not own any You do not own any Funds Withdrawn shares. shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "You do not have enough Fund balance to withdraw GBP 97.0");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0" + "'", str2, "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", (int) (byte) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares." + "'", str3, "You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setInvested((double) (-1L));
        user0.setInvested((double) 1.0f);
        user0.setFunds((double) '4');
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares.", (double) 10.0f);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
// flaky:         user1.setPassword("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         user1.setUserName("582780");
        double double9 = 0.0; // flaky: user1.getInvested();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setPassword("");
// flaky:         user1.setCurrentAmount((double) 10.0f);
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setInvested((double) (byte) 10);
        java.lang.Class<?> wildcardClass16 = null; // flaky: user1.getClass();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        order0.setBuyPrice((double) (byte) 10);
        java.lang.String str9 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==", "Stock Prices changed");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        double double3 = user0.getFunds();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-99.0d) + "'", double3 == (-99.0d));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.", "You do not own any  shares.");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares.", "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", (int) ' ', (-25.61290322580645d), 50.0d, (double) (-1.0f));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         user1.setCurrentAmount((double) 0.0f);
// flaky:         user1.setFunds(0.0d);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(1.0d, 49.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4850.0d + "'", double2 == 4850.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
        double double5 = 0.0; // flaky: user1.getFunds();
        double double6 = 0.0; // flaky: user1.getProfit();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("52.0 has been added to funds of hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares((int) (byte) -1);
        order0.setPnl((double) 0);
        order0.setNumberOfShares((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
        java.lang.String str5 = null; // flaky: user1.getUserName();
        double double6 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + " added to wishlist of user 582780" + "'", str5, " added to wishlist of user 582780");
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setPassword("");
// flaky:         user1.setCurrentAmount((double) 10.0f);
// flaky:         user1.setProfit((double) '#');
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setNumberOfShares((int) 'a');
        int int8 = order0.getNumberOfShares();
        order0.setCurrentPrice(5.5d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("1.0 has been added to funds of Funds Withdrawn", "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", (int) (byte) -1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd shares." + "'", str3, "You do not own any pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd shares.");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("");
        java.lang.String str2 = null; // flaky: user1.getPassword();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.", "582780");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        double double5 = order0.getCurrentPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme(" added to wishlist of user 582780");
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setFunds(50.0d);
        double double10 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setPassword("100.0 has been added to funds of ");
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }
}
