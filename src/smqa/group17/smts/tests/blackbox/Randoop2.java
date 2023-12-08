package smqa.group17.smts.tests.blackbox;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import smqa.group17.smts.model.User;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop2 {
	
	public static boolean debug = true;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.addStockToWishlist("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.", "You do not own any  shares.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares. added to wishlist of user You do not own any  shares." + "'", str2, "You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares. added to wishlist of user You do not own any  shares.");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getProfit();
        double double3 = user1.getInvested();
        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '4', (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-98.07692307692307d) + "'", double2 == (-98.07692307692307d));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(12.903225806451612d, 24.193548387096776d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.548387096774192d + "'", double2 == 18.548387096774192d);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        smqa.group17.smts.model.User user1 = smqa.group17.smts.controller.DashboardController.getUserDataForUserId("ADxHIG67X3pRlQueyStfggrELZrOF8CXQPg+DDern7z7H2h0Kmj2GAyXDYB8ZxL0YOqnZ6qwQx84IcJ6GKKpqg==");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        double double3 = user0.getInvested();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.updateFundsForUser("100.0 has been added to funds of ", 100.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0 has been added to funds of 100.0 has been added to funds of " + "'", str2, "100.0 has been added to funds of 100.0 has been added to funds of ");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl((double) (byte) 1);
        double double6 = order0.getCurrentPrice();
        double double7 = order0.getPnl();
        java.lang.String str8 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        smqa.group17.smts.controller.DatabaseController.updateFundsForUser("Registration Successfull", (-99.0d));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.lang.String str3 = smqa.group17.smts.controller.DashboardController.sellStock("", "", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any  shares." + "'", str3, "You do not own any  shares.");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        boolean boolean1 = smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("You do not own any 0.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        java.lang.String str7 = user1.getUserName();
        double double8 = user1.getCurrentAmount();
        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("100.0 has been added to funds of ", "You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        smqa.group17.smts.model.Order order2 = smqa.group17.smts.controller.DatabaseController.getOrderDetails("Stock Prices changed", "52.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        int int5 = user1.getUserId();
        user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
        user1.setProfit((double) (short) 1);
        int int10 = user1.getUserId();
        user1.setFunds((-100.0d));
        double double13 = user1.getCurrentAmount();
        double double14 = user1.getFunds();
        user1.setProfit((double) 10L);
        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setCurrentPrice((double) (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.updateFundsForUser("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", (double) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "35.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares." + "'", str2, "35.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=", "You do not own any  shares.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        stock0.setName("Stock Prices changed");
        java.lang.String str11 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("Registration Successfull", "You do not own any 52.0 has been added to funds of hi! shares.");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("0.0 has been added to funds of hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "J5wXKdtA4hPstPmeCfEhvpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw" + "'", str1, "J5wXKdtA4hPstPmeCfEhvpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        boolean boolean2 = smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio(" added to wishlist of user 582780 added to wishlist of user Registration Successfull", "You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        java.lang.String str3 = user1.getUserName();
        user1.setUserName("100.0 has been added to funds of ");
        user1.setCurrentAmount((double) (byte) 0);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", "You do not own any  shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        user1.setFunds((-0.5d));
        double double7 = user1.getCurrentAmount();
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        smqa.group17.smts.model.User user1 = null;
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) 10L);
        double double4 = user1.getCurrentAmount();
        user1.setInvested(50.0d);
        int int7 = user1.getUserId();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(4850.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        int int5 = user1.getUserId();
        user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
        double double8 = user1.getFunds();
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(0.0d, (-40.38461538461539d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-20.192307692307693d) + "'", double2 == (-20.192307692307693d));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        java.lang.String str6 = order0.getStockSymbol();
        int int7 = order0.getNumberOfShares();
        java.lang.String str8 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setBuyPrice((-40.38461538461539d));
        java.lang.String str7 = order0.getUserName();
        java.lang.String str8 = order0.getStockSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setPrice(1.0d);
        double double8 = stock0.getPrice();
        stock0.setSymbol("100.0 has been added to funds of ");
        double double11 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setPrice(1.0d);
        java.lang.String str8 = stock0.getSymbol();
        stock0.setPrice((-103.2258064516129d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Stock Prices changed" + "'", str8, "Stock Prices changed");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        user1.setCurrentAmount(10.0d);
        user1.setCurrentAmount((-0.5d));
        double double11 = user1.getFunds();
        user1.setCurrentAmount((double) 100);
        user1.setFunds((-102.020202020202d));
        java.lang.String str16 = user1.getPassword();
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setInvested((double) (-1L));
        user0.setInvested((double) 1.0f);
        user0.setProfit((double) 1L);
        double double7 = user0.getFunds();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) 100, 4850.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4750.0d + "'", double2 == 4750.0d);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = user1.getUserId();
        user1.setPassword("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setUserName("582780");
        java.lang.String str9 = user1.getPassword();
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        java.lang.String str4 = stock0.getSymbol();
        java.lang.String str5 = stock0.getSymbol();
        java.lang.String str6 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "You do not own any hi! shares." + "'", str4, "You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "You do not own any hi! shares." + "'", str5, "You do not own any hi! shares.");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setCurrentPrice((double) (-1L));
        order0.setStockSymbol("lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        double double4 = order0.getPnl();
        double double5 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        double double6 = order0.getBuyPrice();
        double double7 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        double double5 = user1.getFunds();
        user1.setPassword("T72xtn4m6zgYCz1QwNF31A==");
        double double8 = user1.getInvested();
        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setUserName("Registration Successfull");
        double double6 = order0.getBuyPrice();
        order0.setUserName("You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        int int8 = order0.getOrderID();
        java.lang.String str9 = order0.getStockSymbol();
        order0.setUserName("52.0 has been added to funds of hi!");
        order0.setBuyPrice((double) 100);
        int int14 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        order0.setStockSymbol("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        java.lang.String str8 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str8, "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(24.5d, (-103.2258064516129d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36290322580645d) + "'", double2 == (-39.36290322580645d));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        java.lang.String str6 = order0.getStockSymbol();
        int int7 = order0.getNumberOfShares();
        order0.setBuyPrice((double) 100.0f);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl((double) (byte) 1);
        order0.setUserName("");
        java.lang.String str8 = order0.getStockSymbol();
        double double9 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("52.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (short) -1, 49.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 24.25d + "'", double2 == 24.25d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setBuyPrice((-40.38461538461539d));
        java.lang.String str7 = order0.getUserName();
        order0.setNumberOfShares(31);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setProfit((double) 'a');
        double double11 = user1.getFunds();
        user1.setInvested(50.0d);
        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setProfit((double) 100.0f);
        double double5 = user0.getFunds();
        user0.setProfit(31.0d);
        user0.setUserId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-99.0d) + "'", double5 == (-99.0d));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setUserName("hi!");
        int int6 = order0.getOrderID();
        double double7 = order0.getBuyPrice();
        int int8 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setFunds(50.0d);
        double double10 = user1.getCurrentAmount();
        double double11 = user1.getProfit();
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) (-1L), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.0d) + "'", double2 == (-0.0d));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setBuyPrice((-40.38461538461539d));
        double double7 = order0.getPnl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setProfit((-1.0d));
        user1.setUserName("582780");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        order0.setStockSymbol("You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        java.lang.String str3 = stock0.getName();
        double double4 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        int int6 = order0.getNumberOfShares();
        int int7 = order0.getNumberOfShares();
        order0.setStockSymbol("You do not have enough Fund balance to withdraw GBP 31.0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setUserName("hi!");
        int int6 = order0.getOrderID();
        order0.setUserName("582780");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        int int5 = user1.getUserId();
        user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
        user1.setProfit((double) (short) 1);
        int int10 = user1.getUserId();
        user1.setFunds((-100.0d));
        double double13 = user1.getInvested();
        double double14 = user1.getFunds();
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setInvested((double) (-1L));
        user0.setInvested((double) 1.0f);
        user0.setProfit((double) 1L);
        user0.setPassword("100.0 has been added to funds of ");
        user0.setProfit((double) (short) 100);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-39.36290322580645d), 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 10, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = user1.getUserId();
        double double5 = user1.getCurrentAmount();
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        order0.setCurrentPrice(50.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getBuyPrice();
        order0.setUserName("582780");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        user1.setCurrentAmount(10.0d);
        user1.setCurrentAmount((-0.5d));
        double double11 = user1.getFunds();
        double double12 = user1.getCurrentAmount();
        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.5d) + "'", double12 == (-0.5d));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setPassword("");
        java.lang.String str10 = user1.getUserName();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        stock0.setPrice((-40.38461538461539d));
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setInvested((double) (-1L));
        user0.setPassword("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        user0.setUserName("You do not own any T72xtn4m6zgYCz1QwNF31A== shares.");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
// flaky:         org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        double double8 = stock0.getPrice();
        stock0.setPrice((double) 1);
        java.lang.String str11 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setStockSymbol("You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setProfit((double) 'a');
        double double11 = user1.getFunds();
        user1.setInvested((double) (byte) 10);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setUserName("You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setInvested((double) (-1L));
        double double3 = user0.getProfit();
        double double4 = user0.getCurrentAmount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        int int3 = user1.getUserId();
        double double4 = user1.getInvested();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setProfit((-51.61290322580645d));
        user0.setCurrentAmount((double) (short) 10);
        double double5 = user0.getFunds();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        double double6 = order0.getPnl();
        order0.setOrderID((int) (short) 100);
        int int9 = order0.getOrderID();
        order0.setUserName("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setBuyPrice(Double.NEGATIVE_INFINITY);
        java.lang.String str8 = order0.getUserName();
        int int9 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) (byte) 10, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 250.0d + "'", double2 == 250.0d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(250.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 124.5d + "'", double2 == 124.5d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setUserName("You do not own any hi! shares.");
        user1.setProfit((double) 0L);
        user1.setInvested((double) 0L);
        int int15 = user1.getUserId();
        double double16 = user1.getProfit();
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setProfit((-1.0d));
        int int5 = user1.getUserId();
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        int int3 = user1.getUserId();
        user1.setUserId((int) (short) 100);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any  shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/zBqTTq/cuCjnAXg0XkAqpM=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/zBqTTq/cuCjnAXg0XkAqpM=");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        int int9 = order0.getNumberOfShares();
        double double10 = order0.getBuyPrice();
        order0.setOrderID((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("You do not own any  shares.");
        order0.setBuyPrice(10.0d);
        order0.setOrderID(31);
        java.lang.String str15 = order0.getUserName();
        order0.setCurrentPrice((-103.2258064516129d));
        java.lang.String str18 = order0.getStockSymbol();
        order0.setUserName("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "You do not own any  shares." + "'", str18, "You do not own any  shares.");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl(1.0d);
        double double6 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(Double.NEGATIVE_INFINITY, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-102.020202020202d), (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-109.8019801980198d) + "'", double2 == (-109.8019801980198d));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        java.lang.Class<?> wildcardClass3 = user1.getClass();
        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        user1.setCurrentAmount(10.0d);
        user1.setInvested((double) 0L);
        user1.setCurrentAmount((double) 1L);
        double double13 = user1.getCurrentAmount();
        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        double double2 = user0.getProfit();
        user0.setProfit((double) 10.0f);
        double double5 = user0.getCurrentAmount();
        user0.setProfit((double) 1.0f);
        int int8 = user0.getUserId();
        java.lang.Class<?> wildcardClass9 = user0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        double double6 = stock0.getPrice();
        java.lang.String str7 = stock0.getName();
        double double8 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!" + "'", str7, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) (-1.0f));
        user1.setPassword("lk1tNlo39haBld4kgdz2bQ==");
        double double11 = user1.getFunds();
        user1.setFunds((-0.5d));
        double double14 = user1.getInvested();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        java.lang.String str6 = stock0.getSymbol();
        java.lang.String str7 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        int int3 = user1.getUserId();
        double double4 = user1.getCurrentAmount();
        double double5 = user1.getCurrentAmount();
        user1.setPassword("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        double double8 = user1.getProfit();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        java.lang.String str3 = user0.getPassword();
        user0.setUserName("You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setUserName("You do not own any hi! shares.");
        user1.setCurrentAmount(24.193548387096776d);
        double double13 = user1.getInvested();
        double double14 = user1.getProfit();
        user1.setInvested(35.0d);
        int int17 = user1.getUserId();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setUserId(31);
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setName("You do not own any hi! shares.");
        stock0.setPrice(50.0d);
        java.lang.String str12 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setPrice((-99.0d));
        java.lang.String str10 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Stock Prices changed" + "'", str10, "Stock Prices changed");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setPrice(1.0d);
        double double8 = stock0.getPrice();
        stock0.setPrice((-99.0d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        double double4 = stock0.getPrice();
        java.lang.String str5 = stock0.getName();
        java.lang.String str6 = stock0.getSymbol();
        stock0.setSymbol("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "You do not own any hi! shares." + "'", str6, "You do not own any hi! shares.");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        double double4 = stock0.getPrice();
        double double5 = stock0.getPrice();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getUserName();
        order0.setOrderID((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        double double5 = order0.getCurrentPrice();
        double double6 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        order0.setNumberOfShares((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        stock0.setPrice((double) '#');
        stock0.setName("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        stock0.setName("You do not own any T72xtn4m6zgYCz1QwNF31A== shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        double double15 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setProfit((double) 100.0f);
        double double5 = user0.getCurrentAmount();
        java.lang.String str6 = user0.getUserName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setInvested((double) 0);
        java.lang.String str11 = user1.getPassword();
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) (byte) -1, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-9800.0d) + "'", double2 == (-9800.0d));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setPnl((double) 10.0f);
        int int11 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setStockSymbol("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        stock0.setName("4pZrH4vsAwcGHvo486Rrww==");
        stock0.setPrice((double) 100.0f);
        double double11 = stock0.getPrice();
        stock0.setSymbol("1.0 has been added to funds of You do not own any  shares.");
        stock0.setPrice((double) (-1));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getUserName();
        order0.setStockSymbol("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(250.0d, (-102.020202020202d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-140.8080808080808d) + "'", double2 == (-140.8080808080808d));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        java.lang.String str3 = user1.getUserName();
        user1.setUserName("100.0 has been added to funds of ");
        java.lang.String str6 = user1.getUserName();
        double double7 = user1.getFunds();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Stock Prices changed" + "'", str8, "Stock Prices changed");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setSymbol("You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
        stock0.setPrice(124.5d);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        int int8 = order0.getOrderID();
        java.lang.String str9 = order0.getStockSymbol();
        order0.setUserName("52.0 has been added to funds of hi!");
        order0.setBuyPrice((double) 100);
        order0.setNumberOfShares((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        double double9 = order0.getBuyPrice();
        double double10 = order0.getBuyPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("You do not own any  shares.");
        order0.setBuyPrice(10.0d);
        order0.setUserName("Stock Prices changed");
        double double15 = order0.getCurrentPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) (-1.0f));
        java.lang.String str9 = user1.getPassword();
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) (-1.0f));
        user1.setPassword("lk1tNlo39haBld4kgdz2bQ==");
        double double11 = user1.getFunds();
        user1.setFunds((double) 31);
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setPrice(1.0d);
        double double8 = stock0.getPrice();
        java.lang.String str9 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Stock Prices changed" + "'", str9, "Stock Prices changed");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        int int8 = order0.getOrderID();
        java.lang.String str9 = order0.getStockSymbol();
        order0.setCurrentPrice((double) 1.0f);
        order0.setUserName("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
        order0.setNumberOfShares((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        stock0.setPrice((double) '#');
        stock0.setName("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        stock0.setSymbol("Stock Prices changed");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.lang.String str16 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        java.lang.String str2 = user0.getUserName();
        user0.setUserId((int) (byte) 100);
        user0.setInvested((double) (-1L));
        user0.setInvested(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        java.lang.String str9 = stock0.getSymbol();
        stock0.setName("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setBuyPrice((-40.38461538461539d));
        java.lang.String str7 = order0.getUserName();
        order0.setUserName(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        order0.setPnl((-9800.0d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-24.0d), (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.5d + "'", double2 == 5.5d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setStockSymbol("You do not own any hi! shares.");
        order0.setCurrentPrice((double) 10L);
        order0.setNumberOfShares(10);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        double double4 = order0.getBuyPrice();
        order0.setNumberOfShares((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        java.lang.String str3 = user1.getUserName();
        double double4 = user1.getFunds();
        java.lang.String str5 = user1.getPassword();
        double double6 = user1.getInvested();
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        java.lang.String str6 = order0.getStockSymbol();
        int int7 = order0.getNumberOfShares();
        int int8 = order0.getOrderID();
        java.lang.String str9 = order0.getStockSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setPrice(1.0d);
        double double8 = stock0.getPrice();
        stock0.setPrice((double) (byte) 1);
        double double11 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        int int6 = order0.getNumberOfShares();
        int int7 = order0.getOrderID();
        double double8 = order0.getBuyPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        double double4 = order0.getBuyPrice();
        double double5 = order0.getBuyPrice();
        int int6 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        int int3 = user1.getUserId();
        double double4 = user1.getCurrentAmount();
        double double5 = user1.getCurrentAmount();
        double double6 = user1.getInvested();
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested(31.0d);
        user1.setUserId((int) '#');
        user1.setPassword(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setFunds(50.0d);
        org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares((int) (byte) -1);
        order0.setPnl((double) 0);
        int int13 = order0.getNumberOfShares();
        order0.setOrderID((int) (byte) 1);
        java.lang.String str16 = order0.getUserName();
        java.lang.String str17 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setOrderID(100);
        double double7 = order0.getBuyPrice();
        order0.setOrderID((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any 52.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==" + "'", str1, "pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setCurrentPrice((double) 'a');
        java.lang.String str10 = order0.getUserName();
        order0.setStockSymbol("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        double double15 = order0.getCurrentPrice();
        order0.setUserName("Stock Prices changed");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setProfit((double) 'a');
        double double11 = user1.getInvested();
        double double12 = user1.getFunds();
        user1.setProfit(24.193548387096776d);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) '#', (-100.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-385.7142857142857d) + "'", double2 == (-385.7142857142857d));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 1);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setPnl((double) ' ');
        java.lang.String str11 = order0.getStockSymbol();
        double double12 = order0.getCurrentPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        stock0.setName(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        stock0.setName(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        java.lang.String str2 = user0.getUserName();
        user0.setUserName("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        user0.setProfit((double) (short) 10);
        double double7 = user0.getProfit();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        stock0.setPrice((double) '#');
        stock0.setName("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        double double7 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setProfit((-51.61290322580645d));
        user0.setCurrentAmount((double) (short) 10);
        user0.setUserName("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        user0.setPassword("-39.36290322580645 has been added to funds of Stock Prices changed");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        double double7 = order0.getCurrentPrice();
        order0.setPnl(52.0d);
        int int10 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setCurrentAmount((-103.2258064516129d));
        int int5 = user0.getUserId();
        user0.setCurrentAmount(1.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5zJKV5ipCRYeVzXxw3fbJ7fVq4wvQYfIK31e5+0u2n2AfZ0OZg0Te4Ug2dU3+uqjb4bZHb3JV86qYvBSKZAXhGZr1E+uPxudtzs1E+O4e6vyY1wn0xv3ff11otTZ/rXzNLcpLw3cuSJgULkl7oQ+pTXHe9iCyJCe7BQxJdU3HCCc=" + "'", str1, "pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5zJKV5ipCRYeVzXxw3fbJ7fVq4wvQYfIK31e5+0u2n2AfZ0OZg0Te4Ug2dU3+uqjb4bZHb3JV86qYvBSKZAXhGZr1E+uPxudtzs1E+O4e6vyY1wn0xv3ff11otTZ/rXzNLcpLw3cuSJgULkl7oQ+pTXHe9iCyJCe7BQxJdU3HCCc=");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setStockSymbol("You do not own any hi! shares.");
        order0.setOrderID((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        double double4 = stock0.getPrice();
        stock0.setSymbol("J5wXKdtA4hPstPmeCfEhvpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setBuyPrice(124.5d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("You do not own any  shares.");
        order0.setBuyPrice(10.0d);
        order0.setOrderID(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        order0.setPnl((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        double double6 = order0.getBuyPrice();
        order0.setStockSymbol("You do not own any You do not own any Funds Withdrawn shares. shares.");
        java.lang.Class<?> wildcardClass9 = order0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL(" added to wishlist of user 582780", (-39.36290322580645d), (-140.8080808080808d), (-9800.0d), (-20.192307692307693d));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
// flaky:         user1.setInvested((double) 'a');
        double double7 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setPassword("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9800.0d) + "'", double7 == (-9800.0d));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setStockSymbol("lk1tNlo39haBld4kgdz2bQ==");
        java.lang.String str11 = order0.getStockSymbol();
        int int12 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "lk1tNlo39haBld4kgdz2bQ==" + "'", str11, "lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        stock0.setPrice((double) '#');
        double double5 = stock0.getPrice();
        stock0.setPrice((-103.2258064516129d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 1);
        order0.setOrderID(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setStockSymbol("You do not own any hi! shares.");
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("You do not own any You do not own any You do not own any hi! shares. shares. shares.", (double) (-1), 24.193548387096776d, (double) 0, (double) (-1.0f));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        int int5 = order0.getNumberOfShares();
        double double6 = order0.getBuyPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setName("You do not have enough Fund balance to withdraw GBP 97.0");
        stock0.setName("hi!");
        java.lang.String str12 = stock0.getSymbol();
        stock0.setPrice((-0.0d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl((double) (byte) 1);
        double double6 = order0.getCurrentPrice();
        int int7 = order0.getNumberOfShares();
        order0.setUserName("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares. added to wishlist of user You do not own any  shares.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        java.lang.String str3 = user0.getPassword();
        int int4 = user0.getUserId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        stock0.setName("4pZrH4vsAwcGHvo486Rrww==");
        stock0.setPrice((double) 100.0f);
        double double11 = stock0.getPrice();
        stock0.setSymbol("1.0 has been added to funds of You do not own any  shares.");
        stock0.setPrice((-490.4282115869018d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setBuyPrice((-24.0d));
        int int9 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setInvested((double) 0L);
// flaky:         user1.setCurrentAmount((double) 1L);
        double double13 = 0.0; // flaky: user1.getInvested();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "Stock Prices changed", (int) (short) 1, (double) 0, (double) 100, (double) (-1.0f));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setName("You do not have enough Fund balance to withdraw GBP 97.0");
        stock0.setName("hi!");
        java.lang.String str12 = stock0.getSymbol();
        java.lang.String str13 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        int int6 = order0.getNumberOfShares();
        int int7 = order0.getNumberOfShares();
        order0.setOrderID((int) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        stock0.setName("Stock Prices changed");
        stock0.setPrice((-25.61290322580645d));
        stock0.setSymbol("Stock Prices changed");
        double double15 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-25.61290322580645d) + "'", double15 == (-25.61290322580645d));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", (double) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str2, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("582780");
// flaky:         user1.setCurrentAmount(Double.NEGATIVE_INFINITY);
// flaky:         user1.setProfit((double) 0L);
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setCurrentPrice((double) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("97.0 has been added to funds of 52.0 has been added to funds of hi!", 31.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "31.0 has been added to funds of 97.0 has been added to funds of 52.0 has been added to funds of hi!" + "'", str2, "31.0 has been added to funds of 97.0 has been added to funds of 52.0 has been added to funds of hi!");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getSymbol();
        stock0.setPrice(100.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("", 1.0d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        java.lang.String str2 = null; // flaky: user1.getPassword();
        int int3 = 0; // flaky: user1.getUserId();
// flaky:         user1.setFunds(35.0d);
        double double6 = 0.0; // flaky: user1.getInvested();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-39.36d) + "'", double6 == (-39.36d));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setCurrentPrice((double) 'a');
        order0.setBuyPrice(18.548387096774192d);
        order0.setStockSymbol("You do not own any hi! shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setUserId(31);
        double double10 = 0.0; // flaky: user1.getCurrentAmount();
        double double11 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-140.81d) + "'", double10 == (-140.81d));
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9800.0d) + "'", double11 == (-9800.0d));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        java.lang.String str9 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setStockSymbol("lk1tNlo39haBld4kgdz2bQ==");
        java.lang.String str11 = order0.getStockSymbol();
        double double12 = order0.getCurrentPrice();
        double double13 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "lk1tNlo39haBld4kgdz2bQ==" + "'", str11, "lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= added to wishlist of user lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= added to wishlist of user lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setOrderID(100);
        order0.setPnl((-109.8019801980198d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=", "");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares. added to wishlist of user You do not own any  shares.", "52.0 has been added to funds of hi!", "You do not own any You do not own any You do not own any Funds Withdrawn shares. shares. shares.", (int) (short) -1, (-0.0d), (-20.192307692307693d), (-40.38461538461539d));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setBuyPrice(Double.NEGATIVE_INFINITY);
        java.lang.String str8 = order0.getUserName();
        java.lang.String str9 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("1.0 has been added to funds of Funds Withdrawn");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setName("You do not own any pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "You do not own any hi! shares." + "'", str4, "You do not own any hi! shares.");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", "You do not own any 52.0 has been added to funds of hi! shares.");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(12.903225806451612d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.451612903225806d + "'", double2 == 6.451612903225806d);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!", 12.903225806451612d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("4pZrH4vsAwcGHvo486Rrww==", "You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares.", 0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares. shares." + "'", str3, "You do not own any You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares. shares.");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        double double15 = order0.getCurrentPrice();
        order0.setBuyPrice((-99.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        java.lang.Class<?> wildcardClass3 = order0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setPrice(1.0d);
        java.lang.String str8 = stock0.getSymbol();
        stock0.setSymbol("You do not own any 1.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Stock Prices changed" + "'", str8, "Stock Prices changed");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setPnl((-98.07692307692307d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed added to wishlist of user You do not have enough Fund balance to withdraw GBP 52.0", (-103.2258064516129d));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("35.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-140.8080808080808d), 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-44.4040404040404d) + "'", double2 == (-44.4040404040404d));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getProfit();
        double double3 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-20.19d) + "'", double2 == (-20.19d));
// flaky:         org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-9800.0d) + "'", double3 == (-9800.0d));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setProfit((-51.61290322580645d));
        user0.setCurrentAmount((double) (short) 10);
        user0.setUserName("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        double double7 = user0.getProfit();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-51.61290322580645d) + "'", double7 == (-51.61290322580645d));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("1.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        java.lang.String str2 = null; // flaky: user1.getPassword();
        int int3 = 0; // flaky: user1.getUserId();
        double double4 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setFunds((double) 31);
        double double7 = 0.0; // flaky: user1.getProfit();
        java.lang.String str8 = null; // flaky: user1.getUserName();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-140.81d) + "'", double4 == (-140.81d));
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-20.19d) + "'", double7 == (-20.19d));
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + " added to wishlist of user 582780" + "'", str8, " added to wishlist of user 582780");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        int int5 = order0.getNumberOfShares();
        order0.setBuyPrice((double) 100);
        order0.setCurrentPrice(0.0d);
        int int10 = order0.getNumberOfShares();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("1.0 has been added to funds of You do not own any  shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setPassword("");
// flaky:         user1.setCurrentAmount((double) 10.0f);
// flaky:         user1.setProfit((-1.0d));
// flaky:         user1.setCurrentAmount((double) (-1));
        double double16 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setProfit(24.25d);
        java.lang.String str19 = null; // flaky: user1.getPassword();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.LoginController.isAlreadyRegistered("");
// flaky:         org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.LoginController.register("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==", "5.5 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setBuyPrice(Double.NEGATIVE_INFINITY);
        java.lang.String str8 = order0.getUserName();
        order0.setNumberOfShares((int) ' ');
        int int11 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        java.lang.String str5 = order0.getUserName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setCurrentPrice(31.0d);
        order0.setBuyPrice((-102.020202020202d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("52.0 has been added to funds of hi!", "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", "pRtxcGSinU6wRRkDvfPm/zBqTTq/cuCjnAXg0XkAqpM=", (int) (short) 0, 53.5d, 35.0d, (-140.81d));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setPrice((-99.0d));
        stock0.setPrice((double) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        java.lang.String str4 = stock0.getName();
        stock0.setPrice(124.5d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         user1.setCurrentAmount((double) 0.0f);
// flaky:         user1.setUserName("You do not own any hi! shares.");
// flaky:         user1.setCurrentAmount(24.193548387096776d);
        double double13 = 0.0; // flaky: user1.getInvested();
        double double14 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setCurrentAmount(0.0d);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-9800.0d) + "'", double14 == (-9800.0d));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("You do not have enough Fund balance to withdraw GBP 52.0", "Funds Withdrawn", 97);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any Funds Withdrawn shares." + "'", str3, "You do not own any Funds Withdrawn shares.");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.", "J5wXKdtA4hPstPmeCfEhvpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw", (int) '#', 0.0d, 31.0d, 250.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        double double7 = order0.getCurrentPrice();
        double double8 = order0.getCurrentPrice();
        order0.setOrderID(31);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (-1), (double) 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.0d + "'", double2 == 14.0d);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setPassword("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= added to wishlist of user lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
// flaky:         org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio(" added to wishlist of user 582780 added to wishlist of user Registration Successfull", "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("You do not own any 0.0 has been added to funds of hi! shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setInvested((double) (-1.0f));
        java.lang.String str9 = null; // flaky: user1.getUserName();
// flaky:         user1.setInvested((double) (short) 1);
        double double12 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str9, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9800.0d) + "'", double12 == (-9800.0d));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("582780");
// flaky:         user1.setInvested((double) 1.0f);
// flaky:         org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getOrderID();
        double double6 = order0.getBuyPrice();
        int int7 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("You do not own any pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd shares.", "YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("You do not own any You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares. shares.", "You do not own any hi! shares.");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares((int) (byte) -1);
        order0.setStockSymbol("You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.");
        java.lang.Class<?> wildcardClass13 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getBuyPrice();
        double double9 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", (-9800.0d));
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-9800.0 has been added to funds of hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0" + "'", str2, "-9800.0 has been added to funds of hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(124.5d, (-9800.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-7971.4859437751d) + "'", double2 == (-7971.4859437751d));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.", (double) '4');
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setName("You do not have enough Fund balance to withdraw GBP 97.0");
        java.lang.String str10 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("100.0 has been added to funds of 100.0 has been added to funds of ", "You do not own any You do not own any You do not own any Funds Withdrawn shares. shares. shares.");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("You do not own any  shares.", (double) '4');
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("You do not own any 0.0 has been added to funds of hi! shares.", "pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not own any 0.0 has been added to funds of hi! shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==" + "'", str2, "You do not own any 0.0 has been added to funds of hi! shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 100);
        order0.setStockSymbol("You do not have enough Fund balance to withdraw GBP 31.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.lang.String str1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setBuyPrice(Double.NEGATIVE_INFINITY);
        order0.setNumberOfShares((int) (short) 0);
        int int10 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        smqa.group17.smts.model.Stock stock1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("0.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6O+xE3T1Xka9raHapdkkhI0j/+Ifc8KgdL/FQw3+l992t" + "'", str1, "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6O+xE3T1Xka9raHapdkkhI0j/+Ifc8KgdL/FQw3+l992t");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("pRtxcGSinU6wRRkDvfPm/zBqTTq/cuCjnAXg0XkAqpM=");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-98.07692307692307d), 6.451612903225806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-45.81265508684863d) + "'", double2 == (-45.81265508684863d));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ=");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        stock0.setName("You do not own any  shares.");
        java.lang.String str10 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.", "Registration Successfull", "pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5zJKV5ipCRYeVzXxw3fbJ7fVq4wvQYfIK31e5+0u2n2AfZ0OZg0Te4Ug2dU3+uqjb4bZHb3JV86qYvBSKZAXhGZr1E+uPxudtzs1E+O4e6vyY1wn0xv3ff11otTZ/rXzNLcpLw3cuSJgULkl7oQ+pTXHe9iCyJCe7BQxJdU3HCCc=", 0, (-102.020202020202d), Double.POSITIVE_INFINITY, (double) (byte) 100);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("52.0 has been added to funds of hi!", 31.0d, (double) 0, 0.0d, (-0.0d));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("1.0 has been added to funds of hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ADxHIG67X3pRlQueyStfgpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw" + "'", str1, "ADxHIG67X3pRlQueyStfgpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.", "582780", (int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any 582780 shares." + "'", str3, "You do not own any 582780 shares.");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any You do not own any hi! shares. shares.", "", (int) (short) 0, (double) '#', (double) 29, (-24.0d));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("", "You do not have enough Fund balance to withdraw GBP 31.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         user1.setInvested(31.0d);
// flaky:         user1.setUserId((int) '#');
        double double10 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setInvested(50.0d);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("You do not own any 52.0 has been added to funds of hi! shares.", "35.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setStockSymbol("lk1tNlo39haBld4kgdz2bQ==");
        java.lang.String str11 = order0.getStockSymbol();
        int int12 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "lk1tNlo39haBld4kgdz2bQ==" + "'", str11, "lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.", "4pZrH4vsAwcGHvo486Rrww==", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed", (int) (byte) 1, (-100.0d), (double) 31, 52.0d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        int int9 = order0.getNumberOfShares();
        int int10 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", (double) (byte) 10, (double) 32, 97.0d, 6.451612903225806d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        java.lang.String str8 = stock0.getName();
        stock0.setName("0.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Stock Prices changed" + "'", str8, "Stock Prices changed");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setInvested(50.0d);
// flaky:         org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) 10L);
        double double4 = 0.0; // flaky: user1.getProfit();
        double double5 = 0.0; // flaky: user1.getInvested();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-20.19d) + "'", double4 == (-20.19d));
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-39.36d) + "'", double5 == (-39.36d));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("");
// flaky:         user1.setProfit((double) 97);
// flaky:         org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", "You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", (-0.0d));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("5.5 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setCurrentPrice((double) (-1L));
        order0.setStockSymbol("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
        order0.setBuyPrice((-0.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares. added to wishlist of user You do not own any  shares.", (-100.0d), (-25.61290322580645d), (-39.36d), (double) (byte) 10);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
        double double5 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setPassword("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
// flaky:         user1.setPassword("pRtxcGSinU6wRRkDvfPm/zBqTTq/cuCjnAXg0XkAqpM=");
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-9800.0d) + "'", double5 == (-9800.0d));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("Funds Withdrawn", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", (int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares." + "'", str3, "You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        order0.setPnl(5.5d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares.", "0.0 has been added to funds of hi!");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "Registration Successfull");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("You do not own any 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.", (double) 0L, 1.0d, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setCurrentPrice(28.307692307692307d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("Funds Withdrawn", "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("You do not own any  shares.");
        double double11 = order0.getPnl();
        order0.setPnl((double) (-1.0f));
        double double14 = order0.getBuyPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.LoginController.register("31.0 has been added to funds of 97.0 has been added to funds of 52.0 has been added to funds of hi!", "T72xtn4m6zgYCz1QwNF31A==");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("J5wXKdtA4hPstPmeCfEhvpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 31, 6.451612903225806d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 18.725806451612904d + "'", double2 == 18.725806451612904d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        stock0.setName("You do not own any You do not own any hi! shares. shares.");
        double double9 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         user1.setInvested((double) 0.0f);
// flaky:         user1.setUserId((int) 'a');
// flaky:         user1.setFunds(100.0d);
// flaky:         org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("You do not own any You do not own any hi! shares. shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        order0.setNumberOfShares((int) (byte) 0);
        double double8 = order0.getPnl();
        order0.setPnl((double) (-1.0f));
        java.lang.Class<?> wildcardClass11 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        double double6 = order0.getPnl();
        order0.setBuyPrice((-40.38461538461539d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
// flaky:         user1.setPassword("");
// flaky:         user1.setCurrentAmount((double) 10.0f);
// flaky:         user1.setProfit((-1.0d));
// flaky:         user1.setCurrentAmount((double) (-1));
        double double16 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setProfit(24.25d);
        java.lang.String str19 = null; // flaky: user1.getUserName();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + " added to wishlist of user 582780" + "'", str19, " added to wishlist of user 582780");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("You do not own any You do not own any You do not own any hi! shares. shares. shares.", "100.0 has been added to funds of ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setCurrentPrice((double) 'a');
        order0.setStockSymbol("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        int int6 = order0.getNumberOfShares();
        java.lang.String str7 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         user1.setCurrentAmount((double) 0.0f);
// flaky:         user1.setProfit((double) 'a');
        double double11 = 0.0; // flaky: user1.getInvested();
        double double12 = 0.0; // flaky: user1.getFunds();
        double double13 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9800.0d) + "'", double12 == (-9800.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-9800.0d) + "'", double13 == (-9800.0d));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(50.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A== added to wishlist of user You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares." + "'", str2, "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A== added to wishlist of user You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("hi!", "You do not own any hi! shares.");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("4pZrH4vsAwcGHvo486Rrww==", "1.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.withdrawFunds("Stock Prices changed", 30.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not have enough Fund balance to withdraw GBP 30.0" + "'", str2, "You do not have enough Fund balance to withdraw GBP 30.0");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        java.lang.String str3 = stock0.getName();
        stock0.setPrice((-490.4282115869018d));
        double double6 = stock0.getPrice();
        java.lang.String str7 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-490.4282115869018d) + "'", double6 == (-490.4282115869018d));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        double double4 = stock0.getPrice();
        java.lang.String str5 = stock0.getName();
        java.lang.String str6 = stock0.getSymbol();
        double double7 = stock0.getPrice();
        java.lang.String str8 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "You do not own any hi! shares." + "'", str6, "You do not own any hi! shares.");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "You do not own any hi! shares." + "'", str8, "You do not own any hi! shares.");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed added to wishlist of user You do not have enough Fund balance to withdraw GBP 52.0");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("4pZrH4vsAwcGHvo486Rrww==", "0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         user1.setCurrentAmount((double) 0.0f);
// flaky:         user1.setProfit((double) 'a');
// flaky:         user1.setUserId((int) ' ');
// flaky:         user1.setInvested(52.0d);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!", (double) 31);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "31.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!" + "'", str2, "31.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t", "", "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A== added to wishlist of user You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.", (int) (short) 1, (double) (byte) -1, 12.903225806451612d, (-100.0d));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("You do not own any 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.updateFundsForUser("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.", 24.193548387096776d);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares." + "'", str2, "24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
        double double7 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setCurrentAmount((double) ' ');
        java.lang.Class<?> wildcardClass10 = null; // flaky: user1.getClass();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9800.0d) + "'", double7 == (-9800.0d));
// flaky:         org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.withdrawFunds("4pZrH4vsAwcGHvo486Rrww==", (double) (byte) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Funds Withdrawn" + "'", str2, "Funds Withdrawn");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        double double8 = stock0.getPrice();
        java.lang.String str9 = stock0.getSymbol();
        double double10 = stock0.getPrice();
        java.lang.String str11 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setCurrentPrice((double) 'a');
        order0.setBuyPrice(18.548387096774192d);
        order0.setUserName("You do not have enough Fund balance to withdraw GBP 31.0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setPnl((double) (short) 100);
        order0.setUserName("You do not own any hi! shares.");
        double double12 = order0.getPnl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setInvested((double) 0L);
// flaky:         user1.setCurrentAmount((double) 1L);
        double double13 = 0.0; // flaky: user1.getProfit();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-20.19d) + "'", double13 == (-20.19d));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.", "100.0 has been added to funds of 100.0 has been added to funds of ", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", (int) (short) 100, (double) (byte) -1, 0.0d, (double) (byte) 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setSymbol("You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
        stock0.setName("You do not own any 1.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("You do not own any  shares.");
        double double11 = order0.getCurrentPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-25.61290322580645d), (-51.61290322580645d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-38.61290322580645d) + "'", double2 == (-38.61290322580645d));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.", "You do not have enough Fund balance to withdraw GBP 31.0", 97, 24.5d, (-7971.4859437751d), (double) 10);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        double double2 = user0.getProfit();
        user0.setProfit((double) 10.0f);
        double double5 = user0.getCurrentAmount();
        user0.setProfit((double) 1.0f);
        int int8 = user0.getUserId();
        user0.setProfit(4850.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

}
