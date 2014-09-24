package net.acegik.examples;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for ValidationUtil
 */
public class ValidationUtilTest {

    @Test
    public void test_valid_emails() {
        String[] sample_valid_emails = new String[] {
            "abc@example.com", "abc01@example.com", "a@example.com",
            "too_long_email_address@sub.example.com"};

        for(int i=0; i<1000; i++) {
            for(String sample:sample_valid_emails) {
                Assert.assertTrue( ValidationUtil.verifyEmail(sample) );
            }
        }
        
        for(int i=0; i<1000; i++) {
            for(String sample:sample_valid_emails) {
                Assert.assertTrue( ValidationUtil.verifyEmail2(sample) );
            }
        }
    }
    
    @Test
    public void test_invalid_emails() {
        String[] sample_invalid_emails = new String[] {
            "", "#ABCDEF$", "Wrong Email",
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567"};

        for(String sample:sample_invalid_emails) {
            Assert.assertFalse( ValidationUtil.verifyEmail(sample) );
        }

        for(String sample:sample_invalid_emails) {
            Assert.assertFalse( ValidationUtil.verifyEmail2(sample) );
        }
    }
}
