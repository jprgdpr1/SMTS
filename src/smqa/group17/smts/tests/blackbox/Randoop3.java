package smqa.group17.smts.tests.blackbox;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import smqa.group17.smts.model.User;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop3 {
	
	public static boolean debug = true;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("You do not own any 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setPnl((double) 10.0f);
        java.lang.String str11 = order0.getStockSymbol();
        order0.setStockSymbol("0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("582780");
        java.lang.Class<?> wildcardClass2 = orderList1.getClass();
        org.junit.Assert.assertNotNull(orderList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = user1.getUserId();
        user1.setInvested((double) 'a');
        double double7 = user1.getFunds();
        user1.setProfit((-490.4282115869018d));
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-9800.0d) + "'", double7 == (-9800.0d));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        boolean boolean1 = smqa.group17.smts.controller.LoginController.isAlreadyRegistered("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= added to wishlist of user lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        int int1 = user0.getUserId();
        user0.setInvested(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setPnl((double) (short) -1);
        double double8 = order0.getCurrentPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm//IZrYFKphygv5cElcDx/e11lRlyXzV2lLtaedMSQ3O5eFtJn8KldNoemRUf9m15TUdHlCwFciS5wQe2zPK2KcEzZB6M1hnEpsv33Mr5S3JFUFQEn4kUpxWENxafw7NN5iRLN0TCmn00SMM8G3NjBV/INFdtx9crmaqvZ7twqQo3vfK/1rJjee7+b7xd3MeeMW/jjjCCWsU4F/wj+JFY1Fu0Bbj/32Db1txf8slrZnPzK6i8jXMKNH51aoFjCSs7BQ==" + "'", str1, "pRtxcGSinU6wRRkDvfPm//IZrYFKphygv5cElcDx/e11lRlyXzV2lLtaedMSQ3O5eFtJn8KldNoemRUf9m15TUdHlCwFciS5wQe2zPK2KcEzZB6M1hnEpsv33Mr5S3JFUFQEn4kUpxWENxafw7NN5iRLN0TCmn00SMM8G3NjBV/INFdtx9crmaqvZ7twqQo3vfK/1rJjee7+b7xd3MeeMW/jjjCCWsU4F/wj+JFY1Fu0Bbj/32Db1txf8slrZnPzK6i8jXMKNH51aoFjCSs7BQ==");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.String str3 = smqa.group17.smts.controller.DashboardController.sellStock("T72xtn4m6zgYCz1QwNF31A==", "-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any -103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A== shares." + "'", str3, "You do not own any -103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A== shares.");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) 100L, 24.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-75.5d) + "'", double2 == (-75.5d));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        smqa.group17.smts.controller.DatabaseController.updateOrder("-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.", 1, (-385.7142857142857d), 24.5d, (double) 31);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl((double) (byte) 1);
        double double6 = order0.getCurrentPrice();
        java.lang.String str7 = order0.getStockSymbol();
        order0.setBuyPrice(24.5d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        order0.setBuyPrice((-40.38461538461539d));
        java.lang.String str7 = order0.getUserName();
        order0.setUserName(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        java.lang.String str10 = order0.getStockSymbol();
        order0.setUserName("You do not have enough Fund balance to withdraw GBP 30.0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        int int5 = user1.getUserId();
        user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
        user1.setProfit((double) (short) 1);
        user1.setUserName("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        double double12 = user1.getInvested();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("You do not have enough Fund balance to withdraw GBP 52.0");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) (-1.0f));
        user1.setPassword("lk1tNlo39haBld4kgdz2bQ==");
        double double11 = user1.getFunds();
        user1.setFunds((-0.5d));
        double double14 = user1.getProfit();
        double double15 = user1.getFunds();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-9800.0d) + "'", double11 == (-9800.0d));
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-20.19d) + "'", double14 == (-20.19d));
//        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-0.5d) + "'", double15 == (-0.5d));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setInvested((double) (-1L));
        user0.setPassword("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        user0.setCurrentAmount(24.193548387096776d);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getUserName();
        double double2 = order0.getCurrentPrice();
        order0.setCurrentPrice((-20.192307692307693d));
        order0.setBuyPrice((double) (byte) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setName("You do not own any  shares.");
        stock0.setPrice((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        boolean boolean1 = smqa.group17.smts.controller.LoginController.isAlreadyRegistered("You do not own any You do not own any You do not own any hi! shares. shares. shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(18.548387096774192d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setPnl((double) (-1));
        order0.setStockSymbol("You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
        double double13 = order0.getBuyPrice();
        order0.setPnl((-44.4040404040404d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setPnl((double) (short) 100);
        order0.setUserName("You do not own any hi! shares.");
        java.lang.String str12 = order0.getStockSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setPassword("You do not have enough Fund balance to withdraw GBP 97.0");
        double double9 = user1.getCurrentAmount();
        double double10 = user1.getProfit();
        user1.setPassword("1.0 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. shares.");
        double double13 = user1.getCurrentAmount();
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-140.81d) + "'", double9 == (-140.81d));
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.19d) + "'", double10 == (-20.19d));
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-140.81d) + "'", double13 == (-140.81d));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setPassword("You do not have enough Fund balance to withdraw GBP 97.0");
        user1.setPassword("1.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        smqa.group17.smts.model.Order order2 = smqa.group17.smts.controller.DatabaseController.getOrderDetails("hi!", "100.0 has been added to funds of ");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        user1.setCurrentAmount(10.0d);
        user1.setCurrentAmount((-0.5d));
        user1.setCurrentAmount(18.725806451612904d);
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        smqa.group17.smts.controller.DatabaseController.createUser("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed added to wishlist of user You do not have enough Fund balance to withdraw GBP 52.0", "");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        java.lang.String str3 = user1.getUserName();
        double double4 = user1.getFunds();
        user1.setFunds((-103.2258064516129d));
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
//        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " added to wishlist of user 582780" + "'", str3, " added to wishlist of user 582780");
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-9800.0d) + "'", double4 == (-9800.0d));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = user1.getUserId();
        user1.setProfit(49.5d);
        double double7 = user1.getCurrentAmount();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
//        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setUserName("You do not own any hi! shares.");
        user1.setProfit((double) 0L);
        user1.setInvested((double) (short) 100);
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setCurrentPrice((double) 'a');
        order0.setBuyPrice(18.548387096774192d);
        double double12 = order0.getPnl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.0d + "'", double12 == 31.0d);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "pRtxcGSinU6wRRkDvfPm/zBqTTq/cuCjnAXg0XkAqpM=", (int) (short) 1, (-45.81265508684863d), (double) (-1L), (-100.0d));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 100);
        double double4 = order0.getPnl();
        double double5 = order0.getBuyPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.", "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        smqa.group17.smts.model.User user1 = smqa.group17.smts.controller.DashboardController.getUserDataForUserId("You do not own any You do not own any Funds Withdrawn shares. shares.");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not own any 1.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", "You do not own any You do not own any You do not own any hi! shares. shares. shares.");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        boolean boolean2 = smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!", "1.0 has been added to funds of You do not own any  shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setPassword("");
        user1.setCurrentAmount((double) 10.0f);
        user1.setProfit((-1.0d));
        user1.setCurrentAmount((double) (-1));
        double double16 = user1.getCurrentAmount();
        java.lang.String str17 = user1.getPassword();
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
//        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("You do not have enough Fund balance to withdraw GBP 30.0");
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any 582780 shares.", "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=", (int) '4', 10.0d, 24.5d, (double) 100.0f);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("0.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setUserName("T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        java.lang.String str6 = order0.getStockSymbol();
        double double7 = order0.getPnl();
        int int8 = order0.getNumberOfShares();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount(Double.NEGATIVE_INFINITY);
        java.lang.String str4 = user1.getUserName();
        double double5 = user1.getCurrentAmount();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "582780" + "'", str4, "582780");
//        org.junit.Assert.assertTrue("'" + double5 + "' != '" + Double.NEGATIVE_INFINITY + "'", double5 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.String str3 = smqa.group17.smts.controller.DashboardController.sellStock("52.0 has been added to funds of hi!", "You do not own any 0.0 has been added to funds of hi! shares.", 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any 0.0 has been added to funds of hi! shares. shares." + "'", str3, "You do not own any You do not own any 0.0 has been added to funds of hi! shares. shares.");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("You do not own any  shares.");
        double double11 = order0.getPnl();
        order0.setNumberOfShares((int) (byte) 0);
        java.lang.String str14 = order0.getStockSymbol();
        double double15 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "You do not own any  shares." + "'", str14, "You do not own any  shares.");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares((int) (byte) -1);
        order0.setOrderID((int) (byte) 10);
        order0.setOrderID(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        smqa.group17.smts.controller.DatabaseController.updateFundsForUser("1.0 has been added to funds of Funds Withdrawn", (double) (byte) 1);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!", "T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        smqa.group17.smts.controller.DatabaseController.updateFundsForUser("Stock Prices changed", 35.0d);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        java.lang.String str6 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested(31.0d);
        user1.setUserId((int) '#');
        user1.setProfit((double) (short) 100);
        double double12 = user1.getFunds();
        user1.setUserName("YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=");
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-9800.0d) + "'", double12 == (-9800.0d));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setUserName("You do not own any hi! shares.");
        user1.setCurrentAmount(24.193548387096776d);
        user1.setInvested((-1.0d));
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 32, 49.5d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 40.75d + "'", double2 == 40.75d);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        smqa.group17.smts.model.User user1 = smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setProfit((double) 100.0f);
        double double5 = user0.getCurrentAmount();
        user0.setFunds(10.0d);
        double double8 = user0.getFunds();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.updateFundsForUser("You do not have enough Fund balance to withdraw GBP 31.0", (-1.0d));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 31.0" + "'", str2, "-1.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 31.0");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        smqa.group17.smts.controller.DatabaseController.updateFundsForUser("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", (double) 32);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setPassword("You do not have enough Fund balance to withdraw GBP 97.0");
        double double9 = user1.getCurrentAmount();
        double double10 = user1.getProfit();
        user1.setPassword("1.0 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. shares.");
        double double13 = user1.getInvested();
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-140.81d) + "'", double9 == (-140.81d));
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-20.19d) + "'", double10 == (-20.19d));
//        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setInvested((double) (-1L));
        user0.setPassword("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not own any 52.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("You do not own any 52.0 has been added to funds of hi! shares.", "0.0 has been added to funds of hi!");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) (-1.0f));
        user1.setPassword("lk1tNlo39haBld4kgdz2bQ==");
        user1.setUserId(0);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        int int3 = user1.getUserId();
        double double4 = user1.getCurrentAmount();
        user1.setUserId((int) '4');
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-140.81d) + "'", double4 == (-140.81d));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(18.548387096774192d, (-75.5d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-28.475806451612904d) + "'", double2 == (-28.475806451612904d));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setPassword("");
        user1.setCurrentAmount((double) 10.0f);
        user1.setCurrentAmount((double) '4');
        user1.setInvested((double) (byte) 10);
        int int16 = user1.getUserId();
        user1.setProfit(4850.0d);
//        org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-39.36d) + "'", double2 == (-39.36d));
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        int int4 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("You do not own any You do not own any You do not own any hi! shares. shares. shares.");
        org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        smqa.group17.smts.model.User user1 = smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        smqa.group17.smts.controller.DatabaseController.createUser("You do not own any hi! shares.", "");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setUserName("");
        int int3 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        smqa.group17.smts.model.User user1 = smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("You do not own any T72xtn4m6zgYCz1QwNF31A== shares.");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        order0.setPnl(24.5d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not have enough Fund balance to withdraw GBP 52.0 added to wishlist of user You do not own any 52.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        double double7 = order0.getCurrentPrice();
        double double8 = order0.getCurrentPrice();
        order0.setOrderID((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        double double6 = order0.getPnl();
        int int7 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        double double7 = order0.getCurrentPrice();
        double double8 = order0.getCurrentPrice();
        order0.setStockSymbol("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
        order0.setNumberOfShares(32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        smqa.group17.smts.controller.DatabaseController.updateUserPnL(" added to wishlist of user 582780", 52.0d, 18.548387096774192d, (double) 0L, 52.0d);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setUserName("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        double double9 = user1.getCurrentAmount();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A== added to wishlist of user You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
        org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("4pZrH4vsAwcGHvo486Rrww==");
//        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str1, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", "ADxHIG67X3pRlQueyStfggrELZrOF8CXQPg+DDern7z7H2h0Kmj2GAyXDYB8ZxL0YOqnZ6qwQx84IcJ6GKKpqg==");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        double double9 = order0.getBuyPrice();
        double double10 = order0.getCurrentPrice();
        order0.setOrderID((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("Stock Prices changed");
        stock0.setSymbol("97.0 has been added to funds of 52.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        smqa.group17.smts.model.User user1 = new User();
        user1.setFunds((double) 100.0f);
        user1.setCurrentAmount((-102.020202020202d));
//        org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!", "Stock Prices changed", "You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!", (int) (byte) 0, 0.0d, (-38.61290322580645d), (-102.020202020202d));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        double double6 = stock0.getPrice();
        java.lang.String str7 = stock0.getName();
        stock0.setPrice(35.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!" + "'", str7, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        double double4 = stock0.getPrice();
        java.lang.String str5 = stock0.getName();
        java.lang.String str6 = stock0.getSymbol();
        double double7 = stock0.getPrice();
        double double8 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "You do not own any hi! shares." + "'", str6, "You do not own any hi! shares.");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) (-1.0f));
        user1.setPassword("lk1tNlo39haBld4kgdz2bQ==");
        java.lang.String str11 = user1.getUserName();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str11, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setCurrentPrice((double) 'a');
        java.lang.String str10 = order0.getUserName();
        int int11 = order0.getNumberOfShares();
        double double12 = order0.getBuyPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested(31.0d);
        user1.setUserId((int) '#');
        user1.setProfit((double) (short) 100);
        double double12 = user1.getFunds();
        java.lang.String str13 = user1.getUserName();
        user1.setUserName("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested((-140.81d));
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str13, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        java.lang.String str9 = order0.getStockSymbol();
        java.lang.String str10 = order0.getStockSymbol();
        java.lang.String str11 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setProfit((double) 'a');
        double double11 = user1.getInvested();
        double double12 = user1.getFunds();
        double double13 = user1.getProfit();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
//        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
//        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
//        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.updateFundsForUser("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.", (double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1.0 has been added to funds of You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares." + "'", str2, "1.0 has been added to funds of You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setFunds(50.0d);
        int int10 = user1.getUserId();
        double double11 = user1.getFunds();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
//        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        java.lang.String str3 = user1.getPassword();
        java.lang.String str4 = user1.getUserName();
        user1.setPassword("You do not own any 1.0 has been added to funds of hi! shares.");
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str3, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " added to wishlist of user 582780" + "'", str4, " added to wishlist of user 582780");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        java.lang.String str3 = stock0.getName();
        stock0.setPrice(53.5d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setCurrentPrice((double) 'a');
        order0.setOrderID((int) (short) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("97.0 has been added to funds of 52.0 has been added to funds of hi!");
        org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(50.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested((double) 0.0f);
        user1.setUserId((int) 'a');
        double double10 = user1.getFunds();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        smqa.group17.smts.controller.DatabaseController.updateUserPnL("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!", Double.POSITIVE_INFINITY, 1.0d, (double) (short) -1, (-98.07692307692307d));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        double double6 = stock0.getPrice();
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getName();
        stock0.setSymbol("32.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!" + "'", str7, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!" + "'", str8, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-45.81265508684863d), 18.725806451612904d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-13.543424317617863d) + "'", double2 == (-13.543424317617863d));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        int int8 = order0.getOrderID();
        java.lang.String str9 = order0.getStockSymbol();
        order0.setCurrentPrice((double) 1.0f);
        java.lang.String str12 = order0.getUserName();
        java.lang.String str13 = order0.getStockSymbol();
        int int14 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        double double4 = stock0.getPrice();
        java.lang.String str5 = stock0.getName();
        java.lang.String str6 = stock0.getSymbol();
        double double7 = stock0.getPrice();
        java.lang.String str8 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "You do not own any hi! shares." + "'", str6, "You do not own any hi! shares.");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setInvested((double) 0);
        user1.setCurrentAmount(35.0d);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares((int) (byte) -1);
        order0.setStockSymbol("You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.");
        order0.setPnl(18.725806451612904d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        smqa.group17.smts.model.User user1 = smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setProfit((double) 'a');
        double double11 = user1.getFunds();
        user1.setUserId((int) (short) 10);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
//        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        smqa.group17.smts.model.User user1 = new User();
        int int2 = user1.getUserId();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.addStockToWishlist("pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=", "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA= added to wishlist of user -490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==" + "'", str2, "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA= added to wishlist of user -490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("You do not own any  shares.", "ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ=");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) (-1.0f));
        user1.setPassword("lk1tNlo39haBld4kgdz2bQ==");
        double double11 = user1.getFunds();
        user1.setFunds((-0.5d));
        double double14 = user1.getProfit();
        int int15 = user1.getUserId();
        user1.setProfit(5.5d);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
//        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        int int9 = order0.getNumberOfShares();
        double double10 = order0.getBuyPrice();
        order0.setStockSymbol("You do not own any pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd shares.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "1.0 has been added to funds of You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        smqa.group17.smts.model.Order order2 = smqa.group17.smts.controller.DatabaseController.getOrderDetails("You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.", "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        smqa.group17.smts.controller.DatabaseController.createUser("0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0", "T72xtn4m6zgYCz1QwNF31A==");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount(Double.NEGATIVE_INFINITY);
        user1.setProfit((double) 0L);
        user1.setInvested((-0.5d));
//        org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setPassword("");
        user1.setCurrentAmount((double) 10.0f);
        user1.setProfit((-1.0d));
        user1.setCurrentAmount((double) (-1));
        user1.setUserId(97);
        double double18 = user1.getInvested();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setProfit((-1.0d));
        double double5 = user1.getFunds();
        java.lang.String str6 = user1.getUserName();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
//        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " added to wishlist of user 582780" + "'", str6, " added to wishlist of user 582780");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        smqa.group17.smts.controller.DatabaseController.createUser("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) 100);
        int int9 = user1.getUserId();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getProfit();
        user1.setPassword("You do not own any You do not own any You do not own any hi! shares. shares. shares.");
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        user1.setCurrentAmount(10.0d);
        user1.setUserId(1);
        user1.setFunds((double) (byte) 100);
        double double13 = user1.getInvested();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        java.lang.String str9 = order0.getStockSymbol();
        double double10 = order0.getBuyPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl((double) (byte) 1);
        int int6 = order0.getNumberOfShares();
        order0.setOrderID((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
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
        order0.setPnl(49.5d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("You do not have enough Fund balance to withdraw GBP 52.0", "You do not have enough Fund balance to withdraw GBP 52.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setStockSymbol("You do not own any hi! shares.");
        order0.setStockSymbol("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        java.lang.String str7 = order0.getStockSymbol();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares." + "'", str7, "You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        int int3 = user1.getUserId();
        double double4 = user1.getCurrentAmount();
        user1.setCurrentAmount((double) 100);
        user1.setUserId(0);
        java.lang.String str9 = user1.getUserName();
        double double10 = user1.getFunds();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
//        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 18.55d + "'", double4 == 18.55d);
//        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " added to wishlist of user 582780" + "'", str9, " added to wishlist of user 582780");
//        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setProfit((-1.0d));
        java.lang.String str5 = user1.getUserName();
        user1.setUserId((int) (byte) 0);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " added to wishlist of user 582780" + "'", str5, " added to wishlist of user 582780");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        order0.setNumberOfShares((int) (byte) 0);
        order0.setNumberOfShares((int) (short) 10);
        order0.setBuyPrice(0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        smqa.group17.smts.controller.DatabaseController.updateUserPnL("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.", 100.0d, (-44.4040404040404d), 97.0d, (double) 29);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ=" + "'", str1, "ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ=");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        boolean boolean1 = smqa.group17.smts.controller.LoginController.isAlreadyRegistered("You do not own any 0.0 has been added to funds of hi! shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        smqa.group17.smts.controller.DatabaseController.createUser("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", "31.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        smqa.group17.smts.controller.DatabaseController.createUser("You do not own any  shares.", "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6O+xE3T1Xka9raHapdkkhI0j/+Ifc8KgdL/FQw3+l992t");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("35.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", "-9800.0 has been added to funds of hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", (int) (short) 1, (double) 32, (double) 10.0f, (double) (short) -1);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        order0.setCurrentPrice((double) (byte) 100);
        java.lang.String str7 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.", "1.0 has been added to funds of You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        double double4 = order0.getPnl();
        order0.setOrderID((int) (byte) 100);
        int int7 = order0.getNumberOfShares();
        double double8 = order0.getBuyPrice();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("100.0 has been added to funds of 100.0 has been added to funds of ", "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "You do not have enough Fund balance to withdraw GBP 31.0", 31, (double) 0L, Double.NEGATIVE_INFINITY, 52.0d);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        double double5 = user1.getInvested();
        user1.setCurrentAmount((double) (byte) 10);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        stock0.setPrice((double) 31);
        stock0.setSymbol("");
        java.lang.String str13 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Stock Prices changed" + "'", str13, "Stock Prices changed");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setPnl((double) 10.0f);
        order0.setBuyPrice((double) 31);
        double double13 = order0.getBuyPrice();
        java.lang.String str14 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 31.0d + "'", double13 == 31.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.lang.String str3 = smqa.group17.smts.controller.DashboardController.sellStock("1.0 has been added to funds of Funds Withdrawn", "1.0 has been added to funds of You do not own any  shares.", 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any 1.0 has been added to funds of You do not own any  shares. shares." + "'", str3, "You do not own any 1.0 has been added to funds of You do not own any  shares. shares.");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        double double4 = order0.getPnl();
        order0.setOrderID((int) (byte) 100);
        java.lang.String str7 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        double double8 = stock0.getPrice();
        java.lang.Class<?> wildcardClass9 = stock0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setPrice((double) (-1.0f));
        java.lang.String str4 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested(31.0d);
        double double8 = user1.getInvested();
        user1.setPassword("");
        java.lang.Class<?> wildcardClass11 = user1.getClass();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 31.0d + "'", double8 == 31.0d);
//        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) 32, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-100.0d) + "'", double2 == (-100.0d));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        smqa.group17.smts.model.User user1 = new User();
        org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setCurrentAmount((-103.2258064516129d));
        int int5 = user0.getUserId();
        user0.setUserId(0);
        double double8 = user0.getFunds();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-99.0d) + "'", double8 == (-99.0d));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
//        boolean boolean1 = smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed added to wishlist of user You do not have enough Fund balance to withdraw GBP 52.0");
//        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested(31.0d);
        double double8 = user1.getInvested();
        user1.setPassword("");
        user1.setPassword("You do not own any 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 31.0d + "'", double8 == 31.0d);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        int int5 = order0.getNumberOfShares();
        order0.setBuyPrice((double) 100);
        double double8 = order0.getCurrentPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = new java.util.ArrayList<smqa.group17.smts.model.Order>();
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setNumberOfShares((int) (short) 100);
        java.lang.String str5 = order0.getUserName();
        order0.setUserName("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
        double double8 = order0.getPnl();
        double double9 = order0.getBuyPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = user1.getUserId();
        user1.setProfit((double) (short) 0);
        user1.setCurrentAmount((double) (byte) -1);
        java.lang.String str9 = user1.getUserName();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
//        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " added to wishlist of user 582780" + "'", str9, " added to wishlist of user 582780");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = new java.util.ArrayList<smqa.group17.smts.model.Stock>();
        org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = new java.util.ArrayList<smqa.group17.smts.model.Order>();
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setName("You do not own any hi! shares.");
        java.lang.String str10 = stock0.getSymbol();
        java.lang.String str11 = stock0.getSymbol();
        stock0.setName("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        int int5 = user1.getUserId();
        user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
        user1.setProfit((double) (short) 1);
        user1.setUserName("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        user1.setProfit((-44.4040404040404d));
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = user1.getUserId();
        double double5 = user1.getInvested();
        user1.setFunds((-100.0d));
        double double8 = user1.getInvested();
        double double9 = user1.getInvested();
        double double10 = user1.getInvested();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
//        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
//        smqa.group17.smts.controller.DatabaseController.updateUserPnL(" added to wishlist of user 582780 added to wishlist of user Registration Successfull", 28.307692307692307d, (double) (byte) 1, (-51.61290322580645d), (double) 0L);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setUserName("");
        double double7 = order0.getBuyPrice();
        order0.setBuyPrice(31.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        int int5 = user1.getUserId();
        user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
        user1.setProfit((double) (short) 1);
        int int10 = user1.getUserId();
        user1.setFunds((-100.0d));
        double double13 = user1.getCurrentAmount();
        user1.setInvested((double) 34);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
//        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.55d + "'", double13 == 18.55d);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getProfit();
        user1.setUserName("Funds Withdrawn");
        user1.setFunds((-102.020202020202d));
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        double double7 = user1.getFunds();
        user1.setInvested((-13.543424317617863d));
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage(0.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5d + "'", double2 == 0.5d);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        user1.setCurrentAmount(10.0d);
        user1.setCurrentAmount((double) 100);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        order0.setNumberOfShares((int) (byte) 0);
        double double8 = order0.getPnl();
        double double9 = order0.getCurrentPrice();
        java.lang.String str10 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        smqa.group17.smts.model.Stock stock1 = new smqa.group17.smts.model.Stock();
//        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        smqa.group17.smts.model.Stock stock1 = new smqa.group17.smts.model.Stock();
//        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
//        boolean boolean2 = true;
//        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
//        smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("32.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==", "-103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        smqa.group17.smts.model.User user1 = new User();
//        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
//        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.", "");
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        smqa.group17.smts.model.User user1 = new User();
//        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setInvested((double) 1L);
        int int5 = user1.getUserId();
        user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
        user1.setProfit((double) (short) 1);
        int int10 = user1.getUserId();
        user1.setFunds((-100.0d));
        double double13 = user1.getCurrentAmount();
        java.lang.String str14 = user1.getUserName();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
//        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.55d + "'", double13 == 18.55d);
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "T72xtn4m6zgYCz1QwNF31A==" + "'", str14, "T72xtn4m6zgYCz1QwNF31A==");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        smqa.group17.smts.model.Stock stock1 = new smqa.group17.smts.model.Stock();
//        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        double double6 = stock0.getPrice();
        stock0.setName("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5zJKV5ipCRYeVzXxw3fbJ7fVq4wvQYfIK31e5+0u2n2AfZ0OZg0Te4Ug2dU3+uqjb4bZHb3JV86qYvBSKZAXhGZr1E+uPxudtzs1E+O4e6vyY1wn0xv3ff11otTZ/rXzNLcpLw3cuSJgULkl7oQ+pTXHe9iCyJCe7BQxJdU3HCCc=");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((-109.8019801980198d), (-140.81d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-125.3059900990099d) + "'", double2 == (-125.3059900990099d));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = user1.getUserId();
        user1.setInvested((double) 'a');
        double double7 = user1.getFunds();
        double double8 = user1.getFunds();
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
//        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
//        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
//        boolean boolean2 = smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("1.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==", "lk1tNlo39haBld4kgdz2bQ==");
//        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
//        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("You do not own any 0.0 has been added to funds of hi! shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
//        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
//        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= added to wishlist of user lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn", "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
//        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setCurrentPrice(31.0d);
        double double7 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        double double4 = order0.getBuyPrice();
        double double5 = order0.getBuyPrice();
        int int6 = order0.getNumberOfShares();
        order0.setNumberOfShares(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        int int6 = order0.getNumberOfShares();
        java.lang.String str7 = order0.getStockSymbol();
        double double8 = order0.getPnl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) 10L);
        double double4 = user1.getCurrentAmount();
        user1.setInvested(100.0d);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        stock0.setName("Stock Prices changed");
        stock0.setSymbol("1.0 has been added to funds of You do not own any  shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
//        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.updateFundsForUser("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed", (double) 34);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "34.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed" + "'", str2, "34.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        stock0.setName("You do not own any You do not own any hi! shares. shares.");
        stock0.setPrice(30.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setUserName("hi!");
        int int6 = order0.getOrderID();
        double double7 = order0.getBuyPrice();
        order0.setBuyPrice(52.0d);
        order0.setBuyPrice((double) 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
//        smqa.group17.smts.model.Order order2 = smqa.group17.smts.controller.DatabaseController.getOrderDetails("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "4pZrH4vsAwcGHvo486Rrww==");
//        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        int int3 = user1.getUserId();
        double double4 = user1.getCurrentAmount();
        user1.setCurrentAmount((double) 100);
        user1.setUserId((int) (short) 1);
        double double9 = user1.getProfit();
        double double10 = user1.getFunds();
        double double11 = user1.getInvested();
        user1.setFunds((-39.36d));
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
//        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 18.55d + "'", double4 == 18.55d);
//        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
//        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((-0.0d), (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.NEGATIVE_INFINITY + "'", double2 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setUserId(31);
        user1.setFunds(0.0d);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setPassword("You do not have enough Fund balance to withdraw GBP 97.0");
        double double9 = user1.getCurrentAmount();
        user1.setFunds((-490.4282115869018d));
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
//        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.55d + "'", double9 == 18.55d);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl(1.0d);
        order0.setStockSymbol("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6O+xE3T1Xka9raHapdkkhI0j/+Ifc8KgdL/FQw3+l992t");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
//        smqa.group17.smts.controller.DatabaseController.createUser("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.", "-9800.0 has been added to funds of hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        user1.setInvested((double) (-1.0f));
        user1.setPassword("lk1tNlo39haBld4kgdz2bQ==");
        double double11 = user1.getFunds();
        user1.setFunds((-0.5d));
        user1.setProfit(250.0d);
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
//        smqa.group17.smts.controller.DatabaseController.updateFundsForUser("You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares.", 10.0d);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
//        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=", "You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested(31.0d);
        user1.setUserId((int) '#');
        user1.setProfit((double) (short) 100);
        double double12 = user1.getFunds();
        java.lang.String str13 = user1.getUserName();
        user1.setUserName("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setPassword("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed added to wishlist of user You do not have enough Fund balance to withdraw GBP 52.0");
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str13, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
//        java.lang.String str3 = smqa.group17.smts.controller.DashboardController.sellStock("", "You do not own any T72xtn4m6zgYCz1QwNF31A== shares.", (int) ' ');
//        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any T72xtn4m6zgYCz1QwNF31A== shares. shares." + "'", str3, "You do not own any You do not own any T72xtn4m6zgYCz1QwNF31A== shares. shares.");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
//        smqa.group17.smts.model.Order order2 = smqa.group17.smts.controller.DatabaseController.getOrderDetails("", "32.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
//        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        java.lang.String str4 = stock0.getName();
        stock0.setName("ADxHIG67X3pRlQueyStfggrELZrOF8CXQPg+DDern7z7H2h0Kmj2GAyXDYB8ZxL0YOqnZ6qwQx84IcJ6GKKpqg==");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        int int3 = user1.getUserId();
        double double4 = user1.getCurrentAmount();
        user1.setFunds((double) 31);
        user1.setCurrentAmount((-1.0d));
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
//        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 18.55d + "'", double4 == 18.55d);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
//        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("", "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6O+xE3T1Xka9raHapdkkhI0j/+Ifc8KgdL/FQw3+l992t");
//        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
//        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.updateFundsForUser("4pZrH4vsAwcGHvo486Rrww==", (-45.81265508684863d));
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-45.81265508684863 has been added to funds of 4pZrH4vsAwcGHvo486Rrww==" + "'", str2, "-45.81265508684863 has been added to funds of 4pZrH4vsAwcGHvo486Rrww==");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
//        smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any You do not own any hi! shares. shares.", "You do not own any You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares. shares.", "You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.", 0, (double) (byte) -1, (double) 31, 250.0d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
//        smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any You do not own any hi! shares. shares.", "You do not own any You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.", "You do not own any pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd shares.", 0, 24.25d, 10.0d, (-100.0d));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
//        smqa.group17.smts.model.Order order2 = smqa.group17.smts.controller.DatabaseController.getOrderDetails("", "You do not own any You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares. shares.");
//        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setStockSymbol("You do not own any hi! shares.");
        double double4 = order0.getPnl();
        order0.setCurrentPrice(0.0d);
        order0.setBuyPrice((double) 32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("100.0 has been added to funds of 100.0 has been added to funds of ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "EiJQi/r7jDlw2fSG/vWkSsDtXFEJSOXF5EyrMI2dCA6YMMjuHLjakjasSZkkQoiCdZUZcl81dpS7WnnTEkNzuYorxbRlXgfkU1nhaP8G6ww=" + "'", str1, "EiJQi/r7jDlw2fSG/vWkSsDtXFEJSOXF5EyrMI2dCA6YMMjuHLjakjasSZkkQoiCdZUZcl81dpS7WnnTEkNzuYorxbRlXgfkU1nhaP8G6ww=");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
//        smqa.group17.smts.controller.DatabaseController.createUser("52.0 has been added to funds of hi!", "");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
//        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("T72xtn4m6zgYCz1QwNF31A==");
//        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        double double7 = user1.getFunds();
        user1.setFunds((-28.475806451612904d));
//        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        smqa.group17.smts.model.User user1 = new User();
//        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= added to wishlist of user lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        int int7 = user1.getUserId();
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
//        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 31 + "'", int7 == 31);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
//        smqa.group17.smts.model.Stock stock1 = smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("You do not have enough Fund balance to withdraw GBP 31.0");
//        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        int int6 = user1.getUserId();
        user1.setCurrentAmount((double) 0.0f);
        user1.setUserName("You do not own any hi! shares.");
        java.lang.String str11 = user1.getUserName();
        user1.setCurrentAmount((double) 10L);
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "You do not own any hi! shares." + "'", str11, "You do not own any hi! shares.");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
//        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.addStockToWishlist("You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares.", "pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==" + "'", str2, "You do not own any You do not own any 52.0 has been added to funds of hi! shares. shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
//        smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.", "You do not have enough Fund balance to withdraw GBP 31.0");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
//        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
//        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
//        smqa.group17.smts.model.Stock stock1 = smqa.group17.smts.controller.DatabaseController.getStockDataForSymbol("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
//        org.junit.Assert.assertNull(stock1);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        double double5 = order0.getCurrentPrice();
        order0.setPnl((double) 100.0f);
        order0.setBuyPrice(50.0d);
        order0.setPnl(4850.0d);
        order0.setStockSymbol("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares. added to wishlist of user You do not own any  shares.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
//        boolean boolean2 = smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("You do not own any 1.0 has been added to funds of You do not own any  shares. shares.", "");
//        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
//        smqa.group17.smts.controller.DatabaseController.createUser("You do not own any 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.", "97.0 has been added to funds of 52.0 has been added to funds of hi!");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
//        smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("-39.36290322580645 has been added to funds of Stock Prices changed", "You do not have enough Fund balance to withdraw GBP 52.0");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
//        smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) (byte) -1, (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.5d + "'", double2 == 4.5d);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        user1.setUserId((int) (short) 0);
        user1.setUserId((int) ' ');
        user1.setPassword("31.0 has been added to funds of 97.0 has been added to funds of 52.0 has been added to funds of hi!");
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        user1.setInvested(24.193548387096776d);
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
//        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
//        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        java.lang.String str6 = stock0.getSymbol();
        stock0.setSymbol("You do not own any You do not own any T72xtn4m6zgYCz1QwNF31A== shares. shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        stock0.setSymbol("You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.lang.String str1 = smqa.group17.smts.controller.DatabaseController.getPasswordForUsername("You do not own any You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares. shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("You do not own any  shares.");
        double double11 = order0.getPnl();
        order0.setNumberOfShares((int) (byte) 0);
        order0.setStockSymbol("You do not own any You do not own any You do not own any Funds Withdrawn shares. shares. shares.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        stock0.setName("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
        stock0.setName("0.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        stock0.setSymbol("You do not own any pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd shares.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setStockSymbol("lk1tNlo39haBld4kgdz2bQ==");
        java.lang.String str11 = order0.getStockSymbol();
        order0.setCurrentPrice((-140.8080808080808d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "lk1tNlo39haBld4kgdz2bQ==" + "'", str11, "lk1tNlo39haBld4kgdz2bQ==");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
        org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("You do not own any  shares.", "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        java.lang.String str6 = order0.getStockSymbol();
        int int7 = order0.getNumberOfShares();
        int int8 = order0.getOrderID();
        int int9 = order0.getOrderID();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
//        java.lang.String str2 = smqa.group17.smts.controller.DashboardController.withdrawFunds("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=", (double) ' ');
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not have enough Fund balance to withdraw GBP 32.0" + "'", str2, "You do not have enough Fund balance to withdraw GBP 32.0");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("You do not own any 1.0 has been added to funds of You do not own any  shares. shares.", "-490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A== added to wishlist of user You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setProfit((double) 100.0f);
        double double5 = user0.getCurrentAmount();
        user0.setCurrentAmount((-13.543424317617863d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares(0);
        int int11 = order0.getOrderID();
        order0.setBuyPrice((double) (byte) 0);
        order0.setUserName("You do not own any 582780 shares.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 1);
        java.lang.String str8 = order0.getStockSymbol();
        order0.setPnl((double) ' ');
        java.lang.String str11 = order0.getStockSymbol();
        order0.setStockSymbol("34.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("hi!", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.", "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA=");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("You do not have enough Fund balance to withdraw GBP 97.0", "You do not own any Funds Withdrawn shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("ADxHIG67X3pRlQueyStfggrELZrOF8CXQPg+DDern7z7H2h0Kmj2GAyXDYB8ZxL0YOqnZ6qwQx84IcJ6GKKpqg==");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "jG8XmiuRiYPM44i+MDlDb+vSnYCR01CCjUtnDGCAKZbS/YhCE8cgzxd7mvQT96R4UkU8Y1Lp5v1bxUVjy7Drd2lR9WO2zwAI57tjc9uqyEjoWxcqrCBDqyDpNr9IAv/z" + "'", str1, "jG8XmiuRiYPM44i+MDlDb+vSnYCR01CCjUtnDGCAKZbS/YhCE8cgzxd7mvQT96R4UkU8Y1Lp5v1bxUVjy7Drd2lR9WO2zwAI57tjc9uqyEjoWxcqrCBDqyDpNr9IAv/z");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        boolean boolean1 = smqa.group17.smts.controller.LoginController.isAlreadyRegistered("You do not own any 1.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setProfit((-1.0d));
        user1.setInvested((double) (byte) 1);
        user1.setCurrentAmount((double) (byte) 0);
        user1.setProfit(0.0d);
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setCurrentAmount(10.0d);
        double double10 = user1.getInvested();
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
//        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        user1.setInvested((double) 0.0f);
        double double8 = user1.getInvested();
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        smqa.group17.smts.model.Order order2 = smqa.group17.smts.controller.DatabaseController.getOrderDetails("1.0 has been added to funds of You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.", "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        smqa.group17.smts.model.User user1 = smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("0.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "You do not own any You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares. shares.");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getProfit();
        java.lang.String str3 = user1.getUserName();
        user1.setProfit(4750.0d);
        java.lang.String str6 = user1.getPassword();
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " added to wishlist of user 582780" + "'", str3, " added to wishlist of user 582780");
//        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str6, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares(0);
        int int11 = order0.getOrderID();
        order0.setOrderID((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("You do not own any You do not own any T72xtn4m6zgYCz1QwNF31A== shares. shares.", "You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares.");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        boolean boolean1 = smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("You do not own any You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares. shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==", "pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        stock0.setName("You do not have enough Fund balance to withdraw GBP 97.0");
        stock0.setName("hi!");
        java.lang.String str12 = stock0.getSymbol();
        stock0.setSymbol("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        double double4 = stock0.getPrice();
        java.lang.String str5 = stock0.getSymbol();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setStockSymbol("You do not own any hi! shares.");
        order0.setBuyPrice((double) (-1L));
        java.lang.String str7 = order0.getStockSymbol();
        double double8 = order0.getPnl();
        order0.setOrderID(97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "You do not own any hi! shares." + "'", str7, "You do not own any hi! shares.");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setPnl((double) (short) -1);
        order0.setNumberOfShares((int) (byte) 100);
        order0.setStockSymbol("You do not own any You do not own any You do not own any Funds Withdrawn shares. shares. shares.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setSymbol("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t" + "'", str4, "pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        smqa.group17.smts.model.User user1 = new User();
        java.lang.String str2 = user1.getPassword();
        user1.setProfit((-1.0d));
        double double5 = user1.getFunds();
        user1.setUserName("You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
        java.lang.String str8 = user1.getUserName();
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
//        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
//        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares." + "'", str8, "You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("32.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==", "You do not own any 0.0 has been added to funds of hi! shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = user1.getUserId();
        user1.setProfit((double) (short) 0);
        user1.setCurrentAmount((double) (byte) -1);
        user1.setUserName("0.0 has been added to funds of hi!");
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares(0);
        order0.setUserName("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.lang.String str2 = smqa.group17.smts.controller.LoginController.register("EiJQi/r7jDlw2fSG/vWkSsDtXFEJSOXF5EyrMI2dCA6YMMjuHLjakjasSZkkQoiCdZUZcl81dpS7WnnTEkNzuYorxbRlXgfkU1nhaP8G6ww=", "pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5zJKV5ipCRYeVzXxw3fbJ7fVq4wvQYfIK31e5+0u2n2AfZ0OZg0Te4Ug2dU3+uqjb4bZHb3JV86qYvBSKZAXhGZr1E+uPxudtzs1E+O4e6vyY1wn0xv3ff11otTZ/rXzNLcpLw3cuSJgULkl7oQ+pTXHe9iCyJCe7BQxJdU3HCCc=");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        double double2 = smqa.group17.smts.controller.DashboardController.getAverage((double) 'a', (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 98.5d + "'", double2 == 98.5d);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = user1.getCurrentAmount();
        double double7 = user1.getFunds();
        user1.setUserId(34);
        org.junit.Assert.assertNotNull(user1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setStockSymbol("You do not own any hi! shares.");
        double double4 = order0.getPnl();
        double double5 = order0.getPnl();
        order0.setCurrentPrice((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("You do not own any 52.0 has been added to funds of hi! shares.", "lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        boolean boolean2 = smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd", "1.0 has been added to funds of You do not own any  shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        stock0.setName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        double double6 = stock0.getPrice();
        stock0.setSymbol("4pZrH4vsAwcGHvo486Rrww==");
        stock0.setPrice((-51.61290322580645d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setProfit((double) 100.0f);
        double double5 = user0.getCurrentAmount();
        user0.setFunds(10.0d);
        java.lang.Class<?> wildcardClass8 = user0.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice(10.0d);
        java.lang.String str7 = stock0.getSymbol();
        java.lang.String str8 = stock0.getName();
        stock0.setName("You do not have enough Fund balance to withdraw GBP 52.0 added to wishlist of user You do not own any 52.0 has been added to funds of hi! shares.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares((int) (byte) -1);
        int int11 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        double double4 = order0.getPnl();
        order0.setOrderID((int) (byte) 100);
        int int7 = order0.getNumberOfShares();
        order0.setStockSymbol("You do not own any You do not own any hi! shares. shares.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = smqa.group17.smts.controller.DatabaseController.getAllOrdersForUserName("-39.36290322580645 has been added to funds of Stock Prices changed");
        org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setSymbol("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        java.lang.String str7 = stock0.getSymbol();
        java.lang.String str8 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "You do not own any hi! shares." + "'", str4, "You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0" + "'", str7, "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any T72xtn4m6zgYCz1QwNF31A== shares.", " added to wishlist of user 582780", "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", (int) (byte) -1, (-13.543424317617863d), (-140.81d), 1.0d);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        java.lang.String str5 = user1.getUserName();
        org.junit.Assert.assertNotNull(user1);
//        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " added to wishlist of user 582780" + "'", str5, " added to wishlist of user 582780");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        double double4 = order0.getBuyPrice();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setPnl((double) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 1);
        order0.setPnl(50.0d);
        order0.setNumberOfShares((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setPnl((double) 10.0f);
        order0.setBuyPrice((double) 31);
        order0.setNumberOfShares((int) (short) 1);
        order0.setPnl((-20.192307692307693d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.lang.String str3 = smqa.group17.smts.controller.DashboardController.sellStock("You do not have enough Fund balance to withdraw GBP 52.0 added to wishlist of user You do not own any 52.0 has been added to funds of hi! shares.", "1.0 has been added to funds of You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.", 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any 1.0 has been added to funds of You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares. shares." + "'", str3, "You do not own any 1.0 has been added to funds of You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("Registration Successfull", "pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        smqa.group17.smts.model.User user1 = new User();
        double double2 = user1.getInvested();
        user1.setInvested(0.0d);
        int int5 = user1.getUserId();
        user1.setUserId((int) (byte) 0);
        user1.setFunds(50.0d);
        double double10 = user1.getFunds();
        user1.setFunds(0.0d);
        org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        smqa.group17.smts.model.User user1 = new User();
        user1.setCurrentAmount((double) '4');
        int int4 = 31;
        double double5 = user1.getInvested();
        user1.setFunds((-100.0d));
        double double8 = user1.getFunds();
        user1.setPassword("0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0");
        user1.setUserName("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        int int13 = user1.getUserId();
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        boolean boolean2 = smqa.group17.smts.controller.LoginController.login("You do not own any jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= shares.", "-45.81265508684863 has been added to funds of 4pZrH4vsAwcGHvo486Rrww==");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("31.0 has been added to funds of 97.0 has been added to funds of 52.0 has been added to funds of hi!");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("1.0 has been added to funds of Funds Withdrawn", " added to wishlist of user 582780", (-1), 97.0d, (double) 1, 4.5d);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("You do not own any hi! shares.", "31.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setStockSymbol("You do not own any hi! shares.");
        order0.setStockSymbol("You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        order0.setPnl(0.0d);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        int int6 = order0.getNumberOfShares();
        int int7 = order0.getOrderID();
        order0.setUserName("ADxHIG67X3pRlQueyStfgpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0 added to wishlist of user hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0", "You do not own any 0.0 has been added to funds of hi! shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==", (int) (byte) 0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any 0.0 has been added to funds of hi! shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ== shares." + "'", str3, "You do not own any You do not own any 0.0 has been added to funds of hi! shares. added to wishlist of user pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ== shares.");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        stock0.setPrice((double) '#');
        java.lang.String str5 = stock0.getSymbol();
        stock0.setName("You do not own any 582780 shares.");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setNumberOfShares((int) (short) 100);
        java.lang.String str5 = order0.getUserName();
        order0.setUserName("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
        order0.setCurrentPrice(49.5d);
        order0.setOrderID(31);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        java.lang.String str2 = null; // flaky: user1.getPassword();
// flaky:         user1.setInvested((double) 1L);
        java.lang.String str5 = null; // flaky: user1.getUserName();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + " added to wishlist of user 582780" + "'", str5, " added to wishlist of user 582780");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("You do not own any 582780 shares.", "You do not own any You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi! shares.", (int) '4', 6.451612903225806d, 6.451612903225806d, 14.0d);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setUserName("You do not own any ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ= shares.");
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        double double7 = order0.getCurrentPrice();
        order0.setPnl(52.0d);
        order0.setCurrentPrice(6.451612903225806d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull", "1.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        int int9 = order0.getNumberOfShares();
        java.lang.String str10 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        double double6 = order0.getPnl();
        order0.setPnl((double) (short) -1);
        order0.setStockSymbol("1.0 has been added to funds of Funds Withdrawn");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.withdrawFunds("hi!", 0.5d);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "You do not have enough Fund balance to withdraw GBP 0.5" + "'", str2, "You do not have enough Fund balance to withdraw GBP 0.5");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        double double4 = stock0.getPrice();
        java.lang.String str5 = stock0.getName();
        stock0.setPrice((double) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToWishListForUser("Registration Successfull", "You do not own any You do not own any hi! shares. shares.");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("52.0 has been added to funds of hi!");
// flaky:         org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", 1.0d, 31.0d, (-490.4282115869018d), (double) 10.0f);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("Funds Withdrawn", "lk1tNlo39haBld4kgdz2bQ==");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Funds Withdrawn added to wishlist of user lk1tNlo39haBld4kgdz2bQ==" + "'", str2, "Funds Withdrawn added to wishlist of user lk1tNlo39haBld4kgdz2bQ==");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
// flaky:         user1.setFunds((-28.475806451612904d));
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setPnl((double) 10.0f);
        order0.setBuyPrice((double) 31);
        double double13 = order0.getBuyPrice();
        int int14 = order0.getNumberOfShares();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 31.0d + "'", double13 == 31.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        order0.setBuyPrice(124.5d);
        order0.setBuyPrice((-0.5d));
        java.lang.Class<?> wildcardClass11 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        stock0.setName("You do not own any  shares.");
        stock0.setPrice((-7971.4859437751d));
        stock0.setPrice((double) 100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0", (double) (byte) -1, (double) 'a', (double) (short) 1, (double) (byte) 1);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setInvested((double) (-1.0f));
// flaky:         user1.setPassword("lk1tNlo39haBld4kgdz2bQ==");
        double double11 = 0.0; // flaky: user1.getFunds();
        double double12 = 0.0; // flaky: user1.getInvested();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setSymbol("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        java.lang.String str7 = stock0.getSymbol();
        double double8 = stock0.getPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "You do not own any hi! shares." + "'", str4, "You do not own any hi! shares.");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0" + "'", str7, "hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        java.lang.String str2 = null; // flaky: user1.getPassword();
// flaky:         user1.setInvested((double) 1L);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserName("T72xtn4m6zgYCz1QwNF31A==");
// flaky:         user1.setProfit((double) (short) 1);
// flaky:         user1.setUserName("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        int int12 = 0; // flaky: user1.getUserId();
// flaky:         user1.setFunds(40.75d);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        double double1 = stock0.getPrice();
        stock0.setPrice((double) (byte) -1);
        stock0.setName("You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.");
        stock0.setName("0.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        java.lang.String str8 = stock0.getSymbol();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
        int int4 = 0; // flaky: user1.getUserId();
// flaky:         user1.setProfit(49.5d);
        java.lang.String str7 = null; // flaky: user1.getUserName();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + " added to wishlist of user 582780" + "'", str7, " added to wishlist of user 582780");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= added to wishlist of user lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn", "32.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setPnl((double) (short) -1);
        double double8 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        java.lang.String str6 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        order0.setBuyPrice((double) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
        java.lang.String str3 = null; // flaky: user1.getUserName();
// flaky:         user1.setUserName("100.0 has been added to funds of ");
        java.lang.String str6 = null; // flaky: user1.getUserName();
        double double7 = 0.0; // flaky: user1.getCurrentAmount();
        double double8 = 0.0; // flaky: user1.getProfit();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + " added to wishlist of user 582780" + "'", str3, " added to wishlist of user 582780");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0 has been added to funds of " + "'", str6, "100.0 has been added to funds of ");
// flaky:         org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.55d + "'", double7 == 18.55d);
// flaky:         org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("You do not own any You do not have enough Fund balance to withdraw GBP 31.0 shares.", "You do not own any YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY= shares.", "pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA= added to wishlist of user -490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==", 34, 31.0d, (-0.5d), 28.307692307692307d);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setStockSymbol("You do not own any hi! shares.");
        order0.setBuyPrice((double) (-1L));
        java.lang.String str7 = order0.getStockSymbol();
        double double8 = order0.getPnl();
        order0.setPnl((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "You do not own any hi! shares." + "'", str7, "You do not own any hi! shares.");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getAllStocksInWishlist("ADxHIG67X3pRlQueyStfgpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("35.0 has been added to funds of 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("J5wXKdtA4hPstPmeCfEhvpkz7gv4X51oL9fL6O1vejFFAPbj0blPi/ks8KblMxMw", " added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
// flaky:         smqa.group17.smts.controller.DatabaseController.deleteStockFromPortfolio("hi!", "You do not own any  shares.");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        java.lang.String str5 = stock0.getSymbol();
        java.lang.String str6 = stock0.getSymbol();
        java.lang.String str7 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("jG8XmiuRiYPM44i+MDlDb+vSnYCR01CCjUtnDGCAKZbS/YhCE8cgzxd7mvQT96R4UkU8Y1Lp5v1bxUVjy7Drd2lR9WO2zwAI57tjc9uqyEjoWxcqrCBDqyDpNr9IAv/z", "", (int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any  shares." + "'", str3, "You do not own any  shares.");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        double double5 = order0.getCurrentPrice();
        double double6 = order0.getBuyPrice();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getUserDataForUsernamme("hi!");
// flaky:         org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("pRtxcGSinU6wRRkDvfPm/zBqTTq/cuCjnAXg0XkAqpM=");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "You do not own any  shares." + "'", str1, "You do not own any  shares.");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getUserName();
        java.lang.String str2 = order0.getUserName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
// flaky:         user1.setUserId((int) (byte) 0);
        double double8 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setPassword("ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ=");
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("pRtxcGSinU6wRRkDvfPm//s4wrJpnz9lhY1gRkYUH6pq+TfMxJXZDSlktce5tABd");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "You do not own any Funds Withdrawn shares." + "'", str1, "You do not own any Funds Withdrawn shares.");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setPnl((double) (short) 100);
        order0.setUserName("You do not own any hi! shares.");
        order0.setOrderID((int) (byte) 100);
        java.lang.String str14 = order0.getUserName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "You do not own any hi! shares." + "'", str14, "You do not own any hi! shares.");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn added to wishlist of user Stock Prices changed", "24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.", 0);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any 24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares. shares." + "'", str3, "You do not own any 24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares. shares.");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.LoginController.register("You do not have enough Fund balance to withdraw GBP 30.0", "582780");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Registration Successfull" + "'", str2, "Registration Successfull");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        int int1 = order0.getNumberOfShares();
        order0.setNumberOfShares((-1));
        java.lang.String str4 = order0.getUserName();
        order0.setUserName("");
        double double7 = order0.getPnl();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        java.lang.String str2 = stock0.getName();
        stock0.setPrice((double) '#');
        double double5 = stock0.getPrice();
        java.lang.String str6 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.lang.String str1 = smqa.group17.smts.controller.EncryptionController.encrypt("You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "pRtxcGSinU6wRRkDvfPm/2dXSaRrYGqbe3mHsER1YSSwTCr3gsMiAkEbQ+Hf9KwYfMVz3SYbCoTIoZec5z9D7DvcPjHNbDkJaNQmIbYo7G5qJ3JZ4tJjKTplmnmTmWessSz8ZrZLX/78ltpau1NhjA==" + "'", str1, "pRtxcGSinU6wRRkDvfPm/2dXSaRrYGqbe3mHsER1YSSwTCr3gsMiAkEbQ+Hf9KwYfMVz3SYbCoTIoZec5z9D7DvcPjHNbDkJaNQmIbYo7G5qJ3JZ4tJjKTplmnmTmWessSz8ZrZLX/78ltpau1NhjA==");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        java.lang.String str2 = user0.getUserName();
        user0.setUserId((int) (byte) 100);
        user0.setUserName("You do not have enough Fund balance to withdraw GBP 97.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        java.lang.String str2 = null; // flaky: user1.getPassword();
        int int3 = 0; // flaky: user1.getUserId();
        double double4 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setCurrentAmount((double) 100);
// flaky:         user1.setUserId((int) (short) 1);
        java.lang.String str9 = null; // flaky: user1.getUserName();
        double double10 = 0.0; // flaky: user1.getProfit();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + double4 + "' != '" + 18.55d + "'", double4 == 18.55d);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + " added to wishlist of user 582780" + "'", str9, " added to wishlist of user 582780");
// flaky:         org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("-45.81265508684863 has been added to funds of 4pZrH4vsAwcGHvo486Rrww==", "1.0 has been added to funds of You do not own any You do not own any Funds Withdrawn shares. shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        double double4 = stock0.getPrice();
        stock0.setPrice(0.0d);
        stock0.setPrice((double) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setPnl((double) 31);
        int int5 = order0.getNumberOfShares();
        order0.setNumberOfShares((int) (byte) 100);
        order0.setCurrentPrice((double) 'a');
        order0.setBuyPrice(18.548387096774192d);
        order0.setBuyPrice((-20.19d));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.lang.String str2 = null; // flaky: smqa.group17.smts.controller.DashboardController.addStockToWishlist("97.0 has been added to funds of 52.0 has been added to funds of hi!", "YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "97.0 has been added to funds of 52.0 has been added to funds of hi! added to wishlist of user YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=" + "'", str2, "97.0 has been added to funds of 52.0 has been added to funds of hi! added to wishlist of user YKIJMiotFGmrh3GOa4OyBhV7DgzroH+h48xVHJnCHgN/4rfyDKEfDkCXU+GkJu5Okez8x0ECnIa3HqwBp0Mz3xmU8hbNQ9kC21Z/CASKAQY=");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("32.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("pRtxcGSinU6wRRkDvfPm/zBqTTq/cuCjnAXg0XkAqpM=", "pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5zJKV5ipCRYeVzXxw3fbJ7fVq4wvQYfIK31e5+0u2n2AfZ0OZg0Te4Ug2dU3+uqjb4bZHb3JV86qYvBSKZAXhGZr1E+uPxudtzs1E+O4e6vyY1wn0xv3ff11otTZ/rXzNLcpLw3cuSJgULkl7oQ+pTXHe9iCyJCe7BQxJdU3HCCc=", (int) '4', 5.5d, (double) 29, 5.5d);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         user1.setInvested(31.0d);
        java.lang.String str8 = null; // flaky: user1.getUserName();
// flaky:         user1.setPassword("You do not own any  shares.");
        double double11 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str8, "100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setSymbol("You do not own any hi! shares.");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setSymbol("hi! added to wishlist of user 100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user You do not have enough Fund balance to withdraw GBP 97.0");
        stock0.setSymbol("pRtxcGSinU6wRRkDvfPm/3K+75O8obecH9bhvJ4c4qA= added to wishlist of user -490.4282115869018 has been added to funds of T72xtn4m6zgYCz1QwNF31A==");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "You do not own any hi! shares." + "'", str4, "You do not own any hi! shares.");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getPnl();
        double double5 = order0.getCurrentPrice();
        order0.setPnl((double) 100.0f);
        order0.setBuyPrice(50.0d);
        java.lang.String str10 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("You do not have enough Fund balance to withdraw GBP 31.0", "jG8XmiuRiYPM44i+MDlDb+vSnYCR01CCjUtnDGCAKZbS/YhCE8cgzxd7mvQT96R4UkU8Y1Lp5v1bxUVjy7Drd2lR9WO2zwAI57tjc9uqyEjoWxcqrCBDqyDpNr9IAv/z");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        java.lang.String str2 = null; // flaky: user1.getPassword();
// flaky:         user1.setProfit((-1.0d));
// flaky:         user1.setInvested((double) (byte) 1);
        double double7 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        double double7 = order0.getCurrentPrice();
        double double8 = order0.getCurrentPrice();
        order0.setStockSymbol("100.0 has been added to funds of ");
        double double11 = order0.getBuyPrice();
        int int12 = order0.getNumberOfShares();
        java.lang.String str13 = order0.getStockSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0 has been added to funds of " + "'", str13, "100.0 has been added to funds of ");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setNumberOfShares((int) (short) 100);
        order0.setNumberOfShares(34);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) (byte) 0);
        java.lang.String str7 = stock0.getName();
        java.lang.String str8 = stock0.getSymbol();
        double double9 = stock0.getPrice();
        java.lang.String str10 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Stock Prices changed" + "'", str7, "Stock Prices changed");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        order0.setBuyPrice(14.0d);
        double double7 = order0.getPnl();
        java.lang.String str8 = order0.getStockSymbol();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setFunds(0.0d);
// flaky:         user1.setUserName("Funds Withdrawn added to wishlist of user lk1tNlo39haBld4kgdz2bQ==");
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        stock0.setName("4pZrH4vsAwcGHvo486Rrww==");
        stock0.setPrice((double) 100.0f);
        java.lang.String str11 = stock0.getSymbol();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        int int5 = order0.getNumberOfShares();
        double double6 = order0.getCurrentPrice();
        order0.setNumberOfShares((int) '#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered("You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setPnl((double) (-1));
        order0.setStockSymbol("You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.");
        double double13 = order0.getBuyPrice();
        java.lang.String str14 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         user1.setInvested(31.0d);
// flaky:         user1.setFunds(53.5d);
// flaky:         user1.setFunds(18.548387096774192d);
// flaky:         org.junit.Assert.assertNotNull(user1);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        smqa.group17.smts.model.Stock stock0 = new smqa.group17.smts.model.Stock();
        java.lang.String str1 = stock0.getName();
        stock0.setName("Stock Prices changed");
        java.lang.String str4 = stock0.getSymbol();
        stock0.setPrice((double) 100.0f);
        double double7 = stock0.getPrice();
        java.lang.String str8 = stock0.getName();
        java.lang.String str9 = stock0.getName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Stock Prices changed" + "'", str8, "Stock Prices changed");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Stock Prices changed" + "'", str9, "Stock Prices changed");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        int int8 = order0.getOrderID();
        java.lang.String str9 = order0.getStockSymbol();
        order0.setUserName("52.0 has been added to funds of hi!");
        order0.setPnl((-45.81265508684863d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        order0.setBuyPrice((double) (byte) 10);
        int int9 = order0.getNumberOfShares();
        java.lang.String str10 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        java.lang.String str4 = order0.getStockSymbol();
        double double5 = order0.getBuyPrice();
        java.lang.String str6 = order0.getStockSymbol();
        int int7 = order0.getNumberOfShares();
        order0.setOrderID((int) '#');
        order0.setStockSymbol("lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setProfit((double) 100.0f);
        java.lang.String str5 = user0.getPassword();
        java.lang.String str6 = user0.getUserName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
// flaky:         smqa.group17.smts.controller.DatabaseController.createUser("pRtxcGSinU6wRRkDvfPm/2dXSaRrYGqbe3mHsER1YSSwTCr3gsMiAkEbQ+Hf9KwYfMVz3SYbCoTIoZec5z9D7DvcPjHNbDkJaNQmIbYo7G5qJ3JZ4tJjKTplmnmTmWessSz8ZrZLX/78ltpau1NhjA==", "1.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setCurrentAmount((-0.5d));
        double double11 = 0.0; // flaky: user1.getFunds();
        int int12 = 0; // flaky: user1.getUserId();
        double double13 = 0.0; // flaky: user1.getProfit();
        java.lang.String str14 = null; // flaky: user1.getUserName();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + " added to wishlist of user 582780" + "'", str14, " added to wishlist of user 582780");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        smqa.group17.smts.model.Order order2 = null; // flaky: smqa.group17.smts.controller.DatabaseController.getOrderDetails("pRtxcGSinU6wRRkDvfPm/3G12v65MpIwv3uAIc+8tdV1lRlyXzV2lLtaedMSQ3O5QrpmowkaBJ/RyhK8vSphzA==", "97.0 has been added to funds of 52.0 has been added to funds of hi!");
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("0.0 has been added to funds of hi!", "You do not own any 582780 shares.", "32.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==", 0, 250.0d, 124.5d, (double) (byte) 10);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setCurrentAmount((-0.5d));
        double double11 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setCurrentAmount((double) 100);
        double double14 = 0.0; // flaky: user1.getProfit();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.util.List<smqa.group17.smts.model.Stock> stockList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllStocksInWishlist("You do not own any 24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares. shares.");
// flaky:         org.junit.Assert.assertNotNull(stockList1);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        boolean boolean1 = false; // flaky: smqa.group17.smts.controller.DatabaseController.isAlreadyRegistered(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setPnl((double) 10.0f);
        order0.setBuyPrice((double) 31);
        double double13 = order0.getBuyPrice();
        order0.setBuyPrice(52.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 31.0d + "'", double13 == 31.0d);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        order0.setBuyPrice(14.0d);
        order0.setOrderID((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        double double7 = order0.getCurrentPrice();
        double double8 = order0.getCurrentPrice();
        order0.setStockSymbol("100.0 has been added to funds of ");
        double double11 = order0.getBuyPrice();
        double double12 = order0.getBuyPrice();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setBuyPrice(Double.NEGATIVE_INFINITY);
        order0.setNumberOfShares((int) (short) 0);
        double double10 = order0.getPnl();
        int int11 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateUserPnL("100.0 has been added to funds of 100.0 has been added to funds of ", (double) (-1L), 24.5d, (double) 0.0f, (double) 34);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setPnl((double) (byte) 1);
        order0.setUserName("");
        order0.setUserName("");
        java.lang.String str10 = order0.getUserName();
        int int11 = order0.getOrderID();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("You do not own any  added to wishlist of user 582780 added to wishlist of user Registration Successfull shares.", "1.0 has been added to funds of hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        int int5 = order0.getNumberOfShares();
        order0.setCurrentPrice((double) (short) 1);
        double double8 = order0.getPnl();
        java.lang.String str9 = order0.getUserName();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("Stock Prices changed", "You do not own any You do not own any T72xtn4m6zgYCz1QwNF31A== shares. shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        order0.setUserName("hi!");
        int int6 = order0.getOrderID();
        order0.setOrderID((int) (byte) 1);
        order0.setBuyPrice((-40.38461538461539d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
        int int5 = 0; // flaky: user1.getUserId();
        int int6 = 0; // flaky: user1.getUserId();
// flaky:         user1.setCurrentAmount((double) 0.0f);
// flaky:         user1.setUserName("You do not own any hi! shares.");
// flaky:         user1.setCurrentAmount(24.193548387096776d);
        double double13 = 0.0; // flaky: user1.getInvested();
        double double14 = 0.0; // flaky: user1.getProfit();
// flaky:         user1.setProfit(1.0d);
        int int17 = 0; // flaky: user1.getUserId();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 31 + "'", int6 == 31);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares." + "'", str1, "You do not own any You do not have enough Fund balance to withdraw GBP 97.0 shares.");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.lang.String str1 = smqa.group17.smts.controller.DecryptionController.decrypt("You do not own any You do not own any You do not own any Funds Withdrawn shares. shares. shares.");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
// flaky:         smqa.group17.smts.controller.DatabaseController.addStockToProtfolio("1.0 has been added to funds of Funds Withdrawn", "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA= added to wishlist of user lk1tNlo39haBld4kgdz2bQ== added to wishlist of user Funds Withdrawn", "You do not own any Funds Withdrawn shares. added to wishlist of user 0.0 has been added to funds of hi!", (int) (short) 100, (double) 1, (double) '#', (double) 1);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         user1.setInvested((double) 100);
// flaky:         user1.setProfit((double) 31);
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         user1.setInvested(31.0d);
// flaky:         user1.setUserId((int) '#');
// flaky:         user1.setPassword(" added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        java.lang.String str12 = null; // flaky: user1.getPassword();
        java.lang.String str13 = null; // flaky: user1.getPassword();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + " added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str12, " added to wishlist of user 582780 added to wishlist of user Registration Successfull");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + " added to wishlist of user 582780 added to wishlist of user Registration Successfull" + "'", str13, " added to wishlist of user 582780 added to wishlist of user Registration Successfull");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setOrderID((int) (byte) 0);
        double double8 = order0.getCurrentPrice();
        order0.setNumberOfShares((int) (byte) -1);
        order0.setOrderID((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = order0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        smqa.group17.smts.model.User user1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getUserDataForUserId("ojGbN9v0DfwSVcOif8u/gH1gRcYAT6nTEyaseVjq9sQ=");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        java.lang.String str2 = null; // flaky: user1.getPassword();
// flaky:         user1.setProfit((-1.0d));
// flaky:         user1.setInvested((double) (byte) 1);
// flaky:         user1.setCurrentAmount((double) (byte) 0);
        double double9 = 0.0; // flaky: user1.getCurrentAmount();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=" + "'", str2, "jnooZyiNQC3+wHc0ZrkFdDDB3BIvk4qxQye84tpK3wA=");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setPassword(" added to wishlist of user 582780");
// flaky:         user1.setProfit((double) '4');
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setCurrentAmount(10.0d);
// flaky:         user1.setCurrentAmount((-0.5d));
// flaky:         user1.setCurrentAmount((-25.61290322580645d));
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        java.lang.String str3 = order0.getStockSymbol();
        order0.setOrderID((int) (short) 100);
        int int6 = order0.getNumberOfShares();
        order0.setNumberOfShares(10);
        double double9 = order0.getCurrentPrice();
        double double10 = order0.getPnl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        int int4 = order0.getNumberOfShares();
        java.lang.String str5 = order0.getStockSymbol();
        order0.setUserName("Registration Successfull");
        order0.setUserName("32.0 has been added to funds of lk1tNlo39haBld4kgdz2bQ==");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.util.List<smqa.group17.smts.model.Order> orderList1 = null; // flaky: smqa.group17.smts.controller.DashboardController.getAllOrdersForUserName("Stock Prices changed");
// flaky:         org.junit.Assert.assertNotNull(orderList1);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setProfit((double) 100.0f);
        user0.setFunds(0.0d);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss(24.25d, 50.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 106.18556701030928d + "'", double2 == 106.18556701030928d);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
        double double2 = 0.0; // flaky: user1.getInvested();
// flaky:         user1.setInvested(0.0d);
// flaky:         user1.setUserId((int) (short) 0);
// flaky:         user1.setUserId((int) ' ');
        double double9 = 0.0; // flaky: user1.getFunds();
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        order0.setBuyPrice((double) (byte) 10);
        int int9 = order0.getNumberOfShares();
        order0.setBuyPrice(31.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateOrder("", "You do not own any hi! shares.", (int) (byte) 100, 0.0d, (-38.61290322580645d), 24.25d);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        double double7 = order0.getCurrentPrice();
        double double8 = order0.getCurrentPrice();
        order0.setStockSymbol("100.0 has been added to funds of ");
        int int11 = order0.getNumberOfShares();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        int int3 = order0.getOrderID();
        double double4 = order0.getBuyPrice();
        double double5 = order0.getPnl();
        int int6 = order0.getNumberOfShares();
        order0.setBuyPrice((double) (byte) 10);
        int int9 = order0.getNumberOfShares();
        order0.setStockSymbol("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull added to wishlist of user 0.0 has been added to funds of hi! added to wishlist of user You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.LoginController.login("pRtxcGSinU6wRRkDvfPm//oeBEAisR3uKVqlUKyVPJMoxsiTENZ8IMxsrM3v3zXl3LHNSSLnIGcrfzF7qNi6OwN4elfWSGsYJJDjOG1XFvv/+Ifc8KgdL/FQw3+l992t", "pRtxcGSinU6wRRkDvfPm/yGheJ/1UL85xPUHAFw6wOVsxwUij9223EowzId7coOrvZZZYHv1US79B5XvrjbbnQ==");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        boolean boolean2 = false; // flaky: smqa.group17.smts.controller.DatabaseController.checkIfStockAlreadyInPortfolio("You do not own any -103.2258064516129 has been added to funds of T72xtn4m6zgYCz1QwNF31A== shares.", "24.193548387096776 has been added to funds of You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. added to wishlist of user You do not own any hi! shares.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        order0.setPnl(100.0d);
        order0.setStockSymbol("You do not own any hi! shares.");
        order0.setCurrentPrice((double) 10L);
        java.lang.String str7 = order0.getStockSymbol();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "You do not own any hi! shares." + "'", str7, "You do not own any hi! shares.");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        user0.setFunds((-99.0d));
        user0.setProfit((double) 100.0f);
        java.lang.String str5 = user0.getUserName();
        java.lang.String str6 = user0.getPassword();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.String str3 = null; // flaky: smqa.group17.smts.controller.DashboardController.sellStock("You do not own any  shares.", "You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares.", (int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "You do not own any You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares." + "'", str3, "You do not own any You do not own any 1.0 has been added to funds of hi! shares. added to wishlist of user You do not own any 0.0 has been added to funds of You do not have enough Fund balance to withdraw GBP 97.0 shares. shares.");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
// flaky:         smqa.group17.smts.controller.DatabaseController.updateFundsForUser("hi!", 0.0d);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        smqa.group17.smts.model.User user0 = new smqa.group17.smts.model.User();
        double double1 = user0.getFunds();
        java.lang.String str2 = user0.getUserName();
        user0.setUserId((int) (byte) 100);
        double double5 = user0.getFunds();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        smqa.group17.smts.model.User user1 = null; // flaky: new User();
// flaky:         user1.setCurrentAmount((double) '4');
// flaky:         user1.setUserName("100.0 has been added to funds of 1.0 has been added to funds of  added to wishlist of user 582780 added to wishlist of user Registration Successfull");
        double double6 = 0.0; // flaky: user1.getCurrentAmount();
        double double7 = 0.0; // flaky: user1.getFunds();
// flaky:         user1.setInvested((-7971.4859437751d));
// flaky:         org.junit.Assert.assertNotNull(user1);
// flaky:         org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        smqa.group17.smts.model.Order order0 = new smqa.group17.smts.model.Order();
        java.lang.String str1 = order0.getStockSymbol();
        java.lang.String str2 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        order0.setBuyPrice((double) '4');
        double double7 = order0.getCurrentPrice();
        java.lang.String str8 = order0.getStockSymbol();
        order0.setBuyPrice((double) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        double double2 = smqa.group17.smts.controller.DashboardController.calculateProfitLoss((double) 31, (-98.07692307692307d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-416.3771712158809d) + "'", double2 == (-416.3771712158809d));
    }

}
